@Fullsuite
Feature: End to End 003
  @TC_E2E_003
  Scenario Outline: Verify user able to select product from Ariat Homepage Banner buttons and secure checkout the product

    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "<username>", "<password>"
    And  I verify that title "My Account | Ariat" of the page
    When I click "Ariat" link on Home page
    And  I verify the HomePage Banner buttons are available
    When I Click any one of the Banner button randomly in homepage
    Then I verify it navigates to the expected Widget links page
    And  I click any widget link from the widget links
    Then I verify that selected widget is displayed on Product details page
    When I select "Width" of the product on Product details page
    And I select "Color" of the product on Product details page
    And I select "Size" of the product on Product details page
    And I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that selected product is added on My Bag page
    And I verify that Selected Product's Price and Total Price on My Bag page
    When I get the Estimated Total Price on My Bag page
    And I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    And I verify the Checkout Widget Product name on Secure Checkout page
    And I verify the Checkout widget Product price on Secure Checkout page
    And I verify the estimated and grand total price should be same
    When I click Next:Payment button on Secure Checkout page
    Then I verify that payment section is displayed on Secure Checkout page
    When I click credit card link from payment section
    And I enter credit card payment details "<CardNumber>", "<ExpireDate>", "<Cvv>", and "<Name>" on payment section
    And I click Next:Review Order button from payment section
    Then I verify that card ending with "<card end>" is added in payment section
    When I click place order button on Secure Checkout page

    Examples:
      | username                 | password    | CardNumber          | ExpireDate | Cvv | Name        | card end |
      | photontest2@gmail.com | password   | 6771 7980 2500 0004 | 0330       | 737 | Test Photon | 0004     |

