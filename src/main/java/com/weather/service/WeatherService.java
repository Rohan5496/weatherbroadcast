package com.weather.service;

import com.weather.model.WeatherEntry;
import com.weather.model.WeatherForecast;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.weather.constants.ApplicationConstants.*;

@Service
public class WeatherService {

    Logger logger = Logger.getLogger(WeatherService.class);

    @Autowired
    private RestTemplate restTemplate;

    public WeatherEntry getWeather(String city, String country) {
        ResponseEntity<WeatherEntry> exchange = restTemplate.getForEntity(WEATHER_URL, WeatherEntry.class,
                city, country, API_KEY);
        WeatherEntry weatherObj = exchange.getBody();
        return weatherObj;
    }

    public WeatherForecast getWeatherForecast(String city, String country) {
        ResponseEntity<WeatherForecast> exchange = restTemplate.getForEntity(FORECAST_URL, WeatherForecast.class,
                city, country, API_KEY);
        WeatherForecast weatherForecastObj = exchange.getBody();
        return weatherForecastObj;

    }



   /* private <T> T invoke(URI url, Class<T> responseType) {
        RequestEntity<?> request = RequestEntity.get(url)
                .accept(MediaType.APPLICATION_JSON).build();
        ResponseEntity<T> exchange = this.restTemplate
                .exchange(request, responseType);
        return exchange.getBody();
    }*/

}
