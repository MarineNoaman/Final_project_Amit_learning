Feature: user can login
  @smoke
  Scenario: valid login
    Given home page appear user click on login button
    When user enter his username
    And user enter his password
    Then user click on login button


  Scenario Outline: Invalid Login
    Given home page appear user click on login button
    When Given user enters his "<username>" and "<password>"
    Then user click on login button

    Examples:
      | username                 |  password     |
      |  Marin Noman   |   Amit1456 |