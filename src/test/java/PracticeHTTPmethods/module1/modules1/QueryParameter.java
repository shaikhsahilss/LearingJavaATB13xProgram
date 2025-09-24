package PracticeHTTPmethods.module1.modules1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class QueryParameter {
    @Test
    public void queryparamet(){

        RestAssured.baseURI ="";

        given()
                .queryParam("pages",2)
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .body("page",equalTo(2));
        //Query parameters make APIs more flexible, reusable, and efficient
// by allowing filtering, pagination, sorting, and
// customization without creating new endpoints
    }
}
