Feature: Validation of the Gift Cards Page

  @TC_GiftCards_01
  Scenario: Validation of the Label names, text box and Buttons are displayed in the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    And  I verify the page header "Gift Cards" displayed on the page
    And  I verify that "General Gift Card information" info text displayed on the page
    And  I verify that "Sender Information" text displayed in Sender Information on the page
    And  I verify the below listed sender information label names and text Box are displayed on the page
      | First Name |
      | Last Name  |
    And  I verify that "Recipient Information" text displayed in Recipient Information on the page
    And  I verify the Recipient information label names and text box are displayed on the page
    And I verify Add to Cart Button displayed on the page
    And I verify that "Check Gift Card Balance" header is displayed on the page
    And I verify the below listed Recipient information label names and text box are displayed on the page
      | Gift Card Number |
      | Gift Card PIN    |
    And I verify Check Gift Card Balance Button displayed on the page

  @TC_GiftCards_02
  Scenario: Validation of the Sender and Recipient Information input field error message in the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I click the Add to Cart button on the page
    Then I verify that error message "Please enter a valid value." are displayed all the input Field

  @TC_GiftCards_03
  Scenario: Validation of the Check Gift Card Balance input field error message in the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I click the Check Gift Card Balance Button on the page
    Then I verify that error message "Please enter a valid value." are displayed in the Gift card input Field

  @TC_GiftCards_04
  Scenario Outline: Negative validation of the Email and Confirm Email Id field in the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I enter the Sender information "<Sender First Name>" into the First name Field
    And  I enter the Sender information "<Sender Last Name>" into the Last name Field
    And  I enter the Recipient information "<Recipient First Name>" into the First name Field
    And  I enter the Recipient information "<Recipient Last Name>" into the Last name Field
    And  I enter the Recipient information "<Invalid Recipient Email>" into the Recipient Email Id Field
    And  I enter the Recipient information "<Invalid Recipient Confirm Email>" into the Recipient Confirm Email Id Field
    And  I enter the Recipient information "<Amount>" into the Amount Field
    When I click the Add to Cart button on the page
    Then I verify that error indication displayed on recipient Email and Confirm recipient Email Id field

    Examples:
      | Sender First Name | Sender Last Name | Recipient First Name | Recipient Last Name | Invalid Recipient Email | Invalid Recipient Confirm Email | Amount |
      | Ariat             | test             | photon               | test                | ariat@com               | ariat@com                       | 25     |
      | Ariat             | test             | photon               | test                | test@com                | test@com                        | 25     |
      | Ariat             | test             | photon               | test                | 123@.com                | 123@.com                        | 25     |
      | Ariat             | test             | photon               | test                | 123@com                 | 456@com                         | 25     |
      | Ariat             | test             | photon               | test                | #$ ^7*88@com            | $%5 ariat@com                   | 25     |

  @TC_GiftCards_05
  Scenario Outline: Validation of the Email field with Valid Email Id and Invalid Confirm Email Id in the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I enter the Sender information "<Sender First Name>" into the First name Field
    And  I enter the Sender information "<Sender Last Name>" into the Last name Field
    And  I enter the Recipient information "<Recipient First Name>" into the First name Field
    And  I enter the Recipient information "<Recipient Last Name>" into the Last name Field
    And  I enter the Recipient information "<Valid Recipient Email>" into the Recipient Email Id Field
    And  I enter the Recipient information "<Invalid Recipient Confirm Email>" into the Recipient Confirm Email Id Field
    And  I enter the Recipient information "<Amount>" into the Amount Field
    When I click the Add to Cart button on the page
    Then I verify that error indication displayed on Confirm recipient Email Id field

    Examples:
      | Sender First Name | Sender Last Name | Recipient First Name | Recipient Last Name | Valid Recipient Email | Invalid Recipient Confirm Email | Amount |
      | Ariat             | test             | photon               | test                | ariat@gmail.com       | ariat@com                       | 25     |
      | Ariat             | test             | photon               | test                | test@gmail.com        | test@com                        | 25     |
      | Ariat             | test             | photon               | test                | test123@gmail.com     | 123@.com                        | 25     |
      | Ariat             | test             | photon               | test                | ariat123@yahoo.com    | 456@com                         | 25     |
      | Ariat             | test             | photon               | test                | ariattest@yahoo.com   | $%5 ariat@com                   | 25     |

  @TC_GiftCards_06
  Scenario Outline: Validation of the Email field with Valid Confirm Email Id and Invalid Valid Email Id in the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I enter the Sender information "<Sender First Name>" into the First name Field
    And  I enter the Sender information "<Sender Last Name>" into the Last name Field
    And  I enter the Recipient information "<Recipient First Name>" into the First name Field
    And  I enter the Recipient information "<Recipient Last Name>" into the Last name Field
    And  I enter the Recipient information "<Invalid Recipient Email>" into the Recipient Email Id Field
    And  I enter the Recipient information "<valid Recipient Confirm Email>" into the Recipient Confirm Email Id Field
    And  I enter the Recipient information "<Amount>" into the Amount Field
    When I click the Add to Cart button on the page
    Then I verify that error indication displayed on recipient Email Id field

    Examples:
      | Sender First Name | Sender Last Name | Recipient First Name | Recipient Last Name | Invalid Recipient Email | valid Recipient Confirm Email | Amount |
      | Ariat             | test             | photon               | test                | ariat@com               | ariat@yahoo.com               | 25     |
      | Ariat             | test             | photon               | test                | test@com                | test@gmail.com                | 25     |
      | Ariat             | test             | photon               | test                | test123@.om             | ariattest123@gmail.com        | 25     |
      | Ariat             | test             | photon               | test                | ariat123@com            | test456@gmail.com             | 25     |
      | Ariat             | test             | photon               | test                | ariattest@com           | testariat@yahoo.com           | 25     |

  @TC_GiftCards_07
  Scenario Outline: Validation of the Email field with Missmatch Email Id in the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I enter the Sender information "<Sender First Name>" into the First name Field
    And  I enter the Sender information "<Sender Last Name>" into the Last name Field
    And  I enter the Recipient information "<Recipient First Name>" into the First name Field
    And  I enter the Recipient information "<Recipient Last Name>" into the Last name Field
    And  I enter the Recipient information "<Recipient Email>" into the Recipient Email Id Field
    And  I enter the Recipient information "<Recipient Confirm Email>" into the Recipient Confirm Email Id Field
    And  I enter the Recipient information "<Amount>" into the Amount Field
    When I click the Add to Cart button on the page
    Then I verify the error Message "Friend's emails do not match." displayed on recipient Confirm Email Id field
    And  I verify the alert Indication Error Message displayed on the Gift Card Page
    When I click the close button in the alert message

    Examples:
      | Sender First Name | Sender Last Name | Recipient First Name | Recipient Last Name | Recipient Email        | Recipient Confirm Email | Amount |
      | Ariat             | test             | photon               | test                | ariat@yahoo.com        | ariat1@yahoo.com        | 25     |
      | Ariat             | test             | photon               | test                | test@gmail.com         | test1@gmail.com         | 25     |
      | Ariat             | test             | photon               | test                | ariattest123@gmail.com | ariattest1234@gmail.com | 25     |
      | Ariat             | test             | photon               | test                | test456@gmail.com      | test4567@gmail.com      | 25     |
      | Ariat             | test             | photon               | test                | testariat@yahoo.com    | testariat1@yahoo.com    | 25     |

  @TC_GiftCards_08
  Scenario: Validation of the Amount Field with amount value less than 25 and Greater than 1500 in the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I enter the Sender information "photon" into the First name Field
    And  I enter the Sender information "test" into the Last name Field
    And  I enter the Recipient information "ariat" into the First name Field
    And  I enter the Recipient information "test" into the Last name Field
    And  I enter the Recipient information "ariattest@gmail.com" into the Recipient Email Id Field
    And  I enter the Recipient information "ariattest@gmail.com" into the Recipient Confirm Email Id Field
    And  I enter the below listed Amount into the Amount field and verify the error message "Please enter a value greater than or equal to 25." displayed below the Amount field
      | 23 |
      | 22 |
      | 19 |
      | 10 |
      | 9  |
      | 24 |
    And  I enter the below listed Amounts into the Amount field and verify the error message "Please enter a value less than or equal to 1500." displayed below the Amount field
      | 1501 |
      | 1600 |
      | 1650 |

  @TC_GiftCards_09
  Scenario Outline: Validation of the Positive Scenario of the Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I enter the Sender information "<Sender First Name>" into the First name Field
    And  I enter the Sender information "<Sender Last Name>" into the Last name Field
    And  I enter the Recipient information "<Recipient First Name>" into the First name Field
    And  I enter the Recipient information "<Recipient Last Name>" into the Last name Field
    And  I enter the Recipient information "<Recipient Email>" into the Recipient Email Id Field
    And  I enter the Recipient information "<Recipient Confirm Email>" into the Recipient Confirm Email Id Field
    And  I enter the Recipient information "<Amount>" into the Amount Field
    When I click the Add to Cart button on the page
    Then I verify that title "My Bag | Ariat" of the page

    Examples:
      | Sender First Name | Sender Last Name | Recipient First Name | Recipient Last Name | Recipient Email      | Recipient Confirm Email | Amount |
      | Ariat             | test             | photon               | test                | ariat1@yahoo.com     | ariat1@yahoo.com        | 25     |
      | test              | ariat            | photon123            | test                | test1@gmail.com      | test1@gmail.com         | 100    |
      | Ariat123          | test             | photonariat          | test                | testariat1@yahoo.com | testariat1@yahoo.com    | 1400   |


  @TC_GiftCards_10
  Scenario Outline: Validation of the Check Gift Card Balance with Invalid Card Number and Pin Number on Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I enter "<Invalid Card Number>" into the Gift Card Number field
    And  I enter the "<Invalid Pin Number>" into the Gift Card Pin field
    And  I click the Check Gift Card Balance Button on the page
    Then I verify the error message "Error: The combination of gift card number and PIN does not exist." is displayed on the page

    Examples:
      | Invalid Card Number | Invalid Pin Number |
      | 2346856777          | 123                |
      | photon12234         | test               |
      | a@356123$%^&        | $%^                |
      | test#$()            | ()123              |

  @TC_GiftCards_11
  Scenario Outline: Validating the Check Gift Card Balance with Blank the Card Number field and enter invalid Pin Number on Gift Card Page
    Given I am on Ariat Website Home page
    When I click "Ariat" link on Home page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click the Gift card link on Ariat Footer
    Then I verify that title "Ariat Gift Card | Ariat" of the page
    When I enter "<Card Number>" into the Gift Card Number field
    And  I enter the "<Invalid Pin Number>" into the Gift Card Pin field
    And  I click the Check Gift Card Balance Button on the page
    Then I verify that error message "Please enter a valid value." are displayed in the Gift card input Field

    Examples:
      | Card Number | Invalid Pin Number |
      |             | 123                |
      |             | test               |
      |             | $%^                |
      |             | ()123              |


