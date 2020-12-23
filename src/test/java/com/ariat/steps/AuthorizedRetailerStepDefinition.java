package com.ariat.steps;

import com.ariat.pages.AuthorizedRetailerPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AuthorizedRetailerStepDefinition extends AuthorizedRetailerPage {
    @When("^I click the Stores from the Store Locator list$")
    public void i_click_the_Stores_from_the_Store_Locator_list() {
        clickStore();

    }

    @When("^I click the \"([^\"]*)\" in the brand shops$")
    public void i_click_the_in_the_brand_shops(String goToShoPage) {
        clickGoToShopButton(goToShoPage);

    }

    @When("^I click the Outside the Us link from the store list$")
    public void i_click_the_Outside_the_Us_link_from_the_store_list() {
        clickOutsideTheUs();
    }

    @Then("^I verify the Stores details are displayed in the page$")
    public void i_verify_the_Stores_details_are_displayed_in_the_page() {
        Assert.assertTrue(isStoreLocatorDetailsDisplayed());
    }

    @Then("^I verify the ariat email Id is displayed in the page$")
    public void i_verify_the_ariat_email_Id_is_displayed_in_the_page() {
        Assert.assertTrue(isAriatEmailIdDisplayedInOutsideTheUsPage());
    }

    @When("^I click the stores link from the store list$")
    public void i_click_the_stores_link_from_the_store_list() {
        clickStore();
    }


    @When("^I enter the zipcode \"([^\"]*)\" in the zipcode input box$")
    public void i_enter_the_valid_in_the_zipcode_input_box(String zipcode) {
        enterZipCode(zipcode);
    }

    @When("^I select any \"([^\"]*)\" from the Radius dropdown$")
    public void i_select_any_from_the_Radius_dropdown(String radius) {
        selectRadius(radius);
    }


    @When("^I click the Search button in the Store Page$")
    public void i_click_the_Search_button_in_the_Store_Page() {
        clickSearchButton();
    }

    @Then("^I verify the Checkbox All is selected by default$")
    public void i_verify_the_Checkbox_All_is_selected_by_default() {
        Assert.assertTrue(isCheckboxAllSelectedByDefault());

    }

    @Then("^I verify the stores list are displayed in the page$")
    public void i_verify_the_stores_list_are_displayed_in_the_page() {

        Assert.assertTrue(isStoreNamesDisplayed());


    }

    @When("^I select \"([^\"]*)\" in the check box from the Filter Results$")
    public void i_select_in_the_check_box_from_the_Filter_Results(String filter) {
        selectFilter(filter);
    }

    @Then("^I verify that url \"([^\"]*)\" of the page$")
    public void i_verify_that_url_of_the_page(String url) {
        Assert.assertTrue(isUrlOfThePageDisplayed(url));

    }

    @Then("^I verify the \"([^\"]*)\" under the zipcode textbox is displayed in the page$")
    public void i_verify_the_under_the_zipcode_textbox_is_displayed_in_the_page(String errorMessage) {
        Assert.assertTrue(isErrorMessageDisplayed(errorMessage));
    }

    @Then("^I verify the invalidZipcode \"([^\"]*)\" errorMessage$")
    public void i_verify_the_invalidZipcode_errorMessage(String invalidZipCodeErrorMessage) {
        Assert.assertTrue(isInvalidZipCodeErrorMessageDisplayed(invalidZipCodeErrorMessage));
    }

    @Then("^I verify the Shopnames and Images are displayed in the Ariat Shops page$")
    public void i_verify_the_Shopnames_and_Images_are_displayed_in_the_Ariat_Shops_page(List<String> shopNames) {
        Assert.assertTrue(isShopNamesAndImagesDisplayed(shopNames));
    }


    @Then("^I verify the Store Locator list are displayed on the Authorized Retailer Page$")
    public void i_verify_the_Store_Locator_list_are_displayed_on_the_Authorized_Retailer_Page(List<String> storeList) {
        Assert.assertTrue(isAuthorizedRetailerPageLinksDisplayed(storeList));
    }

    @When("^I click the Our Shops Link from the Store list$")
    public void i_click_the_Our_Shops_Link_from_the_Store_list() {
        clickBrandShops();
    }

    @Then("^I verify the  \"([^\"]*)\" are displayed in Outside The US Page$")
    public void i_verify_the_are_displayed_in_Outside_The_US_Page(String email) {
        Assert.assertTrue(isCountryEmailIdDisplayed(email));
    }

    @Then("^I verify the  \"([^\"]*)\" names are displayed in Outside The US Page$")
    public void i_verify_the_names_are_displayed_in_Outside_The_US_Page(String country) {
        Assert.assertTrue(isStoreCountryNameDisplayed(country));

    }

    @Then("^I verify the  \"([^\"]*)\" are displayed in the page$")
    public void i_verify_the_are_displayed_in_the_page(String phoneNo) {
        Assert.assertTrue(isStoreCountryContactNoDisplayed(phoneNo));

    }


    @Then("^I verify the Filter Results By Checkbox are displayed in the page$")
    public void i_verify_the_Filter_Results_By_Checkbox_are_displayed_in_the_page(List<String> filterResultsBy) {
        Assert.assertTrue(isFilterByCheckBoxDisplayed(filterResultsBy));

    }

    @Then("^I verify the zipcode input box, Radius drop-down, Search button are displayed in the page$")
    public void i_verify_the_zipcode_input_box_Radius_drop_down_Search_button_are_displayed_in_the_page() {
        Assert.assertTrue(isZipCodeDisplayed());
        Assert.assertTrue(isRadiusDisplayed());
        Assert.assertTrue(isSearchButtonDisplayed());

    }
}
