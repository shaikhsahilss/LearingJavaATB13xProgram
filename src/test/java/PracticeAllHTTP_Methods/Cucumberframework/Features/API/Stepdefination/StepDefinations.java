package PracticeAllHTTP_Methods.Cucumberframework.Features.API.Stepdefination;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class StepDefinations {

    private Response response;

    @Given("I set the base URI")
    public void i_set_the_base_uri() {
        RestAssured.baseURI = "https://reqres.in/api"; // Example API
    }

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        response = RestAssured.given()
                .when()
                .get(endpoint);
    }

    @When("I send a POST request to {string} with body {string}")
    public void i_send_a_post_request_to_with_body(String endpoint, String fileName) {
        File jsonFile = new File("src/test/resources/" + fileName);
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonFile)
                .when()
                .post(endpoint);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        assertThat(response.getStatusCode(), equalTo(statusCode));
    }
}
