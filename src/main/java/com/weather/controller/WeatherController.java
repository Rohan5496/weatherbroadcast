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

    @RequestMapping("/today/{country}/{city}")
    public Weather getTodayWeather(@PathVariable String country,
                              @PathVariable String city) {
        return this.weatherService.getWeather(country, city);
    }

    @RequestMapping("/weekly/{country}/{city}")
    public WeatherForecast getWeatherForecast(@PathVariable String country,
                                              @PathVariable String city) {
        return this.weatherService.getWeatherForecast(country, city);
    }

}
