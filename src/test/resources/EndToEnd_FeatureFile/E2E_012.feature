@Fullsuite
Feature: End to End 012

  ########################################################
  # Automation ID - TC_E2E_012                           #
  ########################################################
  @EndToEnd @TC_E2E_012
  Scenario Outline: Verify user able to select product from Ariat Denim Fit Guide and secure checkout the product

    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Denim Fit Guide submenu under "Women" Header Menu
    Then I verify that title "Denim Fit Guide | Ariat" of the page
    When I click any one of the Banner link on the page
    Then I verify the "WOMEN'S ARIAT JEANS" is displayed on Product list page
    When I click any one of the category on the Product List Page
    Then I verify the selected category is displayed in the Product list page Breadcrumb
    When I click Quick View link in any one of the product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Color" of the product on Product details page
    And I select "Size" of the FR product on Product details page
    And I click Add To Bag on Product details page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
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
    Then I verify that "Checkout Complete" page is displayed
    And I verify the Checkout Product name on Secure Checkout page

    Examples:
      | username              | password | CardNumber          | ExpireDate | Cvv | Name        | card end |
      | photontest2@gmail.com | password | 4000 6200 0000 0007 | 0330       | 737 | Test Photon | 0007     |







































