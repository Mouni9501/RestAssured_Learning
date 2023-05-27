package files;

public class Payload {
	public static String addPlace() 
	{
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"karapakkam\",\r\n"
				+ "  \"phone_number\": \"(+91) 4543546\",\r\n"
				+ "  \"address\": \"cumming,Atlanta\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"Dominos\",\r\n"
				+ "    \"KFC\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}";
				
	}
	
	public static String coursesAndInfo()
	{
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "} ";
	}
  public static String addBookInLibrary(String isbn,String aisle)
  {
	 String payload = "{\r\n"
	  + "\"name\":\"Dane Jane\",\r\n"
	  + "\"isbn\":\""+isbn+"\",\r\n"
	  + "\"aisle\":\""+aisle+"\",\r\n"
	  + "\"author\":\"Mounika Ja\"\r\n"
	  + "}";
	 return payload;
  }




}
