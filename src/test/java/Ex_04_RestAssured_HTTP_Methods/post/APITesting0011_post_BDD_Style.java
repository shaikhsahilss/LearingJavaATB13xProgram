package Ex_04_RestAssured_HTTP_Methods.post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting0011_post_BDD_Style {
@Test
    public void test_BDD_Style(){
String payload = "{\n" +
        "    \"username\": \"admin\",\n" +
        "    \"password\": \"password123\"\n" +
        "}";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)


                .when()
                .log().all()
                .post()


                .then().log().all()
                .statusCode(200);
    }
}
