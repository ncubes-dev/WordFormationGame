package com.ncubesdev.wordformationgame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.android.play.core.review.ReviewManagerFactory
import com.ncubesdev.wordformationgame.ui.theme.WordFormationGameTheme
import com.ncubesdev.wordformationgame.ui.quiz_game.QuizScreen
import com.ncubesdev.wordformationgame.ui.quiz_game.QuizViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WordFormationGameTheme {
                showReviewDialog()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val quizViewModel: QuizViewModel = hiltViewModel()
                    QuizScreen(quizViewModel = quizViewModel)
                }
            }
        }
    }
    private fun showReviewDialog() {
        val reviewManager = ReviewManagerFactory.create(applicationContext)
        reviewManager.requestReviewFlow().addOnCompleteListener {
            if (it.isSuccessful) {
                reviewManager.launchReviewFlow(this, it.result)
            }
        }
    }
}
