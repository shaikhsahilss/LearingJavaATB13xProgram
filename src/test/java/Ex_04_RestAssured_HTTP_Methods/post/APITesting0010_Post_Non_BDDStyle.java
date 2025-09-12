package Ex_04_RestAssured_HTTP_Methods.post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class APITesting0010_Post_Non_BDDStyle {


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

@Test
    public void test_POST_non_BDDStyle(){
        String payload = "{\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"password123\"\n" +
                "}";


        System.out.println("_____----Part 1_____----");

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();


        System.out.println("------Part 2 -------");

        response = r.when().log().all().post();


        System.out.println("_______---Part 3----_____");

        vr =response.then().log().all().statusCode(200);

    }
}
