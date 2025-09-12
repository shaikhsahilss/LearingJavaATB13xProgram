package Ex_04_RestAssured_HTTP_Methods.put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITestin_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Test
    public void Test_put_nonBDD(){


        String bookingid ="3414";
        String token = "404475adb3df7b9";

        String payload = "{\n" +
                "    \"firstname\": \"Sahil\",\n" +
                "    \"lastname\": \"Shaikh\",\n" +
                "    \"totalprice\": 120,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \" Biryani\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();

        response = r.when().log().all().put();


        vr= response.then().log().all();

                vr.statusCode(200);

    }
}
