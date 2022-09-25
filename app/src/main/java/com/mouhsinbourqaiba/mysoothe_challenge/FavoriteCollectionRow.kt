package com.mouhsinbourqaiba.mysoothe_challenge

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mouhsinbourqaiba.mysoothe_challenge.ui.theme.MySootheChallengeTheme

@Composable
fun FavoriteCollectionRow(
    collections: List<Collection>
) {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(collections) { collection ->
            FavoriteCollectionCard(collection = collection)

        }
    }

}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)

@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)

@Composable
private fun FavoriteCollectionRowPreview() {
    MySootheChallengeTheme {
        FavoriteCollectionRow(collections = favoriteCollectionOne)
    }
}