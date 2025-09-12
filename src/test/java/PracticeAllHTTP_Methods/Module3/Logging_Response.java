package PracticeAllHTTP_Methods.Module3;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import static org.hamcrest.Matchers.*;
public class Logging_Response {
    @Test
    public void logALL(){
        RestAssured.baseURI="";

        given()
                .log().all()
                .when().get("/user/2")
                .then()
                .statusCode(200);
//.log().all() is used to log everything about the request or response.

        //It prints:

        //Request details: URI, method, headers, cookies, parameters, and body

      //  Response details: status code, headers, body

        //Best used for debugging, to see full request/response details.
    }
}
