Feature: check login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And user is on login page
    When user enters the <username> and <password>
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Dipanjan |    12345 |
      | Dip      |    12345 |
      | kanjilal |    12345 |
