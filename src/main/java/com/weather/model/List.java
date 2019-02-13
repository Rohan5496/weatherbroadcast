
package com.weather.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dt",
    "main",
    "weather",
    "clouds",
    "wind",
    "snow",
    "sys",
    "dt_txt",
    "rain"
})
public class List implements Serializable
{

    @JsonProperty("dt")
    private Integer dt;
    @JsonProperty("main")
    private Main main;
    @JsonProperty("weather")
    private java.util.List<Weather_> weather = null;
    @JsonProperty("clouds")
    private Clouds clouds;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("snow")
    private Snow snow;
    @JsonProperty("sys")
    private Sys sys;
    @JsonProperty("dt_txt")
    private String dtTxt;
    @JsonProperty("rain")
    private Rain rain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6593771408442188435L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public List() {
    }

    /**
     * 
     * @param clouds
     * @param dt
     * @param wind
     * @param sys
     * @param dtTxt
     * @param snow
     * @param weather
     * @param rain
     * @param main
     */
    public List(Integer dt, Main main, java.util.List<Weather_> weather, Clouds clouds, Wind wind, Snow snow, Sys sys, String dtTxt, Rain rain) {
        super();
        this.dt = dt;
        this.main = main;
        this.weather = weather;
        this.clouds = clouds;
        this.wind = wind;
        this.snow = snow;
        this.sys = sys;
        this.dtTxt = dtTxt;
        this.rain = rain;
    }

    @JsonProperty("dt")
    public Integer getDt() {
        return dt;
    }

    @JsonProperty("dt")
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    @JsonProperty("main")
    public Main getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(Main main) {
        this.main = main;
    }

    @JsonProperty("weather")
    public java.util.List<Weather_> getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(java.util.List<Weather_> weather) {
        this.weather = weather;
    }

    @JsonProperty("clouds")
    public Clouds getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("snow")
    public Snow getSnow() {
        return snow;
    }

    @JsonProperty("snow")
    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    @JsonProperty("sys")
    public Sys getSys() {
        return sys;
    }

    @JsonProperty("sys")
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    @JsonProperty("dt_txt")
    public String getDtTxt() {
        return dtTxt;
    }

    @JsonProperty("dt_txt")
    public void setDtTxt(String dtTxt) {
        this.dtTxt = dtTxt;
    }

    @JsonProperty("rain")
    public Rain getRain() {
        return rain;
    }

    @JsonProperty("rain")
    public void setRain(Rain rain) {
        this.rain = rain;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dt", dt).append("main", main).append("weather", weather).append("clouds", clouds).append("wind", wind).append("snow", snow).append("sys", sys).append("dtTxt", dtTxt).append("rain", rain).append("additionalProperties", additionalProperties).toString();
    }

}
