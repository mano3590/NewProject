@Fullsuite
@CreateAccount
Feature: Create Account

  @TC_CreateAccount_01
  Scenario: Validating the Create Account Screen
    Given I am on Ariat Home page
    When I click sign in button in Header section
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
    And  I verify Please add me to the Ariat email list text is displayed in the Create Account User Form
    When I click the Please add me to the Ariat email check box
    Then I verify the Add me to button is selected
    And  I verify PRIVACY POLICY link text is displayed
    When I click the PRIVACY POLICY link
    And  I verify the PRIVACY POLICY Model screen is displayed
    When I click the close button in the PRIVACY POLICY Model screen
    Then I verify the Required text is displayed above the Create Account Submit button
    And  I verify the Create Account Submit button is displayed in the Create Account User Form

  @TC_CreateAccount_02
  Scenario: Validation of the Mandatory fields left as Blank and verify error messages
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I click the Create Account tab
    And I click the Create Account submit button without filling any fields
    Then verify the "This field is required." should display below in all textboxes in the Create Account User Form
      | First Name       |
      | Last Name        |
      | Email            |
      | Confirm Email    |
      | Password         |
      | Confirm Password |

  @TC_CreateAccount_03
  Scenario Outline: validation of the Birthday & Day dropdown, Gender radio button and Invalid Email Id and Invalid Confirm Email Id in the Create Account user form
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<Invalid EmailId>" in Email Id field
    And I enter "<Invalid Confirm EmailId>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Email and Confirm Email textbox
    Examples:
      | FirstName       | LastName | Birthday | Day | Gender | Invalid EmailId   | Invalid Confirm EmailId | Error Message                       | Password     | Confirm Password |
      | Ariat           | test     | January  | 2   | Male   | sidhanth          | sidhanth                | Please enter a valid E-Mail address | password     | password         |
      | Ariattest       | test     | February | 3   | Female | sidhanth@         | sidhanth@               | Please enter a valid E-Mail address | pass1234     | pass1234         |
      | photon234       | tes2     | April    | 8   | Male   | sidhanthgmail     | sidhanthgmail           | Please enter a valid E-Mail address | Pass@&*#123  | Pass@&*#123      |
      | Photontest000   | 000      | August   | 5   | Female | sidhanth@gmail    | sidhanth@gmail          | Please enter a valid E-Mail address | P@ssW@rd     | P@ssW@rd         |
      | Photontes1      | Arit     | November | 10  | Male   | sidhanth.com      | sidhanth.com            | Please enter a valid E-Mail address | testpass     | testpass         |
      | Photon@#test001 | 100%$    | December | 12  | Female | sidhanth@gmail    | sidhanth@gmail          | Please enter a valid E-Mail address | passwordtest | passwordtest     |
      | Photontest      | test     | May      | 7   | Male   | sidhanthgmail.com | sidhanthgmail.com       | Please enter a valid E-Mail address | Password000  | Password000      |


  @TC_CreateAccount_04
  Scenario Outline: Negative validation of the Invalid Email and valid Confirm Email fields in the Create Account user form
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<Invalid EmailId>" in Email Id field
    And I enter "<Valid Confirm EmailId>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Email textbox
    Examples:
      | FirstName       | LastName | Birthday | Day | Gender | Invalid EmailId   | Valid Confirm EmailId  | Error Message                       | Password     | Confirm Password |
      | Ariat           | test     | January  | 2   | Male   | sidhanth          | sidhanth@gmail.com     | Please enter a valid E-Mail address | password     | password         |
      | Ariattest       | test     | February | 3   | Female | sidhanth@         | sidhanth123@gmail.com  | Please enter a valid E-Mail address | pass1234     | pass1234         |
      | photon234       | tes2     | April    | 8   | Male   | @#$%^%^&&@gmail   | sidhanth@rediff.com    | Please enter a valid E-Mail address | Pass@&*#123  | Pass@&*#123      |
      | Photontest000   | 000      | August   | 5   | Female | sidhanth@gmail    | sidhanthtest@yahoo.com | Please enter a valid E-Mail address | P@ssW@rd     | P@ssW@rd         |
      | Photontes1      | Arit     | November | 10  | Female | sidhanth.com      | ariattest123@gmail.com | Please enter a valid E-Mail address | testpass     | testpass         |
      | Photon@#test001 | 100%$    | December | 12  | Male   | sidhanth@gmail    | sidhanth567@gmail.com  | Please enter a valid E-Mail address | passwordtest | passwordtest     |
      | Photontest      | test     | May      | 7   | Female | sidhanthgmail.com | sidhanth00@gmail.com   | Please enter a valid E-Mail address | Password000  | Password000      |
      | Photontes1      | Arit     | November | 10  | Male   |                   | ariattest123@gmail.com | This field is required              | testpass     | testpass         |
      | Photon@#test001 | 100%$    | December | 12  | Female |                   | sidhanth567@gmail.com  | This field is required              | passwordtest | passwordtest     |
      | Photontest      | test     | May      | 7   | Male   |                   | sidhanth00@gmail.com   | This field is required              | Password000  | Password000      |

  @TC_CreateAccount_05
  Scenario Outline: Negative validation of the Valid Email and Invalid Confirm Email fields in the Create Account user form
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<Valid EmailId>" in Email Id field
    And I enter "<Invalid Confirm EmailId>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Confirm Email textbox
    Examples:
      | FirstName       | LastName | Birthday | Day | Gender | Valid EmailId          | Invalid Confirm EmailId | Error Message                       | Password     | Confirm Password |
      | Ariat           | test     | January  | 2   | Male   | sidhanth@gmail.com     | 132445363               | Please enter a valid E-Mail address | password     | password         |
      | Ariattest       | test     | February | 3   | Female | sidhanth123@gmail.com  | sidhanth@               | Please enter a valid E-Mail address | pass1234     | pass1234         |
      | photon234       | tes2     | April    | 8   | Male   | sidhanth@rediff.com    | 1223@#344@gmail         | Please enter a valid E-Mail address | Pass@&*#123  | Pass@&*#123      |
      | Photontest000   | 000      | August   | 5   | Male   | sidhanthtest@yahoo.com | sidhanth@gmail          | Please enter a valid E-Mail address | P@ssW@rd     | P@ssW@rd         |
      | Photontes1      | Arit     | November | 10  | Female | ariattest123@gmail.com | sidhanth.com            | Please enter a valid E-Mail address | testpass     | testpass         |
      | Photon@#test001 | 100%$    | December | 12  | Male   | sidhanth567@gmail.com  | sidhanth@gmail          | Please enter a valid E-Mail address | passwordtest | passwordtest     |
      | Photontest      | test     | May      | 7   | Female | sidhanth00@gmail.com   | sidhanthgmail.com       | Please enter a valid E-Mail address | Password000  | Password000      |
      | Photontes1      | Arit     | November | 10  | Male   | ariattest123@gmail.com |                         | This field is required              | testpass     | testpass         |
      | Photon@#test001 | 100%$    | December | 12  | Female | sidhanth567@gmail.com  |                         | This field is required              | passwordtest | passwordtest     |
      | Photontest      | test     | May      | 7   | Male   | sidhanth00@gmail.com   |                         | This field is required              | Password000  | Password000      |


  @TC_CreateAccount_06
  Scenario Outline: Validating the Create Account Screen with the valid EmailId and different valid Confirm EmailId
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Confirm Email textbox
    Examples:
      | FirstName   | LastName | Birthday | Day | Gender | Error Message                     | Password    | Confirm Password | EmailId                     | Confirm Emailid               |
      | Photontest  | test     | November | 5   | Female | Please enter the same value again | password123 | password123      | testgmail13@gmail.com       | testinggamil13@gmail.com      |
      | test        | Photon   | December | 6   | Male   | Please enter the same value again | Pass@word   | Pass@word        | Photontest123@gmail.com     | Photontest345@gmail.com       |
      | Ariat1      | teste    | May      | 8   | Female | Please enter the same value again | Pass_word   | Pass_word        | Photonariat123@gmail.com    | Photonariat12345@gmail.com    |
      | Photontest1 | testr    | November | 5   | Male   | Please enter the same value again | password000 | password000      | testgmail1356@gmail.com     | testinggamil1356@gmail.com    |
      | test1       | Photon2  | December | 6   | Female | Please enter the same value again | Pass@word@# | Pass@word@#      | Photontesting123@gmail.com  | Photontesting345@gmail.com    |
      | Ariat5      | testc    | May      | 8   | Male   | Please enter the same value again | Pass_word$% | Pass_word$%      | Photonariatest123@gmail.com | Photonariatest12345@gmail.com |


  @TC_CreateAccount_07
  Scenario Outline: Validating the Create Account user form with Invalid Password(less than 8Character) and Invalid ConfirmPassword(less than 8character)
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the "<Invalid Password>" and "<Invalid Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Password and Confirm Password fields
    Examples:
      | FirstName   | LastName | Birthday | Day | Gender | Error Message                        | Invalid Password | Invalid Confirm Password | EmailId                     | Confirm Emailid             |
      | Photontest  | test     | November | 5   | Female | This field needs 8 to 255 characters | passwo           | passwo                   | testgmail13@gmail.com       | testgmail13@gmail.com       |
      | test        | Photon   | December | 6   | Male   | This field needs 8 to 255 characters | Pass@            | Pass@                    | Photontest123@gmail.com     | Photontest123@gmail.com     |
      | Ariat1      | teste    | May      | 8   | Female | This field needs 8 to 255 characters | 1234             | 1234                     | Photonariat123@gmail.com    | Photonariat123@gmail.com    |
      | Photontest1 | testr    | November | 5   | Male   | This field needs 8 to 255 characters | 000              | 000                      | testgmail1356@gmail.com     | testgmail1356@gmail.com     |
      | test1       | Photon2  | December | 6   | Female | This field needs 8 to 255 characters | %^@#             | %^@#                     | Photontesting123@gmail.com  | Photontesting123@gmail.com  |
      | Ariat5      | testc    | May      | 8   | Male   | This field needs 8 to 255 characters | Pass%*           | Pass%*                   | Photonariatest123@gmail.com | Photonariatest123@gmail.com |


  @TC_CreateAccount_08
  Scenario Outline: Negative validation of the Password fields in Create Account user form with more than 8 Character
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the "<Invalid Password>" and "<Invalid Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Confirm Password fields
    Examples:
      | FirstName   | LastName | Birthday | Day | Gender | Error Message           | Invalid Password       | Invalid Confirm Password | EmailId                     | Confirm Emailid             |
      | Photontest  | test     | November | 5   | Male   | Does not match password | passwo()#              | 123 #$%6&53663           | testgmail13@gmail.com       | testgmail13@gmail.com       |
      | test        | Photon   | December | 6   | Female | Does not match password | Pass@word              | word1234Password         | Photontest123@gmail.com     | Photontest123@gmail.com     |
      | Ariat1      | teste    | May      | 8   | Male   | Does not match password | 1234Password           | Pass_Word@0000           | Photonariat123@gmail.com    | Photonariat123@gmail.com    |
      | Photontest1 | testr    | November | 5   | Male   | Does not match password | 000)(000               | )(000&^%pa    ss         | testgmail1356@gmail.com     | testgmail1356@gmail.com     |
      | test1       | Photon2  | December | 6   | Female | Does not match password | %^@#Password           | Pass@@#word____455       | Photontesting123@gmail.com  | Photontesting123@gmail.com  |
      | Ariat5      | testc    | May      | 7   | Male   | Does not match password | Pass%*word____345      | Pass_$%word              | Photonariatest123@gmail.com | Photonariatest123@gmail.com |
      | Ariat5      | testc    | May      | 8   | Female | Does not match password | Pass%*wordbnhhh        | Pass_$%word              | Photonariatest@gmail.com    | Photonariatest@gmail.com    |
      | Ariat5      | testc    | May      | 9   | Male   | Does not match password | Pass%*word   ariat     | Pass_$%word              | Photonaria123@gmail.com     | Photonaria123@gmail.com     |
      | Ariatest    | testing  | August   | 8   | Female | Does not match password | Pass%*23word photon123 |                          | Photonariatest111@gmail.com | Photonariatest111@gmail.com |
      | Ariat5test  | te       | March    | 12  | Male   | Does not match password | Pass%*(*word           |                          | Photonariatest555@gmail.com | Photonariatest555@gmail.com |
      | Photon      | test     | June     | 11  | Female | Does not match password | Pass%*(*word23         |                          | Photonariatest55@gmail.com  | Photonariatest55@gmail.com  |

  @TC_CreateAccount_09
  Scenario Outline: Negative validation of the Password fields and left the Password as blank in Create Account user form
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the "<Invalid Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Password fields
    Examples:
      | FirstName  | LastName     | Birthday | Day | Gender | Error Message          | Invalid Password | Confirm Password | EmailId                    | Confirm Emailid            |
      | Photontest | test         | May      | 11  | Male   | This field is required |                  | Pass%*0000       | Photonariatest55@gmail.com | Photonariatest55@gmail.com |
      | testPhoton | testing      | June     | 5   | Female | This field is required |                  | 000 0000 00      | Photonariatest55@gmail.com | Photonariatest55@gmail.com |
      | Photon     | test123      | July     | 3   | Male   | This field is required |                  | #$%% $%^ ^&      | Photonariatest55@gmail.com | Photonariatest55@gmail.com |
      | Photon     | testing      | January  | 1   | Female | This field is required |                  | Pass@word123     | Photonariatest55@gmail.com | Photonariatest55@gmail.com |
      | 00000      | 1223455      | June     | 6   | Female | This field is required |                  | password         | Photonariatest55@gmail.com | Photonariatest55@gmail.com |
      | 89062536   | Photon#$%899 | February | 11  | Male   | This field is required |                  | Password123      | Photonariatest55@gmail.com | Photonariatest55@gmail.com |


  @TC_CreateAccount_10
  Scenario Outline: Negative validation of the Password fields more than 255 characters in Create Account user form
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the password and confirm password more than 255 characters
    When I click the Create Account submit button
    Then I Verify the Create Account tab is displayed
    Examples:
      | FirstName  | LastName     | Birthday | Day | Gender | EmailId                      | Confirm Emailid              |
      | Photontest | test         | May      | 11  | Male   | Ariatphoton001@gmail.com     | Ariatphoton001@gmail.com     |
      | testPhoton | testing      | June     | 5   | Female | Photonariatet90@gmail.com    | Photonariatet90@gmail.com    |
      | Photon     | test123      | July     | 3   | Male   | Photonariatest001@gmail.com  | Photonariatest001@gmail.com  |
      | Photon     | testing      | January  | 1   | Female | Photonariatest087@gmail.com  | Photonariatest08@gmail.com   |
      | 00000      | 1223455      | June     | 6   | Male   | Photonariatest0901@gmail.com | Photonariatest0901@gmail.com |
      | 89062536   | Photon#$%899 | February | 11  | Female | Photonariatest0956@gmail.com | Photonariatest0956@gmail.com |

  @TC_CreateAccount_11
  Scenario Outline: Validating the Create Account Screen with already registered Emailid
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<Already Registered EmailId>" in Email Id field
    And I enter "<Already Registered Confirm Emailid>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Email textbox

    Examples:
      | FirstName | LastName | Birthday | Day | Gender | Already Registered EmailId | Already Registered Confirm Emailid | Error Message                           | Password    | Confirm Password |
      | Ariat     | test     | January  | 2   | Male   | photontest2@gmail.com      | photontest2@gmail.com              | Customer with this email already exists | password    | password         |
      | Ariattest | test     | February | 3   | Female | testphoton2020@gmail.com   | testphoton2020@gmail.com           | Customer with this email already exists | pass1234    | pass1234         |
      | photon234 | tes2     | April    | 8   | Male   | photontest2020@gmail.com   | photontest2020@gmail.com           | Customer with this email already exists | Pass@&*#123 | Pass@&*#123      |

  @TC_CreateAccount_12
  Scenario Outline: Validating the Create Account User form with leaving the First Name Mandatory field as Blank
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the First Name textbox field

    Examples:
      | FirstName | LastName | Birthday | Day | Gender | EmailId                   | Confirm Emailid           | Error Message          | Password    | Confirm Password |
      |           | test     | January  | 2   | Male   | photontesting2@gmail.com  | photontesting2@gmail.com  | This field is required | password    | password         |
      |           | testing  | March    | 1   | Female | photontestin2@gmail.com   | photontestin2@gmail.com   | This field is required | passwords   | passwords        |
      |           | tests    | May      | 4   | Male   | photontestings2@gmail.com | photontestings2@gmail.com | This field is required | password123 | password123      |

  @TC_CreateAccount_13
  Scenario Outline: Validating the Create Account User form with leaving the Last Name Mandatory field as Blank
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" month in the dropdown
    And I select the "<Day>" Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Last Name textbox field

    Examples:
      | FirstName | LastName | Birthday | Day | Gender | EmailId                  | Confirm Emailid          | Error Message          | Password     | Confirm Password |
      | Photon    |          | January  | 1   | Male   | photontesting2@gmail.com | photontesting2@gmail.com | This field is required | password     | password         |
      | Photon    |          | May      | 12  | Female | phototesting2@gmail.com  | phototesting2@gmail.com  | This field is required | password@123 | password@123     |
      | Photon    |          | January  | 8   | Male   | photonesting2@gmail.com  | photonesting2@gmail.com  | This field is required | password     | password         |

  @TC_CreateAccount_14
  Scenario Outline: Validating the Create Account User form with leaving the Birthday Month Mandatory field as Blank
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" birthday Month in the dropdown
    And I select the "<Day>" birthday Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Birthday dropdown field

    Examples:
      | FirstName | LastName | Birthday | Day | Gender | EmailId                    | Confirm Emailid            | Error Message          | Password    | Confirm Password |
      | Photon    | test     |          | 2   | Male   | photontesting2@gmail.com   | photontesting2@gmail.com   | This field is required | password    | password         |
      | Ariat     | 123      |          | 2   | Female | photontesting002@gmail.com | photontesting002@gmail.com | This field is required | password 00 | password 00      |
      | 00000     | te0000st |          | 2   | Male   | photontesting112@gmail.com | photontesting112@gmail.com | This field is required | password 89 | password 89      |

  @TC_CreateAccount_15
  Scenario Outline: Validating the Create Account User form with leaving the Birthday day Mandatory field as Blank
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I click the Create Account tab
    And I enter the "<FirstName>" and "<LastName>" in the Create Account user form
    And I select the "<Birthday>" birthday Month in the dropdown
    And I select the "<Day>" birthday Day in the dropdown
    And I click "<Gender>" radio button
    And I enter "<EmailId>" in Email Id field
    And I enter "<Confirm Emailid>" in Confirm Email id field
    And I enter the "<Password>" and "<Confirm Password>"
    When I click the Create Account submit button
    Then I verify the "<Error Message>" is display below the Birthday dropdown field

    Examples:
      | FirstName | LastName | Birthday  | Day | Gender | EmailId                  | Confirm Emailid          | Error Message          | Password | Confirm Password |
      | Photon    | test     | May       |     | Male   | photontesting2@gmail.com | photontesting2@gmail.com | This field is required | password | password         |
      | Photon    | test     | April     |     | Female | photontesting2@gmail.com | photontesting2@gmail.com | This field is required | password | password         |
      | Photon    | test     | September |     | Male   | photontesting2@gmail.com | photontesting2@gmail.com | This field is required | password | password         |


  @TC_CreateAccount_16
  Scenario Outline: Validating the Create Account User Form without selecting Please Add me to the Ariat Email
    Given I am on Ariat Home page
    When I click sign in button in Header section
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

  @TC_CreateAccount_17
  Scenario Outline: Validating the Create Account User Form without selecting Please Add me to the Ariat Email
    Given I am on Ariat Home page
    When I click sign in button in Header section
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


