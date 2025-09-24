package PracticeHTTPMethod2ndRound.module1.mdoule2;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class ExtractResponse {
    @Test
    public void extractresposne(){
        RestAssured.baseURI ="";
     int userid=   given().when()
                .get("/user/2")
                .then()
                .statusCode(200)
                .extract().path("JsonPayload.id");


        System.out.println("user id"+ userid);
    }


}
