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
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun OtherAppsListScreen(
    quizViewModel: QuizViewModel,
    navController:NavController,
    context: Activity
) {
    val otherApps by quizViewModel.myOtherApps.collectAsState()
    val scope = rememberCoroutineScope()
    var key by remember {
        mutableStateOf(0)
    }

    Column(modifier = Modifier
        .fillMaxSize()) {
        LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 150.dp)) {
            items(otherApps) {
                SubjectCard(
                    appName = it.name,
                    painter = painterResource(id = R.drawable.google_play),
                    des = it.description,
                    url = it.url
                )
            }
        }
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
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SubjectCard(
    appName: String,
    des: String,
    url: String,
    painter: Painter,
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
            CustomDialog(description = des, link = url, context = context, name = appName) {
                isDialog = false
            }
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
    context: Context,
    onDismissRequest: () -> Unit
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
                        urlIntent(url = link, context = context)
                    }) {
                        Text(text = "view in play store")
                    }
                }
            }
//        }
    }
}
fun urlIntent(url: String, context: Context) {
    val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    ContextCompat.startActivity(context, webIntent, null)///webIntent
}