package PracticeHTTPMethod2ndRound.module1.module3;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class chaningRequest_post_put {
    @Test
    public void chaingPutpost() {
        RestAssured.baseURI="";
        String payload = "{\n" +
                "\"name\" : \"sahil\",\n" +
                "\"job\" : \"QA\"\n" +
                "\n" +
                "}";
        String userID =given()
                .header("Content-Type","application/json")
                .when().post("/user")
                .then().statusCode(201)
                .extract().path("id");

       given() .header("Content-Type","application/json")
               .pathParams("id",userID)
               .when().get("/user/{id}")
               .then().statusCode(200);
    }
}
