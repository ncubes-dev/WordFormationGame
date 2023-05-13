package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView

@SuppressLint("VisibleForTests")
@Composable
fun BannerAdView() {
    AndroidView(
        modifier = Modifier
            .fillMaxWidth(),
        factory = { context ->
            AdView(context).apply {
                setAdSize(AdSize.BANNER)
                // Add your adUnitID, this is for testing.
                adUnitId = "ca-app-pub-5556067296782269/8353156179"
                //ca-app-pub-5556067296782269/8353156179
                loadAd(AdRequest.Builder().build())
            }
        }
    )
}