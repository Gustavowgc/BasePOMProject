Feature: Clear todo completed

  Scenario: As a user, I can add a task

    Given Navigate to the home page
    When I enter text and press enter
    Then a new task should be added

  Scenario: As a user, I can delete a task

    Given Navigate to the home page
    And add a task item
    When I click on delete button
    Then the selected task should be deleted

  Scenario: As a user, I can update a task title

    Given Navigate to the home page
    When I double click on a task
    And enter a new title value
    Then the selected task should be updated

  Scenario: As a user, I can complete a task

    Given Navigate to the home page
    And add a task item
    When I click on complete button
    Then the selected task should be completed

  Scenario: As a user, I can uncomplete a task

    Given Navigate to the home page
    And add a task item
    When I click on delete button
    And I click on complete button
    And I click on complete button
    Then the selected task should be remain uncompleted

