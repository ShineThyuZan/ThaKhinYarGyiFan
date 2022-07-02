package com.omgea.thakhinyargyifan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.omgea.thakhinyargyifan.ui.NewsEvent
import com.omgea.thakhinyargyifan.ui.NewsViewItem
import com.omgea.thakhinyargyifan.ui.NewsViewModel
import com.omgea.thakhinyargyifan.ui.theme.ThaKhinYarGyiFanTheme
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThaKhinYarGyiFanTheme {

                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        val news = listOf("h","b","c")
                        Greeting(news = news)
                    }


            }
        }
    }
}

@Composable
fun Greeting(news : List<String>) {
    val viewModel : NewsViewModel = NewsViewModel()
    val state = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    LaunchedEffect(key1 = true){
        viewModel.event.collectLatest {
            when (it) {
                is NewsEvent.NewsItemClickEvent -> state.snackbarHostState.showSnackbar(message = it.index)
            }


        }
    }

    Scaffold (scaffoldState = state){
        LazyColumn {
            items(news.size){ index ->
                NewsViewItem(text = index.toString(), onClickEvent = {
                    viewModel.onItemClick(index = index.toString())

                })
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThaKhinYarGyiFanTheme {
        Greeting(listOf())
    }
}