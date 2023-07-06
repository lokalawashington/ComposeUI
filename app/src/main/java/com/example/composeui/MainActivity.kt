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
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeui.ui.theme.ComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val wonderwoman = painterResource(id = R.drawable.wonderwoman)
            val tenet = painterResource(id = R.drawable.tenet)
            val moneyheist = painterResource(id = R.drawable.moneyheist)
            val monedas = painterResource(id = R.drawable.monedas)
            val darkmaterial = painterResource(id = R.drawable.darkmaterial)
            val industry = painterResource(id = R.drawable.industry)
            val nissan = painterResource(id = R.drawable.nissan)

            val description = "Compose UI"

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .padding(top = 32.dp, start = 8.dp, end = 8.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.Start

            ) {
                Spacer(modifier = Modifier.height(8.dp))
                Text("Popular Movie", style = TextStyle(color = Color.White, fontSize = 18.sp))
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                    Column() {
                        ImageCard(
                            painter = wonderwoman,
                            contentDescription = description,
                        )
                        Text(
                            "Wonder Women(1984)",
                            style = TextStyle(color = Color.White, fontSize = 16.sp)
                        )
                        Text(
                            "Des 16, 2020",
                            style = TextStyle(color = Color.White, fontSize = 8.sp)
                        )

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = tenet,
                            contentDescription = description,
                        )
                        Text("Tenet", style = TextStyle(color = Color.White, fontSize = 16.sp))
                        Text("Aug 22, 2020", style = TextStyle(color = Color.White, fontSize = 8.sp)
                        )

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = moneyheist,
                            contentDescription = description,
                        )
                        Text(
                            "Star Watching",
                            style = TextStyle(color = Color.White, fontSize = 16.sp)
                        )
                        Text(
                            "Nov 12, 2020",
                            style = TextStyle(color = Color.White, fontSize = 8.sp)
                        )

                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text("TV Show", style = TextStyle(color = Color.White, fontSize = 18.sp))
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                    Column() {
                        ImageCard(
                            painter = monedas,
                            contentDescription = description,
                        )
                        Text(
                            "30 Monedas",
                            style = TextStyle(color = Color.White, fontSize = 16.sp)
                        )
                        Text(
                            "Nov 29, 2020",
                            style = TextStyle(color = Color.White, fontSize = 8.sp)
                        )

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = darkmaterial,
                            contentDescription = description,
                        )
                        Text("His Dark Materials", style = TextStyle(color = Color.White, fontSize = 16.sp))
                        Text(
                            "Nov 03, 2020",
                            style = TextStyle(color = Color.White, fontSize = 8.sp)
                        )

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = industry,
                            contentDescription = description,
                        )
                        Text("Industry", style = TextStyle(color = Color.White, fontSize = 16.sp))
                        Text(
                            "Nov 09, 2020",
                            style = TextStyle(color = Color.White, fontSize = 8.sp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text("Continue Watching", style = TextStyle(color = Color.White, fontSize = 18.sp))
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                    Column() {
                        ImageCard(
                            painter = nissan,
                            contentDescription = description,
                        )
                        Text(
                            "Wonder Women(1984)",
                            style = TextStyle(color = Color.White, fontSize = 16.sp)
                        )

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = nissan,
                            contentDescription = description,
                        )
                        Text("Tenet", style = TextStyle(color = Color.White, fontSize = 16.sp))

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        ImageCard(
                            painter = nissan,
                            contentDescription = description,
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
) {
    Card(
        modifier = Modifier
            .width(160.dp)
            .padding(end = 8.dp),
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
