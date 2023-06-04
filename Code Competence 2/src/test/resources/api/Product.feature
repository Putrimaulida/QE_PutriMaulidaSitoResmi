Feature: User
  As an a admin
  I want to see list product
  So that I can get list product

  Scenario: GET ALL - As admin I can get all data details
    Given I set the api GET ALL endpoint
    When I send HTTP GET ALL request
    Then I receive valid HTTP response code 200
    And I receive any data for all users details

  Scenario: Get a single product - As admin I can get one product data
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive valid HTTP response code 200
    And I received data id 1

  Scenario: Limit results - As admin I can get product limit
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive valid HTTP response code 200
    And I receive data with a limit of 5

  Scenario: Get all categories - As admin I can get data of all categories
    Given I set the GET api endpoint
    When I send HTTP GET request
    Then I receive valid HTTP response code 200
    And I receive data of all categories

  Scenario: Add new product - As admin I can add new data
    Given I set the api POST endpoint
    When I send HTTP POST request
    Then I receive valid HTTP response code 200
    And I received new data