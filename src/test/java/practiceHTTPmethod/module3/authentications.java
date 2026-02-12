package practiceHTTPmethod.module3;
import io.restassured.RestAssured;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
public class authentications {

    @Test
    public void authentication(){
        RestAssured.baseURI="";

        given().auth().basic("username","password")
                .when()
                .get("/basic/auth")
                .then()
                .statusCode(200)
                .body("authenticate", equalTo(true));

    }
}
