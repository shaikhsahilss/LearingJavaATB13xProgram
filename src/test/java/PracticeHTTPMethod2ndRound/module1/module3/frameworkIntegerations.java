package PracticeHTTPMethod2ndRound.module1.module3;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class frameworkIntegerations {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI="";

    }
}
class userTest extends frameworkIntegerations{
    @Test
    public void getUserTest(){
        given()
                .when()
                .get()
                .then()
                .statusCode(200);

    }
}
