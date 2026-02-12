package practiceHTTPmethod.module3;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
public class loggingResposne {

    @Test
    public void logging(){
        RestAssured.baseURI="";

        given().when().get().then().log().all().statusCode(200);
    }
}
