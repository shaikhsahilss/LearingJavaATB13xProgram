package PracticeHTTPMethod2ndRound.module1.module1;


import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;
public class queryparamerte {
    @Test
    public void queyparamer(){
        RestAssured.baseURI ="";
        given().queryParam("page",2)
                .when().get("/user/2")
                .then().assertThat().statusCode(200)
                .body("page",equalTo(2));
//Query parameters make APIs more flexible, reusable, and efficient
// by allowing filtering, pagination, sorting, and
// customization without creating new endpoints
    }
}
