package PracticeHTTPmethods.module1.module2;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import static org.hamcrest.Matchers.*;

public class AssertionWithHamcrest {
    @Test

    public void assertion(){
        RestAssured.baseURI ="";

        given()
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .body("JsonPayload.firstName",hasItem("sahil,shaikh"))
                //Array Contains names
                .body("JsonPayload[0].email",containsString("@shaik.com"))

                .body("JsonPayload.size",greaterThan(0));
        // validate list is not empty

    }
}
