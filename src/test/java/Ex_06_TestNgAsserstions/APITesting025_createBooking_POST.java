package Ex_06_TestNgAsserstions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;

public class APITesting025_createBooking_POST {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    String token;

    Integer bookingID;
@Test
    public void test_createBooking_POST(){

String payload = "{\n" +
        "    \"firstname\": \"Sahil\",\n" +
        "    \"lastname\": \"Shaikh\",\n" +
        "    \"totalprice\": 111,\n" +
        "    \"depositpaid\": true,\n" +
        "    \"bookingdates\": {\n" +
        "        \"checkin\": \"2025-30-07\",\n" +
        "        \"checkout\": \"2025-08-01\"\n" +
        "    },\n" +
        "    \"additionalneeds\": \"Biryani\"\n" +
        "}";
requestSpecification = RestAssured.given();
requestSpecification.baseUri("https://restful-booker.herokuapp.com");
requestSpecification.basePath("/booking");

//header information
requestSpecification.contentType(ContentType.JSON);
requestSpecification.body(payload);

response = requestSpecification.when().log().all().post();

//Get validate response to perfrom validation

validatableResponse = response.then();

//Rest assured .Assertions
validatableResponse.statusCode(200);

//Booking ID != null , firstName == sahil
    //Extract the response body and do iy
//System.out.println(response.asString());

    validatableResponse.body("bookingid", Matchers.notNullValue());
    validatableResponse.body("booking.firstname",Matchers.equalTo("Sahil"));
    validatableResponse.body("booking.lastname",Matchers.equalTo("Shaikh"));

    validatableResponse.body("booking.bookingdates.checkout",Matchers.equalTo("2025-08-01"));
    validatableResponse.body("booking.depositpaid",Matchers.equalTo(true));

    }
}
