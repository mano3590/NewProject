package com.ariat.steps;

import com.ariat.pages.Two24HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Two24HomeStepDefinition extends Two24HomePage {

    @When("^I click \"([^\"]*)\" link on Two24 Home page$")
    public void iClickLinkOnTwoHomePage(String button)  {

        selectBannerButton(button);
    }

}

