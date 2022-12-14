package com.mouhsinbourqaiba.mysoothe_challenge


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun MySootheTextField(
    labelText: String,
    leadingIcon: ImageVector? = null,
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        onValueChange = {},
        label = {
            Text(text = labelText)
        },
        modifier = modifier.fillMaxWidth(),
        leadingIcon = {
            if(leadingIcon != null) {
                Icon(
                    leadingIcon,
                    contentDescription = null
                )
            }
        }
    )
}