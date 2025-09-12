package PracticeAllHTTP_Methods.Module2;



import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post_Request_Json_body {
    @Test
    public void post_request(){
        RestAssured.baseURI = "https://reqres.in/api";

        String requstBody = "{\n" +
                "\"name\" : \"sahil\",\n" +
                "\"job\" : \"QA\"\n" +
                "\n" +
                "}";
        given()
                .header("Content-Type","application/json")// response created in JSON
                .body(requstBody)// payload - data send client to srever
                .when().post("/user")// submit the data or create the resoucre
                .then().statusCode(201) // 201 Created
                .body("name",equalTo("sahil"))
                .body("job",equalTo("QA"));
    }
}
