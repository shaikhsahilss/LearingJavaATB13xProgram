package Ex_06_TestNgAsserstions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class APITesting_027_TestNG_assetion_Assert_J {

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
// 1. Json extarct direct method
// Extraction is important in testNG or Assert J
        // TestNG - Extract the details of the first name, booking ID, last name checkout date
//In testNg we required to store the extract body response in the variable To validate them
        bookingID = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");

        String lastname = response.then().extract().path("booking.lastname");

//TestNg assertion - 75 % using
        // hard assert used = 90 %

        Assert.assertEquals(firstname,"Sahil");
        Assert.assertEquals(lastname,"Shaikh");


// Assert J ( 3rd assertion) - 20% uses
assertThat(bookingID).isNotNull().isNotZero().isPositive();

assertThat(firstname).isNotNull().isNotBlank().isNotEmpty().isEqualTo("Sahil");


// Another mechanism to extract the keys and values using the Jason path class
// used to extract the response
        // 2 Jsonpath class extract the json response
        JsonPath jsonPath = new JsonPath(response.asString());
        int bookingid = jsonPath.getInt("bookingid");
        System.out.println(bookingid);
        String firstname1 = jsonPath.getString("booking.firstname");
        System.out.println(firstname1);
    }
}
