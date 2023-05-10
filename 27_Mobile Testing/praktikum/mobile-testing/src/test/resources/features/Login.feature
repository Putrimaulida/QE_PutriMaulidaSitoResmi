Feature: As a user
  i have be able to login
  so that i can see home screen

  @Register
  Scenario: as a user I can successful register
    Given user on login page
    When user click create one
    And user input name
    And user input valid email
    And user input password
    And user input confirm password
    And user click register button
    Then user see message "Registration Successful"

  @PositiveLogin
  Scenario: as a user I can see successful login because I input valid email and password
    Given user on login page
    When user click login button
    And user input valid username
    And user input valid password
    And user click login button
    Then user on the accounts page

  @NegativeLogin
  Scenario: As a user i cant login because i input invalid password
    Given user on login page
    When user input valid username
    And user input invalid password
    And user click login button
    Then user see error message "Wrong Email or Password"


