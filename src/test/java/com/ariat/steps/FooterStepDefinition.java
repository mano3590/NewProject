package com.ariat.steps;

import com.ariat.pages.FooterPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class FooterStepDefinition extends FooterPage {
    @When("^I click the link Sustainability from the Footer$")
    public void i_click_the_link_Sustainability_from_the_Footer() {
        clickSustainability();
    }

    @When("^I verify the banner is displayed in the Sustainability page$")
    public void i_verify_the_banner_is_displayed_in_the_Sustainability_page() {
        isBannerDisplayedInSustainability();
    }
    @When("^I clicks any one of the random banner button in the Sustainability page$")
    public void i_clicks_any_one_of_the_random_banner_button_in_the_Sustainability_page() {
        clickRandomBannerButtonSustainability();
    }

    @When("^I click the Contact us link on the Footer$")
    public void iClickTheContactUsLinkOnTheFooter() {

        clickContactUsLink();
    }

    @And("^I verify that \"([^\"]*)\" text displayed in the Ariat Footer$")
    public void iVerifyThatTextDisplayedInTheAriatFooter(String text){

        Assert.assertTrue(isVerifyJoinOurFamilyDisplayed(text));
    }

    @And("^I verify that email text box displayed on the page$")
    public void iVerifyThatEmailTextBoxDisplayedOnThePage() {

        Assert.assertTrue(isVerifyEmailTextBoxDisplayed());
    }

    @And("^I verify that Subscribe button displayed on the page$")
    public void iVerifyThatSubscribeButtonDisplayedOnThePage() {

        Assert.assertTrue(isVerifySubscribeBtnDisplayed());
    }

    @And("^I verify able to click the Facebook, twitter, pinterest and Instagram links on the page$")
    public void iVerifyAbleToClickTheFacebookTwitterPinterestAndInstagramLinksOnThePage() {

        Assert.assertTrue(isVerifyFacebookLogoDisplayed());
        Assert.assertTrue(isVerifyTwitterLogoDisplayed());
        Assert.assertTrue(isVerifyPinterestLogoDisplayed());
        Assert.assertTrue(isVerifyInstagramLogoDisplayed());
    }

    @When("^I click the Facebook link on the page$")
    public void iClickTheFacebookLinkOnThePage() {

        clickFacebookLink();
    }

    @When("^I click the twitter link on the page$")
    public void iClickTheTwitterLinkOnThePage() {

        clickTwitterLink();
    }

    @When("^I click the pinterest link on the page$")
    public void iClickThePinterestLinkOnThePage() {

        clickPinterestLink();
    }

    @When("^I click the Instagram link on the page$")
    public void iClickTheInstagramLinkOnThePage() {

        clickInstagramLink();
    }

    @And("^I verify the Partnerships logos are displayed on the page$")
    public void iVerifyThePartnershipsLogosAreDisplayedOnThePage() {

        Assert.assertTrue(isVerifyUSFederationLogoDisplayed());
        Assert.assertTrue(isVerifyPBRLogoDisplayed());
        Assert.assertTrue(isVerifyWSTRLogoDisplayed());
    }

    @And("^I verify the error message \"([^\"]*)\" is displayed below in the email field by entering the below listed invalid email into the email field$")
    public void iVerifyTheErrorMessageIsDisplayedBelowInTheEmailFieldByEnteringTheBelowListedInvalidEmailIntoTheEmailField(String errormsg, List<String> invalidemail) {

        Assert.assertTrue(isVerifyEmailFieldErrorMessage(errormsg, invalidemail));
    }

    @And("^I verify able to click the below listed Footer submenus and verify the appropriate page Url$")
    public void iVerifyAbleToClickTheBelowListedFooterSubmenusAndVerifyTheAppropriatePageUrl(DataTable datatable) {

        Assert.assertTrue(isVerifyFooterSubMenuItemIsDisplayedAndClickTheLink(datatable));
    }

    @When("^I click order Status submenu in Footer$")
    public void iClickOrderStatusSubmenuInFooter() {

        clickOrderStatusSubmenu();
    }

    @When("^I click My Account submenu in Footer$")
    public void iClickMyAccountSubmenuInFooter() {

        clickMyAccountSubmenu();
    }

    @And("^I verify that Copyrights text displayed on the page$")
    public void iVerifyThatCopyrightsTextDisplayedOnThePage() {

        Assert.assertTrue(isVerifyCopyRightsTextDisplayed());
    }

    @And("^I verify Size charts link is displayed on the Ariat Footer$")
    public void iVerifySizeChartsLinkIsDisplayedOnTheAriatFooter() {

        Assert.assertTrue(isVerifySizeChartsLinkDisplayed());
    }

    @When("^I click the Size chart link on the Ariat Footer$")
    public void iClickTheSizeChartLinkOnTheAriatFooter() {

        clickSizeChartsSubmenu();
    }

    @And("^I verify that Email Sign up submenu link displayed in the Footer$")
    public void iVerifyThatEmailSignUpSubmenuLinkDisplayedInTheFooter() {

        Assert.assertTrue(isVerifyEmailSignUpLinkDisplayed());
    }

    @When("^I click the Email Sign up submenu link$")
    public void iClickTheEmailSignUpSubmenuLink() {

        clickEmailSignUpLink();
    }

    @Then("^I verify the url \"([^\"]*)\" of the page$")
    public void iVerifyTheUrlOfThePage(String pageurl) {

        Assert.assertTrue(isVerifyPageUrl(pageurl));
    }

    @And("^I verify email text box, Sign up button and privacy policy link are displayed on the page$")
    public void iVerifyEmailTextBoxSignUpButtonAndPrivacyPolicyLinkAreDisplayedOnThePage() {

        Assert.assertTrue(isEmailTextBoxDisplayed());
        Assert.assertTrue(isSignUpButtonDisplayed());
        Assert.assertTrue(isVerifyPrivacyPolicyLinkDisplayed());
    }

    @And("^I verify the Email Signup field error message \"([^\"]*)\" is displayed below in the Join our family email field by entering the below listed invalid email Id into the email field$")
    public void iVerifyTheEmailSignupFieldErrorMessageIsDisplayedBelowInTheJoinOurFamilyEmailFieldByEnteringTheBelowListedInvalidEmailIdIntoTheEmailField(String errormsg, List<String> invalidemail)  {

        Assert.assertTrue(isVerifyEmailSignUpFieldErrorMessage(errormsg, invalidemail));
    }

    @When("^I click the Privacy Policy Link on the page$")
    public void iClickThePrivacyPolicyLinkOnThePage() {

        clickPrivacyPolicyLink();
    }

    @Then("^I verify that privacy policy page screen displayed$")
    public void iVerifyThatPrivacyPolicyPageScreenDisplayed() {

        Assert.assertTrue(isVerifyPrivacyPolicyPopupDisplayed());
    }

    @When("^I click the close on the privacy policy page screen$")
    public void iClickTheCloseOnThePrivacyPolicyPageScreen() {

        clickPrivacyPolicyCloseBtn();
    }


    @When("^I enter the valid Email Id \"([^\"]*)\" into the Email field$")
    public void iEnterTheValidEmailIdIntoTheEmailField(String emailId){

        enterEmailInEmailSignUpField(emailId);
    }

    @And("^I click the Sign Up button$")
    public void iClickTheSignUpButton() {

        clickSignUpButton();
    }

    @Then("^I verify that Thank You Success Popup screen displayed on the page$")
    public void iVerifyThatThankYouSuccessPopupScreenDisplayedOnThePage() {

        Assert.assertTrue(isVerifyThankYouTextDisplayedInPopupScreen());
    }

    @When("^I click the close button on the Screen$")
    public void iClickTheCloseButtonOnTheScreen() {

        clickClosebtnOnThankyouPopupScreen();
    }

    @When("^I click the Gift card link on Ariat Footer$")
    public void iClickTheGiftCardLinkOnAriatFooter() {

        clickGiftCardsLink();
    }

}
