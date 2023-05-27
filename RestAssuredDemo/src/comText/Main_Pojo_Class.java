package comText;

import io.restassured.path.json.JsonPath;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Main_Pojo_Class {
    public static void main(String[] ar)
    {
        Pojo_Example pojoExample = new Pojo_Example();
        Address address = new Address();
        pojoExample.setName("Mounika Ja");
        pojoExample.setEmail("mounika9501@example.com");
        pojoExample.setAge(25);
        pojoExample.setBio("I'm a software engineer with a passion for coding and music. In my free time, I enjoy playing guitar and watching movies.");
        address.setStreet("123 Main St");
        address.setState("NY");
        address.setCountry("United States");
        pojoExample.setAddress(address);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("programming");
        arrayList.add("music");
        arrayList.add("sports");
        pojoExample.setInterests(arrayList);
        //System.out.println(pojoExample);
        JsonPath js = new JsonPath(String.valueOf(pojoExample));
        System.out.println(js.getString("name"));
        given().log().all().queryParam("key","qaclick123")
                .header("Content-Type","application/json").
                body(pojoExample)
                .when().post("maps/api/place/add/json").then().assertThat().
                header("Server", "Apache/2.4.41 (Ubuntu)")
                .statusCode(200).body("scope", equalTo("APP")).extract().response();

    }
}
