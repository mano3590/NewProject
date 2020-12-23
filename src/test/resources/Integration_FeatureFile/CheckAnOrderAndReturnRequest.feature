@Fullsuite
@CheckAnOrderAndReturnPage
Feature: Validation of the CHECK AN ORDER / REQUEST RETURN

  @TC_CheckAnOrderAndReturnPage_01
  Scenario: Validating the Check an order and Request Return block
    Given I am on Ariat Home page
    When I click sign in button in Header section
    Then I verify Check an order and Request Return block is displayed in the page
    And  I verify "Check an order / request return" Header is displayed
    And  I verify "See your order even if you are not a registered user." is displayed
    And  I verify the Below listed label names are displayed above the text box
      | Order number |
      | Order Email  |
    And I verify the Below listed text box are displayed in the page
      | Order number |
      | Order Email  |
    And I verify check status button is displayed

  @TC_CheckAnOrderAndReturnPage_02
  Scenario: Validating the Check an order and Request Return block without entered anything in the block
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I click the check status button
    Then I verify the "This field is required." error display below textboxes in the Check and Return Order block
      | Order number |
      | Order Email  |

  @TC_CheckAnOrderAndReturnPage_03
  Scenario Outline: Negative Validation of the Check an order and Request Return block and verifying the respective error message
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I enter "<Invalid Order Number>" into the Order Number input field
    And  I enter "<Invalid Order Email ID>" into the Order Email input field
    And  I click the check status button
    Then I verify the "<Error Message>" error message
    Examples:
      | Invalid Order Number | Invalid Order Email ID | Error Message                                                                                  |
      | 2453676              | photon_123gmail        | Sorry this order number or email does not match our records. Check your records and try again. |
      | 24afgd#676           | phot#$n_123gmailcom    | Sorry this order number or email does not match our records. Check your records and try again. |
      | 245#$%3676abc        | @3$%& raggsv           | Sorry this order number or email does not match our records. Check your records and try again. |
      | #4$5%%^^&7((         | @#$%66&7*&%$%$#        | Sorry this order number or email does not match our records. Check your records and try again. |

  @TC_CheckAnOrderAndReturnPage_04
  Scenario Outline: Validation of the Check an order and Request Return block by left the Order Number field as blank and verify the error message
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I enter "<Order Number>" into the Order Number input field
    And  I enter "<Order Email ID>" into the Order Email input field
    And  I click the check status button
    Then I verify the "<Error Message>" error message below the Order Number input field
    Examples:
      | Order Number | Order Email ID      | Error Message           |
      |              | photon_123gmail     | This field is required. |
      |              | phot#$n_123gmailcom | This field is required. |
      |              | @3$%& raggsv        | This field is required. |
      |              | @#$%66&7*&%$%$#     | This field is required. |

  @TC_CheckAnOrderAndReturnPage_05
  Scenario Outline: Validation of the Check an order and Request Return block by left the Order Email field as blank and verify the error message
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I enter "<Order Number>" into the Order Number input field
    And  I enter "<Order Email ID>" into the Order Email input field
    And  I click the check status button
    Then I verify the "<Error Message>" error message below the Order Email input field
    Examples:
      | Order Number | Order Email ID | Error Message           |
      | 2345566      |                | This field is required. |
      | 2345677      |                | This field is required. |
      | 345678       |                | This field is required. |
      | 6789900      |                | This field is required. |

  @TC_CheckAnOrderAndReturnPage_06
  Scenario Outline: Validation of the Check an order and Request Return block by entering Valid Order Number and Valid Order Email
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I enter "<Order Number>" into the Order Number input field
    And  I enter "<Order Email ID>" into the Order Email input field
    And  I click the check status button
    Then I verify that Header "Order Detail" of the page
    And  I verify the "<Order Number>" is displayed in the Order summary
    Examples:
      | Order Number | Order Email ID            |
      | 35020343     | photontesting20@gmail.com |
      | 35021161     | photontesting20@gmail.com |
      | 35021160     | photontesting20@gmail.com |






