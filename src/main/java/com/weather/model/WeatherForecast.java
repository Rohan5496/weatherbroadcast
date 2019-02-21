package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
public class WeatherForecast {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Weather> entries=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("entries")
    public List<Weather> getEntries() {
        return entries;
    }

    @JsonProperty("list")
    public void setEntries(List<Weather> entries) {
        this.entries = entries;
    }

    @JsonProperty("city")
    public void setCity(Map<String,Object> city) {
        setName(city.get("name").toString());
    }
}
