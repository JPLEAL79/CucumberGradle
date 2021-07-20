Feature: Test Google search functionality

  Scenario: As a user I enter search criteria

    Given I am on the google search page
    When  I enter search criteria
    And   click on the search button
    Then  the results match criteria