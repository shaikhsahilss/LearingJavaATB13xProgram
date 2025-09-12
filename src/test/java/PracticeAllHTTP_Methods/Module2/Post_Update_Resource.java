package PracticeAllHTTP_Methods.Module2;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post_Update_Resource {
    @Test
    public void update_resource_post(){

        RestAssured.baseURI ="https://reqres.in/api";

        String requestBody= "{\n" +
                "\"name\" : \"sahil\",\n" +
                "\"job\" : \"QA\"\n" +
                "\n" +
                "}";

        given()
                .header("Content-Type","application/json")
                //Content Type (Data Format)
                //Tells the server what kind of data you are sending.
                //Means the request body is in JSON format.
                .body(requestBody)
                .when().put("/user/2")
                //Path /user/2 tells which user to update, and body tells what to update.
                //name and job are the updated fields for user 2.
                .then()
                .statusCode(200)
                .body("job",equalTo("QA")); // validate updated filed




//        Accept: application/json
//👉 Tells the server you only want JSON response.

        //Headers are required to tell the server
        // how to process your request and tell the client how to handle the response.
        // Without headers,
        // APIs wouldn’t know the format, authentication, or rules of communication.

    }
}
