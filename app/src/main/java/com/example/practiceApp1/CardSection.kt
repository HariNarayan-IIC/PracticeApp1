package com.example.practiceApp1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardSection() {
    // Card section
    LazyRow(
        modifier = Modifier.fillMaxWidth()
    ) {
        item { CardItem() }
        item { CardItem() }
        item { CardItem() }
        item { CardItem() }
        item { CardItem() }
    }
}

@Composable
fun CardItem() {
    // Card item
    Box(modifier = Modifier
        .padding(10.dp)
        .clip(shape = RoundedCornerShape(15.dp))
        .background(color = MaterialTheme.colorScheme.secondaryContainer)
        .height(150.dp)
        .width(300.dp)
        )
    {

    }
}

@Preview(
    showBackground = true
)
@Composable
fun CardSectionPreview() {
    CardSection()
}