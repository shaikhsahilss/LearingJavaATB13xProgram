package PracticeHTTPMethod2ndRound.module1.mdoule2;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class Put_update {

    @Test
    public void put_update() {
        RestAssured.baseURI = "";
        String payload = "{\n" +
                "\"name\" : \"sahil\",\n" +
                "\"job\" : \"QA\"\n" +
                "\n" +
                "}";
        given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .put("/user/2")
                .then()
                .statusCode(200)
                .body("job",equalTo("QA"));

    }
}
