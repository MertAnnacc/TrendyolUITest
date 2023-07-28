
  Feature: User must be able to access the correct site.

    @run
    Scenario: User goes to trendyol.com

      Given User goes to trendyol.com
      Then  Accept the cookies
      Then  Verify to be on the right site
      And   Close the page
