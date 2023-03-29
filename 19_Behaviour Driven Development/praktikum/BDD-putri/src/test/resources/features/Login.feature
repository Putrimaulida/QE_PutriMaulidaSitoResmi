Feature: Login
  As a user
  I want to see my home page
  So that I can update my profile

  Scenario: As user I have be able to success login
    Given I am on the login page
    When I enter my username and password correctly
    And I click login button
    Then I am on the home page