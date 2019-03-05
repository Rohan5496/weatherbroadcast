package com.weather.service;

import com.weather.constants.ApplicationConstants;
import com.weather.model.Weather;
import com.weather.model.WeatherForecast;
import com.weather.repository.WeatherForecastRepository;
import com.weather.repository.WeatherRepository;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.net.URI;

import static com.weather.constants.ApplicationConstants.*;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    private final WeatherRepository weatherRepository;

    private final WeatherForecastRepository weatherForecastRepository;

    public WeatherService(RestTemplate restTemplate, WeatherRepository weatherRepository, WeatherForecastRepository weatherForecastRepository) {
        this.restTemplate = restTemplate;
        this.weatherRepository = weatherRepository;
        this.weatherForecastRepository = weatherForecastRepository;
    }

    public Weather getWeather(String city,String country)
    {
        URI url=new UriTemplate(ApplicationConstants.WEATHER_URL).expand(city,country,ApplicationConstants.API_KEY);
        Weather weatherObj=invoke(url,Weather.class);
        weatherRepository.save(weatherObj);
        return invoke(url,Weather.class);
    }

    public WeatherForecast getWeatherForecast(String city,String country) {
        URI url = new UriTemplate(FORECAST_URL).expand(city, country, ApplicationConstants.API_KEY);
        WeatherForecast weatherForecastObj=invoke(url,WeatherForecast.class);
        weatherForecastRepository.save(weatherForecastObj);
        return weatherForecastObj;
    }

    private <T> T invoke(URI url, Class<T> responseType) {
        RequestEntity<?> request = RequestEntity.get(url)
                .accept(MediaType.APPLICATION_JSON).build();
        ResponseEntity<T> exchange = this.restTemplate
                .exchange(request, responseType);
        return exchange.getBody();
    }

}
