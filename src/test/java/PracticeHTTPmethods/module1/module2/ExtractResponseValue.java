package PracticeHTTPmethods.module1.module2;
import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class ExtractResponseValue {
    @Test

    public void extractresponse(){
        RestAssured.baseURI ="";

        int userId =
                given()
                .when()
                .get("/user/2")
                .then()
                        .statusCode(200)
                        .extract().path("JsonPayload.id");
        System.out.println("Extracted user id : " +userId);
    }
}
