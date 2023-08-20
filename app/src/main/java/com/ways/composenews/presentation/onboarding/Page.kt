package com.ways.composenews.presentation.onboarding

import androidx.annotation.DrawableRes
import com.ways.composenews.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val onBoardingPages = listOf<Page>(
    Page(title = "nonumy", description = "reformidans", image = R.drawable.onboarding1),
    Page(title = "nonumy", description = "reformidans", image = R.drawable.onboarding2),
    Page(title = "nonumy", description = "reformidans", image = R.drawable.onboarding3),
)