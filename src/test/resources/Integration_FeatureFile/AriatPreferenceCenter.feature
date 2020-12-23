@Fullsuite
Feature: Validating the Ariat Preferences Center Page

  @TC_AriatPreferencesCenter_01
  Scenario: Validating the Email Save Preferences without selecting all the fields in 'Get the email update' page
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I login the application with "photon2@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the page
    When I click the Edit link on My Account Page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    And  I verify the Email ID which is displayed in the Page
    And  I click the Save Preferences Button
    Then I verify the Please select brand or brands before clicking unsubscribe popup screen is displayed
    When I click the Keep Shopping button on the popup screen
    Then I verify that title "Ariat International | Home Page" of the page

  @TC_AriatPreferencesCenter_02
  Scenario: Validating the Ariat Preferences Center Page
    Given I am on Ariat Home page
    When I click sign in button in Header section
    When I click the create account link in the wishlist page
    And  I enters values in create account user forms
      | Photon   |
      | test     |
      | April    |
      | 8        |
      | Female   |
      | photon   |
      | photon   |
      | Password |
      | Password |
    When I click the Create Account submit button
    Then I verify that title "My Account | Ariat" of the page
    When I click the Edit link on My Account Page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    And  I verify Ariat Twotwentyfour and Ariat Main logo in the page
    And  I verify Women link text are displayed in the page
    And  I verify Men link text are displayed in the page
    And  I verify Kids link text are displayed in the page
    And  I verify the "Get the email updates you want!" header is displayed in the page
    And  I verify "Send Update" text displayed in the page
    And  I verify the Email address First Name and Last Name text boxs and lable names are displayed in the page
      | Email Address |
      | First Name    |
      | Last Name     |
    And  I verify the Email ID which is displayed in the Page
    And  I verify "Select Your Brand Subscriptions" text displayed in the page
    And I verify "Ariat" Brand Subscription logo is displayed in the page
    And I verify "Two24" Brand Subscription logo is displayed in the page
    And I verify "Ariat Work" Brand Subscription logo is displayed in the page
    When I click the Ariat Brand Subscription checkbox
    Then I verify the Ariat Brand Subscription checkbox is selected
    And  I verify the below listed Ariat Brand Subscription toggle headings are displayed
      | Lifestyle            |
      | Riding & Performance |
      | Outdoor              |
    When I click all the checkboxs listed in the Ariat Brand Subscription toggle sections
    And  I click the Twotwentyfour Brand Subscription checkbox
    Then I verify the Twotwentyfour Brand Subscription checkbox is selected
    When I click the Ariat Work Brand Subscription checkbox
    Then I verify the Ariat Work Brand Subscription checkbox is selected
    When I click all the checkboxs listed in the Ariat Work Brand Subscription toggle sections
    And  I verify "Tell Us About Yourself:" text displayed in the page
    And  I verify the SubSection "Who do you shop for" header text displayed in the page
    When I click all the checkboxs listed below in the Tell Us About Yourself
    Then I verify "Where do you call home?" text displayed above the zipcode textbox
    And  I verify Zipcode textbox displayed
    When I enter the "90201" into the Zipcode field
    Then I verify Birthday text displayed on the page
    And  I verify the Birthday Month label Name displayed
    And  I verify the Birthday Day label Name displayed
    When I select the Birthday Month "April" from the dropdown
    And  I select the Birthday Day "3" from the dropdown
    Then I verify the "Would you like to hear about local store events" text displayed above the radio buttons
    When I select the "Lexington, KY" radio button
    And  I click the Save Preferences Button
    Then I verify the Please select brand or brands before clicking unsubscribe popup screen is displayed
    When I click the Keep Shopping button on the popup screen
    Then I verify that title "Ariat International | Home Page" of the page

#Production Env
  @TC_AriatPreferencesCenter_03
  Scenario: Validating the Logo and Product Header links in the Ariat Preferences Center Page
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I login the application with "photontest2@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the page
    When I click the Edit link on My Account Page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    And  I verify Ariat Twotwentyfour and Ariat Main logo in the page
    And  I verify Women link text are displayed in the page
    And  I verify Men link text are displayed in the page
    And  I verify Kids link text are displayed in the page
    When I click the Ariat International logo
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    Then I verify that title "My Account | Ariat" of the page
    And  I click the Edit link on My Account Page
    And  I click Ariat logo in the page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    Then I verify that title "My Account | Ariat" of the page
    And  I click the Edit link on My Account Page
    And  I click Twotwentyfour logo in the page
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    Then I verify that title "My Account | Ariat" of the page
    And  I click the Edit link on My Account Page
    When I click the "Men" Header link
    Then I verify the selected Product header Name "Men" displayed in the Product List Page
    When I click sign in button in Header section
    Then I verify that title "My Account | Ariat" of the page
    And  I click the Edit link on My Account Page
    When I click the "Women" Header link
    Then I verify the selected Product header Name "Women" displayed in the Product List Page
    When I click sign in button in Header section
    Then I verify that title "My Account | Ariat" of the page
    And  I click the Edit link on My Account Page
    When I click the "Kids" Header link
    Then I verify the selected Product header Name "Kids" displayed in the Product List Page

  @TC_AriatPreferencesCenter_04
  Scenario: Validating the Unsubscribe link in Email Preferences
    Given I am on Ariat Home page
    When I click sign in button in Header section
    When I click the create account link in the wishlist page
    And  I enters values in create account user forms
      | Photon   |
      | test     |
      | April    |
      | 8        |
      | Female   |
      | photon   |
      | photon   |
      | Password |
      | Password |
    When I click the Create Account submit button
    Then I verify that title "My Account | Ariat" of the page
    When I click the Edit link on My Account Page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    And  I verify the Email ID which is displayed in the Page
    When I click the Twotwentyfour Brand Subscription checkbox
    And  I click the unsubscribe Link at the bottom of the page
    Then I verify that title "Ariat Unsubscribe from Preference Center" of the Ariat preference page
    And  I verify the "Unsubscribe" header is displayed in the page
    And  I verify the Email ID which is displayed in the Page
    When I click the "Two24" checkbox in the Unsubscribe page
    And  I click the Unsubscribe button
    Then I verify that title "Ariat International | Home Page" of the page
    When I click sign in button in Header section
    And  I login the application with "photontest2@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the page
    And  I click the Edit link on My Account Page
    Then I verify Twotwentyfour Brand Subscription checkbox is Unsubscribed

  @TC_AriatPreferencesCenter_05
  Scenario: Validating the EMail Preferences in the Unsubscribe Page
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And I login the application with "photontest2@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the page
    When I click the Edit link on My Account Page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    When I click the unsubscribe Link at the bottom of the page
    Then I verify the Email ID which is displayed in the Page
    Then I verify that title "Ariat Unsubscribe from Preference Center" of the Ariat preference page
    When I click the Email Preference button in the Unsubscribe page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    When I click the Save Preferences Button
    Then I verify the "This field is required" error message is displayed below the Email Address text box
    When I enter the "photontest4@gmail.com" into the Email ID field
    And  I enter the "photon" into the First Name Field
    And  I enter the "test" into the Last Name Field
    And  I click the Save Preferences Button
    Then I verify the Please select brand or brands before clicking unsubscribe popup screen is displayed
    When I click the close button on the popup screen
    Then I verify that title "Ariat International | Home Page" of the page


  @TC_AriatPreferencesCenter_06
  Scenario Outline: Validating the Zipcode Field in the Ariat Preferences Center Page
    Given I am on Ariat Home page
    When I click sign in button in Header section
    And  I login the application with "photontest2@gmail.com", "password"
    Then I verify that title "My Account | Ariat" of the page
    When I click the Edit link on My Account Page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    When I click the unsubscribe Link at the bottom of the page
    And  I click the Email Preference button in the Unsubscribe page
    Then I verify that title "Ariat Preference Center" of the Ariat preference page
    When I enter the "photontest4@gmail.com" into the Email ID field
    And  I click and enter "<Invalid zipcode>" in the Zipcode field
    And  I click the Save Preferences Button
    Then I verify the "Please enter a valid Zip Code" error message is displayed below the Zipcode field
    Examples:
      | Invalid zipcode |
      | 12              |
      | 0000            |
      | 34#$^&*99)G     |
      | 0 00            |
      | 10              |


























