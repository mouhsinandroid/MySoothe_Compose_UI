package com.mouhsinbourqaiba.mysoothe_challenge

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MySootheTextField(
    labelText: String
) {
    TextField(
        value = "",
        onValueChange = {},
        label = {
            Text(text = labelText)
        },
        modifier = Modifier.fillMaxWidth()
    )
}