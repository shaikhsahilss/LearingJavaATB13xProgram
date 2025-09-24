package PracticeHTTPMethod2ndRound.module1.module3;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class basicAuth {
    @Test
    public void authbasic(){
        RestAssured.baseURI="";

        given().auth().basic("user","pass")
                .when()
                .get("/user")
                .then().statusCode(200)
                .body("authenticated",equalTo(true))
                ;
    }

}
