package com.ncubesdev.wordformationgame

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.ads.MobileAds
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.InstallStateUpdatedListener
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.InstallStatus
import com.google.android.play.core.install.model.UpdateAvailability
import com.google.android.play.core.ktx.isFlexibleUpdateAllowed
import com.google.android.play.core.ktx.isImmediateUpdateAllowed
import com.google.android.play.core.review.ReviewManagerFactory
import com.ncubesdev.wordformationgame.ui.other_apps_screen.AddAppAdvertAndAdmin
import com.ncubesdev.wordformationgame.ui.other_apps_screen.OtherAppsListScreen
import com.ncubesdev.wordformationgame.ui.quiz_game.QuizScreen
import com.ncubesdev.wordformationgame.ui.quiz_game.QuizViewModel
import com.ncubesdev.wordformationgame.ui.theme.WordFormationGameTheme
import com.ncubesdev.wordformationgame.util.Constants
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var adMobInterstitial: AdMobInterstitial
    private lateinit var appUpdateManager: AppUpdateManager
    private val updateType = AppUpdateType.FLEXIBLE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appUpdateManager = AppUpdateManagerFactory.create(applicationContext)
        if (updateType == AppUpdateType.FLEXIBLE) {
            appUpdateManager.registerListener(installStateUpdatedListener)
        }
        checkAppUpdates()
        MobileAds.initialize(this)
        adMobInterstitial.loadAd()
        setContent {
            WordFormationGameTheme {
                showReviewDialog()
                Surface(color = MaterialTheme.colors.background) {
                    val quizViewModel: QuizViewModel = hiltViewModel()
                    val navController= rememberNavController()
                    NavHost(navController = navController, startDestination = Constants.GAME_SCREEN){
                        composable(route=Constants.GAME_SCREEN){
                            Column {
                                QuizScreen(quizViewModel = quizViewModel, navController = navController, context = this@MainActivity, showAd = {
                                    adMobInterstitial.showAdd(
                                        this@MainActivity)
                                })
                            }
                        }
                        composable(route = Constants.OTHER_APPS){
                            OtherAppsListScreen(quizViewModel = quizViewModel,navController,this@MainActivity)
                        }
                        composable(Constants.ADMIN_PANNEL){
                            AddAppAdvertAndAdmin(quizViewModel = quizViewModel)
                        }
                    }
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
    private fun checkAppUpdates() {
        appUpdateManager.appUpdateInfo.addOnSuccessListener { info ->
            val isUpdateAvailable = info.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
            val isUpdateAllowed = when (updateType) {
                AppUpdateType.FLEXIBLE -> info.isFlexibleUpdateAllowed
                AppUpdateType.IMMEDIATE -> info.isImmediateUpdateAllowed
                else -> false
            }
            if (isUpdateAvailable && isUpdateAllowed) {
                appUpdateManager.startUpdateFlowForResult(
                    info, updateType, this, 123
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (updateType == AppUpdateType.FLEXIBLE) {
            appUpdateManager.unregisterListener(installStateUpdatedListener)
        }
    }

    override fun onResume() {
        super.onResume()
        if (updateType == AppUpdateType.IMMEDIATE) {
            appUpdateManager.appUpdateInfo.addOnSuccessListener { info ->
                if (info.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS) {
                    appUpdateManager.startUpdateFlowForResult(
                        info, updateType, this, 123
                    )
                }
            }
        }
    }

    private val installStateUpdatedListener = InstallStateUpdatedListener { state ->
        if (state.installStatus() == InstallStatus.DOWNLOADED) {
            Toast.makeText(
                applicationContext,
                "Download successful. Restarting app in 5 seconds",
                Toast.LENGTH_SHORT
            ).show()
            lifecycleScope.launch {
                delay(5000)
                appUpdateManager.completeUpdate()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 123) {
            if (resultCode != RESULT_OK) {
                Toast.makeText(applicationContext, "update failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
