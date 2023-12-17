package com.example.myspotify.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myspotify.R

@Composable
fun albumCover(){
    Column(
        modifier = Modifier
            .padding(5.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.alb5),
            contentDescription = "album",
            modifier = Modifier
                .size(150.dp)
        )
        Text(
            text = "название альбома",
            modifier = Modifier,
            fontSize = 12.sp,
            color = Color.White,
            fontWeight = FontWeight(450)
            )
        Text(
            text = "исполнитель",
            modifier = Modifier,
            fontSize = 9.sp,
            color = Color.DarkGray
            )
    }

}


@Preview
@Composable
fun albumList(){
    Column(
        modifier = Modifier
            .padding(8.dp)
    ) {
        Text(
            text = "Персональные подборки",
            fontWeight = FontWeight(550),
            color = Color.White
        )
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            albumCover()
            albumCover()
            albumCover()
            albumCover()
        }

    }

}


@Preview
@Composable
fun albumCoverPrev(){
    albumCover()
}