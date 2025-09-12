package Ex_01_RA_basic;

import io.restassured.RestAssured;

public class APITesting_Lab01_RA {
    public static void main(String[] args) {
        RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com")
                .when().get("/ping")
                .then().log().all().statusCode(201);
    }
}
