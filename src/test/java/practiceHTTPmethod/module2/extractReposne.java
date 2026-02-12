package practiceHTTPmethod.module2;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class extractReposne {
    @Test

    public  void extractResponse(){

        RestAssured.baseURI="";

        int userId = given()
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .extract().path("json.payloadId");
        System.out.println("user id" + userId);
    }
}
