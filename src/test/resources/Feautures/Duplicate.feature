Feature: Duplicate tas

  Scenario: As a user, I can add duplicated tasks

    Given Navigate to the home page
    And add a task item predefined
    And add a task item predefined
    When I validate the items titles
    Then the items titles should match