package practiceHTTPmethod.Cucumber;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class StepDefinition {

    private Response response;
    private Map<String, Object> payload;

    @Given("I have the user payload with name {string} and job {string}")
    public void i_have_the_user_payload_with_name_and_job(String name, String job) {
        // Prepare JSON payload
        payload = new HashMap<>();
        payload.put("name", name);
        payload.put("job", job);
    }

    @When("I send POST request to {string}")
    public void i_send_post_request_to(String endpoint) {
        response = given()
                .baseUri("https://your-base-uri.com") // replace with your API base URI
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post(endpoint);
    }

    @Then("The response status should be {int}")
    public void the_response_status_should_be(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("The response should contain {string}")
    public void the_response_should_contain(String key) {
        response.then().body(key, notNullValue());
        System.out.println(response.asString()); // Optional: prints the full response
    }
}
