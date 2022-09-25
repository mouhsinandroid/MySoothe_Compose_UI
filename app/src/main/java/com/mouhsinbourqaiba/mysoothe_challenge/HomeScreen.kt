package com.mouhsinbourqaiba.mysoothe_challenge

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mouhsinbourqaiba.mysoothe_challenge.ui.theme.MySootheChallengeTheme

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column {
            Spacer(modifier = Modifier.height(72.dp))
            
            MySootheTextField(
                labelText = "Search",
                leadingIcon = Icons.Default.Search,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            FavoriteCollectionSection()

        }
    }

}

@Composable
private fun FavoriteCollectionSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "FAVORITE COLLECTION",
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(horizontal = 16.dp),
            style = MaterialTheme.typography.h2
        )

        FavoriteCollectionRow(collections = favoriteCollectionOne)
        FavoriteCollectionRow(collections = favoriteCollectionTwo)

        AlignYourBodySection()

        AlignYourMindSection()
    }


}

@Composable
private fun AlignYourBodySection() {

    Text(
        text = "ALIGN YOUR BODY",
        modifier = Modifier
            .paddingFromBaseline(40.dp)
            .padding(horizontal = 16.dp),
        style = MaterialTheme.typography.h2
    )

    CollectionRow(collections = alignYourBodyCollections)

}

@Composable
private fun AlignYourMindSection() {

    Text(
        text = "ALIGN YOUR MIND",
        modifier = Modifier
            .paddingFromBaseline(40.dp)
            .padding(horizontal = 16.dp),
        style = MaterialTheme.typography.h2
    )

    CollectionRow(collections = alignYourMindCollections)

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
private fun HomeScreenPreview() {
    MySootheChallengeTheme {
        HomeScreen()
    }
}