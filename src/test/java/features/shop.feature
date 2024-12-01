Feature: Shop registration
  Scenario: create new mail and register on shop
    Given create new mail
    And register on shop
    And sign in to shop
    And add product
    When complete the order