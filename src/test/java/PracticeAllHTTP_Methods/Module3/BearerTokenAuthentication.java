package PracticeAllHTTP_Methods.Module3;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BearerTokenAuthentication {
    @Test
    public void beareToken(){
        RestAssured.baseURI ="";

        given()
                .header("Authorization", "Bearer 1234567")
                .when()
                .get("/users")
                .then().statusCode(200);

    }
}
