package PracticeHTTPmethods.module1.modules1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class ValidateResponseHeader {
    @Test

    public void validateResponse(){

        RestAssured.baseURI ="";

        given()
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .header("Content-Type",equalTo("application/json; charse=utf8"));
        //validate header
    }
}
