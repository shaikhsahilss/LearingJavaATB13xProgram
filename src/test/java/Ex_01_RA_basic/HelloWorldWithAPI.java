package Ex_01_RA_basic;

import io.restassured.RestAssured;

public class HelloWorldWithAPI {
    public static void main(String[] args) {


        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .when().get("/ping")
                .then().log().all().statusCode(201);


    }
}
