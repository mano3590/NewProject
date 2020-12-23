package com.ariat.steps;

import com.ariat.pages.AboutUsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AboutUsStepDefinition extends AboutUsPage {

    @Then("^I verify the \"([^\"]*)\" title$")
    public void i_verify_the_title(String title) {

        Assert.assertTrue(isVerifyTitleOfPage(title));
    }

    @Then("^I verify the links are displayed on About us page$")
    public void i_verify_the_links_are_displayed_on_About_us_page(List<String> links) {

        Assert.assertTrue(isAboutUsPageLinksDisplayed(links));
    }

    @Then("^I verify widgets images are displayed on About us Page$")
    public void i_verify_widgets_images_are_displayed_on_About_us_Page() {

        Assert.assertTrue(isWidgetLinksDisplayed());
    }

    @When("^I clicks the CAREERS link on About us page$")
    public void i_clicks_the_CAREERS_link_on_About_us_page() {

        clickCarrerlink();
    }

    @When("^I clicks the GIVING link$")
    public void i_clicks_the_GIVING_link() {

        clickGivinglink();
    }

    @When("^I clicks the SUSTAINABILITY link on About us page$")
    public void i_clicks_the_SUSTAINABILITY_link_on_About_us_page() {
        clickSustainabilityLink();

    }

    @When("^I clicks the PRESS link$")
    public void i_clicks_the_PRESS_link() {

        clickPressLink();
    }

    @Then("^I verify widgets images are displayed on Ariat Giving Page$")
    public void i_verify_widgets_images_are_displayed_on_Ariat_Giving_Page() {

        Assert.assertTrue(isWidgetLinksDisplayed());
    }

}
