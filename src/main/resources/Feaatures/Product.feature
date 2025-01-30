Feature: user can purchase 2 product
  @smok
  Scenario: valid purchasing 2 product
    Given home page appear user click on login button
    When user enter his username
    And user enter his password
    Then user click on login button
    Given user Click on Laptops under categories on the homepage
    When Choose Product 1
    And add product 1 to the cart
    And user click on home page
    And Choose Product 2
    And add product 2 to the cart
    And user go to cart page
    And user click on place order
    And user fill the name
    And user fill the country
    And user fill the city
    And user fill the credit card number
    And user fill the month
    And user fill the year
    And user click purchase
    Then user click ok