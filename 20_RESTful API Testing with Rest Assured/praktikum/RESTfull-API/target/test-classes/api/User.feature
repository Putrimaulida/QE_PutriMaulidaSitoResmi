Feature: User
  As an a admin
  I want to see list of user
  So that I can create new user

  Scenario: GET ALL - As admin I can get all data details
    Given I set the api GET ALL endpoint
    When I send a HTTP GET ALL request
    Then I receive valid the HTTP response code 200
    And I receive any data for all users details

  Scenario: POST - As admin I have be able to create new user
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  Scenario: GET ID - As admin I have be able to get id detail user
    Given I set GET id api endpoints
    When I send GET id HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user

  Scenario: PUT - As admin I have be able to update existing user
    Given I set PUT api endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for updated user

  Scenario: DELETE - As admin I have be able to delete existing user
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 204

  Scenario: INVALID GET ALL - As an admin I can't get all data details
    Given I set the GET ALL api endpoint
    When I send HTTP GET ALL request
    Then I receive valid HTTP response code 200
    And I don't receive any data for user details

  Scenario: INVALID POST - As an admin I can't create a new user
    Given I set the endpoint in the POST api
    When I send invalid HTTP POST id request
    Then I receive a valid HTTP response code 404
    And I can't add new user

  Scenario: INVALID PUT - As an admin I can't update an existing user
    Given I set the endpoint in the PUT api
    When I send invalid HTTP PUT id request
    Then I received HTTP response code 500
    And I am not receiving valid data for updated user