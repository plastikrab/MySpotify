package com.example.myspotify.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myspotify.R
import com.example.myspotify.ui.theme.BackgroundGray


@Composable
fun favoriteAlbum(){
    Card(
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier
            .width(198.dp)
            .background(BackgroundGray)
            .clip(shape = RoundedCornerShape(1.dp))
            .padding(4.dp)

    ) {
        Row(
            modifier = Modifier
                .background(Color.DarkGray)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
           Image(
               painter = painterResource(id = R.drawable.alb2) ,
               contentDescription = "album img",
               modifier = Modifier
                   .size(60.dp)
           )
            Text(
                text = "example music",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 8.dp),
                fontWeight = FontWeight(450)
            )
        }
    }
}





@Preview
@Composable
fun prevAlbums(){
    Row(
        Modifier.background(BackgroundGray)
    ) {
        Column(
            Modifier.background(BackgroundGray)
        ) {
            favoriteAlbum()
            favoriteAlbum()
            favoriteAlbum()
            favoriteAlbum()
        }
        Column {
            favoriteAlbum()
            favoriteAlbum()
            favoriteAlbum()
            favoriteAlbum()
        }
    }
}

@Preview
@Composable
fun prevAlbum(){
    favoriteAlbum()
}
