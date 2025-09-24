package PracticeHTTPMethod2ndRound.module1.module3;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class BearerToken {
    @Test
    public void bearerToken(){
        RestAssured.baseURI="";

        given().header("Authorization","Bearer 1234567")
                .when()
                .get("/user")
                .then().statusCode(200);

    }
}
