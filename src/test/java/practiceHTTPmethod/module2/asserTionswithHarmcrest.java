package practiceHTTPmethod.module2;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
public class asserTionswithHarmcrest {

    @Test
    public void assertion(){
        RestAssured.baseURI="";

        given()
                .when()
                .get("/user")
                .then()
                .statusCode(200)
                .assertThat()
                .body("contact[0].email", containsString("shaikhsahil@gmail.com"));

    }
}
