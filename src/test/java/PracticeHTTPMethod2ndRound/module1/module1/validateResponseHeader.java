package PracticeHTTPMethod2ndRound.module1.module1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class validateResponseHeader {
    @Test
    public void headerrepo(){
        RestAssured.baseURI="";
        given()
                .when()
                .get("/user/2")
                .then()
                .assertThat()
                .statusCode(200)
                .header("Content-Type",equalTo("application/json; charset=utf8"));
        //header validation
    }
}
