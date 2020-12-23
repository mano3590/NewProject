@Fullsuite
Feature: End to End 027

  ########################################################
  # Automation ID - TC_E2E_027                          #
  ########################################################
  @EndToEnd @TC_E2E_027
  Scenario Outline: Verify user able to search and select product from search link and apply Filter and secure checkout the product

    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "<username>", "<password>"
    And  I click "Ariat" link on Home page
    And  I click Search Link in the Header section
    And  I enter product "men" in the Search field
    And  I verify the "men" text is displayed in the page
    When I click the the SEE ALL PRODUCTS link is displayed in the page
    Then I verify Product list page Url contains "men"
    When I click Gender filter from Product list page
    Then I verify the filter is displayed on Product List page
    And  I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    And  I verify the selected filter is displayed on Product detail page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the selected Product ID on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And  I verify that product is added on My Bag page
    And  I verify that selected Product ID is displayed on My Bag page
    And  I verify that Price and Total Price of the product on My Bag page
    When I click the selected product Name link on the page
    Then I verify that selected product is displayed on Product details page
    When I get the Product Quantity on Product details page
    And  I click Add To Bag on Product details page
    And  I click View Cart icon from header section
    Then I verify that product is added on My Bag page
    And  I verify the Quantity of the Product on My Bag Page
    And  I verify that Updated Price and Total Price of the product on My Bag page
    When I get the Estimated Total Price on My Bag page
    And  I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
    And  I verify the Checkout Product name on Secure Checkout page
    And  I verify the Checkout Product price on Secure Checkout page
    And  I verify the estimated and grand total price should be same
    When I click Next:Payment button on Secure Checkout page
    Then I verify that payment section is displayed on Secure Checkout page
    When I click credit card link from payment section
    And  I enter credit card payment details "<CardNumber>", "<ExpireDate>", "<Cvv>", and "<Name>" on payment section
    And  I click Next:Review Order button from payment section
    Then I verify that card ending with "<card end>" is added in payment section
    When I click place order button on Secure Checkout page
    Then I verify that "Checkout Complete" page is displayed
    And  I verify the Checkout Product name on Secure Checkout page

    Examples:
      | username              | password | CardNumber          | ExpireDate | Cvv | Name        | card end |
      | photontest2@gmail.com | password | 4000 6200 0000 0007 | 0330       | 737 | Test Photon | 0007     |






































