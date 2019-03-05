package com.weather.controller;


import com.weather.model.WeatherEntry;
import com.weather.model.WeatherForecast;
import com.weather.service.WeatherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@Api(description = "Generate WeatherEntity Response", produces = "application/json")
@RestController
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @ApiOperation(value = "Current Day Forecast")
    @GetMapping("/today/{city}/{country}")
    public WeatherEntry getTodayWeather(@PathVariable String city, @PathVariable String country) {
        return this.weatherService.getWeather(city, country);
    }

    @ApiOperation(value = "Weekly Forecast")
    @GetMapping("/weekly/{city}/{country}")
    public WeatherForecast getWeatherForecast(@PathVariable String city, @PathVariable String country) {
        return this.weatherService.getWeatherForecast(city, country);
    }

}
