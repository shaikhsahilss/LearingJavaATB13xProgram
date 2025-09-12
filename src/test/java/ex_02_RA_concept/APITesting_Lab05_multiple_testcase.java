package ex_02_RA_concept;

import io.restassured.RestAssured;

public class APITesting_Lab05_multiple_testcase {
    public static void main(String[] args) {

        String pincode = "110048";

        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        pincode = "@";

        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);


        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
