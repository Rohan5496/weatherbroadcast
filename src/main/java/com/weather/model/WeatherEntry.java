package com.weather.model;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
public class WeatherEntry implements Serializable {


    private Instant dt;

    private CityTemperature main;

    private List<WeatherInfo> weather;

    private Wind wind;
//
// public Instant getDt() {
//  return dt;
// }
//
// public void setDt(Instant dt) {
//  this.dt = dt;
// }
//
// public CityTemperature getMain() {
//  return main;
// }
//
// public void setMain(CityTemperature main) {
//  this.main = main;
// }
//
// public List<WeatherInfo> getWeather() {
//  return weather;
// }
//
// public void setWeather(List<WeatherInfo> weather) {
//  this.weather = weather;
// }
//
// public Wind getWind() {
//  return wind;
// }
//
// public void setWind(Wind wind) {
//  this.wind = wind;
// }
}
