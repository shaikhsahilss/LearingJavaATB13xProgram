package practiceHTTPmethod.module2;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class putReuqest {

    @Test
    public void putrequest(){
        RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";

        String name = given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"firstname\" : \"sahil\",\n" +
                        "    \"lastname\" : \"shaikh\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .when().put("/4619")
                .then().statusCode(200)
                .log().all().extract().path("firstname");

        System.out.println(name);
    }
}
