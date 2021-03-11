Feature: Create an Account for Automation Practice Application

  @system1
  Scenario Outline: Verify that user is able to create a new account
    Given User in on Automation home page
    When User clicks on Sign in link
    And  User enters Email Id <e-mail address>
    And User clicks on Create account button
    Then User navigates to createAccount page
    And enter personal details <firstName> <lastName> <address> <phoneNo><city>
    When user clicks on register
    Then user should be able to create an account

    Examples:
      | e-mail address 		|firstName     |lastName     |address             | phoneNo        |city    |
      |"abc1243@gmail.com"	|"TestUserA"   |"Automation" |"6185 Retail Rd"    |"1 972-656-2196"|"Dallas"|

  @system
  Scenario: Verify that user is able to add an item to the cart
    Given User is logged in using valid credentials
    And User clicks on Dress Menu
    When  User selects an item and add to the cart
    Then the item should be successfully added
