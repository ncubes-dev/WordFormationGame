package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.quiz_game

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.size
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun GameButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var isPressed by remember { mutableStateOf(false) }
    val backgroundColor by animateColorAsState(
        if (isPressed) MaterialTheme.colors.secondary else MaterialTheme.colors.primary
    )
    val contentColor by animateColorAsState(
        if (isPressed) MaterialTheme.colors.onSecondary else MaterialTheme.colors.onPrimary
    )
    FloatingActionButton(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        onClick = {
          onClick()
        },
        modifier = Modifier.size(100.dp)
    ) {
        Text(text, style = MaterialTheme.typography.h4, color = contentColor)
    }
}