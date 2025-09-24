package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class chanininRequest {
    @Test
    public void post_get(){
        //Step creater username

        String userid = given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "\"name\" : \"sahil\",\n" +
                        "\"job\" : \"QA\"\n" +
                        "\n" +
                        "}")
                .when().post("/user")
                .then()
                .statusCode(201).extract().path("id");

        // get the details of the id

        given()
                .pathParams("id",userid)

                .when().get("/user/{id}")
                .then()
                .statusCode(200);


    }
}
