package PracticeHTTPmethods.module1.modules1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class validateResponse {
    @Test
    public void validateRespone(){

        RestAssured.baseURI = "";

        given()
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .body("name.first",equalTo("sahil"))
                // validate JSON field
                .header("Content-Type",equalTo("application/json; charst=utf8"));

    }
}
