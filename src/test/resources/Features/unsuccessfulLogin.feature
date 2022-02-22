Feature: Login functionality

  Scenario Outline: Unsuccessful login using email

    Given I am on the homepage
    And I click the login button
    When I enter incorrect  "<loginEmail>"
    And I click continue
    Then I should get "<errorMessage>"

    Examples:
      |loginEmail                     |errorMessage                                              |
      |quantitative@yahoo.com         |There is no account for the username or email you entered.|
      |                               |Required data missing                                     |