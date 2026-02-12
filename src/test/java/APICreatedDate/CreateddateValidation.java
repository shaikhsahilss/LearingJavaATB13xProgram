package APICreatedDate;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class CreateddateValidation {
    public static void main(String[] args) {
        RestAssured.baseURI="https://reqres.in";

        String payload1 = "{ \"name\": \"Sahil Shaikh\", \"job\": \"Automation Tester\" }";
        String payload2 ="{ \"name\": \"Aisha Khan\", \"job\": \"Software Engineer\" }";
       String date1 = given().header("Content-Type","application/json")
                .body(payload1)
                .when().post("/api/users")
                .then().statusCode(201)
               .extract().path("createdAt");

        String date2 = given().header("Content-Type","application/json")
                .body(payload2)
                .when().post("/api/users")
                .then().statusCode(201)
                .extract().path("createdAt");

        Assert.assertNotEquals(date1,date2, "bothe the dates not matched");
        Assert.assertTrue(date2.compareTo(date1) > 0 ,"second user created later than fisrt");
    }
}
