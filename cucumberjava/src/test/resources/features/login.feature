Feature: feature to test Login functionality

  Scenario: Check login is successful with valid scenario
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
