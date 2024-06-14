Feature: Duplicate tas

  Scenario: As a user, I can add duplicated tasks

    Given Navigate to the home page
    And add a task item
    And add a task item
    When I validate the items titles
    Then the items titles should match