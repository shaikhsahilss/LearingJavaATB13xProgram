package Ex_07_Payload_Management.Map;

//import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;
import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting028_Payload_Map {

RequestSpecification requestSpecification;
Response response;
ValidatableResponse validatableResponse;

String token;
 Integer BookingId;


 @Test
    public void Map_Payload(){

     //        String payload_POST = "{\n" +
//                "    \"firstname\" : \"Pramod\",\n" +
//                "    \"lastname\" : \"Dutta\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : false,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2024-01-01\",\n" +
//                "        \"checkout\" : \"2024-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Lunch\"\n" +
//                "}";

     // Hashmap -> key and value pair
     // Parent Hashmap ->  key and value , Child Hashmap

     Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();

     jsonBodyUsingMap.put("firstname" ,"sahil");
     jsonBodyUsingMap.put("lastname","shaikh");
     jsonBodyUsingMap.put("totalprice", 123);
     jsonBodyUsingMap.put("depositpaid", false);

     Map<String, Object> bookingdatesMap = new LinkedHashMap<>();
     bookingdatesMap.put("checkin","024-01-01");
     bookingdatesMap.put("checkout", "2024-01-01");

     jsonBodyUsingMap.put("bookingdates",bookingdatesMap);

     jsonBodyUsingMap.put("additionalneeds","breakfast");

     requestSpecification = RestAssured.given();
     requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
     requestSpecification.basePath("booking");
     requestSpecification.contentType(ContentType.JSON);
     requestSpecification.body(jsonBodyUsingMap).log().all();


     response = requestSpecification.when().post();

     //// Get Validatable response to perform validation

     validatableResponse = response.then().log().all();
     validatableResponse.statusCode(200);


     validatableResponse.body("booking.firstname", Matchers.equalTo("sahil"));

     validatableResponse.body("booking.lastname",Matchers.equalTo("shaikh"));

     validatableResponse.body("booking.depositpaid",Matchers.equalTo(false));

     validatableResponse.body("bookingid",Matchers.notNullValue());
 }


}
