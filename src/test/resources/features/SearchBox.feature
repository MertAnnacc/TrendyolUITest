
  Feature: Results relevant with the searched product should be displayed.

    Background:
      * User goes to trendyol.com
  @run
    Scenario: The product searched by typing in the search box must be related to the searched product.

        Given Accept the cookies
        Then  Click the search box field
        And   Type the searching word
        Then  Click search icon on the right side of searching fieldbox
        Then  Verify that the page related to the searched product has been reached
        And   Close the page