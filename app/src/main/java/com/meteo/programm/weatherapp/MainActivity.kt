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
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape

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
        var array_of_text = arrayOf("Its cool","Try hard!","Find a job already")
        var array_of_icons = arrayOf(Icons.Filled.Warning,Icons.Filled.Favorite,Icons.Filled.Call)
                Column(modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight(0.5f), horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Bottom) {
                    for (i in 0..2){
                        Row(modifier = Modifier.background(color = Color.Blue, shape = RectangleShape) ) {
                            Icon(array_of_icons[i], contentDescription = null)
                            Text(text = array_of_text[i])
            }

            }
        }

    }


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    WeatherAppTheme {
      AboutScreen()}}}