package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.uploadScreen

import com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen.ViewerScreenViewModel
import android.content.Intent
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.ncubesdev.zimsecpastexampapersandmarksschemes.R
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.PdfDocument
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.LottieLoader
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.UiEvents


@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun AnswerUpdateScreen(
    viewModel: UploadScreenViewModel,
    viewerScreenViewModel: ViewerScreenViewModel
) {
    val unAnsweredPapers by viewerScreenViewModel.unAnsweredPapers.collectAsStateWithLifecycle()

    val context = LocalContext.current
    val isLoading by viewModel.isLoading.collectAsState()
    var localUrl by remember { mutableStateOf("") }
    var localUrlAnswer by remember { mutableStateOf("") }

    val intent = Intent(Intent.ACTION_GET_CONTENT)
    intent.type = "application/pdf";
    intent.addCategory(Intent.CATEGORY_OPENABLE);
    val intentAnswer = Intent(Intent.ACTION_GET_CONTENT)
    intentAnswer.type = "application/pdf";
    intentAnswer.addCategory(Intent.CATEGORY_OPENABLE);
    val launcherAnswer = rememberLauncherForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == ComponentActivity.RESULT_OK) {
            val uri = result.data?.data
            localUrlAnswer = uri.toString()
        }
    }
    LaunchedEffect(key1 = true) {
        viewModel.uiEvent.collect {
            when (it) {
                is UiEvents.Error -> {
                    Toast.makeText(
                        context,
                        "${it.message}", Toast.LENGTH_LONG
                    ).show()
                }
                is UiEvents.Success -> {
                    Toast.makeText(
                        context,
                        "Upload was successful", Toast.LENGTH_LONG
                    ).show()
                }
                is UiEvents.ShowToast -> {
                    Toast.makeText(
                        context,
                        it.text, Toast.LENGTH_LONG
                    ).show()
                }
                else -> {}
            }
        }

    }
    if (unAnsweredPapers.isEmpty()) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            LottieLoader(anim = R.raw.empty_list, modifier = Modifier.size(300.dp))
        }
    } else {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

            LazyColumn {
                items(unAnsweredPapers) { mayPaper ->
                    AnswerUpdateCard(
                        color = if (localUrlAnswer.isEmpty()) ButtonDefaults.buttonColors(
                            backgroundColor = MaterialTheme.colors.background
                        ) else ButtonDefaults.buttonColors(
                            backgroundColor = MaterialTheme.colors.error
                        ),
                        dynamictext = if (localUrlAnswer.isEmpty()) "AddAnswer" else "save",
                        modifier = Modifier.fillMaxWidth(),
                        QuestionPaper(
                            subject = mayPaper.subject,
                            year = mayPaper.year,
                            paper = mayPaper.paper,
                            level = mayPaper.level,
                            month = mayPaper.month
                        ),
                        onAnswerClick = {

                            if (localUrlAnswer.isNotEmpty()) {
                                viewModel.onEvent(
                                    UploadScreenEvent.OnAnswerUpdate(
                                        mayPaper,
                                        PdfDocument(
                                            localUri = "",
                                            answerUri = localUrlAnswer
                                        )
                                    )
                                )
                            } else {
                                launcherAnswer.launch(intent)
                                Toast.makeText(
                                    context,
                                    "Choose a an Answer",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        },
                    ) {
                        Toast.makeText(
                            context,
                            "You can not open the papers here",
                            Toast.LENGTH_LONG
                        ).show()                    }
                }
            }
            if (isLoading) {
                LottieLoader(R.raw.loader2)
            }
        }
    }
}

