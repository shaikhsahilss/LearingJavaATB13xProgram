package practiceHTTPmethod.module2;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class deleterequest {

    @Test
    public void deletereuqets(){

        RestAssured.baseURI="";
        given()
                .when()
                .delete("/user/2")
                .then().assertThat()
                .statusCode(204);

    }
}
