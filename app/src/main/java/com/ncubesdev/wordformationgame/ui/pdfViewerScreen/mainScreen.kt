import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.annotation.RawRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.core.net.toFile
import androidx.core.net.toUri
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.ncubesdev.zimsecpastexampapersandmarksschemes.R
import com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen.*
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.Constants
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.LoadingState
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.UiEvents
import com.rizzi.bouquet.HorizontalPdfReaderState
import com.rizzi.bouquet.ResourceType
import com.rizzi.bouquet.VerticalPdfReaderState
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

sealed class BackPress {
    object Idle : BackPress()
    object InitialTouch : BackPress()
}

@OptIn(ExperimentalLifecycleComposeApi::class, ExperimentalMaterialApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "CoroutineCreationDuringComposition")
@Composable
fun ListScreen(
    viewModel: ViewerScreenViewModel,
    navController: NavController,
) {
    var level by remember { mutableStateOf("") }
    var subject by remember { mutableStateOf("") }
    var showFABs by remember { mutableStateOf(false) }
    var showCheckNetworkSnackBar by remember { mutableStateOf(false) }

    val bottomSheetState = rememberBottomSheetState(initialValue = BottomSheetValue.Collapsed)
    val bottomSheetScaffoldState =
        rememberBottomSheetScaffoldState(bottomSheetState = bottomSheetState)
    val cacheState by viewModel.cacheState.collectAsStateWithLifecycle()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val state = viewModel.stateFlow.collectAsState()
    val context = LocalContext.current
    val papers by viewModel.pages.collectAsStateWithLifecycle()
    val unFilteredPapers by viewModel.unFilteredPapers.collectAsStateWithLifecycle()
    val downloadState by viewModel.downloadState.collectAsStateWithLifecycle()

    var showToast by remember { mutableStateOf(false) }
    var explore by remember { mutableStateOf(false) }

    var backPressState by remember { mutableStateOf<BackPress>(BackPress.Idle) }
    val loadingDialogState by viewModel.loadingDialog.collectAsStateWithLifecycle()

    if (loadingDialogState == LoadingState.LOADING) {
        Dialog(onDismissRequest = { }) {
            scope.launch {
                delay(10000)
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CircularProgressIndicator()
                Button(
                    shape = MaterialTheme.shapes.medium,
                    onClick = { navController.navigate(Constants.EXPLORE) },
                    modifier = Modifier.width(300.dp).padding(top=20.dp)
                ) {
                    Text(
                        text = "You can explore while it loads",
                        modifier = Modifier.padding(10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(100.dp))

            }
        }
    } else if (loadingDialogState == LoadingState.ERROR) {
        viewModel.onEvent(ViewerScreenEvent.NoNetwork)
        viewModel.onEvent(ViewerScreenEvent.BackHome)
    } else if (loadingDialogState == LoadingState.NONE) {
        viewModel.onEvent(ViewerScreenEvent.StopLoading)
    }
    if (loadingDialogState == LoadingState.SUCCESS) {
    }
    if (showToast) {
        Toast.makeText(context, "Press again to exit", Toast.LENGTH_SHORT).show()
        showToast = false
    }
    LaunchedEffect(key1 = true) {
        scope.launch {
            delay(10000)
            explore = true
        }
    }
    LaunchedEffect(key1 = backPressState) {
        if (backPressState == BackPress.InitialTouch) {
            delay(2000)
            backPressState = BackPress.Idle
        }
    }

    BackHandler(backPressState == BackPress.Idle) {
        backPressState = BackPress.InitialTouch
        showToast = true
    }

    LaunchedEffect(key1 = true) {
        viewModel.uiEvent.collect { event ->
            when (event) {
                is UiEvents.Open -> {
                    viewModel.openResource(ResourceType.Remote(url = event.url))
                }
                is UiEvents.OpenAnswer -> {
                    if (event.paper.answerRemoteUrl.isEmpty()) {
                        Toast.makeText(context, "The answer is not available", Toast.LENGTH_LONG)
                            .show()
                    } else {
                        try {
                            if (event.locationCacheInfo.answerLocalUrl.toUri()
                                    .toFile().isFile && event.locationCacheInfo.answerLocalUrl.isNotEmpty()
                            ) {
                                viewModel.openResource(ResourceType.Remote(url = event.locationCacheInfo.answerLocalUrl))

                            } else if (!event.locationCacheInfo.answerLocalUrl.toUri()
                                    .toFile().isFile && event.locationCacheInfo.answerLocalUrl.isNotEmpty()
                            ) {
                                viewModel.onEvent(ViewerScreenEvent.UpdateLocalCacheInfo(event.locationCacheInfo.apply {
                                    this.answerLocalUrl = ""
                                }))
                                viewModel.onEvent(
                                    ViewerScreenEvent.OnCacheAnswerRequest(
                                        event.paper, context
                                    )
                                )
                                viewModel.onEvent(ViewerScreenEvent.ShowLoadingDialog)
                            } else if (event.locationCacheInfo.answerLocalUrl.isEmpty()) {
                                viewModel.onEvent(
                                    ViewerScreenEvent.OnCacheAnswerRequest(
                                        event.paper, context
                                    )
                                )
                                viewModel.onEvent(ViewerScreenEvent.ShowLoadingDialog)
                            }
                        } catch (e: Exception) {
                            viewModel.onEvent(ViewerScreenEvent.UpdateLocalCacheInfo(event.locationCacheInfo.apply {
                                this.answerLocalUrl = ""
                            }))
                            viewModel.onEvent(
                                ViewerScreenEvent.OnCacheAnswerRequest(
                                    event.paper, context
                                )
                            )
                            viewModel.onEvent(ViewerScreenEvent.ShowLoadingDialog)
                        }
                    }
                }
                is UiEvents.OpenQuestion -> {
                    try {
                        if (event.locationCacheInfo.questionLocalUrl.toUri()
                                .toFile().isFile && event.locationCacheInfo.questionLocalUrl.isNotEmpty()
                        ) {
                            viewModel.openResource(ResourceType.Remote(url = event.locationCacheInfo.questionLocalUrl))

                        } else if (!event.locationCacheInfo.questionLocalUrl.toUri()
                                .toFile().isFile && event.locationCacheInfo.questionLocalUrl.isNotEmpty()
                        ) {
                            viewModel.onEvent(ViewerScreenEvent.UpdateLocalCacheInfo(event.locationCacheInfo.apply {
                                this.questionLocalUrl = ""
                            }))
                            viewModel.onEvent(
                                ViewerScreenEvent.OnCacheQuestionRequest(
                                    event.paper, context
                                )
                            )
                            viewModel.onEvent(ViewerScreenEvent.ShowLoadingDialog)
                        } else if (event.locationCacheInfo.questionLocalUrl.isEmpty()) {
                            viewModel.onEvent(
                                ViewerScreenEvent.OnCacheQuestionRequest(
                                    event.paper, context
                                )
                            )
                            viewModel.onEvent(ViewerScreenEvent.ShowLoadingDialog)
                        }
                    } catch (e: Exception) {
                        viewModel.onEvent(ViewerScreenEvent.UpdateLocalCacheInfo(event.locationCacheInfo.apply {
                            this.questionLocalUrl = ""
                        }))
                        viewModel.onEvent(
                            ViewerScreenEvent.OnCacheQuestionRequest(
                                event.paper, context
                            )
                        )
                        viewModel.onEvent(ViewerScreenEvent.ShowLoadingDialog)
                    }
                }
                is UiEvents.Error -> {
                    Toast.makeText(
                        context, event.message, Toast.LENGTH_LONG
                    ).show()
                }
                is UiEvents.ShowToast -> {
                    Toast.makeText(context, event.text, Toast.LENGTH_SHORT).show()
                }
                else -> {}
            }
        }
    }
    if (unFilteredPapers.isEmpty()) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                AnimatedVisibility(visible = explore) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "Lets explore while past papers load",
                            modifier = Modifier.padding(10.dp),
                            color = MaterialTheme.colors.primary,
                            style = MaterialTheme.typography.h6
                        )
                        Button(
                            shape = MaterialTheme.shapes.medium,
                            onClick = { navController.navigate(Constants.EXPLORE) },
                            modifier = Modifier.fillMaxWidth(.8f)
                        ) {
                            Text(text = "Explore", modifier = Modifier.padding(10.dp))
                        }
                        Spacer(modifier = Modifier.height(100.dp))
                    }
                }
                CircularProgressIndicator()
                Text(text = "Loading..please wait", modifier = Modifier.padding(10.dp))

            }
        }
    }
    AnimatedVisibility(visible = unFilteredPapers.isNotEmpty()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier) {
                when (val actualState = state.value) {
                    null -> BottomSheetScaffold(scaffoldState = bottomSheetScaffoldState,
                        sheetPeekHeight = 0.dp,
                        drawerElevation = 10.dp,
                        sheetContent = {
                            SheetContent(navController = navController) {
                                if (bottomSheetState.isExpanded) {
                                    scope.launch {
                                        bottomSheetState.collapse()
                                    }
                                }
                            }
                            if (bottomSheetState.isExpanded) {
                                BackHandler(true) {
                                    scope.launch {
                                        bottomSheetState.collapse()
                                    }
                                }
                            }
                        },
                        floatingActionButton = {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                if (showFABs) {
                                    FloatingActionButton(backgroundColor = MaterialTheme.colors.primary,
                                        modifier = Modifier
                                            .padding(bottom = 10.dp)
                                            .width(200.dp),
                                        shape = MaterialTheme.shapes.medium,
                                        onClick = {
                                            navController.navigate(Constants.PRACTICE)
                                        }) {
                                        Text(
                                            "Practice Questions", modifier = Modifier.padding(10.dp)
                                        )
                                    }
                                    FloatingActionButton(
                                        backgroundColor = MaterialTheme.colors.primary,
                                        shape = MaterialTheme.shapes.medium,
                                        onClick = {
                                            if (bottomSheetState.isCollapsed) {
                                                scope.launch {
                                                    bottomSheetState.expand()
                                                }

                                            }
                                        },
                                        modifier = Modifier.width(200.dp)

                                    ) {
                                        Text(
                                            "Explore",
                                            modifier = Modifier
                                                .padding(10.dp)
                                                .width(150.dp)
                                        )
                                    }
                                }
                                FloatingActionButton(
                                    onClick = { showFABs = !showFABs },
                                    backgroundColor = if (showFABs) MaterialTheme.colors.error else MaterialTheme.colors.primary,
                                ) {
                                    Icon(
                                        imageVector = if (showFABs) Icons.Default.Close else Icons.Default.MoreVert,
                                        contentDescription = null
                                    )
                                }
                            }
                        }
                    ) {
                        Column(modifier = Modifier.fillMaxSize()) {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                LazyRow {
                                    items(Constants.dropDownListItemsForSubjects) { sub ->
                                        Button(
                                            shape = MaterialTheme.shapes.medium,
                                            colors = ButtonDefaults.buttonColors(backgroundColor = if (cacheState.subject == sub) MaterialTheme.colors.secondary else MaterialTheme.colors.primaryVariant),
                                            onClick = {
                                                subject = sub
                                                viewModel.onEvent(
                                                    ViewerScreenEvent.Filter(
                                                        subject = subject, level = level, false
                                                    )
                                                )
                                                level = ""
                                                subject = ""
                                            },
                                            elevation = ButtonDefaults.elevation(
                                                defaultElevation = 10.dp,
                                                disabledElevation = 0.dp,
                                                pressedElevation = 0.dp
                                            ),
                                            modifier = Modifier
                                                .padding(5.dp)
                                                .shadow(
                                                    ambientColor = Color.Yellow,
                                                    spotColor = Color(0xFF945324),
                                                    elevation = 25.dp,
                                                    shape = RoundedCornerShape(10.dp)
                                                )
                                        ) {
                                            Icon(
                                                imageVector = if (cacheState.subject == sub) Icons.Default.Check else Icons.Default.Add,
                                                contentDescription = null
                                            )
                                            Text(
                                                text = sub, style = MaterialTheme.typography.caption
                                            )
                                        }
                                    }
                                }
                            }
                            Divider(modifier = Modifier.fillMaxWidth())
                            Row(modifier = Modifier.fillMaxWidth()) {
                                LazyRow {
                                    items(Constants.dropDownListItemsForLevel) { lev ->
                                        Button(
                                            shape = MaterialTheme.shapes.medium,
                                            colors = ButtonDefaults.buttonColors(backgroundColor = if (cacheState.level == lev) MaterialTheme.colors.secondary else MaterialTheme.colors.primaryVariant),
                                            onClick = {
                                                level = lev
                                                viewModel.onEvent(
                                                    ViewerScreenEvent.Filter(
                                                        subject = subject, level = level, false
                                                    )
                                                )
                                                level = ""
                                                subject = ""
                                            },
                                            elevation = ButtonDefaults.elevation(
                                                defaultElevation = 10.dp,
                                                disabledElevation = 0.dp,
                                                pressedElevation = 0.dp
                                            ),
                                            modifier = Modifier
                                                .padding(5.dp)
                                                .shadow(
                                                    ambientColor = Color.Yellow,
                                                    spotColor = Color(0xFF945324),
                                                    elevation = 25.dp,
                                                    shape = RoundedCornerShape(10.dp)
                                                )
                                        ) {
                                            Icon(
                                                imageVector = if (cacheState.level == lev) Icons.Default.Check else Icons.Default.Add,
                                                contentDescription = null
                                            )
                                            Text(
                                                text = lev, style = MaterialTheme.typography.caption
                                            )
                                        }
                                    }
                                }
                            }
                            Divider(modifier = Modifier.fillMaxWidth())
                            SelectionView(
                                viewModel = viewModel,
                                papers = papers,
                            )
                        }
                    }
                    is VerticalPdfReaderState -> Scaffold(
                        scaffoldState = scaffoldState,
                    ) {
                        BackHandler(enabled = true) {
                            viewModel.onEvent(ViewerScreenEvent.BackHome)
                        }
                        Column(modifier = Modifier.fillMaxSize()) {
                            PDFView(
                                pdfState = actualState,
                                viewModel = viewModel
                            )
//                            BannerAdView()
                        }
                    }
                    is HorizontalPdfReaderState -> Scaffold(
                        scaffoldState = scaffoldState,
                    ) {
                        BackHandler(enabled = true) {
                            viewModel.onEvent(ViewerScreenEvent.BackHome)
                        }
                        Column(modifier = Modifier.fillMaxSize()) {
                            HPDFView(
                                pdfState = actualState,
                                scaffoldState = scaffoldState,
                                viewModel = viewModel
                            )
//                        BannerAdView()
                        }

                    }
                }
            }
        }
    }
}




