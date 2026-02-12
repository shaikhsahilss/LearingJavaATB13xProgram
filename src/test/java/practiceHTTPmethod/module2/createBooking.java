package practiceHTTPmethod.module2;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class createBooking {

    @Test
    public void creteBooking_post(){
        RestAssured.baseURI="https://restful-booker.herokuapp.com";

        String checkoutdate = given().header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"firstname\" : \"Jim\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .when().post("/booking")
                .then().log().all().statusCode(200)
                .extract().path("booking.bookingdates.checkout");
        System.out.println(checkoutdate);

        Assert.assertNotNull(checkoutdate, " date is not avaiulate");
    }
}
