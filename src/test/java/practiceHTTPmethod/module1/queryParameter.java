package practiceHTTPmethod.module1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class queryParameter {
    @Test
    public void queryParammeter(){
        RestAssured.baseURI="";

        given()
                .queryParam("pages",2)
                .when().get("/user/2")
                .then().assertThat()
                .statusCode(200)
                .body("page", equalTo(2));
    }
}
