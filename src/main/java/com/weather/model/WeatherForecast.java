package com.weather.model;

import java.util.List;


public class WeatherForecast {


    private float message;


    private String cod;


    private List<WeatherEntry> list;


    private WeatherCity city;

    public float getMessage() {
        return message;
    }

    public void setMessage(float message) {
        this.message = message;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public List<WeatherEntry> getList() {
        return list;
    }

    public void setList(List<WeatherEntry> list) {
        this.list = list;
    }

    public WeatherCity getCity() {
        return city;
    }

    public void setCity(WeatherCity city) {
        this.city = city;
    }
}
