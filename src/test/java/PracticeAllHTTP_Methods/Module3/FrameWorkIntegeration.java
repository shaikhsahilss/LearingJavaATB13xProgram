package PracticeAllHTTP_Methods.Module3;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import static org.hamcrest.Matchers.*;


public class FrameWorkIntegeration {
    @BeforeClass
    public void SetUp(){
        RestAssured.baseURI ="";
    }

}
class userTest extends FrameWorkIntegeration{
    @Test
    public void getUserTest(){
        given()
                .when()
                .get("/user/2")
                .then()
                .statusCode(200);

    }
}
