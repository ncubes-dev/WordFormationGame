package com.ncubesdev.zimsecpastexampapersandmarksschemes.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

data class NavParameter(
    val icon: Painter,
    val text: String,
    val color: Color,
    val link: String="",


)
