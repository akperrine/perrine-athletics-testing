Feature: User login Validation

  Background:

  Scenario: Login should be successful
    Given user enters a password as "123123"
    When user clicks the login button
    Then Login should be successful

  Scenario: Login should be unsuccessful
    Given user enters a password as "123"
    When user clicks the login button
    Then Login should be unsuccessful