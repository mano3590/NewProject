@Fullsuite
Feature:End to End 021

  @TC_E2E_021
  Scenario Outline: Validation of the End to End scenario
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When  I select any values from "Men" "Men Featured"
    Then  I verify the selected subMenu Items is displayed in BreadCrumbs on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And I select "Color" of the product on Product details page
    And I select "Size" of the product on Product details page
    And I click Add To Bag on Product details page
    When I click Remove link in the Product slick slide
    And I click the My Bag from the Header
    Then I verify the Product is not displayed in the MyBag Page
    When  I select any values from "Men" "Men Featured"
    Then  I verify the selected subMenu Items is displayed in BreadCrumbs on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And I select "Color" of the product on Product details page
    And I select "Size" of the product on Product details page
    And I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    When I click SecureCheckout link in the MyBag page
    Then I verify the SecureCheckout popup is Displayed
    When I click the Full Privacy Policy Link in the SecureCheckout popup
    Then I verify the header Privacy Policy is displayed in the page
    And I click View Cart icon from header section
    And I verify that product is added on My Bag page
    And I verify that Price and Total Price of the product on My Bag page
    When I get the Estimated Total Price on My Bag page
    And I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    When I click sign in button on Checkout page
    And I login the application with "<username>", "<password>"
    Then I verify the Checkout Product name on Secure Checkout page
    And I verify the Checkout Product price on Secure Checkout page
    And I verify the estimated and grand total price should be same
    When I click Next:Payment button on Secure Checkout page
    Then I verify that payment section is displayed on Secure Checkout page
    When I click credit card link from payment section
    And I enter credit card payment details "<CardNumber>", "<ExpireDate>", "<Cvv>", and "<Name>" on payment section
    And I click Next:Review Order button from payment section
    Then I verify that card ending with "<card end>" is added in payment section
    When I click place order button on Secure Checkout page


    Examples:
      | username              | password  | CardNumber          | ExpireDate | Cvv | Name        | card end |
      | testingtest@gmail.com | password@ | 4000 6200 0000 0007 | 0330       | 737 | Test Photon | 0007     |

