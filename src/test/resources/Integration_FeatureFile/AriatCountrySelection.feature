@Fullsuite
Feature: Validation of the Country Selection Drop-down in the Ariat website

  @TC_CountrySelection_01
  Scenario Outline: Validation of the Country selection dropdown window
    Given  I am on Ariat Website Home page
    Then   I verify whether the country selection drop-down is displayed in the website
    When   I clicks the country selection drop-down
    Then   I verify country selection pop-up is displayed
    When   I clicks and select "<Country>" country from the list
    Then   I verify the "<Currency>" is displayed as per the selection
    And    I verify the SAVE & CONTINUE Button is displayed
    When   I clicks the SAVE & CONTINUE Button
    Then   I verify the Country "<Url>" as per the selection

    Examples:
      | Country        | Currency | Url                               |
      | United Kingdom | GBP      | https://www.ariat.com/gb/         |
      | France         | EUR      | https://www.ariat.com/fr/         |
      | Deutschland    | EUR      | https://www.ariat.com/de/         |
      | United States  | USD      | https://www.ariat.com/            |
      | Australia      | AUD      | https://www.ariat.com.au/         |
      | New Zealand    | NZD      | https://www.ariat.com.au/         |
      | Belgium        | EUR      | https://www.ariat.com/be/         |
      | Luxembourg     | EUR      | https://www.ariat.com/lu/         |
      | Netherlands    | EUR      | https://www.ariat.com/nl/         |
      | Italy          | EUR      | https://www.ariat.com/it/         |
      | Finland        | EUR      | https://www.ariat.com/fi/         |
      | Denmark        | EUR      | https://www.ariat.com/dk/         |
      | Sweden         | SEK      | https://www.ariat.com/se/         |
      | Norway         | EUR      | https://www.ariat.com/no/         |
      | sterreich      | EUR      | https://www.ariat.com/at/         |
      | Schweiz        | EUR      | https://www.ariat.com/ch/         |
      | Ireland        | EUR      | https://www.ariat.com/ie/         |
#  development
      | United Kingdom | GBP      | https://development.ariat.com/gb/ |
      | France         | EUR      | https://development.ariat.com/fr/ |
      | Deutschland    | EUR      | https://development.ariat.com/de/ |
      | United States  | USD      | https://development.ariat.com/    |


  @TC_CountrySelection_02
  Scenario: Validation of the Country selection dropdown pop-up window
    Given  I am on Ariat Website Home page
    Then   I verify whether the country selection drop-down is displayed in the website
    When   I clicks the country selection drop-down
    And    I clicks the close button on country selection pop-up screen
    And    I clicks the country selection drop-down
    Then   I verify country selection pop-up is displayed
    When   I clicks the Learn more about International Orders link on Country Selector Popup Screen
    Then   I verify whether it is navigating to "FAQs | Ariat" page








