@Fullsuite
Feature: Validating the User Profile after logged into the Ariat website

  @TC_UserProfilescreen_01
  Scenario: Validation of the User Profile Screen
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "photontest2@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the page
    When I Pointover the userprofile link
    Then I verify UserProfile Popover Screen is displayed
    And  I verify the Greetings text is displayed on the Login Popover Screen
    And  I verify below listed Link texts are displayed in the login Popover Screen
      | Orders       |
      | Account Info |
      | Wishlist     |
      | Log out      |
    When I clicks the "Orders" link on the User Profile screen
    Then I verify that title "My Orders | Ariat" of the page
    When I clicks the "Account Info" link on the User Profile screen
    Then I verify that title "My Account | Ariat" of the page
    When I clicks the "Wishlist" link on the User Profile screen
    Then I verify that title "My Wishlist | Ariat" of the page
    When I clicks the "Log out" link on the User Profile screen
    Then I verify that title "Ariat International | Home Page" of the page
    And  I verify the "Sign In" text is displayed in the Header





