@Fullsuite
@EndToEnd @TC_E2E_026
  Feature: End to End 026
Scenario Outline: Verify user able to select product from header submenu and secure checkout the product

Given I am on Ariat Home page
 When I click "Ariat" link on Home page
 Then I verify that title "Ariat International | Home Page" of the page
 When I select any values from "Men" "Footwear"
 Then I verify the header "Men's" "Footwear" is displayed on Product list page
 When I click the "Size" Filter on Product list page
 And  I click any one of the Random SubFilter in the Product List Page
 Then I verify the Selected Filter is displayed in the Product List page
 When I select any one product from Product list page
 Then I verify that selected product is displayed on Product details page
 When I select "Width" of the product on Product details page
 And I select "Color" of the product on Product details page
 And I click the selected Filter in size on Product details page
 And I select "Size" of the product on Product details page
 And I click Wish List button on Product details page
 Then I verify the "The product has been added to your wishlist." success message is displayed
 And  I click Wish List link in the Footer
 Then  I verify the selected product Name, Width, color, size, Price and date are displayed in the wishlist page
 When I click the Add to Bag button
 And  I click View Cart icon from header section
 Then I verify that product is added on My Bag page
 And  I verify Remove From WishList Link is displayed on the selected WishList Product in My Bag Page
 When I click the Remove From WishList Link on the selected WishList Product in My Bag page
 And  I click Wish List link in the Footer
 Then I verify the the product has removed in the Wishlist Page
 And  I click View Cart icon from header section
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
  |testingtest@gmail.com | password@ | 4000 6200 0000 0007 | 0330       | 737 | Test Photon | 0007     |






