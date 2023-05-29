package Pojo_Examples;

import io.restassured.path.json.JsonPath;

public class RSMain
{
    public static void  main(String ags[])
    {
        String js = "{\n" +
                "  \"location\": {\n" +
                "    \"city\": \"New York\",\n" +
                "    \"country\": \"United States\",\n" +
                "    \"latitude\": 40.7128,\n" +
                "    \"longitude\": -74.0060\n" +
                "  },\n" +
                "  \"current_weather\": {\n" +
                "    \"temperature\": 22.5,\n" +
                "    \"humidity\": 60,\n" +
                "    \"description\": \"Partly cloudy\",\n" +
                "    \"wind_speed\": 10.2,\n" +
                "    \"wind_direction\": \"NW\"\n" +
                "  },\n" +
                "  \"forecast\": [\n" +
                "    {\n" +
                "      \"date\": \"2023-05-28\",\n" +
                "      \"temperature\": {\n" +
                "        \"min\": 19,\n" +
                "        \"max\": 25\n" +
                "      },\n" +
                "      \"description\": \"Sunny with scattered clouds\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2023-05-29\",\n" +
                "      \"temperature\": {\n" +
                "        \"min\": 21,\n" +
                "        \"max\": 27\n" +
                "      },\n" +
                "      \"description\": \"Mostly sunny\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2023-05-30\",\n" +
                "      \"temperature\": {\n" +
                "        \"min\": 18,\n" +
                "        \"max\": 23\n" +
                "      },\n" +
                "      \"description\": \"Partly cloudy\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        JsonPath jsonPath = new JsonPath(js);
        String minTemperature = jsonPath.getString("forecast[1].temperature.min");
        System.out.println(minTemperature);
    }
}
