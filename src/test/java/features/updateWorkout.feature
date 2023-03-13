Feature: User updates their workouts

  Scenario: User can update a workout button
    Given user clicks the complete button
    And complete button says Mark As Complete or Complete
    When user clicks the complete button
    Then complete button should say the opposite of its original statement
