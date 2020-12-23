@Fullsuite
Feature: End to End 023

   ########################################################
   #  Automation ID - TC_E2E_023                          #
  ########################################################

  @EndToEnd @TC_E2E_023
  Scenario Outline: Verify user able to select product from header submenu, select product price under $25, sort the product Low to High and secure checkout the selected product

    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "<username>", "<password>"
    And  I verify that title "My Account | Ariat" of the page
    When I click "Ariat" link on Home page
    And  I select any values from "Clearance" "Clearance Men Clothing"
    Then I verify the header "Clearance" "Clothing" is displayed on Product list page
    When I click the "Price" Filter on Product list page
    And  I click the "Under $25" price filter
    Then I verify the filter is applied on Product List page
    And  I verify the listed products price are displayed under "$25" on Product list page
    And  I Verify user able to click "Low to High" from the SortBy drop down list and verify the displayed products are sorted as per the selection
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify that Price and Total Price of the product on My Bag page
    When I get the Estimated Total Price on My Bag page
    And  I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    Then I verify the Checkout Product name on Secure Checkout page
    And  I verify the Checkout Product price on Secure Checkout page
    And  I verify the estimated and grand total price should be same
    When I click Next:Payment button on Secure Checkout page
    And  I verify the Checkout Product name on Secure Checkout page
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
      | username                  | password | paypal username       | paypal password |
      | ariatPhotontest@gmail.com | password | kayla.lahoz@ariat.com | Ariat123$       |


