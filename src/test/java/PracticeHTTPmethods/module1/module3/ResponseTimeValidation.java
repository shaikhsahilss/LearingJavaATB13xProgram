package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class ResponseTimeValidation {
    @Test
    public void timevalidation(){

        RestAssured.baseURI="";

        given().when().get().then().statusCode(200)
                .time(lessThan(2000L));
    }
}
