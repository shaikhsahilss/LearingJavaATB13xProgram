package PracticeHTTPmethods.module1.modules1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Path_parameter {

    @Test
    public void PathParameter() {
        RestAssured.baseURI = "";

        given()
                .pathParams("id", 2)
                //passing path parameters
                .when().get("/user/{id}")
                //Url Becomes /user/2
                .then()
                .statusCode(200)
                .body("name.first", equalTo("sahil"));
    }
}

// Imp -- Path Parameters as a way to identify a specific resource in an API.
//Why we need Path Parameters?
//To uniquely identify a resource -> GET /users/101
//Mandatory resource identification
//Path parameters are usually required, unlike query params which are optional.

//RESTful URL design (clean & meaningful URLs)
//Instead of using query params for everything,
// RESTful design prefers path params for resource identity.
//❌ /getUser?id=101
//✅ /users/101

//Hierarchical resources
//Path parameters represent parent-child relationships.
