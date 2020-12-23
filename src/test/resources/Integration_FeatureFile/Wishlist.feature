@Fullsuite
Feature: Validation of the Wishlist Page

  @TC_Wishlist_01
  Scenario: Validation of the wishlist page after signin Arait website
    Given I am on Ariat Home page
    Then  I verify that title "Ariat International | Home Page" of the page
    When  I click sign in button in Header section
    And   I login the application with "ariatPhotontest@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the My Account page
    When  I get the User Name on the My Account Page
    When  I clicks the "Wishlist" link on the User Profile screen
    Then  I verify that title "My Wishlist | Ariat" of the page
    And   I verify that Header "Wishlist" of the page
    And   I verify the User Name displayed in the Wishlist page
    When  I click the Remove link in the wishlist page
    And   I verify the "You have no items on your wish list to display." Wishlist empty text is displayed on the Wishlist Page
    And   I verify the Start Shopping and Adding Items Button is displayed in the Wishlist page
    And   I verify the Back to My Account link is displayed in the Wishlist page
    When  I click the Back to My Account link in the Wishlist page
    Then  I verify that title "My Account | Ariat" of the My Account page
    When  I clicks the "Wishlist" link on the User Profile screen
    Then  I click the Start Shopping and Adding Items Button in the Wishlist page
    And   I verify that title "Ariat International | Home Page" of the page
    When  I select any values from "Men" "Footwear"
    Then  I verify the header "Men's" "Footwear" is displayed on Product list page
    When  I select any one product from Product list page
    Then  I verify that selected product is displayed on Product details page
    When  I select "Width" of the product on Product details page
    And   I select "Color" of the product on Product details page
    And   I select "Size" of the product on Product details page
    And   I click Wish List button on Product details page
    Then  I verify the "The product has been added to your wishlist." success message is displayed
    When  I click Wish List link in the Footer
    And   I verify the share Url is displayed on the Page
    When  I click the share Url on the page
    Then  I verify the "Wishlist link has been copied" success message displayed
    When  I click the Share through Email icon
    Then  I verify the Share through Email popup screen displayed
    Then  I verify able to click Facebook, Twitter, Pinterest share Icon and its navigated to appropriate page

  @TC_Wishlist_02
  Scenario: Validating the wishlist page after wishlisted the product
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "ariatPhotontest@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the My Account page
    When I click Wish List link in the Footer
    And  I click the Remove link in the wishlist page
    Then I verify the "You have no items on your wish list to display." Wishlist empty text is displayed on the Wishlist Page
    And  I verify the Start Shopping and Adding Items Button is displayed in the Wishlist page
    Then I click the Start Shopping and Adding Items Button in the Wishlist page
    And  I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I click Wish List button on Product details page
    Then I verify the "The product has been added to your wishlist." success message is displayed
    When I click Wish List link in the Footer
    And  I verify that selected product Name, Width, color, size, Price and date are displayed in the wishlist page
    And  I verify EDIT and REMOVE Link is displayed
    And  I verify share through Email logo is displayed on the page
    And  I verify Quantity and Priority Label Names and dropdown displayed on the wishlist page
    When I click the Edit link in the wishlist page
    Then I verify Product Popup screen is displayed
    And  I close the Product Popup screen
    Then I verify Add To Bag button is displayed in the wishlist page
    When I click the Add to Bag button
    And  I click View Cart icon from header section
    Then I verify that product is added on My Bag page

  @TC_Wishlist_03
  Scenario: Validating the Selected Product in QuickView Screen
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "ariatPhotontest@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the My Account page
    When I click Wish List link in the Footer
    And  I click the Remove link in the wishlist page
    Then I verify the "You have no items on your wish list to display." Wishlist empty text is displayed on the Wishlist Page
    And  I verify the Start Shopping and Adding Items Button is displayed in the Wishlist page
    Then I click the Start Shopping and Adding Items Button in the Wishlist page
    And  I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I click Wish List button on Product details page
    Then I verify the "The product has been added to your wishlist." success message is displayed
    When I click Wish List link in the Footer
    Then I verify that selected product Name, Width, color, size, Price and date are displayed in the wishlist page
    When I click the Edit link in the wishlist page
    Then I verify Product Popup screen is displayed
    And  I verify the Product slick slide are displayed on the Product QuickView Screen
    And  I verify the Produt Name is displayed on the Product QuickView Screen
    And  I verify the review stars and Write a review link is displayed on the Screen
    And  I verify Color text is displayed on the Screen
    And  I verify the Variation Color and Color count of the product
    And  I verify the Size Dropdown is displayed on the Product QuickView Screen
    And  I verify the Width Buttons are displayed on the Screen
    And  I verify the Product price is displayed on the Screen
    And  I verify the AfterPay logo and Info Icon are displayed on the Screen
    And  I verify the Update Button is displayed on the Screen
    And  I verify the selected Product Color, Width, Size and Price are displayed in the QuickView Screen

  @TC_Wishlist_04
  Scenario: Validation of the QuickView Screen by Updating the Selected Product Width, Color and Size and verify the Updated Product is displayed in Wishlist
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "ariatPhotontest@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the My Account page
    When I click Wish List link in the Footer
    And  I click the Remove link in the wishlist page
    Then I verify the "You have no items on your wish list to display." Wishlist empty text is displayed on the Wishlist Page
    And  I verify the Start Shopping and Adding Items Button is displayed in the Wishlist page
    Then I click the Start Shopping and Adding Items Button in the Wishlist page
    And  I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I click Wish List button on Product details page
    Then I verify the "The product has been added to your wishlist." success message is displayed
    When I click Wish List link in the Footer
    Then I verify that selected product Name, Width, color, size, Price and date are displayed in the wishlist page
    When I click the Edit link in the wishlist page
    Then I verify Product Popup screen is displayed
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I click the Update button on Product QuickView Screen
    Then I verify that selected QuickView product Width, color, size, Price are displayed in the wishlist page

  @TC_Wishlist_05
  Scenario: Validating the Wishlist Page without login the Ariat Site
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    Then I verify that Header "Wishlist" of the page
    When I click the Remove link in the wishlist page
    Then I verify the "You have no items on your wish list to display." Wishlist empty text is displayed on the Wishlist Page
    And  I verify the Start Shopping and Adding Items Button is displayed in the Wishlist page
    Then I click the Start Shopping and Adding Items Button in the Wishlist page
    And  I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I click Wish List button on Product details page
    Then I verify the "The product has been added to your wishlist." success message is displayed
    When I click Wish List link in the Footer
    Then I verify that selected product Name, Width, color, size, Price and date are displayed in the wishlist page
    When I click the Edit link in the wishlist page
    Then I verify Product Popup screen is displayed
    And  I verify the Product slick slide are displayed on the Product QuickView Screen
    And  I verify the Produt Name is displayed on the Product QuickView Screen
    And  I verify the review stars and Write a review link is displayed on the Screen
    And  I verify Color text is displayed on the Screen
    And  I verify the Variation Color and Color count of the product
    And  I verify the Size Dropdown is displayed on the Product QuickView Screen
    And  I verify the Width Buttons are displayed on the Screen
    And  I verify the Product price is displayed on the Screen
    And  I verify the AfterPay logo and Info Icon are displayed on the Screen
    And  I verify the Update Button is displayed on the Screen
    And  I verify the selected Product Color, Width, Size and Price are displayed in the QuickView Screen
    When I close the Product Popup screen
    And  I click the Remove link in the wishlist page
    Then I verify the "You have no items on your wish list to display." Wishlist empty text is displayed on the Wishlist Page

  @TC_Wishlist_06
  Scenario: Validating the Share My Wishlist dialogue box and Quantity & Priority drop down on the wishlist page
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    And  I click the Remove link in the wishlist page
    Then I verify the "You have no items on your wish list to display." Wishlist empty text is displayed on the Wishlist Page
    And  I verify the Start Shopping and Adding Items Button is displayed in the Wishlist page
    Then I click the Start Shopping and Adding Items Button in the Wishlist page
    And  I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I click Wish List button on Product details page
    And  I click Wish List link in the Footer
    When I click the Share My Wishlist link on the page
    Then I verify that Share My Wishlist dialogue box displayed
    When I click the close button on Share My Wishlist dialogue box
    And  I click the Share My Wishlist link on the page
    And  I verify the Below listed label names are displayed above the text box in the Share My Wishlist Screen
      | Your Name      |
      | Friend's Name  |
      | Friend's Email |
    When I enter values in Share My Wishlist Screen
      | Photon                    |
      | test                      |
      | AriatPhotontest@gamil.com |
    And  I click the Share My Wishlist button on the Screen
    Then I verify the "YOUR MESSAGE HAS BEEN SENT." Message is displayed on the screen
    When I click the Close Button on the displayed Screen
    Then  I verify that Header "Wishlist" of the page
    And   I verify user able to click the Quantity dropdown and verify Selected Quantity is displayed on the wishlist page
    When  I click the below listed Priority dropdown Items
      | Low    |
      | Medium |
      | High   |


  @TC_Wishlist_07
  Scenario: Validating the user able to Add to Bag the Wishlisted Product in Wishlist Page
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    And  I click the Remove link in the wishlist page
    Then I verify the "You have no items on your wish list to display." Wishlist empty text is displayed on the Wishlist Page
    And  I verify the Start Shopping and Adding Items Button is displayed in the Wishlist page
    Then I click the Start Shopping and Adding Items Button in the Wishlist page
    And  I verify that title "Ariat International | Home Page" of the page
    When I select any values from "Men" "Footwear"
    Then I verify the header "Men's" "Footwear" is displayed on Product list page
    When I select any one product from Product list page
    Then I verify that selected product is displayed on Product details page
    When I select "Width" of the product on Product details page
    And  I select "Color" of the product on Product details page
    And  I select "Size" of the product on Product details page
    And  I get the Product Quantity on Product details page
    And  I click Wish List button on Product details page
    Then I verify the "The product has been added to your wishlist." success message is displayed
    When I click Wish List link in the Footer
    Then I verify that selected product Name, Width, color, size, Price and date are displayed in the wishlist page
    When I increase the "2" of the product on Wishlist page
    And I click Add To Bag on WishList Page
    And I click View Cart icon from header section
    Then I verify that title "My Bag | Ariat" of the page
    And I verify that product is added on My Bag page


  @Wishlist_TC_08
  Scenario: Validating the SignIn textbox are displayed in the wishlist page in Wishlist Page
    Given I am on Ariat Home page
    Then  I verify that title "Ariat International | Home Page" of the page
    When  I click Wish List link in the Footer
    And   I verify the EmailTextbox, PasswordTextbox, SignInButton,RememberMeCheckBox, ForgotPasswordLink and SignInButton is display in the page
    When  I click the ForgotPassword link in the sign In page
    Then  I verify the Forgot Your Password Popup is displayed

  @Wishlist_TC_09
  Scenario: Validating Sign In without entering the Credentials in Wishlist Page
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    And  I click the Email Textbox in the sign in page
    When I switch off the field from the Email Textbox
    Then I verify the error Message 'This Field is Required' is displayed under the email Textbox
    When I click the Password Textbox in the sign in page
    And  I switch off the field from the Password Textbox
    Then I verify the error Message 'This Field is Required' is displayed under the password Textbox

  @Wishlist_TC_10
  Scenario Outline: Validating the InvalidFormat EmailId and InvalidPassword in Wishlist Page
    Given I am on Ariat Home page
    Then  I verify that title "Ariat International | Home Page" of the page
    When  I click Wish List link in the Footer
    And  I click the Email Textbox in the sign in page
    When I enter the "<Invalid EmailId>" in the Email text box
    And  I switch off the field from the Email Textbox
    Then I verify the error Message 'This Field is Required' is displayed under the email Textbox
    And  I enter the "<Invalid Password>" in the Password text box
    When I click the SignInButton in the Sign In page
    Then I verify the "<Error Message>" is displayed in the Sign In Page
    Examples:
      | Invalid EmailId | Invalid Password | Error Message                                                                          |
      | photon          | photon           | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | Photon@         | pho              | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | Photongmail     | phot             | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | photogmail.com  | ph               | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | pho#12          | test12           | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | #@$%dgfHG       | 324%             | Invalid login or password. Remember that password is case-sensitive. Please try again. |


  @Wishlist_TC_11
  Scenario Outline: Validating the valid EmailId and valid Password in Wishlist Page
    Given I am on Ariat Home page
    Then  I verify that title "Ariat International | Home Page" of the page
    When  I click Wish List link in the Footer
    And  I click the Email Textbox in the sign in page
    When I enter the "<valid EmailId>" in the Email text box
    And  I enter the "<valid Password>" in the Password text box
    When I click the SignInButton in the Sign In page
    Then  I verify that title "My Account | Ariat" of the page
    Examples:
      | valid EmailId            | valid Password |
      | photontest2@gmail.com    | password       |
      | Photontest2020@gmail.com | Photon@2020    |


  @Wishlist_TC_12
  Scenario: Validating the Create Account Screen in Wishlist Page
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    Then I Verify the Create Account tab is displayed
    When I click the Create Account tab
    Then I verify Create Account Screen User Form is displayed
    And I verify below listed names are displayed above the Textbox in the Create Account User Form
      | First Name       |
      | Last Name        |
      | Birthday         |
      | Gender           |
      | Male             |
      | Female           |
      | Email            |
      | Confirm Email    |
      | Password         |
      | Confirm Password |
    And I verify Please add me to the Ariat email list text is displayed in the Create Account User Form
    When I click the Please add me to the Ariat email check box
    Then I verify the Add me to button is selected
    And I verify PRIVACY POLICY link text is displayed
    When I click the PRIVACY POLICY link
    And I verify the PRIVACY POLICY Model screen is displayed
    When I click the close button in the PRIVACY POLICY Model screen
    Then I verify the Required text is displayed above the Create Account Submit button
    And I verify the Create Account Submit button is displayed in the Create Account User Form

  @Wishlist_TC_13
  Scenario: Validation of the Mandatory fields left as Blank and verify error messages in Wishlist Page
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    And  I click the Create Account tab
    And  I click the Create Account submit button without filling any fields
    Then verify the "This field is required." should display below in all textboxes in the Create Account User Form
      | First Name       |
      | Last Name        |
      | Email            |
      | Confirm Email    |
      | Password         |
      | Confirm Password |


  @Wishlist_TC_14
  Scenario Outline: Validating the Create Account User Form without selecting Please Add me to the Ariat Email in Wishlist Page
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" birthday Month in the dropdown
    And I select the "<Day>" birthday Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" and "<Confirm Emailid>"
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the Header "My Account" of the page
    Examples:
      | FirstName | LastName | Birthday | Day | Gender | EmailId | Confirm Emailid | Password | Confirm Password |
      | Photon    | test     | May      | 6   | Female | photon  | photon          | password | password         |

  @Wishlist_TC_15
  Scenario Outline: Validating the Create Account User Form selecting Please Add me to the Ariat Email in Wishlist Page
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" birthday Month in the dropdown
    And I select the "<Day>" birthday Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" and "<Confirm Emailid>"
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Please add me to the Ariat email list check box
    And  I click the Create Account submit button
    Then I verify the Header "My Account" of the page

    Examples:
      | FirstName | LastName | Birthday | Day | Gender | EmailId    | Confirm Emailid | Password | Confirm Password |
      | Photon    | test     | May      | 6   | Male   | photontest | photontest      | password | password         |

  @Wishlist_TC_16
  Scenario: Validating Find a Wishlist block in the wishlist Page
    Given I am on Ariat Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click Wish List link in the Footer
    Then I verify "Find a Wishlist" header is displayed on the Find a Wishlist Block
    And  I verify "One field is required." text is displayed on the Find a Wishlist Block
    And  I verify below listed names are displayed above the Textbox in the Find a Wishlist
      | First Name |
      | Last Name  |
      | Email      |
    Then  I verify Find a wishlist Button is displayed
    When  I click the Find a wishlist Button
    Then  I verify the error "This form requires either first and last name or an email address." is displayed

  @NeedClarification
  @Wishlist_TC_17
  Scenario Outline: Negative validating of the Email field in the Find a Wishlist block
    Given I am on Ariat Home page
    Then  I verify that title "Ariat International | Home Page" of the page
    When  I click Wish List link in the Footer
    When  I enter "<First Name>" and "<Last Name>" into the Find a Wishlist block
    And   I enter "<email>" into the email field
    And   I click the Find a wishlist Button
    Then  I verify the error "Please enter a valid value." message below the email field

    Examples:
      | First Name | Last Name | email         |
      | photon     | test      | ariat123@.com |
      | test       | photon    | photon123     |
      | ariat      | test      | #$%# 1234.com |
      | photon     | testing   | @test.com     |

  @NeedClarification
  @Wishlist_TC_18
  Scenario: Positive validation of the Find a Wishlist block by Entering Email
    Given I am on Ariat Home page
    Then  I verify that title "Ariat International | Home Page" of the page
    When  I click Wish List link in the Footer
    And   I enter "email" into the email field
    And   I click the Find a wishlist Button
    Then  I verify that title "My Wishlist | Ariat" of the page














