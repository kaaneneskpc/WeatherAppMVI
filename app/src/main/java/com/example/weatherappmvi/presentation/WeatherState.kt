package com.example.weatherappmvi.presentation

import com.example.weatherappmvi.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)