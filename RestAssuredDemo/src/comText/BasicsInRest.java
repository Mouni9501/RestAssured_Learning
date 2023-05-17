package comText;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import files.Payload;
import files.ReusableMethods;

public class BasicsInRest {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		String responseResult = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").
		body(Payload.addPlace()).when().post("maps/api/place/add/json").then().assertThat().
		header("Server", "Apache/2.4.41 (Ubuntu)").statusCode(200).body("scope", equalTo("APP")).extract().response().asString();
		
		System.out.println(responseResult);
		JsonPath path = new JsonPath(responseResult);
		String palceId =path.getString("place_id");
		System.out.println("Place Id is: "+palceId);
		
		//update place
		
		String newAddress = "Madhapur , HYD";
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").
		body("{\r\n"
				+ "\"place_id\":\""+palceId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "} \r\n"
				+ "").
		when().put("maps/api/place/update/json").
		then().assertThat().log().all().header("Connection", "Keep-Alive").body("msg", equalTo("Address successfully updated"));
	   
		//get place
	    String getPlaceResponse = given().log().all().queryParam("key","qaclick123").queryParam("place_id",palceId).
		when().get("maps/api/place/get/json").
		then().log().all().assertThat().header("Server","Apache/2.4.41 (Ubuntu)").statusCode(200).extract().response().asString();
		
	    JsonPath path1 = ReusableMethods.rawToJson(getPlaceResponse);  
	    String actualAddress = path1.getString("address");
	    System.out.println(actualAddress);
	    Assert.assertEquals("actualAddress", "newAddress");
		
		
	}

}
