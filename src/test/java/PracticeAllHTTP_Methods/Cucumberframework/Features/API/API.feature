Feature: API Testing with Rest Assured

  Scenario: Validate GET request
    Given I set the base URI
    When I send a GET request to "/users/2"
    Then the response status code should be 200

  Scenario: Validate POST request with JSON
    Given I set the base URI
    When I send a POST request to "/users" with body "request.json"
    Then the response status code should be 201