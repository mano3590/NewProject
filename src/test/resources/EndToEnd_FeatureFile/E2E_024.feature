@Fullsuite
@EndToEnd @TC_E2E_024
Feature:End to End 024

  Scenario Outline: Verify user able to select product from header submenu and added the same product in Wishlist after added to the My Bag Page and delete the same product in My Bag and checkout the same product from wishlist
    Given I am on Ariat Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When  I select any values from "Men" "Footwear"
    Then  I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    When I select "Color" of the product on Product details page
    And I select "Size" of the product on Product details page
    And I click Add To Bag on Product details page
    When I click Edit link in the Product side bar
    And  I verify the slick slide pop up is displayed in the product list page
    And  I click Wishlist button on QuickView Screen
    Then I verify the "The product has been added to your wishlist." success message is displayed
    And  I click the update button in the slickslide popup
    And I click the My Bag from the Header
    And  I click the Remove link in the My Bag Page
    Then I verify the Product is not displayed in the MyBag Page
    And  I click Wish List link in the Footer
    Then I verify that product is added on Wishlist page
    And  I verify that Price and Total Price of the product on Wishlist page
    When I click the Edit link in the wishlist page
    Then I verify Product Popup screen is displayed
    When I select the color of the product on Product slick slide pop up
    And  I get the selected color in the slickslide popup
    And I get the product price in slickslideQuickView
    And  I click the Update button on Product QuickView Screen
    And  I login the application with "<username>", "<password>"
    And  I verify that title "My Account | Ariat" of the page
    And I click Add To Bag on WishList Page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And I verify that product is added on My Bag page
    And I verify the selected color in slickslide is displayed in My Bag page
    And I verify that selected Slick Slide Popup Price and Total Price of the product on My Bag page
    When I get the Estimated Total Price on My Bag page
    And I click Go To Checkout button on My Bag page
    Then I verify header "Secure Checkout" is displayed on Secure Checkout page
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
      | testingtest@gmail.com | password@ | 6771 7980 2500 0004 | 0330       | 737 | Test Photon | 0004     |









