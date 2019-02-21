package com.weather.repository;

import com.weather.model.WeatherForecast;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherForecastRepository extends CrudRepository<WeatherForecast,Integer> {
}
