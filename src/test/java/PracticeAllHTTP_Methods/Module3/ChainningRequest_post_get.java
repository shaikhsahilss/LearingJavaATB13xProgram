package PracticeAllHTTP_Methods.Module3;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ChainningRequest_post_get {
    @Test
    public void get_post(){
        RestAssured.baseURI = "";
        //Step - create user
       String usreId= given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "\"name\" : \"sahil\",\n" +
                        "\"job\" : \"QA\"\n" +
                        "\n" +
                        "}")
                .when().post("/users")
                .then()
                .statusCode(201)// post request created
                .extract().path("id");

       // Step 2 -> Fetch same user using extracted ID

        given()
                .pathParams("id" ,usreId)
                .when().get("/user/{id}")
                .then()
                .statusCode(200);// get request -> ok

    }
}
