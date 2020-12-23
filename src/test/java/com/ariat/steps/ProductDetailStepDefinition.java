package com.ariat.steps;

import com.ariat.pages.ProductDetailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ProductDetailStepDefinition extends ProductDetailPage {
    @Then("^I verify that selected product is displayed on Product details page$")
    public void iVerifyThatSelectedProductIsDisplayedOnProductDetailsPage() {

        Assert.assertTrue(isSelectedProductDisplayed());
    }

    @Then("^I verify that selected Photo Block product is displayed on Product details page$")
    public void iVerifyThatSelectedPhotoBlockProductIsDisplayedOnProductDetailsPage() {

        Assert.assertTrue(isSelectedPhotoBlockProductDisplayed());
    }



    @And("^I click Add To Bag on Product details page$")
    public void iClickAddToBagOnProductDetailsPage() {

        clickAddToBagButton();
    }

    @When("^I select \"([^\"]*)\" of the product on Product details page$")
    public void iSelectOfTheProductOnProductDetailsPage(String productAttribute)  {

        selectAttributeValues(productAttribute);
    }


    @Then("^I verify that selected widget is displayed on Product details page$")
    public void i_verify_that_selected_widget_is_displayed_on_Product_details_page()  {
        Assert.assertTrue(isSelectedWidgetProductDisplayed());
    }

    @When("^I select \"([^\"]*)\" of the FR product on Product details page$")
    public void iSelectOfTheFRProductOnProductDetailsPage(String productAttribute)  {

        selectAttributeValues(productAttribute);
        getSelectedFRProductPrice();

    }


    @When("^I increase the Quantity of the product on Product details page$")
    public void I_increase_the_Quantity_of_the_product_on_Product_details_page()  {


        clickQtyIncrease();
    }


    @Then("^I verify that selected color is availabe on Product details page$")
    public void i_verify_that_selected_color_is_availabe_on_Product_details_page()  {
        isSelectedColorIsDisplayed();
    }

    @When("^I click the selected \"([^\"]*)\" of the product on Product details page$")
    public void i_click_the_selected_of_the_product_on_Product_details_page(String arg1)  {
        SelectFilterColor();
        isSelectedColorIsDisplayed();
    }

    @When("^I click and view the AfterPay info icon$")
    public void i_click_and_view_the_AfterPay_info_icon()  {
        clickAfterPay();
        clickAfterPayCloseBtn();
    }

    @When("^I select \"([^\"]*)\" of the Wish List product on Product details page$")
    public void iSelectOfTheWishListProductOnProductDetailsPage(String productAttribute)  {

        selectAttributeValues(productAttribute);
        getWishListProductPrice();

    }

    @When("^I click Wish List button on Product details page$")
    public void i_click_Wish_List_button_on_Product_details_page()  {
        clickWishListButton();
    }

    @Then("^I verify the \"([^\"]*)\" success message is displayed$")
    public void i_verify_the_success_message_is_displayed(String Successmsg)  {
        Assert.assertTrue(isTextContain(getText(txt_WishlistSuccessmsg),Successmsg));
    }

    @When("^I select size of the Product in Quick view page$")
    public void i_select_size_of_the_Product_in_Quick_view_page()  {
        selectSizeInQuickView();
    }

    @When("^I select color of the product in Quick view page$")
    public void i_select_color_of_the_product_in_Quick_view_page()  {
        selectColorInQuickView();
    }

    @When("^I click Edit link in the Product side bar$")
    public void iClickEditLinkInTheProductSideBar() {
        clickEditLinkInSlickSide();

    }

    @And("^I verify the slick slide pop up is displayed in the product list page$")
    public void iVerifyTheSlickSlidePopUpIsDisplayedInTheProductListPage() {
        Assert.assertTrue(isSlickSlidePopUpOpen());
    }

    @And("^I select the color of the product on Product slick slide pop up$")
    public void iSelectTheColorOfTheProductOnProductSlickSlidePopUp() {
        SelectColorInSlickSlidePopUp();
    }

    @And("^I get the product price in slickslideQuickView$")
    public void iGetTheProductPriceInSlickslideQuickView() {
        getPriceInSlickSlidePopUp();
    }

    @When("^I click the AfterPay info icon in the slick slide popup$")
    public void iClickTheAfterPayInfoIconInTheSlickSlidePopup() {
        clickAfterPayIconInSlickSlidePopUp();

    }

    @Then("^I verify the AfterPay info icon is displayed$")
    public void iVerifyTheAfterPayInfoIconIsDisplayed() {
        Assert.assertTrue(isAfterPayPopUpDisplayedInSlickSlidePopUp());
        clickAfterPayCloseBtn();
    }

    @And("^I click the update button in the slickslide popup$")
    public void iClickTheUpdateButtonInTheSlickslidePopup() {
        clickUpdateButtonInslickSlidePopUp();
        waitFor(5000);

    }

    @When("^I click Remove link in the Product slick slide$")
    public void iClickRemoveLinkInTheProductSlickSlide() {
        clickRemoveLinkInSlickSide();
    }


    @And("^I get the selected color in the slickslide popup$")
    public void iGetTheSelectedColorInTheSlickslidePopup() {

        getProductColorInSlickSlide();
    }


    @And("^I get the Product Quantity on Product details page$")
    public void iGetTheProductQuantityOnProductDetailsPage() {

        getProductQuantity();
    }

    @And("^I get the Product price in Quick view page$")
    public void iGetTheProductPriceInQuickViewPage() {

        getQuickviewProductPrice();
    }


    @And("^I verify the selected product name is displayed in the Bread crumb link$")
    public void iVerifyTheSelectedProductNameIsDisplayedInTheBreadCrumbLink() {
        Assert.assertTrue(isSelectedProductDisplayedInBreadCrumb());
    }

    @And("^I verify the Selected Product Image is Displayed in the Product Detail Page$")
    public void iVerifyTheProductImageIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isProductImageDisplayed());

    }

    @And("^I verify the Selected Menu is Displayed in the Product Detail Page$")
    public void iVerifyTheSelectedMenuIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isSelectedHeaderMenuDisplayedInProductedDetailPage());
    }


    @When("^I get the selected Product ID on Product details page$")
    public void iGetTheSelectedProductIDOnProductDetailsPage() {

        getProductId();
    }

    @And("^I verify the selected filter is displayed on Product detail page$")
    public void iVerifyTheSelectedFilterIsDisplayedOnProductDetailPage() {

        Assert.assertTrue(isVerifySelectedGendertextDisplayed());
    }


    @And("^I verify the product code is displayed in the Product Detail Page$")
    public void iVerifyTheProductCodeIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isProductCodeDisplayedInProductDetailPage());
    }


    @And("^I verify the Starts for the Product is displayed in the Product Detail Page$")
    public void iVerifyTheStartsForTheProductIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isProductStartsDisplayedInProductDetailPage());
        waitFor(5000);


    }

    @And("^I verify the Rating Value is displayed in the Product Detail Page$")
    public void iVerifyTheRatingValueIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isProductAverageRatingCountDisplayed());

    }

    @And("^I verify the Review Stars Count is displayed in the Product Detail Page as same in the Product List Page$")
    public void iVerifyTheReviewStarsCountIsDisplayedInTheProductDetailPageAsSameInTheProductListPage() {
        Assert.assertTrue(isReviewsCountMatchedInProductDetailPage());
    }

    @And("^I verify the Write a review link is displayed in Product Detail Page$")
    public void iVerifyTheWriteAReviewLinkIsDisplayedInProductDetailPage() {
        Assert.assertTrue(isWriteAReviewLinkDisplayed());

    }


    @And("^I verify the Review Stars Count is displayed in the Product Detail Page$")
    public void iVerifyTheReviewStarsCountIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isReviewCountDisplayed());
    }

    @And("^I verify the View Description link is displayed in Product Detail Page$")
    public void iVerifyTheViewDescriptionLinkIsDisplayedInProductDetailPage() {
        Assert.assertTrue(isViewDescriptionLinkDisplayed());
    }

    @And("^I verify the Color name is Displayed in the Product Detail Page$")
    public void iVerifyTheColorNameIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isSelectedProductColorNameDisplayed());
    }

    @And("^I verify the Product color Images are displayed in the Product Detail Page$")
    public void iVerifyTheProductColorImagesAreDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isProductColorsDisplayed());

    }

    @And("^I verify the Size DropDown and Width box are available in the Product Detail Page$")
    public void iVerifyTheSizeDropDownAndWidthBoxAreAvailableInTheProductDetailPage() {
        Assert.assertTrue(isSizeDropDownDisplayed());
        Assert.assertTrue(isWidthBoxDisplayed());
    }

    @And("^I verify the Product Prize is displayed in the Product Detail Page$")
    public void iVerifyTheProductPrizeIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isProductPriceDisplayed());

    }

    @And("^I verify the AfterPay logo and Info Icon are displayed in the Product Detail Page$")
    public void iVerifyTheAfterPayLogoAndInfoIconAreDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isAfterPayTextDisplayed());
        Assert.assertTrue(isAfterPayIconDisplayed());
    }


    @And("^I verify the Quantity Box, Increment and Decrement is displayed in the Product Detail Page$")
    public void iVerifyTheQuantityBoxIncrementAndDecrementIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isQuantityBoxDisplayed());
        Assert.assertTrue(isQuantityIncreaseButtopnDisplayed());
        Assert.assertTrue(isQuantityDecreaseButtonDisplayed());
    }

    @And("^I verify Add to Bag is Disabled in the Product Detail Page$")
    public void iVerifyAddToBagIsDisabledInTheProductDetailPage() {
        Assert.assertTrue(isSelectYourSizeButtonIsDisplayedInAddToBag());
    }

    @And("^I verify the Free Shipping and Free Returns Text is displayed in the Product Detail page$")
    public void iVerifyTheFreeShippingAndFreeReturnsTextIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isFreeShippingAndFreeReturnsTextDisplayed());
    }

    @And("^I verify the Descriptions and Specifications are Displayed in the Product Detail Page$")
    public void iVerifyTheDescriptionsAndSpecificationsAreDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isSpecificationsDetailDisplayed());
        Assert.assertTrue(isSpecificationTitleDisplayed());
        Assert.assertTrue(isDescriptionDetailsDisplayed());
        Assert.assertTrue(isDescriptionHeadingDisplayed());
    }


    @And("^I verify the Complete the Look Images, ProductNames, Product Prices, Review Starts and Review Counts are displayed in the Product Detail Page$")
    public void iVerifyTheCompleteTheLookImagesProductNamesProductPricesReviewStartsAndReviewCountsAreDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isCompleteTheLookTitleDisplayed());
        Assert.assertTrue(isCompleteTheLookImagesDisplayed());
        Assert.assertTrue(isCompleteTheLookProductNamesDisplayed());
        Assert.assertTrue(isCompleteTheLookPricesDisplayed());
        Assert.assertTrue(isCompleteTheLookProductStarsDisplayed());
        Assert.assertTrue(isCompleteTheLookProductReviewCountDisplayed());

    }

    @And("^I verify the You May Also Look Like Images, ProductNames, Product Prices, Review Starts and Review Counts are displayed in the Product Detail Page$")
    public void iVerifyTheYouMayAlsoLookLikeImagesProductNamesProductPricesReviewStartsAndReviewCountsAreDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isYouMayAlsoLookLikeTitleDisplayed());
        Assert.assertTrue(isYouMayAlsoLookLikeProductImagesDisplayed());
        Assert.assertTrue(isYouMayAlsoLookLikeProductNamesDisplayed());
        Assert.assertTrue(isYouMayAlsoLookLikeProductPricesDisplayed());
        Assert.assertTrue(isYouMayAlsoLookLikeProductStarsDisplayed());
        Assert.assertTrue(isYouMayAlsoLookLikeProductReviewCountDisplayed());
    }

    @And("^I verify the Reviews text and Write a Review button is displayed in the Product Detail Page$")
    public void iVerifyTheReviewsTextAndWriteAReviewButtonIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isReviewHeaderDisplayed());
        Assert.assertTrue(isReviewsContentDisplayed());

    }

    @And("^I verify the Recently viewed Images, ProductNames, Product Prices, Review Starts and Review Counts are displayed in the Product Detail Page$")
    public void iVerifyTheRecentlyViewedImagesProductNamesProductPricesReviewStartsAndReviewCountsAreDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isRecentlyViewedTitleDisplayed());
        Assert.assertTrue(isRecentlyViewedProductImagesDisplayed());
        Assert.assertTrue(isRecentlyViewedProductNamesDisplayed());
        Assert.assertTrue(isRecentlyViewedProductPricesDisplayed());
        Assert.assertTrue(isRecentlyViewedProductStarsDisplayed());
        Assert.assertTrue(isRecentlyViewedProductReviewCountsDisplayed());


    }


    @And("^I verify the Number of colors in the Product List Page and Product Detail Page are same$")
    public void iVerifyTheNumberOfColorsInTheProductListPageAndProductDetailPageAreSame() {
        Assert.assertTrue(isColorCountMatchedWithProductDetailPage());

    }

    @And("^I verify the Product Price in the Product List Page and Product Detail Page are same$")
    public void iVerifyTheProductPriceInTheProductListPageAndProductDetailPageAreSame() {
        Assert.assertTrue(isSelectedProductPriceMatchWithProductDetailPage());
    }

    @When("^I select anyone of the color images in the Product Detail Page$")
    public void iSelectAnyoneOfTheColorImagesInTheProductDetailPage() {
        selectColor();
    }


    @Then("^I verify the color Name has changed in the Product Detail Page$")
    public void iVerifyTheColorNameHasChangedInTheProductDetailPage() {
        Assert.assertTrue(isVerifyColorNameChanged());

    }

    @And("^I verify the Add to Bag button is enable in the Product detail page$")
    public void iVerifyTheAddToBagButtonIsEnableInTheProductDetailPage() {
        Assert.assertTrue(isAddToBagButtonEnable());

    }

    @And("^I click the selected Filter in size on Product details page$")
    public void iClickTheSelectedFilterInSizeOnProductDetailsPage() {
//          selectSizeInProductList();

    }

    @And("^I get the selected Product Color on Product details page$")
    public void iGetTheSelectedProductColorOnProductDetailsPage() {

        getSelectedProductColor();
    }
    @And("^I select any one of the Random product in the Product Details Page$")
    public void iSelectAnyOneOfTheRandomProductInTheProductDetailsPage() {
        selectAnyOneProductRandomlyInProductDetailPage();
    }

    @Then("^I verify the Selected Product Name is Displayed in the Product Detail Page$")
    public void iVerifyTheSelectedProductNameIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isRandomlySelectedProductNameDisplayed());
    }


    @Then("^I verify the Width is selected in the Product Detail Page$")
    public void iVerifyTheWidthIsSelectedInTheProductDetailPage() {
        Assert.assertTrue(isWidthSelected());
    }

    @Then("^I verify the Selected Product Name, Color, Size, Width, Quantity,Price, Style Code and Stock Availability is displayed in the Slick Slide bar in Product Detail Page$")
    public void iVerifyTheSelectedProductNameColorSizeWidthQuantityPriceStyleCodeAndStockAvailabilityIsDisplayedInTheSlickSlideBarInProductDetailPage() {
        Assert.assertTrue(isSelectedProductNameDisplayedInSlickSlidebar());
        Assert.assertTrue(isSelectedProductNameStyleCodeDisplayedInSlickSlide());
        Assert.assertTrue(isSelectedProductColorDisplayedInSlickSlide());
        Assert.assertTrue(isSelectedProductSizeDisplayedInSlickSlide());
        Assert.assertTrue(isSelectedProductWidthDisplayedInSlickSlide());
        Assert.assertTrue(isStockAvailabilityDisplayedInSlickSlide());
        Assert.assertTrue(isSelectedProductQuantityDisplayedInSlickSlide());
        Assert.assertTrue(isSelectedProductPriceDisplayedInSlickSlide());


    }

    @And("^I verify the Reviews text is displayed in the Product Detail Page$")
    public void iVerifyTheReviewsTextIsDisplayedInTheProductDetailPage() {
        Assert.assertTrue(isReviewHeaderDisplayed());
        
    }


    @And("^I verify Be the first to review this product text is displayed under the review text$")
    public void iVerifyBeTheFirstToReviewThisProductTextIsDisplayedUnderTheReviewText() {
        Assert.assertTrue(isBeTheFirstReviewTextDisplayed());
    }

    @And("^I verify the selected filter is displayed in product Specifications block on Product detail page$")
    public void iVerifyTheSelectedFilterIsDisplayedInProductSpecificationsBlockOnProductDetailPage() {

        Assert.assertTrue(isVerifySelectedFilterDisplayed());
    }
}