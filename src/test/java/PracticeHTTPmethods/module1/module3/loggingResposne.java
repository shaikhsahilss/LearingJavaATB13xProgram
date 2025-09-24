package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class loggingResposne {

    @Test
    public void loggingResponse(){

        RestAssured.baseURI ="";

        given().log().all()
                .when()
                .get("/user")
                .then()
                .statusCode(200);

        //.log().all() is used to log everything about the request or response.

        //It prints:

        //Request details: URI, method, headers, cookies, parameters, and body

        //  Response details: status code, headers, body

        //Best used for debugging, to see full request/response details.
    }
}
