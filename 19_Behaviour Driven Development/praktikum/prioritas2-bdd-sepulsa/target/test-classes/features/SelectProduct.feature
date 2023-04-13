Feature: Select Product
  As a user
  I want to see on the product page
  So that I can add my product

  Scenario: As user I have be able to success add product
    Given I am on the home page
    When I click product pulse button
    And I enter my phone number
    And I choose nominal pulse
    Then I am on the payment page