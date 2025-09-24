package PracticeHTTPmethods.module1.modules1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get_Validate_status_COde {

    @Test
    public void GetRequest_statusCode(){

        RestAssured.baseURI ="https://reqres.in/api";
        given()
                .when()
                .get("/user?pages=2")
                .then().statusCode(200);// Validate status code


    }
}
