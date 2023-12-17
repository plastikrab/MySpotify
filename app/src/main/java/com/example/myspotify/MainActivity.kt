package com.example.myspotify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myspotify.ui.components.albumCover
import com.example.myspotify.ui.components.albumList
import com.example.myspotify.ui.components.bottomPanel
import com.example.myspotify.ui.components.favoriteAlbum
import com.example.myspotify.ui.theme.BackgroundGray
import com.example.myspotify.ui.theme.MySpotifyTheme
import com.example.myspotify.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContent {
            Column {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .background(BackgroundGray)
                        .weight(1f)

                ) {
                    Row(

                    ) {
                        Column(

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
                    albumList()
                    albumList()
                    albumList()
                    albumList()

                }
                bottomPanel()
            }

        }
    }
}

