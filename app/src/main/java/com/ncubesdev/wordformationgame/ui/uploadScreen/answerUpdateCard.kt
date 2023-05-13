package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.uploadScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper

@Composable
fun AnswerUpdateCard(
    color: ButtonColors,
    dynamictext:String,
    modifier: Modifier,
    questionPaper: QuestionPaper,
    onAnswerClick: () -> Unit,
    onQuestionPaperClick: () -> Unit,
) {
    Card(
        backgroundColor = MaterialTheme.colors.surface,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
        modifier = modifier
            .padding(5.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 1.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = questionPaper.month+" "+questionPaper.level+" "+questionPaper.subject + "  " + questionPaper.year + " /" + questionPaper.paper,
                    modifier = Modifier.weight(1f),
                    style = MaterialTheme.typography.body1
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
                    .fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier,
                    shape = RoundedCornerShape(40.dp),
                    border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.background),
                    onClick = { onQuestionPaperClick() },

                    ) {
                    Text(
                        text = "Question",
                        modifier = Modifier.padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 16.dp,
                            bottom = 16.dp
                        ),
                        style = MaterialTheme.typography.caption
                    )
                }
                Button(
                    shape = RoundedCornerShape(40.dp),
                    border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.background),

                    onClick = { onAnswerClick() }) {
                    Text(
                        text = dynamictext,
                        modifier = Modifier.padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 16.dp,
                            bottom = 16.dp
                        ),
                        style = MaterialTheme.typography.caption
                    )
                }
            }
        }
    }
}
