Feature: Network
  As a user
  I want to see my connection
  So that I can manage my network

  Scenario: As user I have be able to find my connection
    Given I am on the home page
    When I click my network button
    And I click connections
    Then I am on the connections page
