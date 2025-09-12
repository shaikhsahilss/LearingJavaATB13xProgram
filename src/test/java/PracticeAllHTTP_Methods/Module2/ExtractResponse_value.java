package PracticeAllHTTP_Methods.Module2;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ExtractResponse_value {
    @Test
    public void extractUserID(){

        RestAssured.baseURI = "https://reqres.in/api";

     int userID=  given()
              .when()
              .get("/user/2")
              .then()
              .statusCode(200)
              .extract().path("data.id"); // Extract value from JSON
        System.out.println("Extracted user id :" +userID);
    }
}
