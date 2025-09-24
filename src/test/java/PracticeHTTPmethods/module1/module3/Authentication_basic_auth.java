package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Authentication_basic_auth {

    @Test
    public void authenticationBasic(){
        RestAssured.baseURI ="";

        given().auth().basic("user","pass")

                .when()
                .get("/basic-auth")

                .then()
                .statusCode(200)
                .body("authenticate",equalTo(true));


    }
}
