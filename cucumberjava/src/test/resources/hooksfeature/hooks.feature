Feature: Check login functionality
@smoke
  Scenario: Check login is successful with valid credentials
    Given user is in login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: Check login is successful with valid credentials
    Given user is in login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page
