package com.ncubesdev.wordformationgame.ui.quiz_game

import android.app.Activity

sealed class QuizGameScreenEvent{
   object ReStart : QuizGameScreenEvent()
   object AddScore : QuizGameScreenEvent()
   data class SignUp(val context:Activity,val name:String) : QuizGameScreenEvent()
   object AddGameNumber : QuizGameScreenEvent()
}
