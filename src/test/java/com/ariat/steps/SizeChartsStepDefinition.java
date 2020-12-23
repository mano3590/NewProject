package com.ariat.steps;

import com.ariat.pages.SizeChartsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class SizeChartsStepDefinition extends SizeChartsPage {

    @And("^I verify that Size charts box-accordions are displayed on the page$")
    public void iVerifyThatSizeChartsBoxAccordionsAreDisplayedOnThePage(List<String> boxaccordionsnames) {

        Assert.assertTrue(isVerifySizeChartsBoxAccordionsDisplayed(boxaccordionsnames));

    }

    @And("^I verify able to click \"([^\"]*)\" Size charts and able to click below listed subsections and verify the selected Size charts header$")
    public void iVerifyAbleToClickSizeChartsAndAbleToClickBelowListedSubsectionsAndVerifyTheSelectedSizeChartsHeader(String boxaccordionsnames, List<String> subsections) {

        Assert.assertTrue(isVerifySizeChartsBoxAccordionsSubSectionsDisplayed(boxaccordionsnames,subsections));
    }

}
