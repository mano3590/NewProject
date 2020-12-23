@Fullsuite
Feature: Validation of the My Account Page

  Background:
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page

  @TC_MyAccount_01
  Scenario: validating Personal Information with entering all the fields in My account Page
    When  I click sign in button in Header section
    And   I login the application with "photontest2@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    And   I verify My Account title, Welcome UserName text and Logout is present in the page
    And   I verify Personal Information block contains Personal Information text, Name, Change Password Link and Edit Link
    And   I get the Email Id in the Email Preferences
    When  I click the edit Link in the personal Information block in the My Account Page
    Then  I verify the page navigates to the Personal Information Page
    And   I verify Home/ My Account tab is present in the edit Page
    Then  I verify FirstName,LastName,Email,CurrentPassword textbox,Save button, Cancel button, Back to My Account link, Privacy Policy Link and Contact us link are displayed
    And   I verify the FirstName, LastName and Email Id values are entered by default is same as displayed in the My Account page
    When  I delete the FirstName and  switch off the field in the personal information edit block
    Then  I verify the error Message Please Enter a valid Value is displayed under the First Name Input box
    When  I delete the LastName and  switch off the field in the personal information edit block
    Then  I verify the error Message Please Enter a valid Value is displayed under the Last Name Input box
    When  I delete the Confirm Password and  switch off the field in the personal information edit block
    Then  I verify the error Message Please Enter a valid Value is displayed under the Confirm Password Input box
    When  I enter the Current Password less than eight characters in the input field and verify the error Message
      | phot    |
      | phot3   |
      | #$%^&   |
      | 23467   |
      | photon2 |
    When I delete the FirstName and LastName in the Personal Information Edit Page
    And   I click the save button in the Edit page
    Then I verify the error Message This Field is Required is displayed
    When I click the Privacy Policy Link in the Personal Information Page
    Then I verify the Privacy Policy Popup is Displayed
    When I click the Cancel button in the Personal Information
    Then  I verify that title "My Account | Ariat" of the page
    When I click the edit Link in the personal Information block in the My Account Page
    And  I click the Back To My account Link in the Edit Page
    Then  I verify that title "My Account | Ariat" of the page

  @TC_MyAccount_02
  Scenario Outline: Validating the Current password less than eight characters in the password field
    When  I click sign in button in Header section
    And  I login the application with "photontest2@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    When I click the edit Link in the personal Information block in the My Account Page
    When I enter the "<First Name>" and "<Last Name>" in the Personal Information
    And  I enter the "<Invalid Current Password>" in the Personal Information
    And   I click the save button in the Edit page
    Then I verify the "<Error Message>" is displayed under the Current Password field in Personal Information
    Examples:
      | First Name | Last Name | Invalid Current Password | Error Message                        |
      | Photon     | Test      | p                        | This field needs 8 to 255 characters |
      | Photon     | Test1     | ph7#                     | This field needs 8 to 255 characters |
      | photonTest | Testing   | PHOT%$                   | This field needs 8 to 255 characters |


  @TC_MyAccount_03
  Scenario Outline: Validating the Current password more than eight characters in the password field
    When  I click sign in button in Header section
    And  I login the application with "photontest2@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    When I click the edit Link in the personal Information block in the My Account Page
    When I enter the "<First Name>" and "<Last Name>" in the Personal Information
    And  I enter the "<Invalid Current Password>" in the Personal Information
    And   I click the save button in the Edit page
    Then I verify the "<Error Message>" is displayed under the Current Password field
    Examples:
      | First Name | Last Name | Invalid Current Password | Error Message                       |
      | Photon     | Test      | photon13                 | Does not match the current password |
      | Photon     | Test1     | phot#tr@#456             | Does not match the current password |
      | photonTest | Testing   | PHOTON@#$%^&*            | Does not match the current password |

  @TC_MyAccount_04
  Scenario Outline:Validating user able to edit the First Name and Last Name in Personal Information
    When  I click sign in button in Header section
    And  I login the application with "photontest2@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    When I click the edit Link in the personal Information block in the My Account Page
    When I enter the "<First Name>" and "<Last Name>" in the Personal Information
    And  I enter the "<valid Current Password>" in the Personal Information
    And   I click the save button in the Edit page
    And  I verify that title "My Account | Ariat" of the page
    And  I get the Name from Personal Information in My Account block
    Then I verify FirstName and LastName has changed in the Personal Information block in My Account

    Examples:
      | First Name    | Last Name | valid Current Password |
      | Photon        | Test      | password               |
      | PhotonTesting | Test1     | password               |
      | photonTest    | Testing   | password               |

  @TC_MyAccount_05
  Scenario: Validating the Change Password screen in the Personal Information Page
    When  I click sign in button in Header section
    And   I login the application with "photontest2@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    When  I click the Change Password link in the personal information
    Then  I verify it navigates to the Password screen Page
    And   I verify Home/ My Account tab is present in the edit Page
    And   I verify Current password, New Password and confirm Password textboxes are present
    Then  I verify the Cancel button, Save Button and Back to My Account link are displayed in the Password Page
    When  I click the Current password, New Password and confirm Password textboxes and switch off the field
    Then  I verify the error message Please enter a valid value is display in the Password page

  @TC_MyAccount_06
  Scenario Outline: Validating the Less than 8 Characters of Current Password,New Password and Confirm New Password in the Password Page
    When  I click sign in button in Header section
    And   I login the application with "photontest2@gmail.com", "password"
    Then  I verify that title "My Account | Ariat" of the page
    When  I click the Change Password link in the personal information
    Then  I verify it navigates to the Password screen Page
    When  I enter the "<Invalid Current Password>" in the Current Password in Password Page
    And   I enter the "<Invalid New Password>" in the New Password in Password Page
    And   I enter the "<Invalid Confirm New Password>" in the Confirm New Password in Password Page
    And   I click the save button in the Edit page
    Then  I verify the "<Error Message>" is diplayed under the Current password and New Password input field in Password Page
    And   I verify the Error Message Password does not match is displayed in the Confirm Password in Password Page
    Examples:
      | Invalid Current Password | Invalid New Password | Invalid Confirm New Password | Error Message                        |
      | phot12                   | phot13               | phot14                       | This field needs 8 to 255 characters |
      | P#$%T                    | ph#@$%^              | PHOT@#                       | This field needs 8 to 255 characters |
      | 12345                    | 1234                 | 1234fh                       | This field needs 8 to 255 characters |

  @TC_MyAccount_07
  Scenario Outline: Validating user able to create the new password with valid current password and invalid new password and confirm new password
    When  I click sign in button in Header section
    And   I login the application with "testingtest@gmail.com", "password@"
    Then  I verify that title "My Account | Ariat" of the page
    When  I click the Change Password link in the personal information
    Then  I verify it navigates to the Password screen Page
    When  I enter the "<Valid Current Password>" in the Current Password in Password Page
    And   I enter the "<Invalid New Password>" in the New Password in Password Page
    And   I enter the "<Invalid Confirm New Password>" in the Confirm New Password in Password Page
    And   I click the save button in the Edit page
    And   I verify the Error Message Password does not match is displayed in the Confirm Password in Password Page
    Examples:
      |Valid Current Password|Invalid New Password|Invalid Confirm New Password|
      |password              |password1           |password2                   |
      |password              |password2           |password234                 |
      |password              |passw#$%th67        |pass@!#$%yutf               |

  @TC_MyAccount_08
  Scenario Outline: Validating user able to create the new password with Invalid current password and valid new password and confirm new password in Personal Information password page
    When  I click sign in button in Header section
    And   I login the application with "testingtest@gmail.com", "password@"
    Then  I verify that title "My Account | Ariat" of the page
    When  I click the Change Password link in the personal information
    Then  I verify it navigates to the Password screen Page
    When  I enter the "<Invalid Current Password>" in the Current Password in Password Page
    And   I enter the "<Valid New Password>" in the New Password in Password Page
    And   I enter the "<valid Confirm New Password>" in the Confirm New Password in Password Page
    And   I click the save button in the Edit page
    And    I verify the "<Error Message>"  is displayed in the Current Password in Password Page
    Examples:
      |Invalid Current Password|Valid New Password  |valid Confirm New Password   |Error Message|
#      |password1               |password2           |password2                    |Does not match the current password|
      |password                |password234         |password234                  |Does not match the current password|
      |password                |passw#$%th67        |passw#$%th67                 |Does not match the current password|

  @TC_MyAccount_09
  Scenario Outline: Validating user able to create the new password with valid current password and valid new password and confirm new password in Personal Information password page
    When  I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" birthday Month in the dropdown
    And I select the "<Day>" birthday Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" and "<Confirm Emailid>"
    And I get the Email Id from the Email Id field in Create Account
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the Header "My Account" of the page
    When  I click the Change Password link in the personal information
    Then  I verify it navigates to the Password screen Page
    And  I enter the "<Password>" in the Current Password in the Password page
    And   I enter the "<Valid New Password>" in the New Password in Password Page
    And   I enter the "<Valid Confirm New Password>" in the Confirm New Password in Password Page
    When   I click the save button in the Edit page
    Then I verify the Header "My Account" of the page
    When I clicks the "Log out" link on the User Profile screen
    And  I click sign in button in Header section
    And   I enter the New Created Email Id in the email Text in the sign In page
    And   I enter the "<Valid Confirm New Password>" in the password field in SignIn page
    Then I verify the Header "My Account" of the page
    Examples:
      | FirstName | LastName | Birthday | Day | Gender | EmailId | Confirm Emailid | Password | Confirm Password |Valid New Password|Valid Confirm New Password|
      | Photon    | test     | May      | 6   | Female | photon  | photon          | password | password         |password2         |password2                 |

  @TC_MyAccount_10
  Scenario:validating the Email Preferences in My Account
    When  I click sign in button in Header section
    And   I login the application with "testingtest@gmail.com", "password@"
    Then  I verify that title "My Account | Ariat" of the page
    When I click the Edit link on My Account Page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    And  I verify the Email ID which is displayed in the Page
    And  I click the Save Preferences Button

  @TC_MyAccount_11
  Scenario Outline:validating the Addresses Field in My Account
    When  I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" birthday Month in the dropdown
    And I select the "<Day>" birthday Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" and "<Confirm Emailid>"
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the Header "My Account" of the page
    And  I verify you have no address text is displayed in the Addresses block
    And  I verify Edit Link and Add Address link is displayed in the Addresses Field
    When I click the Edit Link in the Addresses block in My account
    Then I verify the Header "Addresses" of the page is Displayed
    And  I verify Home/ My Account tab is present in the edit Page
    And  I verify the Back to My account Link and Add New Button is displayed in the Address page
    And  I click the Back To My account Link in the Edit Page
    Then  I verify that title "My Account | Ariat" of the page
    Examples:
      | FirstName | LastName | Birthday | Day | Gender | EmailId | Confirm Emailid | Password | Confirm Password |
      | Photon    | test     | May      | 6   | Female | photon  | photon          | password | password         |

  @TC_MyAccount_12
  Scenario: validating the Addresses Field in the Address Page in My Account
    When  I click sign in button in Header section
    And   I login the application with "testingtest@gmail.com", "password@"
    Then  I verify that title "My Account | Ariat" of the page
    And   I click the Add Address Link in the Addresses block in My account
    And   I verify Home/ My Account/ Addresses tab is present in the edit Page
    Then  I verify AddressTitle, FirstName, LastName, Address, Zipcode, State,City, Mobile No textboxes and cancel, saveButton are displayed in the Address page
    When  I click the save button in the Edit page
    Then I verify the error Messages are Displayed under all the text boxes
    When I click the MyAccount Breadcrumb link in the edit page
    Then  I verify that title "My Account | Ariat" of the page

  @TC_MyAccount_13
  Scenario Outline: Validation of the Invalid address and zipcode in Address Page
    When  I click sign in button in Header section
    And   I login the application with "testingtest@gmail.com", "password@"
    Then  I verify that title "My Account | Ariat" of the page
    And   I click the Add Address Link in the Addresses block in My account
    And   I enter "<Address Title>" "<First Name>" "<Last Name>" "<Address1>" "<Address2>" "<City>" "<State>" "<Zipcode>" and "<Mobile No>" in the address field
    When  I click the save button in the Edit page
    Then  I verify the Verify Your Address pop up is Displayed
    And   I verify Use Address as is, Edit Address button and close button are displayed in the pop up
    And   I verify the Address is displayed in the Pop up
    When  I click the Use Address as is button in the Pop up
    Then  I verify the Invalid zipcode error message is displayed in the zipcode textbox


    Examples:
      | Address Title | First Name | Last Name | Address1       | Address2 | City       | State   | Zipcode   | Mobile No  |
      |Home9         |Photon      |Test        |1746 ROUTE 9    | Avenue   |aven        |New York |6578e      |518-348-1925|
      |Home9         |Photon      |Test        |1746 ROUTE 9    | Avenue   |aven        |New York |tr3rf       |518-348-1925|
      |Home9         |Photon      |Test        |1746 ROUTE 9    | Avenue   |aven        |New York |76r@w       |518-348-1925|

    #Clarification Need for Phone number Field
  @TC_MyAccount_14
  Scenario Outline: Validation of the Invalid Phone Number in Address Page
    When  I click sign in button in Header section
    And   I login the application with "testingtest@gmail.com", "password@"
    Then  I verify that title "My Account | Ariat" of the page
    And   I click the Add Address Link in the Addresses block in My account
    And   I enter "<Address Title>" "<First Name>" "<Last Name>" "<Address1>" "<Address2>" "<City>" "<State>" "<Zipcode>" and "<Mobile No>" in the address field
    When  I click the save button in the Edit page
    Then  I verify the Verify Your Address pop up is Displayed
    And   I verify Use Address as is, Edit Address button and close button are displayed in the pop up
    And   I verify the Address is displayed in the Pop up
    When  I click the Use Address as is button in the Pop up
    #Then  I verify the Invalid phone no error message is displayed in the phone no textbox

    Examples:
      | Address Title | First Name | Last Name | Address1       | Address2 | City       | State   | Zipcode   | Mobile No  |
      |Home9         |Photon      |Test        |1746 ROUTE 9    | Avenue   |aven        |New York |12345      |5678e       |
      |Home9         |Photon      |Test        |1746 ROUTE 9    | Avenue   |aven        |New York |12345       |#ert%43|
      |Home9         |Photon      |Test        |1746 ROUTE 9    | Avenue   |aven        |New York |12345       |34REW321|

  @TC_MyAccount_15
  Scenario Outline: Validating user able to Add the Address and delete the Addresses Page
    When  I click sign in button in Header section
    And   I login the application with "testingtest@gmail.com", "password@"
    Then  I verify that title "My Account | Ariat" of the page
    And   I click the Add Address Link in the Addresses block in My account
    And   I enter "<Valid Address Title>" "<Valid First Name>" "<Valid Last Name>" "<Valid Address1>" "<Valid Address2>" "<Valid City>" "<Valid State>" "<Valid Zipcode>" and "<Valid Mobile No>" in the address field
    When  I click the save button in the Edit page
    Then  I verify the Header "Addresses" of the page is Displayed
    And   I verify the Added Address is displayed in the page
    When  I click the Edit Address Link in the Added Address
    Then  I verify the Header "Addresses" of the page is Displayed
    And   I edit the "<Change First Name>" in the addresses page
    When  I click the save button in the Edit page
    Then  I verify the Edited First Name is displayed in the page
    When  I click the Delete Link in the Addresses page
    Then  I verify the Delete Address Popup is Displayed
    When  I click the Yes button in the Popup
    Then  I verify the added Address is deleted

    Examples:
      | Valid Address Title | Valid First Name | Valid Last Name | Valid Address1   | Valid Address2 | Valid City | Valid State | Valid Zipcode | Valid Mobile No |Change First Name|
      | Home                |      John      |     Brown        |1700 W Blancke St  |                |   Linden   |New Jersey     | 07036-6226  |908 862 1700     |Peter            |

  @TC_MyAccount_16
  Scenario Outline: Verifying user able to add the address and Make the address as default and verify the address is displayed in the Address block in My Account page
    When  I click sign in button in Header section
    And   I login the application with "testingtest@gmail.com", "password@"
    Then  I verify that title "My Account | Ariat" of the page
    And   I click the Add Address Link in the Addresses block in My account
    And   I enter "<Valid Address Title>" "<Valid First Name>" "<Valid Last Name>" "<Valid Address1>" "<Valid Address2>" "<Valid City>" "<Valid State>" "<Valid Zipcode>" and "<Valid Mobile No>" in the address field
    When  I click the save button in the Edit page
    Then  I verify the Header "Addresses" of the page is Displayed
    And   I verify the Added Address is displayed in the page
    And   I click the Make Default Link in the Addresses Page
    Then  I verify the the Address title has changed to Default
    And   I click the MyAccount Breadcrumb link in the edit page
    And   I verify the Default address is displayed in the Address block in My Account

    Examples:
      | Valid Address Title | Valid First Name | Valid Last Name | Valid Address1   | Valid Address2 | Valid City | Valid State | Valid Zipcode | Valid Mobile No |
      | Home                |      John      |     Brown        |1700 W Blancke St  |                |   Linden   |New Jersey     | 07036-6226  |908 862 1700     |

    @TC_MyAccount_17
    Scenario Outline: Verifying user able to add the address and Make the address as default and verify the address is displayed in the Address block in My Account page
      When  I click sign in button in Header section
      And   I login the application with "testingtest@gmail.com", "password@"
      Then  I verify that title "My Account | Ariat" of the page
      And   I click the Add Address Link in the Addresses block in My account
      And   I enter "<Valid Address Title>" "<Valid First Name>" "<Valid Last Name>" "<Valid Address1>" "<Valid Address2>" "<Valid City>" "<Valid State>" "<Valid Zipcode>" and "<Valid Mobile No>" in the address field
      When  I click the save button in the Edit page
      Then  I verify the Header "Addresses" of the page is Displayed
      And   I verify the Added Address is displayed in the page
      When  I click the Add Address button in the Addresses page
      Then  I verify the Header "Addresses" of the page is Displayed
      And   I enter the already Added Address title in the Address Title input field
      And   I enter "<Valid First Name>" "<Valid Last Name>" "<Valid Address1>" "<Valid Address2>" "<Valid City>" "<Valid State>" "<Valid Zipcode>" and "<Valid Mobile No>" in the address field
      When  I click the save button in the Edit page
      Then  I verify the error Message An Address already exists with this Email Id is displayed under the Address title input field

      Examples:
        | Valid Address Title | Valid First Name | Valid Last Name | Valid Address1   | Valid Address2 | Valid City | Valid State | Valid Zipcode | Valid Mobile No |
        | Home                |      John      |     Brown        |1700 W Blancke St  |                |   Linden   |New Jersey     | 07036-6226  |908 862 1700     |

#  @TC_MyAccount_18
#  Scenario: validating the PAYMENT INFORMATION block in the My Account page
#    Given I am on the My Account page
#    When  I clicks the "ADD/DELETE" link in the PAYMENT INFORMATION column box
#    Then  I verify whether it is displayed the Payments page
#    And   I verify whether "BACK TO MY ACCOUNT" link is displayed
#    And   I verify whether "ADD NEW" Button is displayed in the page
#    When  I clicks the "ADD NEW" Button
#    Then  I verify whether the "Please add a new payment method by completing an order through the checkout" text is displayed in the page
#    And   I verify whether the CANCEL Button is displayed in the page
#    When  I clicks the CANCEL Button
#    Then  I verify whether the "Payments" page is displayed
#    When  I clicks the "BACK TO MY ACCOUNT" link in the page
#    Then  I verify whether the "My Account" page is displayed
#    When  I clicks the "ADD CARD" in the PAYMENT INFORMATION column box in my account page
#    Then  I verify whether the "Payments" page is displayed
#    When  I clicks the CANCEL Button
#    Then  I verify whether the "Payments" page is displayed
#    When  I clicks the "BACK TO MY ACCOUNT" link in the page
#    Then  I verify whether the "My Account" page is displayed
#
#  @TC_MyAccount_19
#  Scenario: validating the wishlist block in the My Account page
#    When  I click sign in button in Header section
#    Given I am on My Account page
#    Then  I verify whether the You have no items on your wish list to display. text is displayed in the wishlist block
#    When  I added one product to wishlist
#    Then  I verify whether the selected product is displayed in the wishlist block in the page
#    And   I verify the selected product image, product name, width or waist, size or length, color, instock, price are displayed in the wishlist block
#    And   I verify whether the Remove link, share link, ADD TO BAG and VIEW ALL links are displayed in the page
#    When  I clicks the "ADD TO BAG" Button
#    And   I verify whether My Bag sidebar is displayed in the page
#    When  I clicks the close Button in the My Bag sidebar
#    Then  I verify whether My Account wishlist page is displayed
#    When  I clicks share through email icon
#    Then  I verify whether "SHARE MY WISHLIST" dialogue box is displayed
#    When  I clicks the close button in the "SHARE MY WISHLIST" screen
#    Then  I verify whether My Account wishlist page is displayed
#    When  I clicks the VIEW ALL link
#    Then  I verify My Wishlist page is displayed
#    When  I clicks the "BACK TO MY ACCOUNT" Link in the my wishlist page
#    Then  I verify whether the "My Account page" is displayed
#    When  I clicks Remove link in the My wishlist column box
#    Then  I verify whether "You have no items on your wish list to display." text is displayed in the my wishlist column

    @TC_MyAccount_18
  Scenario Outline: validating the My Orders block in the My Account Page without adding the Items
    When  I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" birthday Month in the dropdown
    And I select the "<Day>" birthday Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" and "<Confirm Emailid>"
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the Header "My Account" of the page
    And  I verify My Orders text is displayed in the My Orders block in My Account page
    And  I verify no order text is displayed in the My Account block
    When I click the view all link in My Order in My Account page
    Then I verify that title "My Orders | Ariat" of the page
    Examples:
      | FirstName | LastName | Birthday | Day | Gender | EmailId | Confirm Emailid | Password | Confirm Password |
      | Photon    | test     | May      | 6   | Female | photon  | photon          | password | password         |

  @TC_MyAccount_19
  Scenario Outline: Validating the My Orders block in the My Account page after adding the product
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
    Then I verify the Order Status and Shipped to email id is displayed in the My Account page
    When I click the view all link in My Order in My Account page
    Then I verify that title "My Orders | Ariat" of the page


    Examples:
      | username                  | password | CardNumber          | ExpireDate | Cvv | Name        | card end |
      | photontesting20@gmail.com | password | 4000 6200 0000 0007 | 0330       | 737 | Test Photon | 0007     |

































