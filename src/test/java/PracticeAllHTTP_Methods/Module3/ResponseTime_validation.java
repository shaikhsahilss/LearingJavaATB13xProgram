package PracticeAllHTTP_Methods.Module3;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ResponseTime_validation {
    @Test
    public void responseTime(){

        RestAssured.baseURI="";

        given()
                .when().get("/user?page=2"  )
                .then()
                .time(lessThan(2000L)); // response time < 2 Seconds

    }
}
