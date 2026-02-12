package practiceHTTPmethod.module3;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class bearerTokenAuthntication {
    @Test
    public void BearerToekn(){
        RestAssured.baseURI="";
String token ="12345678";
        given().header("Authorization", "Bearer " +token)
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .body("username.first",equalTo("sahil"));

        //response validations

    }
}
