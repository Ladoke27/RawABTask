Feature: Login functionality

  Scenario: Valid email should login successfully

    Given I am on the homescreen
    And I click the login
    And I enter valid email
    And I select continue
    And I enter password
    When I click on Signin
    Then I should be successfully logged in