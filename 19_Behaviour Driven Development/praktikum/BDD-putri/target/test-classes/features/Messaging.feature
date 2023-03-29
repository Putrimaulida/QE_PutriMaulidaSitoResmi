Feature: Messaging
  As a user
  I want to see my message page
  So that I can create new message

  Scenario: As user I have be able to create new message
    Given I am on the home page
    When I click pen button
    And I enter name or multiple names
    And I write a message
    And I click send button
    Then I have successfully send the message
