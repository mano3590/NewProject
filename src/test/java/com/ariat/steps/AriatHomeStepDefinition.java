package com.ariat.steps;

import com.ariat.pages.AriatHomePage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AriatHomeStepDefinition extends AriatHomePage {

    @When("^I click any widget link from Ariat Homepage widget links$")
    public void i_click_any_widget_link_from_Ariat_Homepage_widget_links()  {

        clickRandomWidgetLinksItem();
    }

    @When("^I select any one of the photo block from Ariat HomePage Photo Block$")
    public void i_select_any_one_of_the_photo_block_from_Ariat_HomePage_Photo_Block()  {
        clickRandomPhotoBlockItem();
    }

    @When("^I verify the HomePage Banner buttons are available$")
    public void i_verify_the_HomePage_Banner_buttons_are_available()  {
        Assert.assertTrue(isHomePageBannerButtonDisplayed());

    }
    @When("^I Click any one of the Banner button randomly in homepage$")
    public void i_Click_any_one_of_the_Banner_button_randomly_in_homepage()  {
        clickBannerButton();
    }
    @Then("^I verify it navigates to the expected Widget links page$")
    public void i_verify_it_navigates_to_the_expected_Widget_links_page()  {
        Assert.assertTrue(isWidgetTitleDisplayed());
    }
    @Then("^I click any widget link from the widget links$")
    public void i_click_any_widget_link_from_the_widget_links()  {
        clickRandomWidgetLinks();
    }

    @When("^I verify New arrivals is display in the Ariat homepage$")
    public void i_verify_New_arrivals_is_display_in_the_Ariat_homepage()  {
        scrollByPixel();
        Assert.assertTrue(isNewArrivalTitleDisplayed());
    }
    @When("^I click any one of the ShopByWork Banner button$")
    public void i_click_any_one_of_the_ShopByWork_Banner_button()  {
        clickRandomWorkBannerButton();
    }

    @When("^I click Shop By Style in the Footer$")
    public void i_click_Shop_By_Style_in_the_Footer()  {
        clickShopByStyleLink();
    }

    @When("^I click Wish List link in the Footer$")
    public void i_click_Wish_List_link_in_the_Footer()  {
        clickWishListLink();

    }

    @Then("^I verify the Product Name,Product price and Product Image is displayed under the New Arrivals Tag$")
    public void i_verify_the_Product_Name_Product_price_and_Product_Image_is_displayed_under_the_New_Arrivals_Tag()  {
        Assert.assertTrue(isProductNameDisplayedInNewArrivals());
        Assert.assertTrue(isProductPriceDisplayedInNewArrivals());
        Assert.assertTrue(isProductImageDisplayedInNewArrivals());

    }

    @When("^I click the Product Image under the New Arrivals$")
    public void i_click_the_Product_Image_under_the_New_Arrivals()  {
        ClickRandomProductImage();

    }

    @Then("^I verify the HomePage Banner buttons are displayed$")
    public void iVerifyTheHomePageBannerButtonsAreDisplayed() {

        Assert.assertTrue(verifyHomePageBannerButtonDisplayed());
    }

    @When("^I verify able to click the Banner Buttons and verify the Page Urls in the HomePage$")
    public void IverifyabletoclicktheBannerButtonsandverifythePageUrlsintheHomePage() {

        Assert.assertTrue(clickAndVerifyHomePageBannerButton());
    }

    @Then("^I verify the title in the Product List Page$")
    public void iVerifyTheTitleInTheProductListPage() {
        Assert.assertTrue(verifyPageHeader());
    }

    @Then("^I verify the HomePage Widget images are displayed on the Page$")
    public void iVerifyTheHomePageWidgetImagesAreDisplayedOnThePage() {
        Assert.assertTrue(verifyHomePageWidgetImgsDisplayed());
    }

    @Then("^I verify widgets links are displayed on the HomePage$")
    public void iverifyWidgetsLinksAreDisplayedOnTheHomePage() {
        Assert.assertTrue(verifyHomePageWidgetlinksDisplayed());

    }

    @Then("^I verify MyAriat Text Displayed on the Ariat Home page$")
    public void iVerifyMyAriatTextDisplayedOnTheAriatHomePage() {

        Assert.assertTrue(verifyMyAriatTextDisplayed());
    }

    @And("^I verify the Add Your Photo Text is displayed$")
    public void iVerifyTheAddYourPhotoTextIsDisplayed() {

        Assert.assertTrue(verifyAddYourPhoto());
    }

    @When("^I click the Add Your Photo on the Page$")
    public void IclicktheAddYourPhotoonthePage() {

        clicAddYourPhoto();
    }

    @And("^I verify the Upload Frame is displayed$")
    public void iVerifyTheUploadFrameIsDisplayed() {
        Assert.assertTrue(verifyUploadFrameDisplayed());
    }


    @And("^I verify the Source Header is displayed on the Upload Frame$")
    public void iVerifyTheSourceHeaderIsDisplayedOnTheUploadFrame() {

        Assert.assertTrue(verifySourceHeaderDisplayed());
    }

    @And("^I verify the Source Desktop Icon is displayed on the Upload Frame$")
    public void iVerifyTheSourceDesktopIconIsDisplayedOnTheUploadFrame() {
        Assert.assertTrue(verifySourceDesktopDisplayed());
    }

    @And("^I verify the Source Intagram Icon is displayed on the Upload Frame$")
    public void iVerifyTheSourceIntagramIconIsDisplayedOnTheUploadFrame() {

        Assert.assertTrue(verifySourceInstegramDisplayed());
    }

    @And("^I verify the Source Facebook Icon is displayed on the Upload Frame$")
    public void iVerifyTheSourceFacebookIconIsDisplayedOnTheUploadFrame() {

        Assert.assertTrue(verifySourceFacebookDisplayed());
    }

    @And("^I verify the Source Google Icon is displayed on the Upload Frame$")
    public void iVerifyTheSourceGoogleIconIsDisplayedOnTheUploadFrame() {

        Assert.assertTrue(verifySourceGooglephotosDisplayed());
    }

    @And("^I verify the Breadcrum link is displayed on the upload Frame$")
    public void iVerifyTheBreadcrumLinkIsDisplayedOnTheUploadFrame() {

        Assert.assertTrue(verifyChooseSourceBreadCrumDisplayed());
        Assert.assertTrue(verifySelectContentBreadCrumDisplayed());
        Assert.assertTrue(verifyReviewSubmissionBreadCrumDisplayed());
        Assert.assertTrue(verifySubmitContentBreadCrumDisplayed());

    }

    @When("^I click the Desktop icon on the Upload Frame$")
    public void iClickTheDesktopIconOnTheUploadFrame() {

        clickDesktopIcon();
    }

    @Then("^I verify the select Content BreadCrum is enabled$")
    public void iVerifyTheSelectContentBreadCrumIsEnabled() {

        Assert.assertTrue(verifySelectContentBreadCrumEnabled());
    }

    @When("^I click the Drag and Drop Content on the Upload Frame$")
    public void iClickTheDragAndDropContentOnTheUploadFrame() {

        clickDragAndDrop();
    }

    @When("^I click the View Gallery link on the Ariat Home Page$")
    public void iClickTheViewGalleryLinkOnTheAriatHomePage() {

        clickViewGalleryDisplayed();

    }

    @Then("^I verify View Gallery link is displayed on the Ariat Home Page$")
    public void iVerifyViewGalleryLinkIsDisplayedOnTheAriatHomePage() {

        Assert.assertTrue(verifyViewGalleryDisplayed());
    }

    @When("^I click the close button on Upload Frame$")
    public void iClickTheCloseButtonOnUploadFrame() {

        clickCloseBtnInUploadFrame();
        clickYesBtnInAlert();

    }

    @Then("^I verify the PhotoBlocks are displayed in the Page$")
    public void iVerifyThePhotoBlocksAreDisplayedInThePage() {

        Assert.assertTrue(verifyPhotoBlocksDisplayed());
    }

    @And("^I verify the Load More Content Button by user click the Button on the page$")
    public void iVerifyTheLoadMoreContentButtonByUserClickTheButtonOnThePage() {
        clickAndVerifyLoadMoreBtn();
    }

    @Then("^I verify MyAriat Header Text Displayed on the Ariat Home page$")
    public void iVerifyMyAriatHeaderTextDisplayedOnTheAriatHomePage() {

        Assert.assertTrue(verifyMyAriatHeaderDisplayed());
    }

    @And("^I verify that SortBy dropdown displayed on the page$")
    public void iVerifyThatSortByDropdownDisplayedOnThePage() {

        Assert.assertTrue(sortByDropDownDisplayedInMyAriat());
    }

    @When("^I click the SortBy dropdown on the page$")
    public void iClickTheSortByDropdownOnThePage() {

        clickSortBydropdown();
    }

    @Then("^I verify that the dropdown block displayed$")
    public void iVerifyThatTheDropdownBlockDisplayed() {

        Assert.assertTrue(sortBydropdownBlockDisplayed());
    }

    @When("^I click the below listed dropdown list item$")
    public void iClickTheBelowListedDropdownListItem(List<String> sortbydropdownitems) {

        clickSortByDropdownListItem(sortbydropdownitems);

    }

    @Then("^I verify the your personalized content dropdown is displayed on the page$")
    public void iVerifyTheYourPersonalizedContentDropdownIsDisplayedOnThePage() {

        Assert.assertTrue(verifyPersonalizedContentDropdownDispkayed());
    }

    @When("^I click the \"([^\"]*)\" in your personalized content dropdown list item$")
    public void iClickTheInYourPersonalizedContentDropdownListItem(String dropdownlist) {

        clickPersonalizedContentDropdownListItem(dropdownlist);
    }

    @When("^I click the \"([^\"]*)\" in the your personalized content dropdown list item$")
    public void iClickTheInYourthePersonalizedContentDropdownListItem(String dropdownlist) {

        clickPersonalizedContentDropdownListphotosNearMe(dropdownlist);
    }

    @Then("^I verify the SignIn with your social popup screen is displayed$")
    public void iVerifyTheSignInWithYourSocialPopupScreenIsDisplayed() {

        Assert.assertTrue(verifySigninWithYourSocialPopupScreenDisplayed());
    }

    @When("^I click the close button on SignIn with your social popup screen$")
    public void iClickTheCloseButtonOnSignInWithYourSocialPopupScreen() {
        clickCloseBtnInSigninWithYourSocialPopupScreen();
    }

    @When("^I click the your personalized content dropdown on the page$")
    public void iClickTheYourPersonalizedContentDropdownOnThePage() {

        clickPersonalizedContentDropdown();
    }

    @When("^I click the search icon on the My Ariat Home Page$")
    public void iClickTheSearchIconOnTheMyAriatHomePage() {

        clickMyAriatSearchIcon();
    }

    @Then("^I verify the Search field is displayed on the page$")
    public void iVerifyTheSearchFieldIsDisplayedOnThePage() {

        Assert.assertTrue(verifyMyAriatSearchInputFieldDisplayed());
    }

    @When("^I click the search close button on the page$")
    public void iClickTheSearchCloseButtonOnThePage() {


        clickMyAriatSearchCloseBtn();
    }

    @And("^I enters \"([^\"]*)\" into the search field$")
    public void iEntersIntoTheSearchField(String keyword) {

        enterMyAriatSearchField(keyword);

    }

    @Then("^I verify the \"([^\"]*)\" is displayed below the search field$")
    public void iVerifyTheIsDisplayedBelowTheSearchField(String keyword) {

        Assert.assertTrue(verifyenteredSearchKeywordDisplayed(keyword));

    }

    @When("^I click the ClearAll link below the search field$")
    public void iClickTheClearAllLinkBelowTheSearchField() {

        clickClearAll();
    }

    @Then("^I verify the Photos are displayed in the Page$")
    public void iVerifyThePhotosAreDisplayedInThePage() {

        Assert.assertTrue(verifyPhotosDisplayed());
    }

    @When("^I select any one of the photo from the listed photos$")
    public void iSelectAnyOneOfThePhotoFromTheListedPhotos() {

        clickRandomPhotos();
    }

    @And("^I verify able to click the Home page Widgets Images and verify the Page Urls in the Product List Page$")
    public void iVerifyAbleToClickTheHomePageWidgetsImagesAndVerifyThePageUrlsInTheProductListPage() {

        Assert.assertTrue(clickAndVerifyHomePageWidgetImg());
    }

    @And("^I verify able to click the Home page Widgets links and verify the Page Urls in the Product List Page$")
    public void iVerifyAbleToClickTheHomePageWidgetsLinksAndVerifyThePageUrlsInTheProductListPage() {

        Assert.assertTrue(clickAndVerifyHomePageWidgetlinks());
    }

    @And("^I verify able to click the New Arrivals Product and verify selected product is displayed on the Product list Page$")
    public void iVerifyAbleToClickTheNewArrivalsProductAndVerifySelectedProductIsDisplayedOnTheProductListPage() {

        Assert.assertTrue(clickAndVerifyNewArrivalsProducts());
    }
}
