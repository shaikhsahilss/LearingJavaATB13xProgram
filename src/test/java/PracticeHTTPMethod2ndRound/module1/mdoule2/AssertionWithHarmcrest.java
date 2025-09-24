package PracticeHTTPMethod2ndRound.module1.mdoule2;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class AssertionWithHarmcrest {
    @Test
    public void assertionswithharmcrest(){
        RestAssured.baseURI="";
        given()
                .when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .assertThat()
                .body("daat[0].email",containsString("shaikh@gmail.com"));

    }
}
