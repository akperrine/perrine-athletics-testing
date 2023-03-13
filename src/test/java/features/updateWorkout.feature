@workout
Feature: User updates their workouts

  Background:
    Given user logs in as "123123"
    And navigates to Week View

  Scenario Outline: User can update a workout button
    When user clicks the button with text as "<buttonText>"
    Then complete button should say "<updatedText>"

    Examples:
      |buttonText|updatedText|
      |Mark as Complete|Completed|
      |Completed        |Mark as Complete|
