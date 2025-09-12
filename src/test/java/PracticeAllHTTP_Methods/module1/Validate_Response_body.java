package PracticeAllHTTP_Methods.module1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Validate_Response_body {
  @Test
public  void validateResponseBoday(){
  RestAssured.baseURI = "https://reqres.in/api";

  given()
          .when().get("user/2")
          .then()
          .statusCode(200)
          .body("data.first_name",equalTo("sahil"));
  // validate JSON field



  }
}
