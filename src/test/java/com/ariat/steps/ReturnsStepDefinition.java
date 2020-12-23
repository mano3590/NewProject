package com.ariat.steps;

import com.ariat.pages.ReturnsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ReturnsStepDefinition extends ReturnsPage {
    @Then("^I verify the buttons are displayed in the Returns page$")
    public void i_verify_the_buttons_are_displayed_in_the_Returns_page() throws Throwable {
        Assert.assertTrue(isButtonsDisplayedinReturn());

    }

    @When("^I click the \"([^\"]*)\" in the Return page$")
    public void i_click_the_in_the_Return_page(String buttonsAndLinks) throws Throwable {
        clickContentBox(buttonsAndLinks);
    }

    @When("^I click the \"([^\"]*)\" in the Content box$")
    public void i_click_the_in_the_Content_box(String Links) throws Throwable {
        clickContentBox(Links);
    }

    @Then("^I verify the \"([^\"]*)\" is displayed in the page$")
    public void i_verify_the_is_displayed_in_the_page(String Links) throws Throwable {
        Assert.assertTrue(isAllElementDisplayed(Links));
        scrollToTop();

    }

    @When("^I click the \"([^\"]*)\" minimize in the Return Page$")
    public void i_click_the_minimize_button_in_the_Return_Page(String Button) throws Throwable {
        clickContentBox(Button);

    }


}
