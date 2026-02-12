Feature: User API

  Scenario Outline: Verify multiple user creations
    Given I have the user payload with name "<name>" and job "<job>"
    When I send POST request to "/users"
    Then The response status should be 201
    And The response should contain "id"

    Examples:
      | name  | job                  |
      | Sahil | QA Engineer          |
      | Amit  | Automation Tester    |
      | Priya | API Test Specialist  |
