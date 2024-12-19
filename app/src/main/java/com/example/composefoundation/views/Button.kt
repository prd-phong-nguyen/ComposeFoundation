package com.example.composefoundation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefoundation.R

@Composable
fun ButtonExamples() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(onClick = { /* Handle button click */ }) {
            Text("Basic Button")
        }

        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Button with Padding")
        }

        Button(
            onClick = { /* Handle button click */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text("Button with Custom Background Color")
        }

        Button(
            onClick = { /* Handle button click */ },
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white), contentColor = colorResource(id = R.color.black))
        ) {
            Text("Button with Color Resource Background")
        }

        Button(
            onClick = { /* Handle button click */ },
            elevation = ButtonDefaults.elevatedButtonElevation(8.dp)
        ) {
            Text("Button with Elevation")
        }

        Button(
            onClick = { /* Handle button click */ },
            enabled = false
        ) {
            Text("Disabled Button")
        }

        Button(
            onClick = { /* Handle button click */ },
            shape = MaterialTheme.shapes.large
        ) {
            Text("Button with Custom Shape")
        }

        Button(
            onClick = { /* Handle button click */ },
            contentPadding = PaddingValues(32.dp)
        ) {
            Text("Button with Custom Content Padding")
        }
    }
}

@Preview
@Composable
fun PreviewButtonExamples() {
    ButtonExamples()
}