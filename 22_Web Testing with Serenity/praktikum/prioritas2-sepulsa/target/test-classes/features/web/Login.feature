Feature: As a user i have be able to success login
  so that i can see products page

  @PositiveLogin
  Scenario: as user i want to input valid to then i can see success login
    Given user on sign in page
    When user click login button
    And user input valid email
    And user input valid password
    And user click the login button
    Then user on home page

  @PositivePaketData
  Scenario: as a user i want to buy a game voucher product
    Given user on sign in page
    When user click login button
    And user on the login page
    And user enter a valid email
    And user enter a valid password
    And user click the login button
    And user click on the game voucher product
    And user click on the voucher menu
    And user click on the selected voucher type
    And user fill in the phone number voucher
    And user click on the selected voucher package
    And user to the payment page voucher
    Then user see the total payment voucher

