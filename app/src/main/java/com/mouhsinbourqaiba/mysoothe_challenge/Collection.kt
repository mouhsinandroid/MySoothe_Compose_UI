package com.mouhsinbourqaiba.mysoothe_challenge

data class Collection(
    val name: String,
    val imageRes: Int
)

val favoriteCollectionOne = listOf(
    Collection("Short mantras", R.drawable.short_mantras),
    Collection("Nature meditations", R.drawable.nature_meditations),
    Collection("Stress and anxiety", R.drawable.stress_and_anxiety),
)

val favoriteCollectionTwo = listOf(
    Collection("Stress and anxiety", R.drawable.stress_and_anxiety),
    Collection("Overwhelmed", R.drawable.overwhelmed),
    Collection("Nightly wind down", R.drawable.nightly_wind_down)
)