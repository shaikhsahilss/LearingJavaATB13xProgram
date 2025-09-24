package PracticeHTTPmethods.module1.module3;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class BearerTokeAuthentications {
    @Test
    public void bearertoken(){

        RestAssured.baseURI ="";
        given()
                .header("Autherization","Bearer 12345678 ")

                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .body("username.first",equalTo("sahil"));
        // response validations
    }
}
