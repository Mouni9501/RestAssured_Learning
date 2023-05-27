package comText;

//import org.testng.annotations.Test;

import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Library_Api_Using_Testng 
{
	@Test(dataProvider ="Books data")
	public void addBook(String isbn,String aisle)
	  {
		  RestAssured.baseURI = "http://216.10.245.166";
		 String response = given().log().all().header("Content-Type","application/json")
		  .body(Payload.addBookInLibrary(isbn,aisle)).when().post("/Library/Addbook.php")
		  .then().log().all().statusCode(200).extract().response().asString();
		JsonPath jp = ReusableMethods.rawToJson(response);
		System.out.println(response);
		String id =  jp.get("ID");
		System.out.println("Id of the book is: " +id);
	  }
	
    @DataProvider(name = "Books data")
	public Object[][] getBooksData()
	{
		return new Object[][] {{"ojfwty","9363"},{"cwetee","4253"}, {"okmfet","533"} };
	}
}
