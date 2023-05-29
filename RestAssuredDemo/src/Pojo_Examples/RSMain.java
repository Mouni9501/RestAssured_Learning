package Pojo_Examples;

import io.restassured.path.json.JsonPath;

import java.util.*;

import static io.restassured.RestAssured.given;

public class RSMain
{
    public static void  main(String ags[])
    {
        String js = "\n" +
                "{\n" +
                "\"weather\":\n" +
                "{\n" +
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
                "}\n" +
                "}";
//       JsonPath jsonPath = new JsonPath(js);
//       String minTemperature = jsonPath.getString("forecast[1].temperature.min");
//       System.out.println(minTemperature);
//       ArrayList lp = (ArrayList) jsonPath.getList("forecast");
//        System.out.println(lp);
//        for(int i=0;i<lp.size();i++)
//        {
//            HashMap mp = (HashMap) lp.get(i);
//          if(mp.get("date").equals("2023-05-30"))
//          {
//             HashMap mp1 = (HashMap) mp.get("temperature");
//              System.out.println(mp1.get("min"));
//          }
//
//        }



        JsonPath js1 = new JsonPath(js);

        SecondExample secondExample = js1.getObject("weather",SecondExample.class);

        List<ForecastSE> fe =  js1.getList("forecast", ForecastSE.class);
       // System.out.println(secondExample);
        //System.out.println(secondExample.getLocation().getCountry());
      //  System.out.println(secondExample.getCurrent_weather().getDescription());

        System.out.println(fe);



    }
}
