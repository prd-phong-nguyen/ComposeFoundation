package com.example.composefoundation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SurfaceExample() {
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        // Default Surface
        Surface(
            modifier = Modifier.padding(8.dp)
        ) {
            Text("Default Surface")
        }

        // Surface with custom color
        Surface(
            color = MaterialTheme.colorScheme.primary,
            contentColor = Color.White,
            modifier = Modifier.padding(8.dp)
        ) {
            Text("Custom Color Surface")
        }

        // Elevation Surface
        Surface(
            tonalElevation = 8.dp,
            modifier = Modifier.padding(8.dp)
        ) {
            Text("Elevation Surface")
        }
    }
}

@Preview
@Composable
fun PreviewSurfaceExample() {
    SurfaceExample()
}
