@goals
Feature: Goal List

  Background:
    Given user logs in as "123123"
    And user navigates to Goals
    And user adds a goal "Bench 225"

  Scenario: User can update a goal to completed
    When user clicks the complete goal button
    Then the complete goal button should update


  Scenario: User can delete a goal
    When user clicks the remove goal
    Then the goal should be removed