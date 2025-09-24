package PracticeHTTPMethod2ndRound.module1.module3;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class logAll {
    @Test
    public void logALl(){
        RestAssured.baseURI="";
        given().log().all()
                .when().get("user/2")
                .then()
                .statusCode(200);
    }
}
