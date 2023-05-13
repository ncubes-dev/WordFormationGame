package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper
@Composable
fun SelectionView(
    viewModel: ViewerScreenViewModel = hiltViewModel(),
    papers: List<QuestionPaper>,

    ) {
    val localLocationCacheInfo by viewModel.allLocationInfo.collectAsState(initial = emptyList())
    Column(modifier = Modifier.fillMaxSize()) {
        LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 150.dp)) {
            items(papers) { mayPaper ->
                var isDropDown by remember { mutableStateOf(false) }
                var isAnswerAvailable by remember { mutableStateOf(true) }
                SelectionElement(
                    QuestionPaper(
                        subject = mayPaper.subject,
                        year = mayPaper.year,
                        paper = mayPaper.paper,
                        level = mayPaper.level,
                        month = mayPaper.month
                    ),
                    onAnswerClick = {
                        viewModel.onEvent(ViewerScreenEvent.OnGetAnswerUrl(mayPaper))
                        viewModel.onEvent(ViewerScreenEvent.Opening)
                    },
                    onQuestionPaperClick = {
                        viewModel.onEvent(ViewerScreenEvent.OnGetQuestionUrl(mayPaper))
                    },
                    onClick = {
                        isAnswerAvailable = mayPaper.answerRemoteUrl.isEmpty()
                        isDropDown = true
                    },
                    isAnswerAvailable = isAnswerAvailable,
                    online = localLocationCacheInfo.any { it.questionLocalUrl.isNotEmpty() && it.id == mayPaper.id },
                    isDropDown = isDropDown,
                    close = { isDropDown = false }
                )
            }
        }
    }
}

