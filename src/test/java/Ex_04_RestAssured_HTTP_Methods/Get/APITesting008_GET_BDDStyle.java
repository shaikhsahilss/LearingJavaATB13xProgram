package Ex_04_RestAssured_HTTP_Methods.Get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting008_GET_BDDStyle {
    String pincode = "560048";
    @Test
    public void test_GET_Request(){
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}
