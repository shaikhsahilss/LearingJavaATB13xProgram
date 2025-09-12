package PracticeAllHTTP_Methods.module1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get_Validate_statueCode {
    @Test
    public void getRequest_statusCode(){
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .when().get("/user?pages=2")
                .then()
                .statusCode(200); // validate status code


    }
}
