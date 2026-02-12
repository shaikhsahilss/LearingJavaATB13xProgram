package practiceHTTPmethod.module3;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class oAuth {
    @Test
    public void oauth(){
        RestAssured.baseURI="";

        given().auth().oauth2("12357")
                .header("Content-Type", "application/json")
                .when()
                .get().then().statusCode(201)
                .body("autnetivcate",equalTo(true));


    }
}
