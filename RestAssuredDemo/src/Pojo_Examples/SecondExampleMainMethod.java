package Pojo_Examples;

import Pojo_Examples.SecondExample;
import io.restassured.path.json.JsonPath;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SecondExampleMainMethod
{
    public static void main(String args[]){
        SecondExample secondExample = new SecondExample();
        LocationSE locationSE = new LocationSE();
        ForecastSE forecastSE0 = new ForecastSE();
        ForecastSE forecastSE1 = new ForecastSE();
        ForecastSE forecastSE2 = new ForecastSE();
        TemperatureSE temperatureSE0 = new TemperatureSE();
        TemperatureSE temperatureSE1 = new TemperatureSE();
        TemperatureSE temperatureSE2 = new TemperatureSE();
        Current_WeatherSE currentWeatherSE = new Current_WeatherSE();
        locationSE.setCity("New York");
        locationSE.setCountry("United States");
        locationSE.setLatitude(40.7128);
        locationSE.setLongitude(-74.0060);
        currentWeatherSE.setTemperature(22.5);
        currentWeatherSE.setHumidity(60);
        currentWeatherSE.setDescription("Partly cloudy");
        currentWeatherSE.setWind_speed(10.2);
        currentWeatherSE.setWind_direction("NW");
        forecastSE0.setDate("2023-05-28");
        temperatureSE0.setMin(19);
        temperatureSE0.setMax(25);
        forecastSE0.setTemperature(temperatureSE0);
        forecastSE0.setDescription("Sunny with scattered clouds");
        forecastSE1.setDate("2023-05-29");
        temperatureSE1.setMin(21);
        temperatureSE1.setMax(27);
        forecastSE1.setTemperature(temperatureSE1);
        forecastSE1.setDescription("Mostly sunny");
        forecastSE2.setDate("2023-05-30");
        temperatureSE2.setMin(18);
        temperatureSE2.setMax(23);
        forecastSE2.setTemperature(temperatureSE2);
        forecastSE2.setDescription("Partly cloudy");
        secondExample.setLocation(locationSE);
        secondExample.setCurrent_weather(currentWeatherSE);
        ArrayList<ForecastSE> forecastAl = new ArrayList<>();
        forecastAl.add(forecastSE0);
        forecastAl.add(forecastSE1);
        forecastAl.add(forecastSE2);
        secondExample.setForecast(forecastAl);


        given().log().all().queryParam("key","qaclick123")
                .header("Content-Type","application/json").
                body(secondExample)
                .when().post("maps/api/place/add/json").then().assertThat().
                header("Server", "Apache/2.4.41 (Ubuntu)")
                .statusCode(200).body("scope", equalTo("APP")).extract().response();

        System.out.println(forecastSE0.getTemperature().getMax());


    }


}
