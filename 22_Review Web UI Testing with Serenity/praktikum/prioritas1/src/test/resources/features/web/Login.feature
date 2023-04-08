Feature: As a user
  i have be able to success login
  so that i can see products page

  @PositiveLogin
  Scenario: as user i want to input valid to then i can see success login
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    Then user on products page

  @NegativeLogin
  Scenario: as user i want to input invalid username then get error message
    Given user on login page
    When user input invalid username
    And user input valid password
    And user click login button
    Then user see error message "Username and password do not match any user in this service"

  @PositiveAllItem
  Scenario: as user i can add products to my cart
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    And user on products page
    And user click add to cart button in one product
    Then user can see the number of products in the cart symbol

  @NegativeAllItem
  Scenario: as user i can not see number products my cart
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    And user on products page
    And user click add to cart button in one product
    And user click remove button
    Then user can not see the number of products in the cart symbol

  @PositiveOverviewCheckout
  Scenario: as user i can checkout my cart
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    And user on products page
    And user click add to cart button in one product
    And user click the shopping cart
    And user to the checkout page
    And user click checkout button
    And user to the personal data information page
    And user fill first name field
    And user fill last name field
    And user fill postal code field
    And user click continue button
    And user on the overview checkout page
    And user get the price total
    And user click finish button
    Then user successfully checkout in one "Thank you for your order!"

  @NegativeOverviewCheckout
  Scenario: as user i can not checkout my cart
    Given user on login page
    When user input valid username
    And user input valid password
    And user click login button
    And user on products page
    And user click add to cart button in one product
    And user click the shopping cart
    And user to the checkout page
    And user click checkout button
    And user to the personal data information page
    And user fill first name field
    And user click continue button
    Then user get an error message "Error: Last Name is required"
