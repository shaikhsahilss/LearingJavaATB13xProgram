package PracticeHTTPMethod2ndRound.module1.mdoule2;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class deleterequest {
    @Test
    public void delete(){
        RestAssured.baseURI="";
        given()
                .when()
                .delete("/user/2")
                .then()
                .assertThat().statusCode(204);
        //no content
    }
}
