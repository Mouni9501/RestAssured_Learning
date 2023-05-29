package Pojo_Examples;

import Pojo_Examples.Courses_RSCE;
import Pojo_Examples.RahulShettyCourseExample;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RahulShettyCourseExample_MainMethod
{
    public static void main(String args[])
    {
        RahulShettyCourseExample rahulShettyCourseExample = new RahulShettyCourseExample();
        Courses_RSCE coursesRsce = new Courses_RSCE();
        WebAutomation_RSCE webAutomationRsce0 = new WebAutomation_RSCE();
        WebAutomation_RSCE webAutomationRsce1 = new WebAutomation_RSCE();
        WebAutomation_RSCE webAutomationRsce2 = new WebAutomation_RSCE();
        Api_RSCE apiRsce0 = new Api_RSCE();
        Api_RSCE apiRsce1 = new Api_RSCE();
        Mobile_RSCE mobileRsce = new Mobile_RSCE();
        rahulShettyCourseExample.setInstructor("Rahul Shetty");
        rahulShettyCourseExample.setUrl("rahulshettyacademy.com");
        rahulShettyCourseExample.setServices("project support");
        rahulShettyCourseExample.setExpertise("Automation");
        webAutomationRsce0.setCourseTitle("Selenium Webdriver Java");
        webAutomationRsce0.setPrice(50);
        webAutomationRsce1.setCourseTitle("Cypress");
        webAutomationRsce1.setPrice(40);
        webAutomationRsce2.setCourseTitle("Protractor");
        webAutomationRsce2.setPrice(40);
        apiRsce0.setCourseTitle("Rest Assured Automation using Java");
        apiRsce0.setPrice(50);
        apiRsce1.setCourseTitle("SoapUI Webservices testing");
        apiRsce1.setPrice(40);
       ArrayList<WebAutomation_RSCE> webAL = new ArrayList<WebAutomation_RSCE>();
        webAL.add(webAutomationRsce0);
        webAL.add(webAutomationRsce1);
        webAL.add(webAutomationRsce2);
       ArrayList<Api_RSCE>  apiAl = new ArrayList<Api_RSCE>();
       apiAl.add(apiRsce0);
       apiAl.add(apiRsce1);
        mobileRsce.setCourseTitle("appium");
        mobileRsce.setPrice(70);
        ArrayList<Mobile_RSCE> mobileAl = new ArrayList<Mobile_RSCE>();
        mobileAl.add(mobileRsce);

      coursesRsce.setWebAutomation(webAL);
      coursesRsce.setApi(apiAl);
      coursesRsce.setMobile(mobileAl);
      rahulShettyCourseExample.setCourses(coursesRsce);






        given().log().all().queryParam("key","qaclick123")
                .header("Content-Type","application/json").
                body(rahulShettyCourseExample)
                .when().post("maps/api/place/add/json").then().assertThat().
                header("Server", "Apache/2.4.41 (Ubuntu)")
                .statusCode(200).body("scope", equalTo("APP")).extract().response();
    }

}
