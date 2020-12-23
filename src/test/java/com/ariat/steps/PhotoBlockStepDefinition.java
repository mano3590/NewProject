package com.ariat.steps;

import com.ariat.pages.PhotoBlockPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PhotoBlockStepDefinition extends PhotoBlockPage {

    @Then("^I verify that selected photo block lightbox screen is displayed on the page$")
    public void i_verify_that_selected_photo_block_lightbox_screen_is_displayed_on_the_page() {

        Assert.assertTrue(isSelectedPhotoLightBoxDisplayed());

    }

    @When("^I select the displayed product on photo block lightbox screen$")
    public void i_select_the_displayed_product_on_photo_block_lightbox_screen(){


        clickBuyNowButton();
    }


    @And("^I verify that selected photo block lightbox screen contains Close Button, Next and Previous carousel Button$")
    public void iVerifyThatSelectedPhotoBlockLightboxScreenContainsCloseButtonNextAndPreviousCarouselButton() {

        Assert.assertTrue(verifySelectedPhotoLightBoxCloseBtnDisplayed());
        Assert.assertTrue(verifySelectedPhotoLightBoxNextBtnDisplayed());
        Assert.assertTrue(verifySelectedPhotoLightBoxPreviousBtnDisplayed());

    }
}
