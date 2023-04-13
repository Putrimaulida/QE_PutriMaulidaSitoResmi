Feature: Account
  As a user
  I want to see my account
  So that I can settings my account

  Scenario: As user I have be able to settings my account
    Given I am on the home page
    When I click my account correctly
    And I click settings & privacy options
    Then I am on the settings page