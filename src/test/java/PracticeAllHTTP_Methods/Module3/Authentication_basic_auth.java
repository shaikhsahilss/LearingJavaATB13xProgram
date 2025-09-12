package PracticeAllHTTP_Methods.Module3;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Authentication_basic_auth {
    @Test
    public void basicAuth(){
        RestAssured.baseURI = "reqres.in";
        given()
                .auth().basic("UserName","Password")
                .when()
                .get("/basic-auth")
                .then().statusCode(200)
                .body("authenticated",equalTo(true));


    }
}
