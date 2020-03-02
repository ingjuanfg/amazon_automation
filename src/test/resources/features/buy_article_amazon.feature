Feature: Buy article in Amazon
  I as user
  Want to buy something in amazon
  to have it

  Scenario: Buy a book
    Given that Juan is on Amazon Desktop
    When He buys an Edgar Alla Poe´s book
    Then He should see a successfull message