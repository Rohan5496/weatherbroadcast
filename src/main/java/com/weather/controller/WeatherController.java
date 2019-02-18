package com.weather.controller;

import com.weather.model.Weather;
import com.weather.model.WeatherForecast;
import com.weather.service.WeatherService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WeatherController {

    RestTemplate restTemplate;

    private WeatherService weatherService;

    public WeatherController(RestTemplate restTemplate, WeatherService weatherService) {
        this.restTemplate = restTemplate;
        this.weatherService = weatherService;
    }

    @RequestMapping("/today/{city}/{country}")
    public Weather getTodayWeather(@PathVariable String city,@PathVariable String country) {
        return this.weatherService.getWeather(city, country);
    }

    @RequestMapping("/weekly/{city}/{country}")
    public WeatherForecast getWeatherForecast(@PathVariable String city,@PathVariable String country) {
        return this.weatherService.getWeatherForecast(city,country);
    }

}
