package com.ncubesdev.wordformationgame.ui.other_apps_screen

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import com.ncubesdev.wordformationgame.R
import com.ncubesdev.wordformationgame.ui.quiz_game.QuizViewModel
import com.ncubesdev.wordformationgame.util.Constants
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.shareLink
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun OtherAppsListScreen(
    quizViewModel: QuizViewModel,
    navController:NavController,
    context: Activity,
    urlIntent:(String)->Unit
) {
    val otherApps by quizViewModel.myOtherApps.collectAsState()
    val scope = rememberCoroutineScope()
    var key by remember {
        mutableStateOf(0)
    }
Scaffold(
    floatingActionButton = { FloatingActionButton(onClick = { context.shareLink("https://play.google.com/store/apps/details?id=com.ncubesdev.wordformationgame") }) {
        Icon(imageVector = Icons.Default.Share, contentDescription ="share app" )
    }}
) {paddingValues->
    paddingValues.toString()
    Column(modifier = Modifier
        .fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Developed By--",
                fontFamily = FontFamily.SansSerif,
                style = MaterialTheme.typography.caption
            )
            Text(text = "@ncubesdev", modifier = Modifier.clickable {
                key++
                scope.launch {
                    delay(2000)
                    if (key == 7) {
                        navController.navigate(Constants.ADMIN_PANNEL)
                        key = 0
                    }
                }

            }, fontWeight = FontWeight.Bold)
            Text(
                modifier = Modifier.clickable {
                    Toast.makeText(
                        context,
                        "find me via chat with developer",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                text = "ncubes1999@gmail.com",
                fontFamily = FontFamily.SansSerif,
                style = MaterialTheme.typography.caption
            )
        }
        LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 150.dp)) {
            items(otherApps) { myOtherApp ->
                SubjectCard(
                    appName = myOtherApp.name,
                    painter = painterResource(id = R.drawable.google_play),
                    des = myOtherApp.description,
                    url = myOtherApp.url,
                    urlIntent = {urlIntent(it)}
                )
            }
        }

    }
}
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SubjectCard(
    appName: String,
    des: String,
    url: String,
    painter: Painter,
    urlIntent:(String)->Unit
) {
    var isDialog by remember {
        mutableStateOf(false)
    }
    val context = LocalContext.current
    Card(
        onClick = { isDialog=true },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(5.dp)
            .height(150.dp)
            .shadow(
                ambientColor = Color.Yellow,
                spotColor = Color(0xFF945324),
                elevation = 25.dp,
                shape = RoundedCornerShape(10.dp)
            ),
        elevation = 10.dp,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        if (isDialog) {
            CustomDialog(description = des, onDismissRequest = {isDialog = false}, link = url, name = appName, urlIntent = {urlIntent(it)})
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .padding(5.dp)
                    .size(50.dp)
            )
            Text(
                text = appName,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.body2,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = des,
                style = MaterialTheme.typography.caption,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp),
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }
}

@Composable
fun CustomDialog(
    description: String,
    link: String,
    name: String,
    onDismissRequest: () -> Unit,
    urlIntent:(String)->Unit
) {
    Dialog(onDismissRequest = { onDismissRequest() }) {
            Surface(shape = MaterialTheme.shapes.medium) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                        .clip(MaterialTheme.shapes.medium)
                ) {
                    Text(
                        text = name,
                        modifier = Modifier.padding(5.dp),
                        color = MaterialTheme.colors.primary,
                        style = MaterialTheme.typography.h6
                    )
                    Text(
                        text = description,
                        modifier = Modifier.padding(5.dp),
                        style = MaterialTheme.typography.body2
                    )
                    Button(shape=MaterialTheme.shapes.medium,onClick = {
                        urlIntent(link)
                    }) {
                        Text(text = "view in play store")
                    }
                }
            }
//        }
    }
}
