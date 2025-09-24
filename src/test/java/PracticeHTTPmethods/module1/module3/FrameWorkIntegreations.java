package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class FrameWorkIntegreations {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI="";
    }
}
class userTest extends FrameWorkIntegreations{
    @Test
    public void getUserTest(){

        given()
                .when()
                .get("/user")
                .then()
                .statusCode(200);
    }
}
