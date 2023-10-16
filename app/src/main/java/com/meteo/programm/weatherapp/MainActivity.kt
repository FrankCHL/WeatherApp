package com.meteo.programm.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.meteo.programm.weatherapp.ui.theme.WeatherAppTheme
import android.media.MediaPlayer
import android.net.Uri

open class MainActivity : ComponentActivity()  {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    // лямбды
                    content = { innerPadding ->
                        Column(
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            AboutScreen()
                        }
                    })
            }
        }
    }

    @Composable
    fun AboutScreen() {
        var mp = MediaPlayer()
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "NEGRO COOL",
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.Black,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.shailushai),
                        contentDescription = null,
                        modifier = Modifier.size(128.dp)
                    )
                    Text(
                        text = "Версия 1.0",
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    Row(
                        modifier = Modifier.padding(top = 16.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(onClick = {
                        }) {
                            Text("ШАЙЛУШАЙ")
                        }
                    }
                    Card(
                        modifier = Modifier.padding(top = 16.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 4.dp
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text("Карточка")
                            Image(
                                painter = painterResource(id = R.drawable.shailushai),
                                contentDescription = null,
                                modifier = Modifier.size(128.dp)
                            )
                            Icon(Icons.Default.Favorite, contentDescription = null)
                        }
                    }
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    WeatherAppTheme {
      AboutScreen()}}}