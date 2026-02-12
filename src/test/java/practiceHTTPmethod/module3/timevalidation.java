package practiceHTTPmethod.module3;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class timevalidation {
    @Test
    public void timevalidation(){

        RestAssured.baseURI="";

        given()
                .when()
                .get("user/2")
                .then().statusCode(200)
                .assertThat().time(lessThan(2000L));





    }
}
