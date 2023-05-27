package com.ncubesdev.wordformationgame.ui.other_apps_screen

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

import com.ncubesdev.wordformationgame.dormain.models.MyOtherApp
import com.ncubesdev.wordformationgame.ui.quiz_game.QuizGameScreenEvent
import com.ncubesdev.wordformationgame.ui.quiz_game.QuizViewModel
import com.ncubesdev.wordformationgame.util.UiEvents
import kotlinx.coroutines.delay

@Composable
fun AddAppAdvertAndAdmin(quizViewModel: QuizViewModel) {
    var url by rememberSaveable {
        mutableStateOf("")
    }
    var description by rememberSaveable {
        mutableStateOf("")
    }
    var name by rememberSaveable {
        mutableStateOf("")
    }
    var isAuthDialogShown by remember {
        mutableStateOf(true)
    }
    var stopLoading by remember {
        mutableStateOf(true)
    }
    LaunchedEffect(key1 = true) {
        delay(1000)
        isAuthDialogShown = true
    }
    var key by remember {
        mutableStateOf("")
    }
    val context = LocalContext.current

    LaunchedEffect(key1 = true) {
        quizViewModel.uiEvent.collect {
            when (it) {
                is UiEvents.AppAdSent -> {
                    name = ""
                    description = ""
                    url = ""
                    stopLoading = true
                }
                else -> {}
            }
        }

    }
    if (isAuthDialogShown) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Dialog(onDismissRequest = {}) {
                Surface(shape = MaterialTheme.shapes.medium) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        OutlinedTextField(
                            modifier = Modifier.padding(5.dp),
                            value = key,
                            onValueChange = { key = it },
                            label = { Text(text = "Pin Number") })
                        Button(modifier = Modifier.padding(5.dp), onClick = {
                            if (key == "0784250787") {
                                isAuthDialogShown = false
                            } else {
                                Toast.makeText(context, "keep trying", Toast.LENGTH_SHORT).show()
                            }
                        }) {
                            Text(text = "Enter")
                        }
                    }
                }
            }
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                label = { Text(text = "App Name") }
            )
            OutlinedTextField(
                value = description,
                onValueChange = { description = it },
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                label = { Text(text = "App Description") }
            )
            OutlinedTextField(
                value = url,
                onValueChange = { url = it },
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                label = { Text(text = "App download link") }
            )
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium,
                    onClick = {
                        if (url.isNotEmpty() && description.isNotEmpty() && name.isNotEmpty()) {
                            stopLoading = false
                            quizViewModel.onEvent(
                                QuizGameScreenEvent.SendAppAd(
                                    MyOtherApp(
                                        name = name,
                                        description = description,
                                        url = url
                                    )
                                )
                            )
                        }
                    }) {
                    Text(text = "Save")
                }
            if (!stopLoading) {
                CircularProgressIndicator()
            }
        }
    }
}