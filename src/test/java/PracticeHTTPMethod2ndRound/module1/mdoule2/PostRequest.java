package PracticeHTTPMethod2ndRound.module1.mdoule2;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class PostRequest {
    @Test
    public void postrequest(){
        RestAssured.baseURI="";
        String payload = "{\n" +
                "\"name\" : \"sahil\",\n" +
                "\"job\" : \"QA\"\n" +
                "\n" +
                "}";
        given()
                .header("Content-Type","application/json")
                .body(payload) // payload -JsonPayload send to client to server
                .when().post("/user")// submit the JsonPayload and create resource
                .then()
                .statusCode(201)
                .body("name",equalTo("sahil"))
                .body("job",equalTo("QA"));
    }
}
