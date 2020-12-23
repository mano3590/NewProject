package com.ariat.steps;

import com.ariat.pages.ContactUsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ContactUsStepDefinition extends ContactUsPage {


    @When("^I click click here link on the contact Us page$")
    public void iClickClickHereLinkOnTheContactUsPage() {

        clickClickherelink();
    }

    @Then("^I verify the below listed contact info Headers are displayed on the page$")
    public void iVerifyTheBelowListedContactInfoHeadersAreDisplayedOnThePage(List<String> headers) {

        Assert.assertTrue(isVerifyContactHeadersDisplayed(headers));
    }
}
