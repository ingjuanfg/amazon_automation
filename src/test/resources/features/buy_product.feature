Feature:  Buy a product
  I as user
  Want buy a product from Amazon

  Scenario: Add a Pokemon product to the car - Web
    When The user search the product poe book
    And add it to the car
    Then the user should see it in the car list

  Scenario: Add a Pokemon product to the car - Mobile
    When The buyer search the product poe book
    And put the product to the car
    Then the buyer should see it in the car list

  Scenario: Add a Pokemon product to the car - Desktop
    When The actor search the product poe book
    And add the product to the car
    Then He should see it in the car list