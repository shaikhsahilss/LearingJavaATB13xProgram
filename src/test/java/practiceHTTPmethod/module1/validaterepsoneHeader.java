package practiceHTTPmethod.module1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class validaterepsoneHeader {
    @Test
    public void validateHeader(){
        RestAssured.baseURI="";

        given()
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .header("Content-Type", equalTo("application/json; charset=utf8"));

    }
}
