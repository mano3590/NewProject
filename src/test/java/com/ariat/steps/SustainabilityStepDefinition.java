package com.ariat.steps;

import com.ariat.pages.SustainabilityPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SustainabilityStepDefinition extends SustainabilityPage {

    @Then("^I verify the title \"([^\"]*)\" of the selected Shop Button page$")
    public void iVerifythetTitleOfTheselectedShopButtonPage(String title)  {

        Assert.assertTrue(isVerifyTitleOfPage(title));
    }


    @When("^I click the below listed \"([^\"]*)\"$")
    public void iclickthebelowlisted(String shopbuttons)  {
        clickShopButtons(shopbuttons);
    }
}
