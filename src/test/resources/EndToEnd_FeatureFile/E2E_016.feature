@Fullsuite
Feature: End to End 016

  @EndToEnd @TC_E2E_016
  Scenario Outline: Verify user able to select product from header submenu and secure checkout the product
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page
    Then  I verify that title "Ariat International | Home Page" of the page
    When  I select any values from "Men" "Footwear"
    Then  I verify the header "Men's" "Footwear" is displayed on Product list page
    When I apply any Random Filter in the Product List Page
    Then I verify the FilterName is Displayed as per the selection
    When  I click any one of the quick view from the product Search List Page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select color of the product in Quick view page
    And  I select size of the Product in Quick view page
    And  I get the Product price in Quick view page
    And I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And I verify that product is added on My Bag page
    And I verify the Price and Total Price of the product on My Bag page
    When I get the Estimated Total Price on My Bag page
    And I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    When I click sign in button on Checkout page
    And I login the application with "<username>", "<password>"
    Then I verify the Checkout Product name on Secure Checkout page
    And I verify the Checkout Product price same on Secure Checkout page
    And I verify the estimated and grand total price should be same
    When I click Next:Payment button on Secure Checkout page
    Then I verify that payment section is displayed on Secure Checkout page
    When I click credit card link from payment section
    And I enter credit card payment details "<CardNumber>", "<ExpireDate>", "<Cvv>", and "<Name>" on payment section
    And I click Next:Review Order button from payment section
    Then I verify that card ending with "<card end>" is added in payment section
    When I click place order button on Secure Checkout page


    Examples:
      | username                  | password | CardNumber          | ExpireDate | Cvv | Name        | card end |
      | ariatphotontest@gmail.com | password | 4000 6200 0000 0007 | 0330       | 737 | Test Photon | 0007     |

