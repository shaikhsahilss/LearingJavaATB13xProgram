package Ex_04_RestAssured_HTTP_Methods.Get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_GET_Non_BDDStyle {
    RequestSpecification r; //→ Preparing the request (Given)

    Response response;//→ Executing and capturing the response (When)

    ValidatableResponse vr; //Validating the response (Then)
    String pincode;
    @Test
    public void test_GET_nonBDD(){
       pincode = "560048";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        //Part 2

        response = r.when().log().all().get();

        //Part 3

        vr = response.then().log().all();
        vr.statusCode(200);

    }
    public void test_GET_nonBDD_Negative(){
       pincode = "@";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        //Part 2

        response = r.when().log().all().get();

        //Part 3

        vr = response.then().log().all();
        vr.statusCode(404);

    }
}
