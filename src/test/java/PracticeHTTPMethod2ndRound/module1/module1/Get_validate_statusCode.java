package PracticeHTTPMethod2ndRound.module1.module1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class Get_validate_statusCode {

    @Test
    public void getValidate_status_code(){

        RestAssured.baseURI ="";

        given()
                .when().get("/user/2")
                .then().assertThat().
                statusCode(200); // validate status code

    }
}
