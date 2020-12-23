package com.ariat.steps;

import com.ariat.pages.ProductListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ProductListStepDefinition extends ProductListPage {

    @Then("^I verify the header \"([^\"]*)\" is displayed on Product list page$")
    public void iVerifyTheHeaderIsDisplayedOnTwProductListPage(String headerLabel)  {

        Assert.assertTrue(isProductListHeaderMatch(headerLabel));
    }

    @Then("^I verify the Header \"([^\"]*)\" is displayed on Product list page$")
    public void I_verify_the_Header_is_displayed_on_Product_list_page(String MenSubMenu)  {

        Assert.assertTrue(isProductListBreadCrumbMatchWithMenSubMenuHeader(MenSubMenu));
    }

    @Then("^I verify the Header Women \"([^\"]*)\" is displayed on Product list page$")
    public void I_verify_the_Header_Women_is_displayed_on_Product_list_page(String WomenSubMenu)  {
        Assert.assertTrue(isProductListBreadCrumbMatchWithWomenSubMenuHeader(WomenSubMenu));
    }

    @Then("^I verify the Header Kids \"([^\"]*)\" is displayed on Product list page$")
    public void I_verify_the_Header_Kids_is_displayed_on_Product_list_page(String KidsSubMenu)  {
        Assert.assertTrue(isProductListBreadCrumbMatchWithKidsSubMenuHeader(KidsSubMenu));
    }

    @Then("^I verify the Header Clearance \"([^\"]*)\" is displayed on Product list page$")
    public void I_verify_the_Header_Clearance_is_displayed_on_Product_list_page(String ClearanceSubMenu)  {
        Assert.assertTrue(isProductListBreadCrumbMatchWithClearanceSubMenuHeader(ClearanceSubMenu));
    }

    @Then("^I verify the Header New Arrivals \"([^\"]*)\" is displayed on Product list page$")
    public void I_verify_the_Header_New_Arrivals_is_displayed_on_Product_list_page(String NewArrivalsSubMenu)  {
        Assert.assertTrue(isProductListBreadCrumbMatchWithNewArrivalsSubMenuHeader(NewArrivalsSubMenu));
    }

    @Then("^I verify the Header Best Sellers \"([^\"]*)\" is displayed on Product list page$")
    public void I_verify_the_Header_Best_Sellers_is_displayed_on_Product_list_page(String BestSellersSubMenu)  {
        Assert.assertTrue(isProductListBreadCrumbMatchWithBestSellersSubMenuHeader(BestSellersSubMenu));
    }

    @Then("^I verify the header \"([^\"]*)\" \"([^\"]*)\" is displayed on Product list page$")
    public void iVerifyTheHeaderIsDisplayedOnProductListPage(String subMenu, String section) {

        Assert.assertTrue(isProductListHeaderMatchForSubmenuItem(subMenu, section));
    }

    @Then("^I verify that header \"([^\"]*)\" \"([^\"]*)\" is displayed on Product list page$")
    public void iVerifyThatHeaderIsDisplayedOnProductListPage(String subMenu, String section) {

        Assert.assertTrue(isProductListBreadCrumbMatchForSelectedSubmenuItem(subMenu, section));
    }

    @When("^I select any one product from Product list page$")
    public void iSelectAnyOneProductFromProductListPage() {

        selectRandomlyAnyProduct();
    }

    @Then("^I select any one product from Search Suggested Product list page$")
    public void i_select_any_one_product_from_Search_Suggested_Product_list_page()  {
        selectRandomProductFromSearchSuggestedProduct();
    }

    @Then("^I verify the selected widget header is displayed on Product list page$")
    public void i_verify_the_selected_widget_header_is_displayed_on_Product_list_page()  {
        Assert.assertTrue(isProductListHeaderMatchForSelectedFRWidget());
    }


    @When("^I select any one of the product from Product list page$")
    public void i_select_any_one_of_the_product_from_Product_list_page()  {
        selectRandomlyAnyProductInNewArrivals();
    }
    @Then("^I verify it navigates to the expected Product Search list Page$")
    public void i_verify_it_navigates_to_the_expected_Product_Search_list_Page()  {
        Assert.assertTrue(isSelectedWorkBannerButtonDisplay());
    }
    @When("^I click the Banner or the Product from the Search list page$")
    public void i_click_the_Banner_or_the_Product_from_the_Search_list_page()  {
        selectAnyProductOrBannerRandomly();
    }
    @Then("^I verify it navigates to the Product Search list Page$")
    public void i_verify_it_navigates_to_the_Product_Search_list_Page()  {
        Assert.assertTrue(isSelectedWorkWidgetMatched());
    }
    @Then("^I verify the Product list Page Title with the Selected Banner Button$")
    public void i_verify_the_Product_list_Page_Title_with_the_Selected_Banner_Button()  {
        Assert.assertTrue(isSelectedSustainabilityBannerButtonDisplay());
    }
    @Then("^I verify the BreadCrumb is match for the selected Banner button$")
    public void i_verify_the_BreadCrumb_is_match_for_the_selected_Banner_button()  {
        Assert.assertTrue(isProductListBreadCrumbMatchForSustainabilityBannerButton());
    }

    @When("^I apply the Random color Filters on Product List page$")
    public void i_apply_the_Random_color_Filters_on_Product_List_page()  {
        clickColorFilter();
    }

    @Then("^I verify the filter is applied on Product List page$")
    public void i_verify_the_filter_is_applied_on_Product_List_page()  {

        Assert.assertTrue(isSelectedFilterIsDisplayed());
    }

    @Then("^I verify the filter is displayed on Product List page$")
    public void i_verify_the_filter_is_displayed_on_Product_List_page()  {

        Assert.assertTrue(isSelectedFilterNameDisplayed());
    }

    @Then("^I verify the selected Product Name is displayed on Product list page$")
    public void i_verify_the_selected_Product_Name_is_displayed_on_Product_list_page()  {

        Assert.assertTrue(isProductListHeaderMatchForSeletedProductLink());
    }

    @When("^I click any one of the Banner link on the page$")
    public void i_click_any_one_of_the_Banner_link_on_the_page()  {
        selectRandomDenimBannerLink();

    }

    @Then("^I verify the \"([^\"]*)\" is displayed on Product list page$")
    public void i_verify_the_is_displayed_on_Product_list_page(String PageHeader)  {
        Assert.assertTrue(isProductListHeaderMatch(PageHeader));
    }

    @When("^I click any one of the category on the Product List Page$")
    public void i_click_any_one_of_the_category_on_the_Product_List_Page()  {
        clickRandomProductCategory();
    }

    @Then("^I verify the selected category is displayed in the Product list page Breadcrumb$")
    public void i_verify_the_selected_category_is_displayed_in_the_Product_list_page_Breadcrumb()  {
        Assert.assertTrue(isProductListBreadCrumbMatchwithSelectedProductCategoryItem());
    }

    @When("^I click Quick View link in any one of the product from Product list page$")
    public void i_click_Quick_View_link_in_any_one_of_the_product_from_Product_list_page()  {
        selectRandomlyAnyDenimProduct();
    }

    @When("^I apply any Random Filter in the Product List Page$")
    public void i_apply_any_Random_Filter_in_the_Product_List_Page()  {
        clickRandomFilter();
        clickRandomSubFilter();

    }

    @Then("^I verify the FilterName is Displayed as per the selection$")
    public void i_verify_the_FilterName_is_Displayed_as_per_the_selection()  {

        Assert.assertTrue(isSelectedFilterDisplayed());

    }

    @When("^I click any one of the quick view from the product Search List Page$")
    public void i_click_any_one_of_the_quick_view_from_the_product_Search_List_Page()  {
        selectProductFromQuickView();
    }

    @Then("^I verify the header is displayed on Product list page$")
    public void iVerifyTheHeaderIsDisplayedOnProductListPage() {
        Assert.assertTrue(isHeaderMatchForKidsFootwearLink());

    }

    @Then("^I verify the selected subMenu Items is displayed in BreadCrumbs on Product list page$")
    public void iVerifyTheSelectedSubMenuItemsIsDisplayedInBreadCrumbsOnProductListPage() {
        Assert.assertTrue(isHeaderMatchForMenFeatured());
    }

    @Then("^I verify that selected product is displayed on Product list page$")
    public void iVerifyThatSelectedProductIsDisplayedOnProductListPage() {
        Assert.assertTrue(isProductListHeaderMatchWithSelectedCategoryProductName());
    }

    @Then("^I verify Product list page Url contains \"([^\"]*)\"$")
    public void iVerifyProductListPageUrlContains(String searchkeyword)  {

        Assert.assertTrue(verifyUrl(searchkeyword));

    }

    @When("^I click the \"([^\"]*)\" Filter on Product list page$")
    public void iClickTheFilterOnProductListPage(String productfiltername) {

        clickProductFilter(productfiltername);
    }

    @And("^I click the \"([^\"]*)\" price filter$")
    public void iClickThePriceFilter(String productinnerfiltername) {

        clickInnerProductFilter(productinnerfiltername);
    }

    @Then("^I Verify user able to click \"([^\"]*)\" from the SortBy drop down list and verify the displayed products are sorted as per the selection$")
    public void iVerifyUserAbleToClickFromTheSortByDropDownListAndVerifyTheDisplayedProductsAreSortedAsPerTheSelection(String dropdownitem) {

        Assert.assertTrue(verifyProductPriceSorting(dropdownitem));
    }

    @And("^I verify the listed products price are displayed under \"([^\"]*)\" on Product list page$")
    public void iVerifyTheListedProductsPriceAreDisplayedUnderOnProductListPage(String filterprice){

        Assert.assertTrue(verifyProductPrice(filterprice));
    }

    @And("^I verify the Sortby drop down is displayed on the Product List Page$")
    public void iVerifyTheSortbyDropDownIsDisplayedOnTheProductListPage() {

        Assert.assertTrue(verifySortbyDisplayed());
    }

    @When("^I click Sortby drop down on the Product List Page$")
    public void iClickSortbyDropDownOnTheProductListPage() {

        clickProductSortBy();
    }

    @And("^I click \"([^\"]*)\" from the drop down list Items$")
    public void iClickFromTheDropDownListItems(String dropdownlistitems) {

        clickProductDropdownItem(dropdownlistitems);
    }

    @And("^I verify the \"([^\"]*)\" text is displayed on the Product List Page$")
    public void iVerifyTheTextIsDisplayedOnTheProductListPage(String categorytitle) {

        Assert.assertTrue(isVerifyCategorytextDisplayed(categorytitle));
    }


    @And("^I verify product are listed in the Product list page$")
    public void iVerifyProductAreListedInTheProductListPage() {

        Assert.assertTrue(isVerifyProductDisplayed());
    }

    @When("^I verify Product color count, rating stars, star count, Product Name and Product price are displayed on the Product image$")
    public void i_verify_Product_color_count_rating_stars_star_count_Product_Name_and_Product_price_are_displayed_on_the_Product_image() {
        Assert.assertTrue(isVerifyColorCountDisplayedOnProduct());
        Assert.assertTrue(isVerifyProductStarRatingsDisplayedOnProduct());
        Assert.assertTrue(isVerifyProductStarRatingsCountDisplayedOnProduct());
        Assert.assertTrue(isVerifyProductNameDisplayedOnProduct());
        Assert.assertTrue(isVerifyProductPriceDisplayedOnProduct());


    }

    @And("^I verify that able to view the Product Quick view popup screen by clicking the QuickView on the product image$")
    public void iVerifyThatAbleToViewTheProductQuickViewPopupScreenByClickingTheQuickViewOnTheProductImage() {

        Assert.assertTrue(clickAndVerifyProductQuickDisplayedOnProduct());
    }

    @And("^I verify Product colour swatches images are displayed on the product image$")
    public void iVerifyProductColourSwatchesImagesAreDisplayedOnTheProductImage() {
        Assert.assertTrue(isVerifyColourSwatchesDisplayedOnProduct());
    }

    @And("^I verify able to click the More Results Button and products are displayed as per the selection in the page$")
    public void iVerifyAbleToClickTheMoreResultsButtonAndProductsAreDisplayedAsPerTheSelectionInThePage() {

        Assert.assertTrue(verifyMoreResults());

    }

    @And("^I verify \"([^\"]*)\" text is displayed on the Product list page$")
    public void iVerifyTextIsDisplayedOnTheProductListPage(String text) {

        Assert.assertTrue(isVerifyFilterTextDisplayed(text));
    }

    @When("^I click the filters listed on the Product list Page$")
    public void iClickTheFiltersListedOnTheProductListPage() {

        clickFilter();
    }

    @And("^I verify that Banner image is displayed on the top of the page$")
    public void iVerifyThatBannerImageIsDisplayedOnTheTopOfThePage() {

        Assert.assertTrue(isVerifyBannerImgDisplayed());
    }

    @And("^I verify that Banner contains carousel button$")
    public void iVerifyThatBannerContainsCarouselButton() {

        Assert.assertTrue(isVerifyBannerPreviousCarouselBtnDisplayed());
        Assert.assertTrue(isVerifyBannerNextCarouselBtnDisplayed());
    }

    @And("^I click the Banner Image on the Product list page$")
    public void iClickTheBannerImageOnTheProductListPage() {

        clickBannerImage();
    }

    @Then("^I verify that products are displayed on the Product list Page$")
    public void iVerifyThatProductsAreDisplayedOnTheProductListPage() {

        Assert.assertTrue(isVerifyProductListsDisplayed());
    }

    @When("^I click the Next carousel button on the Banner image displayed in the product list page$")
    public void iClickTheNextCarouselButtonOnTheBannerImageDisplayedInTheProductListPage() {

        clickNextCarouselBtnOnBannerImg();
    }

    @Then("^I verify able to click the \"([^\"]*)\" dropdown and verify Products are displayed as per the selection$")
    public void iVerifyAbleToClickTheDropdownAndVerifyProductsAreDisplayedAsPerTheSelection(String dropdownitems){

        Assert.assertTrue(verifyNewArrivalsProductSorting(dropdownitems));

    }

    @And("^I verify that Breadcrum link displayed on the page$")
    public void iVerifyThatBreadcrumLinkDisplayedOnThePage() {

        Assert.assertTrue(isVerifyBreadCrumLinkDisplayed());
    }

    @And("^I verify that Product search results count is displayed on the Page$")
    public void iVerifyThatProductSearchResultsCountIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifyProductSearchResultsCountDisplayed());
    }

    @And("^I verify that Categories list displayed on the page$")
    public void iVerifyThatCategoriesListDisplayedOnThePage() {

        Assert.assertTrue(isVerifyCategorieslistDisplayed());
    }

    @And("^I verify that Pagination is displayed on the page$")
    public void iVerifyThatPaginationIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifyPaginationDisplayed());
    }

    @And("^I verify that Filters is displayed on the page$")
    public void iVerifyThatFiltersIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifyFilterDisplayed());
    }

    @And("^I verify that More Result Button is displayed on the page$")
    public void iVerifyThatMoreResultButtonIsDisplayedOnThePage() {

        Assert.assertTrue(isVerifyMoreResultButtonDisplayed());
    }

    @And("^I verify that Back To Top Displayed on the page$")
    public void iVerifyThatBackToTopDisplayedOnThePage() {

        Assert.assertTrue(isVerifyBackToTopBtnDisplayed());
    }

    @And("^I verify able to click the Back To Top Button and verify that page scroll up$")
    public void iVerifyAbleToClickTheBackToTopButtonAndVerifyThatPageScrollUp() {
        clickBackToTopBtn();
    }

    @And("^I verify that Denim Product Filter links are displayed on the top of the page$")
    public void iVerifyThatDenimProductFilterLinksAreDisplayedOnTheTopOfThePage() {

        Assert.assertTrue(isVerifyDenimProductFilterLinksDisplayed());
    }

    @And("^I verify that Denim Product Filter images are displayed on the top of the page$")
    public void iVerifyThatDenimProductFilterImagesAreDisplayedOnTheTopOfThePage() {

        Assert.assertTrue(isVerifyDenimProductFilterImgDisplayed());
    }

    @And("^I verify that Denim Product Filter Names are displayed on the top of the page$")
    public void iVerifyThatDenimProductFilterNamesAreDisplayedOnTheTopOfThePage() {

        Assert.assertTrue(isVerifyDenimProductFilterTextsDisplayed());
    }

    @And("^I verify user able to click the Filter images & selected Filter name is displayed and verify Products are displayed on the page$")
    public void iVerifyUserAbleToClickTheFilterImagesSelectedFilterNameIsDisplayedAndVerifyProductsAreDisplayedOnThePage() {

        Assert.assertTrue(clickAndVerifyDenimProductFilter());
    }

    @And("^I verify able to click the pagination and verify the products are displayed on the page$")
    public void iVerifyAbleToClickThePaginationAndVerifyTheProductsAreDisplayedOnThePage() {

       Assert.assertTrue(isVerifyPagination());
    }

    @When("^I click Gender filter from Product list page$")
    public void iClickGenderFilterFromProductListPage() {

        clickGenderFilter();
    }

    @And("^I click any one of the Random SubFilter in the Product List Page$")
    public void iClickAnyOneOfTheRandomSubFilterInTheProductListPage() {
        clickInnerProductFilterInSelectedFilter();

    }

    @Then("^I verify the Selected Filter is displayed in the Product List page$")
    public void iVerifyTheSelectedFilterIsDisplayedInTheProductListPage() {
        Assert.assertTrue(isSelectedSubFilterDisplayedInProductListPage());
    }

    @Then("^I verify the Url of the Page$")
    public void iVerifyTheUrlOfThePage() {

        Assert.assertTrue(isVerifyProductPageUrl());
    }

    @Then("^I verify the Header is displayed in the Page$")
    public void iVerifyTheHeaderIsDisplayedInThePage() {
        Assert.assertTrue(isVerifySelectedMenuDisplayed());
    }

    @And("^I select the less than one review Count product in the Product List Page$")
    public void iSelectTheLessThanOneReviewCountProductInTheProductListPage() {
        selectLessthanOneReviewCountProduct();
        waitFor(5000);

    }

    @Then("^I verify the selected New and Best header \"([^\"]*)\" is displayed on Product list page$")
    public void iVerifyTheSelectedNewAndBestHeaderIsDisplayedOnProductListPage(String section) {

        Assert.assertTrue(isProductListHeaderMatchForSelectedNewAndBestSubmenuItem(section));
    }

    @And("^I click the SortBy dropdown and select the \"([^\"]*)\" from the dropdown list$")
    public void iClickTheSortByDropdownAndSelectTheFromTheDropdownList(String sortbyItems) {

        clickProductSortBy();
        clickProductDropdownItem(sortbyItems);
    }

    @When("^I click the \"([^\"]*)\" filter in Product list page$")
    public void iClickTheFilterinProductListPage(String filterItems) {

        clickProductFilters(filterItems);
    }

    @And("^I click the inner \"([^\"]*)\" filter on Product list page$")
    public void iClickTheInnerFilterOnProductListPage(String innerfilterItems)  {

        clickInnerFilters(innerfilterItems);
    }

    @Then("^I verify that \"([^\"]*)\" badge tag is displayed on the listed products$")
    public void iVerifyThatBadgeTagIsDisplayedOnTheListedProducts(String badgename)  {

        isVerifyProductImgNewBadgeDisplayed(badgename);
    }
}
