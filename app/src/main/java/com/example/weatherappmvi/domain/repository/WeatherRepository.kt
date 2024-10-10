package com.example.weatherappmvi.domain.repository

import com.example.weatherappmvi.domain.util.Resource
import com.example.weatherappmvi.domain.weather.WeatherInfo


interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}