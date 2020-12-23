@Fullsuite
Feature: End to End 022
   ########################################################
  # Automation ID - TC_E2E_022                           #
  ########################################################
  @EndToEnd @TC_E2E_022
  Scenario Outline: Verify user able to select product from header submenu, wishlist the selected product in My Bag Page and secure checkout the product
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "<username>", "<password>"
    And  I verify that title "My Account | Ariat" of the page
    When I click "Ariat" link on Home page
    When I select any values from "Kids" "Clothings"
    Then I verify the header "Kids'" "Clothings" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify that Price and Total Price of the product on My Bag page
    When I click the EDIT link on My Bag Page
    And  I click Wishlist button on QuickView Screen
    And  I click the Update button on Product QuickView Screen
    And  I click Wish List link in the Footer
    Then I verify that product is added on Wishlist page
    And  I verify that Price and Total Price of the product on Wishlist page
    When I click the Add to Bag button
    And  I click View Cart icon from header section
    Then I verify that product is added on My Bag page
    When I click the Product Quantity Decrease Button on My Bag Page
    Then I verify that Price and Total Price of the product on My Bag page
    When I get the Estimated Total Price on My Bag page
    And  I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    And  I verify the Checkout Product name on Secure Checkout page
    And  I verify the Checkout Product price on Secure Checkout page
    And  I verify the estimated and grand total price should be same
    When I click Next:Payment button on Secure Checkout page
    Then I verify that payment section is displayed on Secure Checkout page
    When I click Paypal link from payment section
    And  I click Next:Review Order button from Paypal payment section
    When I enter Paypal account "<paypal username>" and "<paypal password>"
    And  I click login button on paypal accpunt page
    Then I verify that "Ariat International" text displayed on the Paypal Page
    When I click the continue button on Paypal page
    When I click place order button on Secure Checkout page
    Then I verify that "Checkout Complete" page is displayed
    And  I verify the Checkout Product name on Secure Checkout page

    Examples:
      | username              | password | paypal username       | paypal password |
      | photontest2@gmail.com | password | kayla.lahoz@ariat.com | Ariat123$       |


