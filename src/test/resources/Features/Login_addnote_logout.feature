Feature: Add note

  Scenario: user should be able to login, add note and logout

    Given I am successfully logged in
    When Add note
    Then I should be signed out