package PracticeHTTPmethods.module1.CucumberFrameWork.StepDefinations;



import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class LoginStepDef {

    private Response response;
    private Map<String, Object> requestBody;

    @Given("I have user payload with {string} and {string}")
    public void i_have_user_payload_with_and(String user, String pass) {
        requestBody = new HashMap<>();
        requestBody.put("username", user);
        requestBody.put("password", pass);
    }

    @When("I send POST request to {string}")
    public void i_send_post_request_to(String endpoint) {
        RestAssured.baseURI = "https://reqres.in/api"; // replace with your API base URI
        response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post(endpoint);
    }

    @Then("The status code should be {int}")
    public void the_status_code_should_be(Integer expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Then("Response body should contain {string}")
    public void response_body_should_contain(String key) {
        response.then().body("$", hasKey(key));
    }
}
