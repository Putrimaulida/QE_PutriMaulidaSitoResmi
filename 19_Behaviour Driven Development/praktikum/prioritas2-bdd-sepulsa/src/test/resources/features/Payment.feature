Feature: Payment
  As a user
  I want to make payment for my product
  So I can successfully checkout my product

  Scenario: As user I have be able to success checkout product
    Given I am on the home page
    When I click product pulse button
    And I enter my phone number
    And I choose nominal pulse
    And I am on the payment page
    And I am choose go-pay payment method
    And I can see total price
    And I click pay now button
    And I am directed on the detail payment
    And I click pay in go-pay application
    And I am directed on the go-pay application
    And I am on the payment review page
    And I click pay button
    Then I am success payment product