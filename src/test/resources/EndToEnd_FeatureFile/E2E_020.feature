@Fullsuite
Feature:End to End 020

  @TC_E2E_020
  Scenario Outline: Verify user able to checkout the Product and verify the Order details in My Account Page by selecting View All links
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Kids" "Clothings"
    Then I verify the header "Kids'" "Clothings" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I click Add To Bag on Product details page
    When I click Edit link in the Product side bar
    Then I verify the slick slide pop up is displayed in the product list page
    And  I select the color of the product on Product slick slide pop up
    And  I get the selected color in the slickslide popup
    And  I get the product price in slickslideQuickView
    When I click the AfterPay info icon in the slick slide popup
    Then I verify the AfterPay info icon is displayed
    And  I click the update button in the slickslide popup
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify the selected color in slickslide is displayed in My Bag page
    And I verify that selected Slick Slide Popup Price and Total Price of the product on My Bag page
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

