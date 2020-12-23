@Fullsuite
Feature: End to End 017

  ########################################################
  # Automation ID - TC_E2E_017                          #
  ########################################################
  @EndToEnd @TC_E2E_017
  Scenario Outline: Verify user able to checkout the Product and verify the Order with login
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Kids" "Clothings"
    Then I verify the header "Kids'" "Clothings" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And I verify that product is added on My Bag page
    And I verify that Price and Total Price of the product on My Bag page
    When I get the Estimated Total Price on My Bag page
    And I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    Then I verify the Checkout Product name on Secure Checkout page
    And I verify the Checkout Product price on Secure Checkout page
    And I verify the estimated and grand total price should be same
    When I click sign in button on Checkout page
    And I login the application with "<username>", "<password>"
    When I get the GrandTotal on SecureCheckout Page
    When I click Next:Payment button on Secure Checkout page
    Then I verify that payment section is displayed on Secure Checkout page
    When I click credit card link from payment section
    And I enter credit card payment details "<CardNumber>", "<ExpireDate>", "<Cvv>", and "<Name>" on payment section
    And I click Next:Review Order button from payment section
    Then I verify that card ending with "<card end>" is added in payment section
    When I click place order button on Secure Checkout page
    Then I verify that "Checkout Complete" page is displayed
    And I verify the Checkout Product name on Secure Checkout page
    And I verify the Checkout Product price on Secure Checkout page
    And I verify the grand Total of Secure Checkout page and Checkout Complete page are same
    And I get the OrderNo, OrderedDate and Total Items in Checkout Complete page
    When I click the Account Info from the user Profile in the header
    Then I verify that title "My Account | Ariat" of the page
    And  I verify the Order Number, Date Ordered,total price, total Items and Product Name in My Orders in My Account page
    When I click the view all link in My Order in My Account page
    Then I verify that title "My Orders | Ariat" of the page
    And  I verify the Order Number is displayed in My Orders page
    Then I verify the Date Ordered,total price,total Items and Product Name are same in My Orders Page


    Examples:
      | username                  | password | CardNumber          | ExpireDate | Cvv | Name        | card end |
      | ariatphotontest@gmail.com | password | 4000 6200 0000 0007 | 0330       | 737 | Test Photon | 0007     |

