package Pojo_Examples;

import Pojo_Examples.Courses_RSCE;
import Pojo_Examples.RahulShettyCourseExample;

import java.util.ArrayList;

public class RahulShettyCourseExample_MainMethod
{
    public static void main(String args[])
    {
        RahulShettyCourseExample rahulShettyCourseExample = new RahulShettyCourseExample();
        Courses_RSCE coursesRsce = new Courses_RSCE();
        WebAutomation_RSCE webAutomationRsce = new WebAutomation_RSCE();
        Api_RSCE apiRsce = new Api_RSCE();
        Mobile_RSCE mobileRsce = new Mobile_RSCE();
        rahulShettyCourseExample.setInstructor("Rahul Shetty");
        rahulShettyCourseExample.setUrl("rahulshettyacademy.com");
        rahulShettyCourseExample.setServices("project support");
        rahulShettyCourseExample.setExpertise("Automation");
        ArrayList<String> webAutomation = new ArrayList<>();
        ArrayList<Integer> webAutomation1 = new ArrayList<>();
        ArrayList<String> api = new ArrayList<>();
        api.add("Rest Assured Automation using Java");

        ArrayList<Integer> api1 = new ArrayList<>();

        mobileRsce.setCourseTitle("appium");
        mobileRsce.setPrice(70);



    }

}
