package Ex_04_RestAssured_HTTP_Methods.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Delete_NONbddStyle {


    RequestSpecification r;
    Response response;

    ValidatableResponse vr;

    @Test
    public void test_Delete_non_BDD(){
        String bookingid ="2134";
        String token = "7ee7e34143eb59a";

        String payload = "{\n" +
                "    \"firstname\": \"paisa\",\n" +
                "    \"lastname\": \"money\"\n" +
                "    }";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();

        response = r.when().log().all().delete();


        vr= response.then().log().all();

        vr.statusCode(201);
    }
}
