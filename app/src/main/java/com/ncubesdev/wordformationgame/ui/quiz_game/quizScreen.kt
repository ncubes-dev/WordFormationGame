package com.ncubesdev.wordformationgame.ui.quiz_game

import android.annotation.SuppressLint
import android.app.Activity
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.ncubesdev.wordformationgame.util.Constants
import com.ncubesdev.wordformationgame.util.UiEvents
import com.ncubesdev.wordformationgame.util.surportAllScreen.WindowInfo
import com.ncubesdev.wordformationgame.util.surportAllScreen.rememberWindowInfo
import kotlinx.coroutines.launch

@SuppressLint("UnrememberedMutableState")
@Composable
fun QuizScreen(quizViewModel: QuizViewModel, showAd: () -> Unit, context: Activity) {
    val uiState by quizViewModel.uiState.collectAsState()
    var isDropDown by remember { mutableStateOf(false) }
    var isDropDownList by remember { mutableStateOf(false) }
    var isDialog by remember { mutableStateOf(false) }
    val scaffoldState = rememberScaffoldState()
    val validWords by quizViewModel.validWords.collectAsState()
    val possibleStrings by quizViewModel.possibleStrings.collectAsState()
    val highScore by quizViewModel.highScore.collectAsState()
    val numberOfGames by quizViewModel.numberOfGames.collectAsState()
    val charactersList = derivedStateOf {
        possibleStrings.toCharArray()
    }
    val showAnswer = rememberSaveable {
        mutableStateOf(false)
    }
    val isPressed0 = rememberSaveable { mutableStateOf(false) }
    val isPressed1 = rememberSaveable { mutableStateOf(false) }
    val isPressed2 = rememberSaveable { mutableStateOf(false) }
    val isPressed3 = rememberSaveable { mutableStateOf(false) }
    val answer = rememberSaveable { mutableStateOf("") }
    var name by rememberSaveable { mutableStateOf("") }
    val scope = rememberCoroutineScope()


    val windowInfo = rememberWindowInfo()
    LaunchedEffect(key1 = true) {
        quizViewModel.uiEvent.collect {
            when (it) {
                is UiEvents.Error -> {
                    Toast.makeText(context,"${it.message}",Toast.LENGTH_LONG).show()
                }
                is UiEvents.StartLoading -> {
                Toast.makeText(context,"Registering...",Toast.LENGTH_LONG).show()
                }
                is UiEvents.Success->{
                    name=""
                    Toast.makeText(context,"Register Success!",Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButton = {
            FloatingActionButton(onClick = {
                answer.value = ""
                showAnswer.value = true
                scope.launch {
                    //reveal answer
                    when (scaffoldState.snackbarHostState.showSnackbar(
                        message = "",
                        actionLabel = "Play Again",
                        duration = SnackbarDuration.Indefinite
                    )) {
                        SnackbarResult.Dismissed -> {}
                        SnackbarResult.ActionPerformed -> {
                            answer.value = ""
                            showAnswer.value = false
                            isPressed0.value = false
                            isPressed1.value = false
                            isPressed2.value = false
                            isPressed3.value = false
                            quizViewModel.onEvent(QuizGameScreenEvent.ReStart)
                            quizViewModel.onEvent(QuizGameScreenEvent.AddGameNumber)
                            showAd()
                        }
                    }
                }
            }, shape = MaterialTheme.shapes.medium) {
                Text(text = "Solution", modifier = Modifier.padding(10.dp))
            }
        }) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Surface(
                        border = BorderStroke(2.dp, MaterialTheme.colors.primary),
                        shape = MaterialTheme.shapes.medium,
                        modifier = if (answer.value.isEmpty()) Modifier
                            .width(100.dp)
                            .height(40.dp) else Modifier
                    ) {
                        Text(
                            text = answer.value,
                            style = MaterialTheme.typography.h4,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(5.dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    if (!isPressed1.value) {
                        GameButton(text = charactersList.value[1].toString(), onClick = {
                            isPressed1.value = true
                            answer.value = answer.value + charactersList.value[1].toString()
                        })
                    }
                    if (!isPressed2.value) {
                        GameButton(text = charactersList.value[2].toString(), onClick = {
                            isPressed2.value = true
                            answer.value = answer.value + charactersList.value[2].toString()
                        })
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    if (!isPressed0.value) {
                        GameButton(text = charactersList.value[0].toString(), onClick = {
                            isPressed0.value = true
                            answer.value = answer.value + charactersList.value[0].toString()
                        })
                    }

                    FloatingActionButton(
                        onClick = { },
                        elevation = FloatingActionButtonDefaults.elevation(
                            defaultElevation = 0.dp,
                            pressedElevation = 0.dp,
                            focusedElevation = 0.dp,
                            hoveredElevation = 0.dp,
                        ),
                        contentColor = MaterialTheme.colors.surface,
                        backgroundColor = MaterialTheme.colors.surface
                    ) {

                    }
                    FloatingActionButton(
                        onClick = { },
                        elevation = FloatingActionButtonDefaults.elevation(
                            defaultElevation = 0.dp,
                            pressedElevation = 0.dp,
                            focusedElevation = 0.dp,
                            hoveredElevation = 0.dp,
                        ),
                        contentColor = MaterialTheme.colors.surface,
                        backgroundColor = MaterialTheme.colors.surface
                    ) {}
                    if (!isPressed3.value) {
                        GameButton(text = charactersList.value[3].toString(), onClick = {
                            isPressed3.value = true
                            answer.value = answer.value + charactersList.value[3].toString()
                        })
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    if (isPressed1.value && isPressed0.value && isPressed2.value && isPressed3.value) {
                        Button(onClick = {
                            if (validWords.contains(answer.value) && !quizViewModel.answers.contains(
                                    answer.value
                                )
                            ) {
                                quizViewModel.answers.add(answer.value)
                                answer.value = ""
                                isPressed0.value = false
                                isPressed1.value = false
                                isPressed2.value = false
                                isPressed3.value = false
                                scope.launch {
                                    val snackbarResult =
                                        scaffoldState.snackbarHostState.showSnackbar(
                                            message = if (quizViewModel.answers.size != validWords.size) "Nice!" else "Excellent Work! You Win",
                                            actionLabel = if (quizViewModel.answers.size != validWords.size) null else "Play Again",
                                            duration = if (quizViewModel.answers.size != validWords.size) SnackbarDuration.Short else SnackbarDuration.Indefinite
                                        )
                                    when (snackbarResult) {
                                        SnackbarResult.ActionPerformed -> {
                                            answer.value = ""
                                            showAnswer.value = false
                                            isPressed0.value = false
                                            isPressed1.value = false
                                            isPressed2.value = false
                                            isPressed3.value = false
                                            quizViewModel.onEvent(QuizGameScreenEvent.AddScore)
                                            quizViewModel.onEvent(QuizGameScreenEvent.ReStart)
                                            quizViewModel.onEvent(QuizGameScreenEvent.AddGameNumber)
                                        }

                                        SnackbarResult.Dismissed -> {}
                                    }
                                }
                            } else {
                                scope.launch {
                                    scaffoldState.snackbarHostState.showSnackbar(
                                        message = "Sorry incorrect! Try again",
                                        duration = SnackbarDuration.Short
                                    )
                                }
                                answer.value = ""
                                isPressed0.value = false
                                isPressed1.value = false
                                isPressed2.value = false
                                isPressed3.value = false
                            }
                        }) {
                            Text(text = "Submit")
                        }
                    }
                }
                if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Solutions",
                            style = MaterialTheme.typography.h6,
                            modifier = Modifier.padding(20.dp)
                        )
                        LazyRow {
                            items(validWords) {
                                Surface(
                                    border = BorderStroke(
                                        2.dp,
                                        color = MaterialTheme.colors.primary,
                                    ),
                                    shape = MaterialTheme.shapes.medium,
                                    modifier = Modifier.padding(5.dp)
                                ) {
                                    if (showAnswer.value || quizViewModel.answers.contains(it)) {
                                        Text(
                                            text = it,
                                            style = MaterialTheme.typography.h4,
                                            fontWeight = FontWeight.Bold,
                                            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                                        )
                                    } else {
                                        Surface(
                                            border = BorderStroke(
                                                2.dp,
                                                color = MaterialTheme.colors.primary
                                            ),
                                            shape = MaterialTheme.shapes.medium,
                                            modifier = Modifier
                                                .width(100.dp)
                                                .height(40.dp)
                                                .padding(5.dp)
                                        ) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp), contentAlignment = Alignment.TopStart
        ) {
            Column() {
                Text(
                    text = "High Score : ${(uiState.highScorePlayer?.numberOfWins?.toInt() ?: 0) / (uiState.highScorePlayer?.numberOfGames?.toInt() ?: 0)} by ${uiState.highScorePlayer?.name} ",
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = "Your Score: ${highScore.toInt() / numberOfGames.toInt()}",
                    modifier = Modifier.padding(5.dp)
                )
                if (windowInfo.screenWidthInfo !is WindowInfo.WindowType.Compact) {
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Solutions",
                            style = MaterialTheme.typography.h6,
                            modifier = Modifier.padding(10.dp)
                        )
                        LazyColumn {
                            items(validWords) {
                                Surface(
                                    border = BorderStroke(
                                        2.dp,
                                        color = MaterialTheme.colors.primary,
                                    ),
                                    shape = MaterialTheme.shapes.medium,
                                    modifier = Modifier.padding(5.dp)
                                ) {
                                    if (showAnswer.value || quizViewModel.answers.contains(it)) {
                                        Text(
                                            text = it,
                                            style = MaterialTheme.typography.h4,
                                            fontWeight = FontWeight.Bold,
                                            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                                        )
                                    } else {
                                        Surface(
                                            border = BorderStroke(
                                                2.dp,
                                                color = MaterialTheme.colors.primary
                                            ),
                                            shape = MaterialTheme.shapes.medium,
                                            modifier = Modifier
                                                .width(100.dp)
                                                .height(40.dp)
                                                .padding(5.dp)
                                        ) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            DropdownMenu(
                expanded = isDropDownList,
                onDismissRequest = { isDropDownList = false }) {
                uiState.players.forEach { player ->
                    DropdownMenuItem(onClick = {
                        isDropDown = false
                    }) {
                        Text(
                            text = player.name+ ": "+"${(player.numberOfWins.toInt()) / (player.numberOfGames.toInt())}",
                            color = MaterialTheme.colors.error,
                            style = MaterialTheme.typography.caption
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            contentAlignment = Alignment.TopEnd
        ) {

            Dialog(onDismissRequest = { isDialog = true }) {
                Surface(shape = MaterialTheme.shapes.medium) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .clip(MaterialTheme.shapes.medium)
                    ) {
                        OutlinedTextField(value = name, onValueChange = { name = it }, label = {
                            Text(
                                text = "Username",
                                modifier = Modifier.padding(5.dp),
                            )
                        })
                        Button(shape = MaterialTheme.shapes.medium, onClick = {
                            quizViewModel.onEvent(
                                QuizGameScreenEvent.SignUp(
                                    name = name,
                                    context = context
                                )
                            )
                        }) {
                            Text(text = "Register")
                        }
                        if (uiState.loading) {
                            CircularProgressIndicator()
                        }
                    }
                }
            }
            Row() {
                FloatingActionButton(onClick = {
                    isDropDownList=true
                }) {
                    Icon(imageVector =Icons.Default.Menu, tint=Color.Green, contentDescription = "list")
                }
                FloatingActionButton(onClick = {
                   if (uiState.admin==null){
                       isDialog = true
                   }else{
                      Toast.makeText(context,"You are already registered",Toast.LENGTH_LONG).show()
                   }
                }) {
                    Icon(imageVector =Icons.Default.Person,tint=if (uiState.admin==null) MaterialTheme.colors.error else Color.Green, contentDescription = "register")
                }
                FloatingActionButton(onClick = { isDropDown = true }) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "help")
                    DropdownMenu(
                        expanded = isDropDown,
                        onDismissRequest = { isDropDown = false }) {
                        Constants.gameInstructions.forEach { label ->
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
    }
}

