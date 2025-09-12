package Ex_03_TestNg_Allure_Report;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_TestNG_Lab_06 {

    String pincode;
    //valid - pincode -
    @Test
    public void Test_TC1_pincode_valid(){
        pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }



    // #$%^ special input - pincode
    @Test
    public void Test_TC2_pincode_invalid(){
        pincode = "@";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    //' ' blank
    @Test
    public void Test_TC3_pincode_invalid(){
        pincode = " ";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
