Feature: user can Sign up
  @smoke
  Scenario: valid Sign up
    Given home page appear user click on Signup button
    When user enter the username
    And user enter the password
    Then user click on Signup button

  Scenario Outline: Invalid Login
    Given home page appear user click on Signup button
    When user enter "<Username>" and "<Password>"
    Then user click on Signup button

    Examples:
      | Username                 |  Password     |
      |  Marine Noaman   |   Amit123456 |