package Ex_07_Payload_Management.String;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting027_RestAssured_payload {

RequestSpecification requestSpecification;
Response response;
ValidatableResponse validatableResponse;

String token;
Integer BookingId;

@Test
    public void test_post(){


    String name = "sahil";

    String payload_post = "{\n" +
            "    \"firstname\": \""+name+"\",\n" +
            "    \"lastname\": \"Shaikh\",\n" +
            "    \"totalprice\": 111,\n" +
            "    \"depositpaid\": true,\n" +
            "    \"bookingdates\": {\n" +
            "        \"checkin\": \"2025-30-07\",\n" +
            "        \"checkout\": \"2025-08-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\": \"Biryani\"\n" +
            "}";
}
}

