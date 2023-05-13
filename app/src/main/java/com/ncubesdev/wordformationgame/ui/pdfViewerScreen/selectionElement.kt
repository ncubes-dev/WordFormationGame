package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen


import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SelectionElement(
    questionPaper: QuestionPaper,
    onClick: () -> Unit,
    onAnswerClick: () -> Unit,
    onQuestionPaperClick: () -> Unit,
    online: Boolean,
    isDropDown: Boolean,
    close: () -> Unit,
    isAnswerAvailable: Boolean

) {
    val context = LocalContext.current
    Card(
        onClick = { onClick() },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(5.dp)
            .height(150.dp)
            .shadow(
                ambientColor = Color.Yellow,
                spotColor = Color(0xFF945324),
                elevation = 25.dp,
                shape = RoundedCornerShape(10.dp)
            ),
        elevation = 10.dp,
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 5.dp, bottom = 1.dp)
                        .fillMaxWidth()
                ) {
                    val choiceList = listOf("Question", "Answer")
                    DropdownMenu(
                        modifier = Modifier.background(MaterialTheme.colors.onSurface),
                        expanded = isDropDown,
                        onDismissRequest = { close() }) {
                        choiceList.forEach { label ->
                            DropdownMenuItem(onClick = {
                                if (label == "Question") {
                                    onQuestionPaperClick()
                                } else if (label == "Answer" && isAnswerAvailable) {
                                    onAnswerClick()
                                } else if (!isAnswerAvailable) {
                                    Toast.makeText(
                                        context,
                                        "Sorry answer is not available for this paper",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                close()
                            }) {
                                Text(text = label.toString(), color = MaterialTheme.colors.surface)
                            }
                        }
                    }
                    Text(
                        text = questionPaper.level,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.h6,
                        color = MaterialTheme.colors.secondary,
                        fontWeight = FontWeight.Bold


                    )
                    Text(
                        text = questionPaper.subject + " " + "\nP" + questionPaper.paper,
                        style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = questionPaper.month + "  " + questionPaper.year,
                        style = MaterialTheme.typography.caption,
                        textAlign = TextAlign.Start
                    )
                }
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .padding(5.dp), contentAlignment = Alignment.BottomCenter
                ) {
                    Text(
                        text = if (online) "available offline" else "needs internet",
                        style = MaterialTheme.typography.caption,
                        color = if (online) Color.Green else MaterialTheme.colors.error,

                        )
                }
            }
        }
    }
}
