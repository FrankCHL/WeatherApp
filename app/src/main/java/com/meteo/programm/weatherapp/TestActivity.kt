package com.meteo.programm.weatherapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
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
import android.widget.Button

class TestActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        var play=findViewById<Button>(R.id.play)
        var stop=findViewById<Button>(R.id.stop)
        var mp=MediaPlayer()
        play.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.shailushai))
            mp.prepare()
            mp.start()
        }
        stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp=MediaPlayer()
        }
    }
}