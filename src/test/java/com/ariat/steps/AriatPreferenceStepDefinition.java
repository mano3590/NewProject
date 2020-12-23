package com.ariat.steps;

import com.ariat.pages.AriatPreferenceCenterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AriatPreferenceStepDefinition extends AriatPreferenceCenterPage {

    @Then("^I verify Ariat Twotwentyfour and Ariat Main logo in the page$")
    public void i_verify_Ariat_Two_and_Ariat_Main_logo_in_the_page()  {
        Assert.assertTrue(verifyAriatMainlogo());
        Assert.assertTrue(verifyAriatlogo());
        Assert.assertTrue(verifyTwo24logo());
    }

    @Then("^I verify Women link text are displayed in the page$")
    public void i_verify_Women_link_text_are_displayed_in_the_page()  {
        
        Assert.assertTrue(verifyWomenLinkDisplayed());
    }

    @Then("^I verify Men link text are displayed in the page$")
    public void i_verify_Men_link_text_are_displayed_in_the_page()  {
        
        Assert.assertTrue(verifyMenLinkDisplayed());
    }

    @Then("^I verify Kids link text are displayed in the page$")
    public void i_verify_Kids_link_text_are_displayed_in_the_page()  {
        
        Assert.assertTrue(verifyKidsLinkDisplayed());
    }

    @Then("^I verify \"([^\"]*)\" text displayed in the page$")
    public void i_verify_text_displayed_in_the_page(String sectionheadername)  {
       
        Assert.assertTrue(verifySectionHeaderTextDisplayed(sectionheadername));
    }

    @Then("^I verify \"([^\"]*)\" Brand Subscription logo is displayed in the page$")
    public void i_verify_Brand_Subscription_logo_is_displayed_in_the_page(String logo)  {
       
        Assert.assertTrue(isVerifBrandSubscriptionLogoDisplayed(logo));
    }

    @Then("^I verify the \"([^\"]*)\" header is displayed in the page$")
    public void i_verify_the_header_is_displayed_in_the_page(String arg1)  {
       
        Assert.assertTrue(verifyGettheEmailHeader());
    }

    @Then("^I verify the Email ID which is displayed in the Page$")
    public void i_verify_the_Email_ID_which_is_displayed_in_the_Page()  {
       
        Assert.assertTrue(verifySelectedEmailDisplayed());
    }

    @Then("^I verify that title \"([^\"]*)\" of the Ariat preference page$")
    public void iVerifyThatTitleoftheAriatpreferencepage(String title)  {

        Assert.assertTrue(isVerifyTitleOfAriatEmailPage(title));
    }

    @Then("^I verify the Email address First Name and Last Name text boxs and lable names are displayed in the page$")
    public void i_verify_the_Email_address_First_Name_and_Last_Name_text_boxs_and_lable_names_are_isplayed_in_the_page(List<String> labelnames) {
       
        Assert.assertTrue(isverifyEmailFirstLastlabelNamesDisplayed(labelnames));
        Assert.assertTrue(isverifyEmailFirstLastinputtextDisplayed(labelnames));
    }

    @When("^I click the Ariat Brand Subscription checkbox$")
    public void I_click_the_Ariat_Brand_Subscription_checkbox() {
          
            clickAriatBrandSubscriptionCheckBox();
    }

    @Then("^I verify the Ariat Brand Subscription checkbox is selected$")
    public void I_verify_the_Ariat_Brand_Subscription_checkbox_is_selected()  {
     
        Assert.assertTrue(isVerifyAriatBrandSubscriptionCheckBoxIsSelected());
    }

    @Then("^I verify the below listed Ariat Brand Subscription toggle headings are displayed$")
    public void I_verify_the_below_listed_Ariat_Brand_Subscription_toggle_headings_are_displayed(List<String> ariattoggleheadingnames) {
      
        Assert.assertTrue(isverifyAriatBrandToggleHeadingNameDisplayed(ariattoggleheadingnames));
    }

    @When("^I click all the checkboxs listed in the Ariat Brand Subscription toggle sections$")
    public void I_click_all_the_checkboxs_listed_in_the_Ariat_Brand_Subscription_toggle_sections()  {
      
        Assert.assertTrue(clickAndVerifyAriatToggleSectionsCheckBoxs());
    }

    @When("^I click the Twotwentyfour Brand Subscription checkbox$")
    public void I_click_the_Twotwentyfour_Brand_Subscription_checkbox() {
        
        clickTwo24BrandSubscriptionCheckBox();
    }

    @Then("^I verify the Twotwentyfour Brand Subscription checkbox is selected$")
    public void I_verify_the_Twotwentyfour_Brand_Subscription_checkbox_is_selected()  {
      
        Assert.assertTrue(isVerifyTwo24BrandSubscriptionCheckBoxIsSelected());
    }

    @When("^I click the Ariat Work Brand Subscription checkbox$")
    public void I_click_the_Ariat_Work_Brand_Subscription_checkbox() {
        
        clickAriatWorkBrandSubscriptionCheckBox();
    }

    @Then("^I verify the Ariat Work Brand Subscription checkbox is selected$")
    public void I_verify_the_Ariat_Work_Brand_Subscription_checkbox_is_selected()  {
      
        Assert.assertTrue(isVerifyAriatWorkBrandSubscriptionCheckBoxIsSelected());
    }

    @When("^I click all the checkboxs listed in the Ariat Work Brand Subscription toggle sections$")
    public void I_click_all_the_checkboxs_listed_in_the_Ariat_Work_Brand_Subscription_toggle_sections()  {
      
        Assert.assertTrue(clickAndVerifyAriatWorkToggleSectionsCheckBoxs());
    }

    @When("^I verify the SubSection \"([^\"]*)\" header text displayed in the page$")
    public void i_verify_the_SubSection_header_text_displayed_in_the_page(String subsectionheader)  {

        Assert.assertTrue(verifySubSectionHeaderTextDisplayed(subsectionheader));
        
    }

    @When("^I click all the checkboxs listed below in the Tell Us About Yourself$")
    public void i_click_all_the_checkboxs_listed_below_in_the_Tell_Us_About_Yourself()  {
        
        Assert.assertTrue(clickAndVerifyTellMeAboutYourselfCheckBoxs());
    }

    @Then("^I verify \"([^\"]*)\" text displayed above the zipcode textbox$")
    public void i_verify_text_displayed_above_the_zipcode_textbox(String zipcodeheader)  {
        
        Assert.assertTrue(verifyZipcodeHeaderDisplayed(zipcodeheader));
    }

    @Then("^I verify Zipcode textbox displayed$")
    public void i_verify_Zipcode_textbox_displayed()  {
        
        Assert.assertTrue(zipcodeTextboxDisplayed());
    }

    @When("^I enter the \"([^\"]*)\" into the Zipcode field$")
    public void i_enter_the_into_the_Zipcode_field(String zipcode)  {

        enterZipcode(zipcode);
    }

    @Then("^I verify Birthday text displayed on the page$")
    public void i_verify_Birthday_text_displayed_on_the_page()  {
        
        Assert.assertTrue(birthdayTextDisplayed());
    }

    @Then("^I verify the Birthday Month label Name displayed$")
    public void i_verify_the_Birthday_Month_label_Name_displayed()  {
        
        Assert.assertTrue(birthdayMonthLabelNameDisplayed());
    }

    @Then("^I verify the Birthday Day label Name displayed$")
    public void i_verify_the_Birthday_Day_label_Name_displayed()  {

        Assert.assertTrue(birthdayDayLabelNameDisplayed());
    }

    @When("^I select the Birthday Month \"([^\"]*)\" from the dropdown$")
    public void i_select_the_Birthday_Month_from_the_dropdown(String month)  {
        
        selectBirthdayMonth(month);
    }

    @When("^I select the Birthday Day \"([^\"]*)\" from the dropdown$")
    public void i_select_the_Birthday_Day_from_the_dropdown(String day)  {
        
        selectBirthdayDay(day);
    }

    @Then("^I verify the \"([^\"]*)\" text displayed above the radio buttons$")
    public void i_verify_the_text_displayed_above_the_radio_buttons(String radiobuttonheader)  {

        Assert.assertTrue(verifyPromotionRadioBtnHeaderDisplayed(radiobuttonheader));
    }

    @When("^I select the \"([^\"]*)\" radio button$")
    public void i_select_the_radio_button(String radiobtn)  {
        selectRadioButton(radiobtn);
    }

    @And("^I click the Save Preferences Button$")
    public void I_click_the_Save_Preferences_Button()  {
        clickSavePreferenceButton();
    }

    @Then("^I verify the Please select brand or brands before clicking unsubscribe popup screen is displayed$")
    public void IverifythePleaseselectbrandorbrandsbeforeclickingunsubscribepopupscreenisdisplayed()  {
        Assert.assertTrue(isVerifyPopupScreenDisplayed());
    }

    @When("^I click the Keep Shopping button on the popup screen$")
    public void IclicktheKeepShoppingbuttononthepopupscreen()  {
        clickKeepShoppingBtn();
    }

    @When("^I click the Ariat International logo$")
    public void i_click_the_Ariat_International_logo() {
        clickAriatInternationalLogo();
    }

    @When("^I click Ariat logo in the page$")
    public void i_click_Ariat_logo_in_the_page() {
        clickAriatLogo();
    }

    @When("^I click Twotwentyfour logo in the page$")
    public void i_click_Twotwentyfour_logo_in_the_page() {
        clickTwo24Logo();
    }

    @When("^I click the \"([^\"]*)\" Header link$")
    public void i_click_the_Header_link(String headername) {
        clickProductLink(headername);
    }

    @Then("^I verify the selected Product header Name \"([^\"]*)\" displayed in the Product List Page$")
    public void i_verify_the_selected_Product_header_Name_displayed_in_the_Product_List_Page(String headername) {
        Assert.assertTrue(isProductListHeaderMatchWithSelectedLink(headername));
    }

    @When("^I click the unsubscribe Link at the bottom of the page$")
    public void i_click_the_unsubscribe_Link_at_the_bottom_of_the_page(){
        
        clickUnsubscribeLink();
    }

    @When("^I click the \"([^\"]*)\" checkbox in the Unsubscribe page$")
    public void i_click_the_checkbox_in_the_Unsubscribe_page(String brandname) {

        Assert.assertTrue(clickVerifyUnsubscribeCheckbox(brandname));

    }

    @When("^I click the Unsubscribe button$")
    public void i_click_the_Unsubscribe_button() {

        clickUnsubscribeBtn();
    }

    @Then("^I verify Twotwentyfour Brand Subscription checkbox is Unsubscribed$")
    public void i_verify_Twotwentyfour_Brand_Subscription_checkbox_is_Unsubscribed() {
        
        Assert.assertTrue(isVerifyTwo24BrandSubscriptionCheckBoxIsSelected());
    }

    @When("^I click the Email Preference button in the Unsubscribe page$")
    public void i_click_the_Email_Preference_button_in_the_Unsubscribe_page()  {

        clickEmailPreferenceBtn();
        
    }

    @Then("^I verify the \"([^\"]*)\" error message is displayed below the Email Address text box$")
    public void i_verify_the_error_message_is_displayed_below_the_Email_Address_text_box(String errormsg)  {
            Assert.assertTrue(verifyEmailFieldErrorMsg(errormsg));
    }

    @Then("^I verify the \"([^\"]*)\" error message is displayed below the Zipcode field$")
    public void i_verify_the_error_message_is_displayed_below_the_Zipcode_field(String errormsg)  {
        Assert.assertTrue(verifyZipcodeFieldErrorMsg(errormsg));
    }

    @When("^I enter the \"([^\"]*)\" into the Email ID field$")
    public void i_enter_the_into_the_Email_ID_field(String emailid)  {

        enterEmailID(emailid);
    }

    @When("^I enter the \"([^\"]*)\" into the First Name Field$")
    public void i_enter_the_into_the_First_Name_Field(String firstname)  {

        enterFirstName(firstname);
    }

    @When("^I enter the \"([^\"]*)\" into the Last Name Field$")
    public void i_enter_the_into_the_Last_Name_Field(String lastname)  {

        enterFirstName(lastname);
    }

    @When("^I click the close button on the popup screen$")
    public void i_click_the_close_button_on_the_popup_screen()  {

        clickCloseBtnInKeepShopping();
    }

    @When("^I click and enter \"([^\"]*)\" in the Zipcode field$")
    public void i_click_and_enter_in_the_Zipcode_field(String zipcode) {

        enterZipcode(zipcode);
    }
}
