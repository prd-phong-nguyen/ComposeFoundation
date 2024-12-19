package com.example.composefoundation.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composefoundation.Greeting
import com.example.composefoundation.ui.theme.ComposeFoundationTheme


@Composable
fun TextExamples() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Default Text") // Basic text

        Text(
            text = "Styled Text",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = androidx.compose.ui.graphics.Color.Blue
        ) // Styled text with custom font size, weight, and color

        Text(
            text = "Centered Text",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) // Centered text using alignment modifier

        Text(
            text = "Underlined Text",
            textDecoration = TextDecoration.Underline
        ) // Underlined text

        Text(
            text = "Rotated Text",
            modifier = Modifier.rotate(45f)
        ) // Rotated text using rotation modifier

        Text(
            text = "Spaced Text",
            letterSpacing = 0.1.sp
        ) // Spaced text using letter spacing


        Text(
            text = "Max Line Text with Ellipsis",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        ) // Text with max lines and ellipsis

        Text(
            text = "Truncated Text",
            maxLines = 1,
            overflow = TextOverflow.Clip
        ) // Truncated text without ellipsis
        Text(
            text = "abc",
            Modifier.alpha(0.5f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextExamplesPreview() {
    ComposeFoundationTheme {
        TextExamples()
    }
}