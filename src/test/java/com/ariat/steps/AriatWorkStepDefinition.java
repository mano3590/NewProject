package com.ariat.steps;

import com.ariat.pages.AriatWorkPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AriatWorkStepDefinition extends AriatWorkPage{

        @When("^I click any one of the Widget Link randomly from ShopByWork$")
        public void i_click_any_one_of_the_Widget_Link_randomly_from_ShopByWork() {
            clickAnyWidgetLinkRandomly();
        }

    @And("^I verify that able to click the Banner Image & Widgets and verify its navigate to appropriate page$")
    public void iVerifyThatAbleToClickTheBannerImageWidgetsAndVerifyItsNavigateToAppropriatePage() {

        Assert.assertTrue(clickAndVerifyBannerAndWidgets());
    }

    @And("^I verify that able to click the Banner button and verify its navigate to appropriate page$")
    public void iVerifyThatAbleToClickTheBannerButtonAndVerifyItsNavigateToAppropriatePage() {

         Assert.assertTrue(clickAndVerifyBannerButtons());
    }
}
