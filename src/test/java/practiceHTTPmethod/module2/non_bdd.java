package practiceHTTPmethod.module2;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class non_bdd {
    @Test
    public void getStatues(){

        RestAssured.baseURI="";
        RequestSpecification reqest = given().header("Content-Type","application/json");

        Response r = reqest.when().get("user/2");

        ValidatableResponse vr = r.then().assertThat().statusCode(200)
                .body("name",equalTo("sahil"));

    }
}
