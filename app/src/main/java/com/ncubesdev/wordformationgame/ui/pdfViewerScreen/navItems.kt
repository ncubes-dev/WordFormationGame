package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun NavItems(
    icon: Painter,
    text: String,
    color: Color,
    link: String,
    closeDrawer:()->Unit
) {
    val context = LocalContext.current
    Surface(elevation = 1.dp) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clickable {
                urlIntent(url = link, context = context)
                closeDrawer()
            }
            .padding(5.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = icon, contentDescription = null, tint = color)
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = text)
        }
    }
}