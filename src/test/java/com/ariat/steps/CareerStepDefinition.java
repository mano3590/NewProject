package com.ariat.steps;

import com.ariat.pages.CareerPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CareerStepDefinition extends CareerPage {

    @Then("^I verify the title \"([^\"]*)\" of the page$")
    public void i_verify_the_title_of_the_page(String title) {
        Assert.assertTrue(isVerifyTitleOfPage(title));
    }

    @Then("^I verify below listed widgets images are displayed on Carrers Page$")
    public void i_verify_below_listed_widgets_images_are_displayed_on_Carrers_Page(List<String> carrersimgs)  {
        Assert.assertTrue(isVerifyCarrersimgsDisplayed(carrersimgs));
    }

    @Then("^I verify below listed VIEW OPEN POSITIONS action buttons are displayed on Carrers Page$")
    public void i_verify_below_listed_VIEW_OPEN_POSITIONS_action_buttons_are_displayed_on_Carrers_Page(List<String> carrersbtnlinks)  {
        Assert.assertTrue(isVerifyCarrersBtnLinksDisplayed(carrersbtnlinks));
    }

    @When("^I clicks the \"([^\"]*)\" action buttons$")
    public void i_clicks_the_action_buttons(String actionbutton) {
        clickCarrersActionBtn(actionbutton);

    }

    @Then("^I verify that title \"([^\"]*)\" of the Career Oppertunities page$")
    public void iVerifyThatTitleOfTheCareerOppertunitiesPage(String title)  {

        Assert.assertTrue(isVerifyTitleOfCarrerPage(title));
    }
}
