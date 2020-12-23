package com.ariat.steps;

import com.ariat.pages.AriatGivingPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class AriatGivingStepDefinition extends AriatGivingPage {

    @Then("^I verify the title of the \"([^\"]*)\" page$")
    public void i_verify_the_title_of_the_page(String title) throws Throwable {
        Assert.assertTrue(isVerifyTitleOfPage(title));
    }
}
