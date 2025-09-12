package PracticeAllHTTP_Methods.Module2;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AssertionsWithHamcrest {
    @Test
    public void validateHamcrest(){
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .body("data.first_name", hasItems("sahil","shaikh"))
        //Array contains names
                .body("data[0].email", containsString("@reqres.in"))
                // partial match
                .body("data.size()", greaterThan(0));
        // Validate list is not empty
    }
}
