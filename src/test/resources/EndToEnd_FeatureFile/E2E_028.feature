@Fullsuite
Feature: End to End 028

  ########################################################
  # Automation ID - TC_E2E_028                          #
  ########################################################
  @TC_E2E_028
  Scenario Outline: Verify user able to select product from New & Best menu and Sorting the product as New Arrivals and apply Certification Filter and secure checkout the product

    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "<username>", "<password>"
    And  I click "Ariat" link on Home page
    When I select any values from "New Best" "New Arrivals"
    Then I verify the selected New and Best header "New Arrivals" is displayed on Product list page
    And  I click the SortBy dropdown and select the "New Arrivals" from the dropdown list
    Then I verify that "New" badge tag is displayed on the listed products
    When I click the "Certifications" filter in Product list page
    And  I click the inner "Certifications" filter on Product list page
    Then I verify the filter is displayed on Product List page
    And  I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    And  I verify the selected filter is displayed in product Specifications block on Product detail page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the selected Product ID on Product details page
    When I get the Product Quantity on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify that selected Product ID is displayed on My Bag page
    And  I verify that Price and Total Price of the product on My Bag page
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
      | username                  | password | paypal username       | paypal password |
      | photontesting20@gmail.com | password | kayla.lahoz@ariat.com | Ariat123$       |






































