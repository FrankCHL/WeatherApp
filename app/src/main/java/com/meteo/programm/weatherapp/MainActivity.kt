package com.meteo.programm.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.meteo.programm.weatherapp.ui.theme.Baby_Blue
import com.meteo.programm.weatherapp.ui.theme.Blue_Gray
import com.meteo.programm.weatherapp.ui.theme.Dark_Blue
import com.meteo.programm.weatherapp.ui.theme.Midnight_Blue
import com.meteo.programm.weatherapp.ui.theme.WeatherAppTheme

open class MainActivity : ComponentActivity()  {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    // лямбды
                    topBar = { TopAppBar(
                        title = { Text(text = "About Us", style = MaterialTheme.typography.displayMedium) },
                        colors = TopAppBarDefaults.mediumTopAppBarColors(
                            containerColor = Dark_Blue,
                            titleContentColor = Baby_Blue
                        ) )},
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
    @Preview(showBackground = true)
    @Composable
    fun AboutScreen() {
        var array_of_text = arrayOf("App name: WeatherApp","Team: D. Konstantin, B. Vadim","Version: alpha-beta 0.1")
        var array_of_icons = arrayOf(Icons.Filled.Warning,Icons.Filled.Favorite,Icons.Filled.Call)
        Box(modifier = Modifier
            .fillMaxHeight(0.4f)
            .fillMaxWidth()
            .background(color = Midnight_Blue)
            )
        {
            Column(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {


            Image(painter = painterResource(
                id = R.drawable.about_us_picture),
                contentDescription = null,
                modifier = Modifier

            )}
        }
        Box (modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Midnight_Blue)
            )
        {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top)
        {

           ElevatedCard(
               elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
               modifier = Modifier
                   .size(300.dp,300.dp),
               colors = CardDefaults.cardColors(
                   containerColor = Blue_Gray
               )

           )
           {
               for (i in 0..2){
                   Row( modifier = Modifier
                       .fillMaxWidth(),
                       horizontalArrangement = Arrangement.Center,
                       verticalAlignment = Alignment.CenterVertically) {
                       Icon(array_of_icons[i], contentDescription = null)
                       Text(modifier = Modifier
                           .padding(10.dp,0.dp)
                           .fillMaxWidth(),
                           text = array_of_text[i],
                           fontSize = 30.sp,
                           style = MaterialTheme.typography.displayMedium,
                           color = Baby_Blue)
                   }
           }}


        }
        }
    }


@Composable
fun AboutScreenPreview() {
    WeatherAppTheme {
      AboutScreen()}}}