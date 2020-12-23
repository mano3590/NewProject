@Fullsuite
Feature: End to End 018

  ########################################################
  # Automation ID - TC_E2E_018                         #
  ########################################################
  @EndToEnd @TC_E2E_018
  Scenario Outline: Verify user able to checkout the Product and verify the Order details in Order detail Page without Login the website

    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Kids" "Clothings"
    Then I verify the header "Kids'" "Clothings" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And I select "Color" of the product on Product details page
    And I select "Size" of the product on Product details page
    And I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And I verify that Price and Total Price of the product on My Bag page
    When I get the Estimated Total Price on My Bag page
    And I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    When I click email text box and enter the "<email id>" on Checkout page
    And I click FirstName text box and enter the "<First Name>" "<Last Name>" "<Address 1>" "<Address 2>" "<City>" "<State>" "<Zip Code>" "<Mobile>" on Checkout page
    And I verify the estimated and grand total price should be same
    Then I verify the Checkout Product name on Secure Checkout page
    And I verify the Checkout Product price on Secure Checkout page
    When I get the GrandTotal on SecureCheckout Page
    When I click Next Payment button on "<email>" Secure Checkout page
    Then I verify that payment section is displayed on Secure Checkout page
    When I click credit card link from payment section
    And I enter credit card payment details "<CardNumber>", "<ExpireDate>", "<Cvv>", and "<Name>" on payment section
    And I click Next:Review Order button from payment section
    Then I verify that card ending with "<card end>" is added in payment section
    When I click place order button on Secure Checkout page
    Then I verify that "Checkout Complete" page is displayed
    And I verify the Checkout Product name on Secure Checkout page
    Then I verify the Checkout Product price on Secure Checkout page
    And I verify the grand Total of Secure Checkout page and Checkout Complete page are same
    When I get the OrderNo, OrderedDate and Total Items in Checkout Complete page
    And I click sign in button in Header section
    And I verify the Check An Order title is displayed in the Sign In page
    And I enter the Order Number in the Order Number in the input field
    And  I enter "<Order Email ID>" into the Order Email input field
    And I click the check status button
    And I verify the Order Details title is displayed in the page
    Then I verify the Order Number, Date Ordered,total price,total Items, Product Name and ProductItems are same in Order Detail Page


    Examples:
      | email id   | First Name | Last Name | Address 1  | Address 2 | City       | State    | Zip Code | Mobile         | email                  | CardNumber          | ExpireDate | Cvv | Name        | card end | Order Email ID         |
      | photontest | john       | Jo        | 5 Grand Av | K405      | San Marcos | Colorado | 92078    | (619) 534-4867 | Photontest18@gmail.com | 4000 6200 0000 0007 | 0330       | 737 | Test Photon | 0007     | Photontest18@gmail.com |



