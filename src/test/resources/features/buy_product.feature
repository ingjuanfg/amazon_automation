Feature:  Buy a product
  I as user
  Want buy a product from Amazon

  Scenario: Add a Edgar Allan Poe product to the cart - Mobile
    When The buyer search the product poe book
    And put the product to the cart
    Then the buyer should see it in the cart list

  Scenario: Add a Edgar Allan Poe product to the cart - Web
    When The user search the product poe book
    And add it to the cart
    Then the user should see it in the cart list

  Scenario: Add a Edgar Allan Poe product to the cart - Desktop
    When The actor search the product poe book
    And add the product to the cart
    Then He should see it in the cart list