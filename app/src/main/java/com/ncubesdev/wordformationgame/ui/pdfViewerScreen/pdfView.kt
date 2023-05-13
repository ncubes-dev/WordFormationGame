package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.rizzi.bouquet.VerticalPDFReader
import com.rizzi.bouquet.VerticalPdfReaderState

@Composable
fun PDFView(
    pdfState: VerticalPdfReaderState,
    viewModel: ViewerScreenViewModel,
) {
    Box(
        contentAlignment = Alignment.TopStart
    ) {
        VerticalPDFReader(
            state = pdfState,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Gray)
        )
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            LinearProgressIndicator(
                progress = pdfState.loadPercent / 100f,
                color = Color.Green,
                backgroundColor = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier
                        .background(
                            color = MaterialTheme.colors.surface.copy(alpha = 0.5f),
                            shape = MaterialTheme.shapes.medium
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Page: ${pdfState.currentPage}/${pdfState.pdfPageCount}",
                        modifier = Modifier.padding(
                            start = 8.dp,
                            end = 8.dp,
                            bottom = 4.dp,
                            top = 8.dp
                        )
                    )
                }
            }
        }
        LaunchedEffect(key1 = pdfState.error) {
            pdfState.error?.let {
                viewModel.onEvent(ViewerScreenEvent.OpeningError)
            }
        }
    }
}