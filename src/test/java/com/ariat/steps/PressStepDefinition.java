package com.ariat.steps;

import com.ariat.pages.PressPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class PressStepDefinition extends PressPage {

    @Then("^I verify For Inquire and Block images are displayed in the page$")
    public void i_verify_For_Inquire_and_Block_images_are_displayed_in_the_page()  {
        Assert.assertTrue(verifyForInquireBlockDisplayed());
        Assert.assertTrue(isPressBlockImagesDisplayed());
    }

    @Then("^I verify ReadMore Links are displayed in the page$")
    public void i_verify_ReadMore_Links_are_displayed_in_the_page()  {
        Assert.assertTrue(isPressReadMoreDisplayed());
    }


}
