package practiceHTTPmethod.module3;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class frameWorkIntegerations {

    @Test
    public void setup(){
        RestAssured.baseURI="";
    }

} class userTest extends frameWorkIntegerations{
    @Test
    public void test(){
        given()
                .when()
                .get("user")
                .then()
                .statusCode(200);
        }

}
