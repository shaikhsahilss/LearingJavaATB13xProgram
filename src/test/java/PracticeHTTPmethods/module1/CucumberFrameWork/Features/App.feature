Feature: Login functionality
  @smoke
  Scenario Outline: Login with multiple users
    Given I have user payload with "<user>" and "<pass>"
    When I send POST request to "/user"
    Then The status code should be 201
    And Response body should contain "id"

    Examples:
      | user   | pass     |
      | sahil  | sahil123 |
      | john   | john@123 |