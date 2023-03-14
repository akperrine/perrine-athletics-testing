@workout
Feature: User updates their workouts

  Scenario Outline: User can update a workout button
    Given user logs in as "123123"
    And navigates to Week View
    When user clicks the button with text as "<buttonText>"
    Then complete button should say "<updatedText>"

    Examples:
      |buttonText|updatedText|
      |Mark as Complete|Completed|
      |Completed        |Mark as Complete|
