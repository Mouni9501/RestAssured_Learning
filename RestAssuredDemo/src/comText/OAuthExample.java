package comText;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.*;
public class OAuthExample {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get();
//        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("mouni95.j");
//        driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Angel@2020");
//        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
        String url = "djsjsjkskslsl##@@code=kdjdjdskskskskksjdjjk";
        String partialCode = url.split("code=")[1];
        String requiredCode = partialCode.split("&scope")[0];
        System.out.println(requiredCode);
//        String response =
//
//                given()
//
//                        .urlEncodingEnabled(false)
//                        .queryParams("code",RequiredCode);
       String accessTokenRequest = given().
                queryParams("code",requiredCode)
                .queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
                .queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
                .queryParams("grant_type","authorization_code")
                .when().log().all().post("https://accounts.google.com/o/oauth2/v2/auth").asString();
        System.out.println(accessTokenRequest);
        JsonPath js = new JsonPath(accessTokenRequest);
        String accessToken = js.getString("access_token");
       String response = given().queryParam("access_token",accessToken)
               .when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();
        System.out.println(response);
    }
}

