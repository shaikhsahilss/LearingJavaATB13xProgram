package PracticeHTTPMethod2ndRound.module1.module1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;
public class pathPramaters {
    @Test
    public void pathparm(){
        RestAssured.baseURI ="";

        given()
                .pathParams("id",2)
                //passing path parameters
                .when().get("/user/{id}")
                .then().assertThat()
                .statusCode(200)
                .body("JsonPayload.id",equalTo(2));
    }
} //Path Parameters as a way to identify a specific resource in an API.
//To uniquely identify a resource -> GET /users/101
//Mandatory resource identification
//Path parameters are usually required, unlike query params which are optional.
//Hierarchical resources
//Path parameters represent parent-child relationships.