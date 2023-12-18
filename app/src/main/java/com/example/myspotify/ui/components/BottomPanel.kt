package com.example.myspotify.ui.components

import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myspotify.R
import com.example.myspotify.ui.theme.BackgroundGray


@Preview
@Composable
fun bottomPanel(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(BackgroundGray)
    ) {
        bottomPlayer()
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.home2),
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 30.dp, vertical = 5.dp)
                    .size(30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 30.dp, vertical = 5.dp)
                    .size(30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.media),
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 30.dp, vertical = 5.dp)
                    .size(30.dp)
            )
        }
    }
}

@Preview
@Composable
fun bottomPlayer(){
    Card(
        shape = RoundedCornerShape(3.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)

        ) {
            Image(
                painter = painterResource(id = R.drawable.alb4) ,
                contentDescription = "asfdfas",
                modifier = Modifier
                    .size(45.dp)
                    .padding(4.dp)
                    .clip(shape = RoundedCornerShape(2.dp))
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                ,

                ){
                Text(
                    text ="track",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(450)
                )
                Text(
                    text ="name",
                    fontSize = 10.sp,

                    )
            }
            Row(
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
            ) {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "unLiked"){

                    composable("unLiked"){
                        Image(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "unFavorite",
                            modifier = Modifier
                                .size(25.dp)
                                .clickable {
                                    navController.navigate("liked")
                                }
                        )
                    }
                    composable("liked"){
                        Image(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            modifier = Modifier
                                .size(25.dp)
                                .clickable {
                                    navController.navigate("unLiked")
                                }
                        )
                    }
                }

                Image(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    modifier = Modifier
                        .size(30.dp)
                )
            }

        }
    }


}

