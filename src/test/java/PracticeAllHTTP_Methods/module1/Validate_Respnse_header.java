package PracticeAllHTTP_Methods.module1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Validate_Respnse_header {
    @Test
    public void validate_response_header(){

        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .when().get("/User/2")
                .then()
                .statusCode(200)
                .header("Content-Type", equalTo("application/json;  charset=utf-8"));
        // validate header
    }


}
