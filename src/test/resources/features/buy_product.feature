Feature:  Buy a product
  I as user
  Want buy a product from Amazon

  @Desktop
  Scenario: Add a Pokemon product to the car - Desktop
    When The actor search the product pokemon puppet
    And add the product to the car
    Then He should see it in the car list

  @Web
  Scenario: Add a Pokemon product to the car - Web
    When The user search the product pokemon puppet
    And add it to the car
    Then the user should see it in the car list

  @Mobile
  Scenario: Buy a book