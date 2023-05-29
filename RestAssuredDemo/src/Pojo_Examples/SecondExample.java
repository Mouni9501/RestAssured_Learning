package Pojo_Examples;

import java.util.List;

public class SecondExample
{
    private LocationSE location;
    private Current_WeatherSE current_weather;
    private List<ForecastSE> forecast;
    public LocationSE getLocation() {
        return location;
    }
    public void setLocation(LocationSE location) {
        this.location = location;
    }
    public Current_WeatherSE getCurrent_weather() {
        return current_weather;
    }
    public void setCurrent_weather(Current_WeatherSE current_weather) {
        this.current_weather = current_weather;
    }

    public List<ForecastSE> getForecast() {
        return forecast;
    }

    public void setForecast(List<ForecastSE> forecast) {
        this.forecast = forecast;
    }
}
