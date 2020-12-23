@Fullsuite
Feature: Validating of the SignIn

  Background:
    Given I am on Ariat Home page
    When  I click "Ariat" link on Home page

  @TC_SignIn_01
  Scenario: Validating the SignIn
    When  I click sign in button in Header section
    Then  I verify that title "Sites-Ariat-Site | Ariat" of the page
    And   I verify the EmailTextbox, PasswordTextbox, SignInButton,RememberMeCheckBox, ForgotPasswordLink and SignInButton is display in the page
    When  I click the ForgotPassword link in the sign In page
    Then  I verify the Forgot Your Password Popup is displayed

  @TC_SignIn_02
  Scenario: Validating Sign In without entering the Credentials
    When  I click sign in button in Header section
    And  I click the Email Textbox in the sign in page
    When  I switch off the field from the Email Textbox
    Then I verify the error Message 'This Field is Required' is displayed under the email Textbox
    When I click the Password Textbox in the sign in page
    And  I switch off the field from the Password Textbox
    Then I verify the error Message 'This Field is Required' is displayed under the password Textbox

  @TC_SignIn_03
  Scenario Outline: Validating the InvalidFormat EmailId and InvalidPassword
    When I click sign in button in Header section
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

  @TC_SignIn_04
  Scenario Outline: Validating the Invalid EmailId and InvalidPassword
    When I click sign in button in Header section
    And  I click the Email Textbox in the sign in page
    When I enter the "<Invalid EmailId>" in the Email text box
    And  I enter the "<Invalid Password>" in the Password text box
    When I click the SignInButton in the Sign In page
    Then I verify the "<Error Message>" is displayed in the Sign In Page
    Examples:
      | Invalid EmailId | Invalid Password | Error Message                                                                          |
      | photg@mail.com  | $#@%^            | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | Photon@n12      | pho              | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | photo@t.com     | phot             | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | photon@mail.com | ph               | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | photon@gmailcom | 12345            | Invalid login or password. Remember that password is case-sensitive. Please try again. |
      | phot@123456.com | 324%             | Invalid login or password. Remember that password is case-sensitive. Please try again. |

  @TC_SignIn_05
  Scenario Outline: Validating the valid EmailId and valid Password
    When I click sign in button in Header section
    And  I click the Email Textbox in the sign in page
    When I enter the "<valid EmailId>" in the Email text box
    And  I enter the "<valid Password>" in the Password text box
    When I click the SignInButton in the Sign In page
    Then  I verify that title "My Account | Ariat" of the page
    Examples:
      | valid EmailId            | valid Password |
      | photontest2@gmail.com    | password       |
      | Photontest2020@gmail.com | Photon@2020    |

  @TC_SignIn_06
  Scenario: Validating the Forgot your Passsword
    When I click sign in button in Header section
    And  I click the ForgotPassword link in the sign In page
    Then  I verify the Forgot Your Password Popup is displayed
    When  I click the send Button in the Forgot your Password Popup
    Then  I verify the error Message 'This Field is Required' is displayed in the Forgot your Passsword Popup


  @TC_SignIn_07
  Scenario Outline: Validating the Forgot your Password with Invalid Email Id
    When I click sign in button in Header section
    And  I click the ForgotPassword link in the sign In page
    When I enter the "<Invalid EmailId>" in the Forgot your Password Popup
    And  I click the send Button in the Forgot your Password Popup
    Then I verify the "<Error Message>" is displayed in the Forgot your Password Popup
    Examples:
      | Invalid EmailId | Error Message                       |
      | phot@test       | Please enter a valid email address. |
      | Pho@g45@#$%     | Please enter a valid email address. |
      | Phot@gm.com     | Please enter a valid email address. |
      | phot@gmai       | Please enter a valid email address. |
      | Pho@g123456     | Please enter a valid email address. |
      | PHOTON@g12.35   | Please enter a valid email address. |

  @Tc_SignIn_08
  Scenario Outline: Validating the Forgot your Password with valid Email Id
    When I click sign in button in Header section
    And  I click the ForgotPassword link in the sign In page
    When I enter the "<Valid EmailId>" in the Forgot your Password Popup
    And  I click the send Button in the Forgot your Password Popup
    Then  I verify the Request to Reset Your Password Received Popup is displayed
    And   I click the close button in the Forgot your Password popup

    Examples:
      | Valid EmailId            |
      | photontest2020@gmail.com |
      | photon@gmail.com         |
      | phot@gmail.com           |
      | photontest2020@gmail.com |







