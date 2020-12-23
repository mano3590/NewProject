package com.ariat.steps;

import com.ariat.pages.MyOrdersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.text.ParseException;
import java.util.List;

public class MyOrdersStepDefinition extends MyOrdersPage {

    @Then("^I verify the Order Number is displayed in My Orders page$")
    public void i_verify_the_Order_Number_is_displayed_in_My_Orders_page()  {

        Assert.assertTrue(isOrderNumberDisplayedInMyOrdersPage());

    }

    @Then("^I verify the Date Ordered,total price,total Items and Product Name are same in My Orders Page$")
    public void i_verify_the_Date_Ordered_total_price_total_Items_and_Product_Name_are_same_in_My_Orders_Page()  {
        Assert.assertTrue(isTotalDisplayedInMyOrdersPage());
        Assert.assertTrue(isOrderedDateDisplayedInMyOrdersPage());
        Assert.assertTrue(isTotalItemsDisplayedInMyOrdersPage());
        Assert.assertTrue(isSelectedProductNameDisplayedInMyOrdersPage());


    }

    @And("^I verify the Order Details title is displayed in the page$")
    public void iVerifyTheOrderDetailsTitleIsDisplayedInThePage() {


        Assert.assertTrue(isOrderDetailsTitleDisplay());
    }

    @Then("^I verify the Order Number, Date Ordered,total price,total Items, Product Name and ProductItems are same in Order Detail Page$")
    public void iVerifyTheOrderNumberDateOrderedTotalPriceTotalItemsProductNameAndProductItemsAreSameInOrderDetailPage() {
        Assert.assertTrue(isOrderNoDisplayedInOrderDetailPage());
        Assert.assertTrue(isOrderedDateDisplayedInOrderDetailPage());
        Assert.assertTrue(isProductNameDisplayedInOrderDetailPage());
        Assert.assertTrue(isProductPriceDisplayedInOrderDetailPage());
        Assert.assertTrue(isTotalItemsDisplayedInOrderDetailPage());
        Assert.assertTrue(isGrandTotalDisplayedInOrderDetailPage());
    }

    @When("^I click the My Orders dropdown on the page$")
    public void iClickTheMyOrdersDropdownOnThePage() {

        clickOrderHistoryDropdown();
    }

    @And("^I click the \"([^\"]*)\" from the dropdown list item$")
    public void iClickTheFromTheDropdownListItem(String myorderdropdownlistitem) throws ParseException {

//        clickMyorderdropdownItems(myorderdropdownlistitem);
        verifyMyOrderdropdown(myorderdropdownlistitem);
    }

    @Then("^I verify the \"([^\"]*)\" text is displayed on the page$")
    public void iVerifyTheTextIsDisplayedOnThePage(String header) {

        Assert.assertTrue(verifyAccountHelpHeaders(header));

    }

    @And("^I verify the \"([^\"]*)\" link is displayed on the page$")
    public void iVerifyTheLinkIsDisplayedOnThePage(String linkname) {

        Assert.assertTrue(verifyContactuslink(linkname));
    }

    @When("^I click the Contact us link on the page$")
    public void iClickTheContactUsLinkOnThePage() {

        clickContactuslink();
    }

    @And("^I verify the Customer Service contact Number and Mail id displayed on the page$")
    public void iVerifyTheCustomerServiceContactNumberAndMailIdDisplayedOnThePage() {
        Assert.assertTrue(verifyCustomerServiceContactNumber());
        Assert.assertTrue(verifyCustomerServiceEmail());

    }

    @And("^I verify the Order No is displayed all the listed order Items on the Page$")
    public void iVerifyTheOrderNoIsDisplayedAllTheListedOrderItemsOnThePage() {

        Assert.assertTrue(verifyOrderNoIsDisplayed());
    }

    @And("^I verify the Order Detail link is displayed all the listed order Items on the Page$")
    public void iVerifyTheOrderDetailLinkIsDisplayedAllTheListedOrderItemsOnThePage() {

        Assert.assertTrue(verifyOrderDetaillinkIsDisplayed());
    }

    @And("^I verify the below listed texts are displayed all the listed order Items on the Page$")
    public void iVerifyTheBelowListedTextsAreDisplayedAllTheListedOrderItemsOnThePage(List<String> orderdetailtexts) {

        Assert.assertTrue(verifyOrderTextsDisplayed(orderdetailtexts));

    }

    @And("^I verify the Total No of Items text is displayed all the listed order Items on the Page$")
    public void iVerifyTheTotalNoOfItemsTextIsDisplayedAllTheListedOrderItemsOnThePage() {

        Assert.assertTrue(verifyNoItemTextDisplayed());
    }

    @And("^I verify the Total Price of the Product is displayed all the listed order Items on the Page$")
    public void iVerifyTheTotalPriceOfTheProductIsDisplayedAllTheListedOrderItemsOnThePage() {

        Assert.assertTrue(verifyProductTotalPriceDisplayed());
    }


    @And("^I get random Order Details in My Orders Page and verify the Selected Order details are displayed in Order Detail Page$")
    public void IgetrandomOrderDetailsinMyOrdersPageandverifytheSelectedOrderdetailsaredisplayedinOrderDetailPage() {

//        Assert.assertTrue(clickAndVerifyOrderlink(pageheader));
        getOrderDetails();
        Assert.assertTrue(isVerifySelectedOrderNumberDisplayed());
        Assert.assertTrue(isVerifySelectedOrderDateDisplayed());
        Assert.assertTrue(isVerifySelectedOrderStatusDisplayed());
        Assert.assertTrue(isVerifySelectedOrderProductCountDisplayed());
        Assert.assertTrue(isVerifySelectedOrderProductTotalpriceDisplayed());
        Assert.assertTrue(isVerifySelectedProductNamesDisplayed());

    }

    @When("^I verify the selected order details are displayed in Order detail Page$")
    public void iVerifyTheSelectedOrderDetailsAreDisplayedInOrderDetailPage() {


    }
}
