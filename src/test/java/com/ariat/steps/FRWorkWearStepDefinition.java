package com.ariat.steps;

import com.ariat.pages.FRWorkWearPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FRWorkWearStepDefinition extends FRWorkWearPage {

    @When("^I click any one of the widget link from FR WorkWear widget links$")
    public void i_click_any_one_of_the_widget_link_from_FR_WorkWear_widget_links() {
        clickRandomFRWidgetLinksItem();
    }

    @And("^I verify that HomePage Banner Button displayed on the page$")
    public void iVerifyThatHomePageBannerButtonDisplayedOnThePage() {

        Assert.assertTrue(isVerifyFRWorkWearBannerButtonDisplayed());
    }

    @And("^I verify that Widgets, Widget links are displayed on the page$")
    public void iVerifyThatWidgetsWidgetLinksAreDisplayedOnThePage() {

        Assert.assertTrue(isVerifyFRWorkWearWidgetsDisplayed());
        Assert.assertTrue(isVerifyFRWorkWearWigetlinksDisplayed());
    }

    @And("^I verify able to click the Widgets and verify the selected widgets Names with Breadcrum displayed on the page$")
    public void iVerifyAbleToClickTheWidgetsAndVerifyTheSelectedWidgetsNamesWithBreadcrumDisplayedOnThePage() {

        Assert.assertTrue(clickAndVerifyFRWorkWearWidgets());
    }

    @And("^I verify that \"([^\"]*)\" Page header is displayed on the page$")
    public void iVerifyThatPageHeaderIsDisplayedOnThePage(String pageheader){

        Assert.assertTrue(isVerifyPageHeader(pageheader));
    }

    @When("^I click the Banner button on the page$")
    public void iClickTheBannerButtonOnThePage() {

        clickFRWorkWearbannerButton();
    }

}
