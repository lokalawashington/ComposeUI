package com.example.composeui

import android.icu.text.UnicodeSetSpanner.TrimOption
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeui.ui.theme.ComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.nissan)
            val description = "Nissan is great"
            val title = "Racing car"

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .padding(top = 32.dp),
                horizontalAlignment = Alignment.Start

            ) {
                Text("Popular Movie", style = TextStyle(color = Color.White, fontSize = 16.sp))
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                    Column() {
                        ImageCard(
                            painter = painter,
                            contentDescription = description,
                            title = title
                        )
                        Text(
                            "Wonder Women(1984)",
                            style = TextStyle(color = Color.White, fontSize = 16.sp)
                        )

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = painter,
                            contentDescription = description,
                            title = title
                        )
                        Text("Tenet", style = TextStyle(color = Color.White, fontSize = 16.sp))

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = painter,
                            contentDescription = description,
                            title = title
                        )
                        Text("Tenet", style = TextStyle(color = Color.White, fontSize = 16.sp))

                    }
                }

                Text("TV Show", style = TextStyle(color = Color.White, fontSize = 16.sp))
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                    Column() {
                        ImageCard(
                            painter = painter,
                            contentDescription = description,
                            title = title
                        )
                        Text(
                            "Wonder Women(1984)",
                            style = TextStyle(color = Color.White, fontSize = 16.sp)
                        )

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = painter,
                            contentDescription = description,
                            title = title
                        )
                        Text("Tenet", style = TextStyle(color = Color.White, fontSize = 16.sp))

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = painter,
                            contentDescription = description,
                            title = title
                        )
                        Text("Tenet", style = TextStyle(color = Color.White, fontSize = 16.sp))

                    }
                }


            }

        }
    }
}


@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .width(200.dp),
        shape = RoundedCornerShape(15.dp)
    ) {
        Box(
            modifier = Modifier.height(200.dp)

        ) {
            Image(
                painter = painter,
                modifier = Modifier.fillMaxSize(),
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
        }

    }
}
