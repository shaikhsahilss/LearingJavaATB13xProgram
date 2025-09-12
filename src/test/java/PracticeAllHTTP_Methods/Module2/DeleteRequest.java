package PracticeAllHTTP_Methods.Module2;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteRequest {
    @Test
    public void deleteUser(){
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .when()
                .delete("/user/2")
                .then()
                .statusCode(204);// no content
    }
}
