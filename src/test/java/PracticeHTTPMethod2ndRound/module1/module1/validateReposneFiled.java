package PracticeHTTPMethod2ndRound.module1.module1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class validateReposneFiled {
    @Test
    public void validateResposne(){
        RestAssured.baseURI="";
        given()
                .when().get("/user/2")
                .then().assertThat()
                .statusCode(200)
                .body("first.name",equalTo("sahil"));

        // valiade JSON filed


    }
}
