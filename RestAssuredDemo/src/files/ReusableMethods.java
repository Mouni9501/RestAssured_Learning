package files;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {

	public static JsonPath rawToJson(String response)
	{
		JsonPath path1 = new JsonPath(response);
		return path1;
	}

}
