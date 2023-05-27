package com.ncubesdev.wordformationgame.ui.quiz_game

import android.app.Activity
import com.ncubesdev.wordformationgame.dormain.models.MyOtherApp

sealed class QuizGameScreenEvent{
   object ReStart : QuizGameScreenEvent()
   object AddScore : QuizGameScreenEvent()
   data class SignUp(val context:Activity,val name:String) : QuizGameScreenEvent()
   object AddGameNumber : QuizGameScreenEvent()

   data class SendAppAd(val myOtherApp: MyOtherApp) :
      QuizGameScreenEvent()


}
