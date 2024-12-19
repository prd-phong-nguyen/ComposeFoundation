package com.example.composefoundation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.composefoundation.ui.theme.ComposeFoundationTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeFoundationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxWidth(),
                    topBar = {
                        TopAppBar(
                            title = { Text("Tran HaLinh Idol") },
                            modifier = Modifier
                                .background(androidx.compose.ui.graphics.Color.Red)
                                .height(70.dp),
                            navigationIcon = {},
                            actions = {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_menu_24),
                                    contentDescription = "Image with Aspect Ratio",
                                    contentScale = ContentScale.Inside,
                                    modifier = Modifier
                                        .size(24.dp)
                                        .aspectRatio(1.5f)
                                )
                            })
                    },
                    bottomBar = {
                        BottomAppBar(
                            containerColor = androidx.compose.ui.graphics.Color.Red,
                            modifier = Modifier
                                .background(androidx.compose.ui.graphics.Color.Red)
                                .height(70.dp),
                            content = {
                                NavigationBarItem(
                                    icon = {
                                        Image(
                                            painter = painterResource(id = R.drawable.baseline_home_24),
                                            contentDescription = "Image with Aspect Ratio",
                                            contentScale = ContentScale.Inside,
                                            modifier = Modifier
                                                .size(24.dp)
                                                .aspectRatio(1.5f)
                                        )
                                    },
                                    label = { Text("Home") },
                                    onClick = {
                                        itemClick("") },
                                    selected = false,
                                    colors = NavigationBarItemColors(
                                        selectedIconColor = androidx.compose.ui.graphics.Color.White,
                                        unselectedIconColor = androidx.compose.ui.graphics.Color.Black,
                                        selectedTextColor = androidx.compose.ui.graphics.Color.White,
                                        unselectedTextColor = androidx.compose.ui.graphics.Color.Black,
                                        disabledIconColor = androidx.compose.ui.graphics.Color.Red,
                                        disabledTextColor = androidx.compose.ui.graphics.Color.Red,
                                        selectedIndicatorColor = androidx.compose.ui.graphics.Color.Red,
                                    ),
                                )
                                NavigationBarItem(
                                    icon = {
                                        Image(
                                            painter = painterResource(id = R.drawable.baseline_heart_broken_24),
                                            contentDescription = "Image with Aspect Ratio",
                                            contentScale = ContentScale.Inside,
                                            modifier = Modifier
                                                .size(24.dp)
                                                .aspectRatio(1.5f),
                                        )
                                    },
                                    label = { Text("Hòm") },
                                    onClick = { itemClick("") },
                                    selected = true,
                                    colors = NavigationBarItemColors(
                                        selectedIconColor = androidx.compose.ui.graphics.Color.White,
                                        unselectedIconColor = androidx.compose.ui.graphics.Color.Black,
                                        selectedTextColor = androidx.compose.ui.graphics.Color.White,
                                        unselectedTextColor = androidx.compose.ui.graphics.Color.Black,
                                        disabledIconColor = androidx.compose.ui.graphics.Color.Red,
                                        disabledTextColor = androidx.compose.ui.graphics.Color.Red,
                                        selectedIndicatorColor = androidx.compose.ui.graphics.Color.Red,
                                    ),
                                )

                            }
                        )
                    }) { innerPadding ->
                    Surface(color = MaterialTheme.colorScheme.background) {
                        LazyColumnList(modifier = Modifier.padding(innerPadding).width(500.dp))
                    }
                }
            }
        }
    }
}

private fun itemClick(item: String) {
    Log.d("xxx", "itemClick: $item")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazyColumnList()
//        LazyRowList()
//        LazyGrid()
//        Greeting("Android")
}

@Composable
fun LazyColumnList(modifier: Modifier = Modifier, names: List<String> = List(1000) { "$it" }) {
    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
        item {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Image with Aspect Ratio",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .aspectRatio(1.5f)
            )
        }

        item {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Image with Aspect Ratio",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .aspectRatio(1.5f)
            )
        }


        names.forEach {
            item {
                itemList()
            }
        }

    }
}


@Composable
fun LazyRowList(modifier: Modifier = Modifier, names: List<String> = List(1000) { "$it" }) {
    LazyRow(modifier = modifier.padding(vertical = 4.dp), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        names.forEach {
            item {
                Greeting(name = it, modifier = Modifier.padding(16.dp))
            }
        }
    }
}


@Composable
fun LazyGrid() {
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 128.dp)) {
        items(1000) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Image with Aspect Ratio",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .aspectRatio(1.5f)
                    .background(androidx.compose.ui.graphics.Color.Gray)
            )
        }
    }
}

@Composable
fun itemList(){
    ConstraintLayout {
        // Create references for the composables to constrain
        val (button, text) = createRefs()

        Button(
            onClick = { /* Do something */ },
            // Assign reference "button" to the Button composable
            // and constrain it to the top of the ConstraintLayout
            modifier = Modifier.constrainAs(button) {
                top.linkTo(parent.top, margin = 16.dp)
                end.linkTo(parent.end, margin = 16.dp)
            }
        ) {
            Text("Button")
        }

        // Assign reference "text" to the Text composable
        // and constrain it to the bottom of the Button composable
        Text(
            "Text",
            Modifier.constrainAs(text) {
                top.linkTo(button.bottom, margin = 16.dp)
            }
        )
    }
}
