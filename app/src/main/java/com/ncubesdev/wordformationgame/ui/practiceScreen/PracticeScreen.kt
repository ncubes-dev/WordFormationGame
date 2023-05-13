package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.practiceScreen

import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.PracticePapersLists
import com.ncubesdev.zimsecpastexampapersandmarksschemes.dormain.models.PracticeQuestion
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.Constants
import kotlinx.coroutines.launch

@SuppressLint("UnrememberedMutableState")
@Composable
fun PracticeScreen(res: Int) {
    val questions = listOf<List<PracticeQuestion>>(
        PracticePapersLists.aPhysics,
        PracticePapersLists.aChemistry,
        PracticePapersLists.aAccounting,
        PracticePapersLists.aBiology,
        PracticePapersLists.aGeography,
        PracticePapersLists.aMaths,
        PracticePapersLists.aComputerScience,
        PracticePapersLists.oPhysics,
        PracticePapersLists.oGeography,
        PracticePapersLists.oAccounting,
        PracticePapersLists.oComputerScience,
        PracticePapersLists.oChemistry,
        PracticePapersLists.oCombinedScience,
        PracticePapersLists.oBiology,
        PracticePapersLists.oMaths,
        PracticePapersLists.oEnglish
    )
    val questionNumber = rememberSaveable { mutableStateOf(1) }

    val myList = derivedStateOf {
        listOf(questions[res].filter { it.answers.contains(it.answer) }[questionNumber.value - 1])
    }
    val totalQuestionNumber = rememberSaveable { mutableStateOf(questions[res].filter { it.answers.contains(it.answer) }.size) }
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val showAnswer = rememberSaveable { mutableStateOf(false) }
    var isDropDown by remember { mutableStateOf(false) }

    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                FloatingActionButton(
                    modifier = Modifier.width(70.dp),
                    shape = MaterialTheme.shapes.medium,
                    backgroundColor = MaterialTheme.colors.primary,
                    onClick = {
                        if (questionNumber.value <= 1) {
                            showAnswer.value = false
                        } else {
                            showAnswer.value = false
                            questionNumber.value -= 1
                        }
                    }) {
                    Text(
                        text = "Back",
                        modifier = Modifier.padding(
                            start = 10.dp,
                            end = 10.dp,
                            top = 5.dp,
                            bottom = 5.dp,
                        )
                    )
                }


                FloatingActionButton(
                    modifier = Modifier.width(100.dp),
                    shape = MaterialTheme.shapes.medium,
                    backgroundColor = MaterialTheme.colors.primary,
                    onClick = {
                        showAnswer.value = true
                    }) {
                    Text(
                        text = "Answer",
                        modifier = Modifier.padding(
                            start = 10.dp,
                            end = 10.dp,
                            top = 5.dp,
                            bottom = 5.dp,
                        )
                    )
                }

                FloatingActionButton(
                    modifier = Modifier.width(70.dp),
                    shape = MaterialTheme.shapes.medium,
                    backgroundColor = MaterialTheme.colors.primary,
                    onClick = {
                        if (questionNumber.value >= totalQuestionNumber.value) {
                            showAnswer.value = false
                            scope.launch {
                                Log.e("mytag", "PracticeScreen: ")
                                when (scaffoldState.snackbarHostState.showSnackbar(
                                    "Your have finished all questions",
                                    "Restart",
                                    SnackbarDuration.Indefinite
                                )) {
                                    SnackbarResult.ActionPerformed -> {
                                        questionNumber.value = 1
                                    }
                                    SnackbarResult.Dismissed -> {}
                                }
                            }
                        } else {
                            questionNumber.value += 1
                            showAnswer.value = false
                        }
                    }) {
                    Text(
                        text = if (questionNumber.value == totalQuestionNumber.value) "Finish" else "Next",
                        modifier = Modifier.padding(
                            start = 10.dp,
                            end = 10.dp,
                            top = 5.dp,
                            bottom = 5.dp,
                        )
                    )
                }
            }
        }
    ) { paddingValues ->
        LazyColumn(contentPadding = paddingValues) {
            item {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Question number: ${questionNumber.value}/${totalQuestionNumber.value}",
                        style = MaterialTheme.typography.h5,
                        color = MaterialTheme.colors.secondary,
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = { isDropDown = true }) {
                        Icon(imageVector = Icons.Filled.Warning, contentDescription = null)
                        DropdownMenu(
                            expanded = isDropDown,
                            onDismissRequest = { isDropDown = false }) {
                            Constants.disclaimer.forEach { label ->
                                DropdownMenuItem(onClick = {
                                    isDropDown = false
                                }) {
                                    Text(
                                        text = label,
                                        color = MaterialTheme.colors.error,
                                        style = MaterialTheme.typography.caption
                                    )
                                }
                            }
                        }

                    }
                }
            }
            items(myList.value) { unShuffleboardQuestion ->
                val practiceQuestion = unShuffleboardQuestion.copy(
                    answers = unShuffleboardQuestion.answers.shuffled()
                )
                val answer = rememberSaveable { mutableStateOf(practiceQuestion.answer) }
                val selectedAnswer = rememberSaveable { mutableStateOf("") }
                Card(
                    elevation = 10.dp
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ) {
                        Text(
                            text = practiceQuestion.question,
                            style = MaterialTheme.typography.body1,
                            fontWeight = FontWeight.Bold
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "(Select your answer)",
                                style = MaterialTheme.typography.caption,
                                color = MaterialTheme.colors.secondary,
                                fontStyle = FontStyle.Italic
                            )
                        }
                        Divider(modifier = Modifier.fillMaxWidth())
                        Surface(
                            color = if (selectedAnswer.value == practiceQuestion.answers[0]) MaterialTheme.colors.primary else MaterialTheme.colors.surface,
                            modifier = Modifier
                                .clickable {
                                    selectedAnswer.value = practiceQuestion.answers[0]
                                }
                                .fillMaxWidth()) {
                            Text(text = practiceQuestion.answers[0],
                                modifier = Modifier
                                    .clickable {

                                        selectedAnswer.value = practiceQuestion.answers[0]
                                    }
                                    .padding(10.dp))
                        }
                        Divider(modifier = Modifier.fillMaxWidth())

                        Surface(
                            color = if (selectedAnswer.value == practiceQuestion.answers[1]) MaterialTheme.colors.primary else MaterialTheme.colors.surface,
                            modifier = Modifier
                                .clickable {
                                    selectedAnswer.value = practiceQuestion.answers[1]

                                }
                                .fillMaxWidth()) {
                            Text(text = practiceQuestion.answers[1],
                                modifier = Modifier
                                    .clickable {
                                        selectedAnswer.value = practiceQuestion.answers[1]
                                    }
                                    .padding(10.dp))
                        }
                        Divider(modifier = Modifier.fillMaxWidth())

                        Surface(
                            color = if (selectedAnswer.value == practiceQuestion.answers[2]) MaterialTheme.colors.primary else MaterialTheme.colors.surface,
                            modifier = Modifier
                                .clickable {
                                    selectedAnswer.value = practiceQuestion.answers[2]
                                }
                                .fillMaxWidth()) {
                            Text(text = practiceQuestion.answers[2],
                                modifier = Modifier
                                    .clickable {
                                        Log.e("mytag", "PracticeScreen:${selectedAnswer.value} ")
                                        selectedAnswer.value = practiceQuestion.answers[2]
                                        Log.e("mytag", "PracticeScreen:${selectedAnswer.value} ")
                                    }
                                    .padding(10.dp))
                        }
                        Divider(modifier = Modifier.fillMaxWidth())

                        Surface(
                            color = if (selectedAnswer.value == practiceQuestion.answers[3]) MaterialTheme.colors.primary else MaterialTheme.colors.surface,
                            modifier = Modifier
                                .clickable {
                                    selectedAnswer.value = practiceQuestion.answers[3]
                                }
                                .fillMaxWidth()) {
                            Text(text = practiceQuestion.answers[3],
                                modifier = Modifier
                                    .clickable {
                                        selectedAnswer.value = practiceQuestion.answers[3]
                                    }
                                    .padding(10.dp))
                        }
                        Divider(modifier = Modifier.fillMaxWidth())

                        AnimatedVisibility(showAnswer.value && selectedAnswer.value.isNotEmpty()) {
                            Column(modifier = Modifier.fillMaxWidth()) {
                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    if (listOf(
                                            practiceQuestion.answers[1],
                                            practiceQuestion.answers[0],
                                            practiceQuestion.answers[2],
                                            practiceQuestion.answers[3]
                                        ).any {
                                            it == practiceQuestion.answer
                                        }
                                    ) {
                                        Text(
                                            text = if (selectedAnswer.value == practiceQuestion.answer) "Good work! your answer is correct" else "Sorry wrong answer ",
                                            style = MaterialTheme.typography.h6,
                                            fontWeight = FontWeight.Bold,
                                            color = if (selectedAnswer.value == practiceQuestion.answer) Color.Green else MaterialTheme.colors.error
                                        )
                                    } else {
                                        Text(
                                            text = "Your answer is :",
                                            style = MaterialTheme.typography.h6,
                                            fontWeight = FontWeight.Bold,
                                            color = if (selectedAnswer.value == practiceQuestion.answer) Color.Green else MaterialTheme.colors.error
                                        )
                                    }
                                }
                                Text(
                                    text = practiceQuestion.answer,
                                    style = MaterialTheme.typography.body1,
                                    color = MaterialTheme.colors.secondary,
                                )
                            }
                        }
                    }

                }
            }
        }
    }
}



