package PracticeAllHTTP_Methods.module1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Query_Parameters {

    @Test
    public void query_parameter(){

        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .queryParam("page", 2) // passing query parameter
                // When the dataset is large,
                // query params help fetch results in smaller chunks.
                .when()
                .get("/user/2")
                .then().statusCode(200)
                .body("page",equalTo(2));
//Query parameters make APIs more flexible, reusable, and efficient
// by allowing filtering, pagination, sorting, and
// customization without creating new endpoints
    }
}
