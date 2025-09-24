package PracticeHTTPmethods.module1.module2;
import io.cucumber.java.ja.但し;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.lang.annotation.Repeatable;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class postRequest {
    @Test

    public void postRequest(){
        RestAssured.baseURI ="";

        String body ="{\n" +
                "\"name\" : \"sahil\",\n" +
                "\"job\" : \"QA\"\n" +
                "\n" +
                "}";

        given()
                .header("Content-Type","application/json")
                //rseponse created in json format
                .body(body)// JsonPayload send client to server
                .when().post("/user")
                // submit the JsonPayload and create resorce
                .then()
                .statusCode(201)// 201 created
                .body("name",equalTo("sahil"))
                .body("job", equalTo("QA"));
    }
}
