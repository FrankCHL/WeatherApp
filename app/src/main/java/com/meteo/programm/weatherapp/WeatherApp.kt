package com.meteo.programm.weatherapp

import android.os.Bundle
import org.koin.core.context.startKoin

class WeatherApp : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startKoin(){}


    }
}