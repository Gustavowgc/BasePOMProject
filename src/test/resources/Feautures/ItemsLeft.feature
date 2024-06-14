Feature: Clear todo completed

  Scenario: As a user, I can see number of items left as the count of active todo items

    Given Navigate to the home page
    And add a task item
    And add a task item
    And complete a task item
    When I validate the items left
    Then the number should be match



