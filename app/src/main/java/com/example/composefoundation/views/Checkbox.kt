package com.example.composefoundation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CheckboxExample() {
    var isChecked = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        // Default Checkbox
        Checkbox(
            checked = isChecked.value,
            onCheckedChange = { isChecked.value = it },
            modifier = Modifier.padding(8.dp)
        )

        // Checkbox with custom colors
        Checkbox(
            checked = isChecked.value,
            onCheckedChange = { isChecked.value = it },
            colors = CheckboxDefaults.colors(
                checkedColor = MaterialTheme.colorScheme.primary,
                uncheckedColor = MaterialTheme.colorScheme.secondary
            ),
            modifier = Modifier.padding(8.dp)
        )

        // Disabled Checkbox
        Checkbox(
            checked = isChecked.value,
            onCheckedChange = { /* Disabled checkbox doesn't change */ },
            enabled = false,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview
@Composable
fun PreviewCheckboxExample() {
    CheckboxExample()
}