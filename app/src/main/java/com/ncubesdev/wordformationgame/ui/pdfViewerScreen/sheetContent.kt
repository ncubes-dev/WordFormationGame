package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import com.ncubesdev.zimsecpastexampapersandmarksschemes.R
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.NavParameter
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.Constants
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.shareLink


fun urlIntent(url: String, context: Context) {
    val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    ContextCompat.startActivity(context, webIntent, null)///webIntent
}

@Composable
fun SheetContent(
    navController: NavController,
    closeSheet: () -> Unit
) {
    val context = LocalContext.current
    val contacts = listOf(
        NavParameter(
            icon = painterResource(id = R.drawable.chart),
            text = "Chart With Developer",
            color = MaterialTheme.colors.onSurface,
            link = "https://wa.me/message/NSDZUHX5UPA7I1"
        ),
        NavParameter(
            icon = painterResource(id = R.drawable.whatsapp),
            text = "WhatsApp group",
            color = Color.Green,
            link = "https://chat.whatsapp.com/IZ8iSqQeoVEEgAUe6PO9n1"
        ),

        )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(10.dp)
    ) {
        item {
            Surface(elevation = 1.dp) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable {
                        navController.navigate(Constants.UPLOAD_SCREEN)
                        closeSheet()
                    }
                    .padding(5.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.file_upload),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onSurface
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Upload Papers")
                }
            }
        }
        item {
            Surface(elevation = 1.dp) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable {
                        navController.navigate(Constants.PRACTICE)
                        closeSheet()
                    }
                    .padding(5.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.questions),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onSurface
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Practice Questions")
                }
            }
        }
        item {
            Surface(elevation = 1.dp) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable {
                        navController.navigate(Constants.GAME)
                        closeSheet()
                    }
                    .padding(5.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.game),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onSurface
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Simple game")
                }
            }
        }


//        item {
//            Surface(elevation = 1.dp) {
//                Row(modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
//                    .clickable {
//                        navController.navigate(Constants.UPDATE_SCREEN)
//                        closeDrawer()
//                    }
//                    .padding(5.dp),
//                    horizontalArrangement = Arrangement.Start,
//                    verticalAlignment = Alignment.CenterVertically) {
//                    Icon(
//                        painter = painterResource(id = R.drawable.file_upload),
//                        contentDescription = null,
//                        tint = MaterialTheme.colors.onSurface
//                    )
//                    Spacer(modifier = Modifier.width(10.dp))
//                    Text(text = "Upload Answers")
//                }
//            }
//        }
        items(contacts) {
            NavItems(
                it.icon,
                it.text,
                it.color,
                it.link,
                closeDrawer = { closeSheet() }
            )
        }
        item {
            Surface(elevation = 1.dp) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { context.shareLink("https://play.google.com/store/apps/details?id=com.ncubesdev.zimsecpastexampapersandmarksschemes") }
                    .padding(5.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_share_24),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onSurface
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "share the app")
                }
            }
        }
    }
}
