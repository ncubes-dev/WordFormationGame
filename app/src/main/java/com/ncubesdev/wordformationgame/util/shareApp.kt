package com.ncubesdev.zimsecpastexampapersandmarksschemes.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat

fun Context.shareLink(url:String){
    val sendIntent=Intent(Intent.ACTION_SEND).apply {
        putExtra(Intent.EXTRA_TEXT,url)
        type="text/plain"
    }
    val shareIntent=Intent.createChooser(sendIntent,null)
    startActivity(shareIntent)
}

