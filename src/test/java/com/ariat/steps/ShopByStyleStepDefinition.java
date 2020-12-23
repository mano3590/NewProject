package com.ariat.steps;

import com.ariat.pages.ShopByStylePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ShopByStyleStepDefinition extends ShopByStylePage {

    @When("^I click any one of the link from Product link listed on the page$")
    public void i_click_any_one_of_the_link_from_Product_link_listed_on_the_page()  {
        clickRandomProductLink();
    }

    @And("^I verify that Page header \"([^\"]*)\" is displayed on the page$")
    public void iVerifyThatPageHeaderIsDisplayedOnThePage(String pageheader) {

        Assert.assertTrue(isVerifyPage(pageheader));
    }

    @And("^I verify able to click the product links displayed on the page and verify the Url$")
    public void iVerifyAbleToClickTheProductLinksDisplayedOnThePageAndVerifyTheUrl() {

        Assert.assertTrue(clickAndVerifyProductLinks());
    }
}
