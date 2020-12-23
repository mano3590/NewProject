package com.ariat.steps;

import com.ariat.pages.SecureCheckoutCompletePage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SecureCheckoutCompleteStepDefinition extends SecureCheckoutCompletePage {
    @Then("^I verify the grand Total of Secure Checkout page and Checkout Complete page are same$")
    public void i_verify_the_grand_Total_of_Secure_Checkout_page_and_Checkout_Complete_page_are_same() {
        Assert.assertTrue(isVerifyGrandTotalAndTotalSameOnCheckoutComplete());
    }

    @Then("^I get the OrderNo, OrderedDate and Total Items in Checkout Complete page$")
    public void i_get_the_OrderNo_OrderedDate_and_Total_Items_in_Checkout_Complete_page() {
        getOrderNumberOrderedDateAndTotalNoOfOrderedItems();


    }
}
