package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.quiz_game

sealed class QuizGameScreenEvent{
   object ReStart :QuizGameScreenEvent()
   object AddScore :QuizGameScreenEvent()
   object AddGameNumber :QuizGameScreenEvent()
}
