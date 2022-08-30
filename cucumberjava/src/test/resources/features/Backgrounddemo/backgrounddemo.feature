Feature: check homepage functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar
    When user clicks on dashboard link
    Then quick launch toolbar is display
