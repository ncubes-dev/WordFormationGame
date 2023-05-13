package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColors(
    secondary = Color(0xff027bb4),//)
    primary = Color(0xFF692F04),
    primaryVariant = Color(0xFF41362E),
    onPrimary = Color(0xFFFFFFFF),
    onSecondary = Color(0xFFFFFFFF),

    )

private val LightColorPalette = lightColors(
    primary = Color(0xff027bb4),//)
    secondary = Color(0xFF692F04),
    primaryVariant = Color(0xFF634E3E),
    onPrimary = Color(0xFFF5F5F2),
    onSecondary = Color(0xFFF3F3ED),

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ZimsecPastExamPapersAndMarksSchemesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}