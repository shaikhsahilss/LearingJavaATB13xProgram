package PracticeHTTPmethods.module1.module2;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class DeleteRequest {
    @Test
    public void deleterequest(){
        RestAssured.baseURI="";

        given()
                .when()
                .delete("/user/2")
                .then()
                .statusCode(204);// no content

    }
}
