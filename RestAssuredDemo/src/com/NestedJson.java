package com;

import org.testng.Assert;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class NestedJson {
	public static void main(String args[])
	{
		JsonPath jPath = new JsonPath(Payload.coursesAndInfo());
		
		//1. Print No of courses returned by API
		int noOfCourses = jPath.getInt("courses.size()");
		System.out.println("Total no:of course: "+noOfCourses);
		//2.Print Purchase Amount
		int purchaseAmount = jPath.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount is: "+purchaseAmount);
		//3. Print Title of the first course
		String title = jPath.get("courses[0].title");
		System.out.println("Title of the first course is: "+title);
		//4. Print All course titles and their respective Prices
		for(int i=0;i<noOfCourses;i++)
		{
			String titleOfTheCourse = jPath.get("courses["+i+"].title");
			int priceOfTheCourse = jPath.getInt("courses["+i+"].price");
			System.out.println("Title of the course: " +titleOfTheCourse);
			System.out.println("Price of the course: " +priceOfTheCourse);
		}
		//5. Print no of copies sold by RPA Course
		for(int i=0;i<noOfCourses;i++)
		{
			String titleOfTheCourse = jPath.get("courses["+i+"].title");
			
			if(titleOfTheCourse.equals("RPA"))
			{
				int noOfCopies = jPath.getInt("courses["+i+"].copies");
				System.out.println("noOfCopies of RPA is: "+noOfCopies);
				break;
			}
		}
		//6. Verify if Sum of all Course prices matches with Purchase Amount
		int sum =0;
		for(int i=0;i<noOfCourses;i++)
		{
			int noOfCopies = jPath.getInt("courses["+i+"].copies");
			int priceOfTheCourse = jPath.getInt("courses["+i+"].price");
			int cost = noOfCopies*priceOfTheCourse;
			sum = sum+cost;
		}
		System.out.println("Total cost is: "+sum);
		
		Assert.assertEquals(sum,purchaseAmount);
		
		
		
	}

}
