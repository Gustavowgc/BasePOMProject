Feature: Clear todo completed

  Scenario: As a user, I can clear all completed task

    Given Navigate to the home page
    And add a task item
    And add a task item
    And complete a task item
    When I click on clear all button
    Then all the completed task should clear

  Scenario: As a user, I can't clear all completed task if any

    Given Navigate to the home page
    And add a task item
    And add a task item
    And add a task item
    When I click on clear all button
    Then I was not able to see the clear button

