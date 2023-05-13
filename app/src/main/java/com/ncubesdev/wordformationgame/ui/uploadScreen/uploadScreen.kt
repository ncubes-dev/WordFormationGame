package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.uploadScreen

import android.content.Intent
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ncubesdev.zimsecpastexampapersandmarksschemes.R
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.PdfDocument
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.Constants
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.LottieLoader
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.UiEvents
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.surportAllScreen.WindowInfo
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.surportAllScreen.rememberWindowInfo


@Composable
fun UploadScreen(
    viewModel: UploadScreenViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    val isLoading by viewModel.isLoading.collectAsState()
    var localUrl by remember { mutableStateOf("") }
    var localUrlAnswer by remember { mutableStateOf("") }
    var paper by remember { mutableStateOf("") }
    var month by remember { mutableStateOf("") }
    var subject by remember { mutableStateOf("") }
    var level by remember { mutableStateOf("") }
    var year by remember { mutableStateOf(0) }

    var isOnSubjectDropDown by remember { mutableStateOf(false) }
    var isOnLevelDropDown by remember { mutableStateOf(false) }
    var isOnYearDropDown by remember { mutableStateOf(false) }
    var isOnMonthDropDown by remember { mutableStateOf(false) }
    var isOnPaperDropDown by remember { mutableStateOf(false) }

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
    val intent = Intent(Intent.ACTION_GET_CONTENT)
    intent.type = "application/pdf";
    intent.addCategory(Intent.CATEGORY_OPENABLE);
    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == ComponentActivity.RESULT_OK) {
            val uri = result.data?.data
                localUrl = uri.toString()
            }
    }
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
    val windowInfo = rememberWindowInfo()
    if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 48.dp, end = 48.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth()) { Text(text = "$level $subject $month $year $paper \nQuestion: $localUrl\nAnswer: $localUrlAnswer") }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 28.dp)
            ) {
                Button(
                    shape = RoundedCornerShape(40.dp),
                    border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                    onClick = { launcher.launch(intent) },
                ) {
                    Text(text = "Select question")
                }
                Button(
                    shape = RoundedCornerShape(40.dp),
                    border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                    onClick = { launcherAnswer.launch(intent) },
                ) {
                    Text(text = "Select answer  ")
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {
                Button(
                    shape = RoundedCornerShape(40.dp),
                    border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                    onClick = { isOnPaperDropDown = true },
                ) {
                    Text(text = "Select Paper  ")
                }
                DropdownMenu(
                    expanded = isOnPaperDropDown,
                    onDismissRequest = { isOnPaperDropDown != isOnPaperDropDown }) {
                    Constants.dropDownListItemsForPaper.forEach { label ->
                        DropdownMenuItem(onClick = {
                            paper = label
                            isOnPaperDropDown = false
                            //have a function to open a specific chart channel on its click
                        }) {
                            Text(text = label)
                        }
                    }
                }
                Button(
                    shape = RoundedCornerShape(40.dp),
                    border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                    onClick = { isOnMonthDropDown = true },
                ) {
                    Text(text = "Select Month  ")
                }
                DropdownMenu(
                    expanded = isOnMonthDropDown,
                    onDismissRequest = { isOnMonthDropDown != isOnMonthDropDown }) {
                    Constants.dropDownListItemsForMonth.forEach { label ->
                        DropdownMenuItem(onClick = {
                            month = label
                            isOnMonthDropDown = false
                            //have a function to open a specific chart channel on its click
                        }) {
                            Text(text = label)
                        }
                    }
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 20.dp,
                    )
            ) {
                Button(
                    shape = RoundedCornerShape(40.dp),
                    border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                    onClick = { isOnYearDropDown = true },
                ) {
                    Text(text = "Select Year    ")
                }
                DropdownMenu(
                    expanded = isOnYearDropDown,
                    onDismissRequest = { isOnYearDropDown != isOnYearDropDown }) {
                    Constants.dropDownListItemsForYear.forEach { label ->
                        DropdownMenuItem(onClick = {
                            year = label
                            isOnYearDropDown = false
                        }) {
                            Text(text = label.toString())
                        }
                    }
                }
                Button(
                    modifier = Modifier,
                    shape = RoundedCornerShape(40.dp),
                    border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                    onClick = { isOnSubjectDropDown = true },
                ) {
                    Text(text = "Select Subject")
                }
            }
            DropdownMenu(
                expanded = isOnSubjectDropDown,
                onDismissRequest = { isOnSubjectDropDown != isOnSubjectDropDown }) {
                Constants.dropDownListItemsForSubjects.forEach { label ->
                    DropdownMenuItem(onClick = {
                        subject = label
                        isOnSubjectDropDown = false
                        //have a function to open a specific chart channel on its click
                    }) {
                        Text(text = label)
                    }
                }
            }
            Button(
                shape = RoundedCornerShape(40.dp),
                border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                onClick = { isOnLevelDropDown = true },
            ) {
                Text(text = "Select Level    ")
            }
            DropdownMenu(
                expanded = isOnLevelDropDown,
                onDismissRequest = { isOnLevelDropDown != isOnLevelDropDown }) {
                Constants.dropDownListItemsForLevel.forEach { label ->
                    DropdownMenuItem(onClick = {
                        level = label
                        isOnLevelDropDown = false
                    }) {
                        Text(text = label)
                    }
                }
            }
            Button(modifier = Modifier
                .padding(
                    top = 48.dp,
                ),
                shape = RoundedCornerShape(40.dp),
                border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                onClick = {
                    if (paper.isNotEmpty() && level.isNotEmpty() && subject.isNotEmpty() && month.isNotEmpty() && localUrl.isNotEmpty() && year != 0) {
                        viewModel.onEvent(
                            UploadScreenEvent.OnUploadClick(
                                QuestionPaper(
                                    level = level,
                                    month = month,
                                    paper = paper,
                                    subject = subject,
                                    year = year
                                ),
                                PdfDocument(
                                    localUri =localUrl,
                                    answerUri = localUrlAnswer
                                )
                            )
                        )
                    } else {
                        Toast.makeText(
                            context,
                            "Choose a question paper pdf and select all 5 options", Toast.LENGTH_LONG
                        ).show()
                    }
                }) {
                Text(
                    textAlign = TextAlign.Center,
                    text = "Upload",
                    modifier = Modifier.padding(start = 4.dp, end = 4.dp, top = 4.dp, bottom = 4.dp)
                )
            }
            if (isLoading) {
                LottieLoader(anim = R.raw.loader2,modifier = Modifier.padding(20.dp))
            }
        }
    } else {
        Column() {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(text = "$level $subject $month $year $paper Question: $localUrl Answer: $localUrlAnswer")
            }
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxSize()
            ) {
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .padding(top = 48.dp)
                ) {
                    Button(
                        shape = RoundedCornerShape(40.dp),
                        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = { launcher.launch(intent) },
                    ) {
                        Text(text = "Select question")
                    }
                    Button(
                        shape = RoundedCornerShape(40.dp),
                        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = { isOnPaperDropDown = true },
                    ) {
                        Text(text = "Select Paper  ")
                    }
                    DropdownMenu(
                        expanded = isOnPaperDropDown,
                        onDismissRequest = { isOnPaperDropDown != isOnPaperDropDown }) {
                        Constants.dropDownListItemsForPaper.forEach { label ->
                            DropdownMenuItem(onClick = {
                                paper = label
                                isOnPaperDropDown = false
                            }) {
                                Text(text = label)
                            }
                        }
                    }
                    Button(
                        shape = RoundedCornerShape(40.dp),
                        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = { isOnMonthDropDown = true },
                    ) {
                        Text(text = "Select Month  ")
                    }
                    DropdownMenu(
                        expanded = isOnMonthDropDown,
                        onDismissRequest = { isOnMonthDropDown != isOnMonthDropDown }) {
                        Constants.dropDownListItemsForMonth.forEach { label ->
                            DropdownMenuItem(onClick = {
                                month = label
                                isOnMonthDropDown = false
                            }) {
                                Text(text = label)
                            }
                        }
                    }
                }
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f)

                ) {
                    Button(
                        modifier = Modifier.padding(top = 28.dp),
                        shape = RoundedCornerShape(40.dp),
                        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = { isOnLevelDropDown = true },
                    ) {
                        Text(text = "Select Level    ")
                    }
                    DropdownMenu(
                        expanded = isOnLevelDropDown,
                        onDismissRequest = { isOnLevelDropDown != isOnLevelDropDown }) {
                        Constants.dropDownListItemsForLevel.forEach { label ->
                            DropdownMenuItem(onClick = {
                                level = label
                                isOnLevelDropDown = false
                                //have a function to open a specific chart channel on its click
                            }) {
                                Text(text = label)
                            }
                        }
                    }
                    Button(modifier = Modifier
                        .padding(
                            top = 28.dp,
                        ),
                        shape = RoundedCornerShape(40.dp),
                        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = {
                            if (paper.isNotEmpty() && level.isNotEmpty() && subject.isNotEmpty() && month.isNotEmpty() && localUrl.isNotEmpty() &&  year != 0) {
                                viewModel.onEvent(
                                    UploadScreenEvent.OnUploadClick(
                                        QuestionPaper(
                                            level = level,
                                            month = month,
                                            paper = paper,
                                            subject = subject,
                                            year = year
                                        ),
                                        PdfDocument(
                                            localUri =localUrl,
                                            answerUri = localUrlAnswer
                                        )
                                    )
                                )
                            } else {
                                Toast.makeText(
                                    context,
                                    "Choose a question paper pdfs and select all 5 options", Toast.LENGTH_LONG
                                ).show()
                            }
                        }) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Upload",
                            modifier = Modifier
                                .padding(
                                    start = 4.dp,
                                    end = 4.dp,
                                    top = 4.dp,
                                    bottom = 4.dp
                                )
                        )
                    }
                    if (isLoading) {
                        LottieLoader(anim = R.raw.loader2,modifier = Modifier.padding(20.dp))
                    }
                }
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .padding(top = 48.dp)
                ) {
                    Button(
                        shape = RoundedCornerShape(40.dp),
                        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = { launcherAnswer.launch(intent) },
                    ) {
                        Text(text = "Select answer  ")
                    }
                    Button(
                        shape = RoundedCornerShape(40.dp),
                        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = { isOnYearDropDown = true },
                    ) {
                        Text(text = "Select Year    ")
                    }
                    DropdownMenu(
                        expanded = isOnYearDropDown,
                        onDismissRequest = { isOnYearDropDown != isOnYearDropDown }) {
                        Constants.dropDownListItemsForYear.forEach { label ->
                            DropdownMenuItem(onClick = {
                                year = label
                                isOnYearDropDown = false
                            }) {
                                Text(text = label.toString())
                            }
                        }
                    }
                    Button(
                        modifier = Modifier,
                        shape = RoundedCornerShape(40.dp),
                        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = { isOnSubjectDropDown = true },
                    ) {
                        Text(text = "Select Subject")
                    }
                }
                DropdownMenu(
                    expanded = isOnSubjectDropDown,
                    onDismissRequest = { isOnSubjectDropDown != isOnSubjectDropDown }) {
                    Constants.dropDownListItemsForSubjects.forEach { label ->
                        DropdownMenuItem(onClick = {
                            subject = label
                            isOnSubjectDropDown = false
                            //have a function to open a specific chart channel on its click
                        }) {
                            Text(text = label)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

        }
    }
}


