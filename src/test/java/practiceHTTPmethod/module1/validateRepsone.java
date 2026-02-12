package practiceHTTPmethod.module1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class validateRepsone {

    @Test
    public void validateReposne(){
        RestAssured.baseURI="";

        given()
                .when()
                .get("/user/2")
                .then().assertThat().statusCode(200)
                .body("name.fisrt", equalTo("sahil"))

                // validate Json fileds

                .header("Content-Type",equalTo("application/json; charset=utf8"));

    }
}
