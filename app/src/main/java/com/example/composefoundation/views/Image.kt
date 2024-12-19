package com.example.composefoundation.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefoundation.R

@Composable
fun ImageExamples() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image",
            modifier = Modifier.size(100.dp)
        ) // Basic image

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image with Aspect Ratio",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .aspectRatio(1.5f)
        ) // Image with aspect ratio and crop content scale

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image with Border",
            modifier = Modifier
                .size(100.dp)
                .border(2.dp, androidx.compose.ui.graphics.Color.Red)
        ) // Image with border

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image with Rounded Corners",
            modifier = Modifier
                .size(100.dp)
                .padding(8.dp)
                .background(androidx.compose.ui.graphics.Color.Gray)
                .padding(4.dp)
                .clip(MaterialTheme.shapes.medium)
        ) // Image with rounded corners

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image with Content Scale Fill Width",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ) // Image with content scale fill width
    }
}

@Preview
@Composable
fun PreviewImageExamples() {
    ImageExamples()
}