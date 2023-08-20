package com.ways.composenews.presentation.onboarding.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.ways.composenews.R
import com.ways.composenews.presentation.onboarding.Page
import com.ways.composenews.presentation.onboarding.onBoardingPages
import com.ways.composenews.ui.theme.MediumPadding1
import com.ways.composenews.ui.theme.MediumPadding2

@Composable
fun OnBoardingPage(
    page: Page,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            text = page.title,
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small),
            modifier = Modifier.padding(horizontal = MediumPadding2),
        )
        Text(
            text = page.description,
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium),
            modifier = Modifier.padding(horizontal = MediumPadding2),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    OnBoardingPage(page = onBoardingPages.first())
}