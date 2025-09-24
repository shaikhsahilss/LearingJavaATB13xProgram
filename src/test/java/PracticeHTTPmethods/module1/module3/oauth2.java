package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class oauth2 {
    @Test

    public void oauth(){
        RestAssured.baseURI ="";

        given()
                .auth().oauth2("1234567")
                .header("Content-Type","application/json")
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .body("authenticates",equalTo(true));
    }
}
