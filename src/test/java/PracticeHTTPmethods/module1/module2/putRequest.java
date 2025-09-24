package PracticeHTTPmethods.module1.module2;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class putRequest {
    @Test
    public void putRequest(){
        RestAssured.baseURI ="";
        String requestBody= "{\n" +
                "\"name\" : \"sahil\",\n" +
                "\"job\" : \"QA\"\n" +
                "\n" +
                "}";
        given()
                .header("Content-Type","application/json")
//Content Type (Data Format)
                //Tells the server what kind of JsonPayload you are sending.
                //Means the request body is in JSON format.
                .body(requestBody)
                .when().put("/user/2")
//Path /user/2 tells which user to update, and body tells what to update.
                //name and job are the updated fields for user 2.
                .then()
                .statusCode(200)
                .body("job",equalTo("QA"));
    }
}
