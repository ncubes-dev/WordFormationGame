package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.practiceScreen

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ncubesdev.zimsecpastexampapersandmarksschemes.R
import com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen.ViewerScreenEvent
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.Constants

@Composable
fun PracticeListScreen(navController:NavController) {
    var aLevel = rememberSaveable {
        mutableStateOf(true)
    }
    var oLevel = rememberSaveable {
        mutableStateOf(false)
    }
    val cardItemsO = listOf<SubjectCardItem>(
        SubjectCardItem(
            subjectName = "Maths",
            painterResource(id = R.drawable.calculating),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+14)}),
        SubjectCardItem(
            subjectName = "English",
            painterResource(id = R.drawable.eng),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+15)}),
        SubjectCardItem(
            subjectName = "Geography",
            painterResource(id = R.drawable.geography),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+8)}),
        SubjectCardItem(
            subjectName = "Accounts",
            painterResource(id = R.drawable.accounting),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+9)}),
        SubjectCardItem(
            subjectName = "Physics",
            painterResource(id = R.drawable.relativity),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+7)}),
        SubjectCardItem(
            subjectName = "Chemistry",
            painterResource(id = R.drawable.laboratory),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+11)}),
        SubjectCardItem(
            subjectName = "Biology",
            painterResource(id = R.drawable.biology),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+13)}),
        SubjectCardItem(
            subjectName = "Computer Science",
            painterResource(id = R.drawable.computer_science),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+10)}),
        SubjectCardItem(
            subjectName = "Combined Science",
            painterResource(id = R.drawable.data_science),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+12)}),

        )
    val cardItemsA = listOf<SubjectCardItem>(
        SubjectCardItem(
            subjectName = "Maths",
            painterResource(id = R.drawable.calculating),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+5)}),
        SubjectCardItem(
            subjectName = "Geography",
            painterResource(id = R.drawable.geography),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+4)}),
        SubjectCardItem(
            subjectName = "Accounting",
            painterResource(id = R.drawable.accounting),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+2)}),
        SubjectCardItem(
            subjectName = "Physics",
            painterResource(id = R.drawable.relativity),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+0)}),
        SubjectCardItem(
            subjectName = "Chemistry",
            painterResource(id = R.drawable.laboratory),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+1)}),
        SubjectCardItem(
            subjectName = "Biology",
            painterResource(id = R.drawable.biology),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+3)}),
        SubjectCardItem(
            subjectName = "Computer Science",
            painterResource(id = R.drawable.computer_science),
            onClick = {navController.navigate(Constants.PRACTICE_SCREEN+"/"+6)}),
    )
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                enabled = !aLevel.value, onClick = {
                    aLevel.value = true
                    oLevel.value = false
                },
                elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, disabledElevation = 0.dp, pressedElevation = 0.dp),
                modifier = Modifier
                    .padding(5.dp)
                    .weight(1f)
                    .shadow(
                        ambientColor = Color.Yellow,
                        spotColor = Color(0xFF945324),
                        elevation = 25.dp,
                        shape = RoundedCornerShape(10.dp)
                    ),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.primary,
                    disabledBackgroundColor = MaterialTheme.colors.primaryVariant
                )
            ) {
                Icon(
                    imageVector = if (aLevel.value) Icons.Default.Check else Icons.Default.Add,
                    contentDescription = null
                )
                Text(text = "Advanced level")
            }
            Button(
                enabled = !oLevel.value,
                onClick = {
                    oLevel.value = true
                    aLevel.value = false
                },
                elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, disabledElevation = 0.dp, pressedElevation = 0.dp),
                modifier = Modifier
                    .padding(5.dp)
                    .weight(1f)
                    .shadow(
                        ambientColor = Color.Yellow,
                        spotColor = Color(0xFF945324),
                        elevation = 25.dp,
                        shape = RoundedCornerShape(10.dp)
                    ),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.primary,
                    disabledBackgroundColor = MaterialTheme.colors.primaryVariant
                )
            ) {
                Icon(
                    imageVector = if (oLevel.value) Icons.Default.Check else Icons.Default.Add,
                    contentDescription = null
                )
                Text(text = "Ordinary level")
            }
        }
        Divider(modifier = Modifier.fillMaxWidth())
        LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 150.dp)) {
            items(if (aLevel.value) cardItemsA else cardItemsO) {
                SubjectCard(
                    subjectName = it.subjectName,
                    painter = it.painter,
                    onClick = it.onClick
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SubjectCard(subjectName: String, painter: Painter, onClick: () -> Unit) {
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
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = subjectName,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

data class SubjectCardItem(val subjectName: String, val painter: Painter, val onClick: () -> Unit)


