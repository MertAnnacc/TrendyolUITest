
  Feature: The user should be able to add any product to their cart without any problems.

    Background:
      * User goes to trendyol.com

    @run
      Scenario: The searched product should be added to the cart and it should be seen that it is in the cart.

        Given Accept the cookies
        Then  Click the search box field
        And   Type the searching word
        Then  Click search icon on the right side of searching fieldbox
        Then  Click the product
        And   Choose foot size number
        Then  Click add to cart
        Then  Click my cart button
        Then  Verify product add to cart
        And   Close the page
