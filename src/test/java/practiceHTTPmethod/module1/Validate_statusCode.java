package practiceHTTPmethod.module1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Validate_statusCode
{
    @Test
    public void getstatusCOde(){
        RestAssured.baseURI ="";

        given()
                .when()
                .get("/user/2")
                .then().assertThat().statusCode(200);
    }
}
