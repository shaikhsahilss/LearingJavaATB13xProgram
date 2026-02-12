package practiceHTTPmethod.module3;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class chainingResquest {

    @Test
    public void post(){

        RestAssured.baseURI="";
        String payload = "";
        int userid =given()
                .header("Content-Type","application/json")
                .body(payload)
                .when()
                .post("/user")
                .then().statusCode(201)
                .extract().path("id");


        given()
                .pathParams("id",userid)
                .when().get("/user/{id}")
                .then().statusCode(200);

        }
    }

