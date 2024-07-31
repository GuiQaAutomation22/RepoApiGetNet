Feature: Create a new user

  Scenario: Successfully create a new user
    Given a user with name "morpheus" and job "leader"
    When I send a request to create the user
    Then the user is created successfully
    And the response contains name "morpheus" and job "leader"
    And the status code is 201
    And the response contains the mandatory fields

  Scenario: Create a user without a name
    Given a user with name "" and job "leader"
    When I send a request to create the user
    Then the status code is 201

  Scenario: Create a user without a job
    Given a user with name "morpheus" and job ""
    When I send a request to create the user
    Then the status code is 201

  Scenario: Verify response structure
    Given a user with name "morpheus" and job "leader"
    When I send a request to create the user
    Then the response contains the mandatory fields