package com.ariat.pages;

import com.ariat.pagefactory.ProductListPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductListPage extends ProductListPageFactory {

    public static String selectedProductName, selectedProductPrice, selectedProductColorCount, selectedFilterColorName, selectedCategoryName, selectedFilterName, selectedSubFilterName, selectedFilter, selectedFilterFirstName, selectedDisplayedSubFilterName,selectedCategoryProFirstName,selectedCategoryProSecondName, selectedproductinnerfiltername, selectedDenimFilterName,selectedGenderFilterNameselectedProductAverageCount, selectedFilterInProductList, selectedSubFilterInProductList,selectedGenderFilterName,selectedProductAverageCount, selectedInnnerFilterName, selectedNoReviewPRoductName;

    public ProductListPage(){

        PageFactory.initElements(driver, this);
    }

    public boolean isProductListHeaderMatch(String header){

        return isElementTextMatch(lbl_ProductListHeader, header);
    }

    public boolean isProductListHeaderMatchForSubmenuItem(String subMenu, String section){

        return isTextContain(getText(lbl_ProductListHeader), subMenu.toUpperCase()+" "+HeaderPage.selectedSubMenuItem.toUpperCase());
    }

    public boolean isProductListHeaderMatchForSelectedNewAndBestSubmenuItem(String section){

        return isTextContain(getText(lbl_ProductListHeader), HeaderPage.selectedSubMenuItem.toUpperCase()+"'S"+" "+section.toUpperCase());
    }

    /**
     * In This method need to improvise based on the stock availability and selecting the product
     */
    public void selectRandomlyAnyProduct(){
        waitForLoadIconDisappear();
        int randomProduct = getRandomNumber(lst_ProductName);
        selectedProductName = getText(lst_ProductName.get(randomProduct));
        selectedProductPrice = getText(lst_ProductPrice.get(randomProduct));
        selectedProductColorCount = getIntegerValue(getText(lst_ProductColor.get(randomProduct)));
        selectedProductAverageCount = getText(lst_StarsCountOnProduct.get(randomProduct));
        logger.info("Selected Product +++ Product Name - "+selectedProductName+"\n"+"Product Price - "+selectedProductPrice
                +"\n"+"Product Color Available - "+selectedProductColorCount);
        clickButton(lst_ProductImg.get(randomProduct));
    }

    public void clickRandomFilter(){
        int randomFilterList = getRandomNumber(lst_Filters.size());
        selectedFilterName = getText(lst_Filters.get(randomFilterList));
        click(lst_Filters.get(randomFilterList));
        waitFor(3000);
        String[] FilterName= selectedFilterName.split(" ",selectedFilterName.length());
        selectedFilterFirstName = FilterName[0];
        String filter =selectedFilterFirstName.toLowerCase();
        selectedFilter = filter.substring(0, 1).toUpperCase() + filter.substring(1);
    }


    public void clickRandomSubFilter(){

        String xpath =  "//div[@class='refinement-body']//div[contains(text(),'"+selectedFilter+"')]//following::div[contains(@class,'collapse') and contains(@aria-labelledby,'"+selectedFilter+"')]//li//button";
        List<WebElement> subFilters =driver.findElements(By.xpath(xpath));
        int randomSubFilterList = getRandomNumber(subFilters.size());
        String selectedSubFilter = getText(subFilters.get(randomSubFilterList));
        click(subFilters.get(randomSubFilterList));
        String[] SubFilterName =selectedSubFilter.split("\n");
        selectedSubFilterName=SubFilterName[0];
        waitFor(4000);
    }

    public boolean isSelectedFilterDisplayed()
    {
        String xpath="//li[@class='filter-value']//button[contains(@data-datalayer,'"+selectedSubFilterName+"')]";
        WebElement element =  driver.findElement(By.xpath(xpath));
        scrollToTop();
        String DisplayedFilter=getText(element);
        String[] DisplayedFilterName =DisplayedFilter.split("\n");
        selectedDisplayedSubFilterName=DisplayedFilterName[0];
        return selectedDisplayedSubFilterName.equalsIgnoreCase(selectedSubFilterName);
    }

    public void selectProductFromQuickView()
    {
        int randomProduct = getRandomNumber(lst_ProductName);
        selectedProductName = getText(lst_ProductName.get(randomProduct));
        selectedProductPrice = getText(lst_ProductPrice.get(randomProduct));
        selectedProductColorCount = getIntegerValue(getText(lst_ProductColor.get(randomProduct)));
        logger.info("Selected Product +++ Product Name - "+selectedProductName+"\n"+"Product Price - "+selectedProductPrice
                +"\n"+"Product Color Available - "+selectedProductColorCount);
        waitFor(2000);
        mouseOver(lst_ProductName.get(randomProduct));
        waitFor(3000);
        click(lst_QuickView.get(randomProduct));
        waitFor(2000);

    }

    public void selectRandomProductFromSearchSuggestedProduct(){
        int randomProduct = getRandomNumber(lst_SearchSuggestedProductName.size());
        selectedProductName = getText(lst_SearchSuggestedProductName.get(randomProduct));
        selectedProductPrice = getText(lst_SearchSuggestedProductPrice.get(randomProduct));
        logger.info("Selected Product +++ Product Name - "+selectedProductName+"\n"+"Product Price - "+selectedProductPrice);
        clickButton(lst_SearchSuggestedProductImg.get(randomProduct));
    }

    public boolean isProductListBreadCrumbMatchForSelectedSubmenuItem(String subMenu, String section){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'"+HeaderPage.selectedSubMenuItem+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(section);
    }


    public boolean isProductListHeaderMatchForSelectedFRWidget(){
        if(FRWorkWearPage.selectedWidgetLinkName.equals("FR BASE & MIDLAYERS")){
            FRWorkWearPage.selectedWidgetLinkName = "FR MIDLAYERS";

        } else if(FRWorkWearPage.selectedWidgetLinkName.equals("FR WOMEN'S")){
            FRWorkWearPage.selectedWidgetLinkName = "WOMEN'S FLAME RESISTANT";
        }
        return isTextContain(getText(lbl_ProductListHeader),FRWorkWearPage.selectedWidgetLinkName);
    }

    public boolean isSelectedProductDisplayed(){

        return isTextContain(getText(lbl_ProductListHeader),AriatHomePage.selectBannerButton.toUpperCase());
    }

    public void selectRandomlyAnyProductInNewArrivals(){

        int randomProduct = getRandomNumber(lst_ProductName);
        selectedProductName = getText(lst_ProductName.get(randomProduct));
        selectedProductPrice = getText(lst_ProductPrice.get(randomProduct));
        logger.info("Selected Product +++ Product Name - "+selectedProductName+"\n"+"Product Price - "+selectedProductPrice);
        clickButton(lst_ProductImg.get(randomProduct));
    }

    public Boolean isSelectedWorkBannerButtonDisplay()
    {
        return isTextContain(getText(lbl_ProductListHeader).toUpperCase(),AriatHomePage.selectedWorkBanner);
    }

    public void selectAnyProductOrBannerRandomly()
    {
        if(isElementDisplayed(img_workTopBanner))
        {
            clickButtonWithOutScroll(btn_WorkBannerArrow);
            clickButtonWithOutScroll(img_workTopBanner);
            selectRandomlyAnyProduct();

        }
        else
        {
            selectRandomlyAnyProduct();
        }
    }

    public boolean isSelectedWorkWidgetMatched(){

        return isTextContain(getText(lbl_ProductListHeader), AriatWorkPage.selectedWidgetLinkSecondName);
    }

    public boolean isSelectedSustainabilityBannerButtonDisplay()
    {
        return isTextContain(getText(lbl_ProductListHeader).toUpperCase(),FooterPage.selectedBannerButton);
    }


    public boolean isProductListBreadCrumbMatchForSustainabilityBannerButton(){
        return isTextContain(getText(lnk_BreadCrumb),FooterPage.selectedBannerButton);
    }

    public boolean isProductListBreadCrumbMatchWithMenSubMenuHeader(String MenSubMenu){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'Ariat')]//following::li//a[@class='breadcrumb-link' and contains(text(),'Men')]//following::li//a[@class='breadcrumb-link' and contains(text(),'"+MenSubMenu+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(MenSubMenu);
    }

    public boolean isProductListBreadCrumbMatchWithWomenSubMenuHeader(String WomenSubMenu){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'Ariat')]//following::li//a[@class='breadcrumb-link' and contains(text(),'Women')]//following::li//a[@class='breadcrumb-link' and contains(text(),'"+WomenSubMenu+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(WomenSubMenu);
    }

    public boolean isProductListBreadCrumbMatchWithKidsSubMenuHeader(String KidsSubMenu){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'Ariat')]//following::li//a[@class='breadcrumb-link' and contains(text(),'Kids')]//following::li//a[@class='breadcrumb-link' and contains(text(),'"+KidsSubMenu+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(KidsSubMenu);
    }

    public boolean isProductListBreadCrumbMatchWithClearanceSubMenuHeader(String ClearanceSubMenu){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'Ariat')]//following::li//a[@class='breadcrumb-link' and contains(text(),'Clearance')]//following::li//a[@class='breadcrumb-link' and contains(text(),'"+ClearanceSubMenu+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(ClearanceSubMenu);
    }

    public boolean isProductListBreadCrumbMatchWithNewArrivalsSubMenuHeader(String NewArrivalsSubMenu){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'Ariat')]//following::li//a[@class='breadcrumb-link' and contains(text(),'New Arrivals')]//following::li//a[@class='breadcrumb-link' and contains(text(),'"+NewArrivalsSubMenu+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(NewArrivalsSubMenu);
    }

    public boolean isProductListBreadCrumbMatchWithBestSellersSubMenuHeader(String BestSellersSubMenu){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'Ariat')]//following::li//a[@class='breadcrumb-link' and contains(text(),'Best Sellers')]//following::li//a[@class='breadcrumb-link' and contains(text(),'"+BestSellersSubMenu+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(BestSellersSubMenu);
    }

    public void clickColorFilter(){
        click(lnk_ColorFilter);
        int randomProduct = getRandomNumber(lst_insideColorFilter.size());
        selectedFilterColorName = getText(lst_FilterColorName.get(randomProduct));
        waitFor(2000);
        click(lst_insideColorFilter.get(randomProduct));
    }

    public void clickGenderFilter(){
        click(lnk_GenderFilter);
        int randomProduct = getRandomNumber(lst_insideGenderFilter.size());
        selectedInnnerFilterName = getText(lst_GenderInnerFilters.get(randomProduct));
        waitFor(2000);
        click(lst_insideGenderFilter.get(randomProduct));
    }

    public void clickProductFilters(String filteritems){
        String xpath = "//div[contains(@class,'float-left') and text()='"+filteritems+"']";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
    }

    public void clickInnerFilters(String innerfilterItems){
        waitFor(2000);
       List <WebElement> innerfilterelements = driver.findElements(By.xpath("//div[@aria-labelledby='"+innerfilterItems+"']//button"));
        int randomProduct = getRandomNumber(innerfilterelements.size());
        String xpath = "//div[@aria-labelledby='"+innerfilterItems+"']//span[@class='refinement-value ']";
        List<WebElement> selectedinnerfilterelements = driver.findElements(By.xpath(xpath));
        selectedInnnerFilterName = getText(selectedinnerfilterelements.get(randomProduct));
      clickButtonWithOutScroll(innerfilterelements.get(randomProduct));
    }

    public boolean isSelectedFilterIsDisplayed(){
        scrollByPixelTop();
        waitForAriatLoadIconDisappear();
        String xpath =  "//li[@class='filter-value']//button[contains(@data-datalayer,'"+selectedproductinnerfiltername+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean isSelectedFilterNameDisplayed(){
        scrollByPixelTop();
        waitForAriatLoadIconDisappear();
        waitFor(2000);
        String xpath =  "//li[@class='filter-value']//button[contains(@data-datalayer,'"+selectedInnnerFilterName+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

    public boolean isProductListHeaderMatchForSeletedProductLink(){

        return isTextContain(ShopByStylePage.selectedProductLinkName.toUpperCase(),getText(lbl_ProductListHeader));
    }

    public void selectRandomDenimBannerLink(){

        int randomProduct = getRandomNumber(lst_DenimBannerlinkimg.size());
        click(lst_DenimBannerlinkimg.get(randomProduct));
    }

    public void clickRandomProductCategory(){

        int randomProduct = getRandomNumber(lst_ProductCategory.size());
        selectedCategoryName = getText(lst_CategoryName.get(randomProduct));
        waitFor(2000);
        scrollToElement(txt_Category);
        click(lst_ProductCategory.get(randomProduct));
    }

    public boolean isProductListBreadCrumbMatchwithSelectedProductCategoryItem(){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'"+selectedCategoryName+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return getText(element).equalsIgnoreCase(selectedCategoryName);
    }

    public void selectRandomlyAnyDenimProduct(){

        int randomProduct = getRandomNumber(lst_ProductName);
        selectedProductName = getText(lst_ProductName.get(randomProduct));
        selectedProductPrice = getText(lst_ProductPrice.get(randomProduct));
        selectedProductColorCount = getIntegerValue(getText(lst_ProductColor.get(randomProduct)));
        logger.info("Selected Product +++ Product Name - "+selectedProductName+"\n"+"Product Price - "+selectedProductPrice
                +"\n"+"Product Color Available - "+selectedProductColorCount);
        waitFor(2000);
        mouseOver(lst_ProductName.get(randomProduct));
        waitFor(3000);
        click(lst_QuickView.get(randomProduct));
        waitFor(2000);
        click(lnk_ViewDescription);
    }

    public boolean isHeaderMatchForKidsFootwearLink()
    {
        return isTextContain(getText(lnk_BreadCrumbKidsFootwear),HeaderPage.selectedSubMenuItemInKids.toUpperCase());

    }


    public boolean isHeaderMatchForMenFeatured()
    {
        return isTextContain(getText(lnk_BreadCrumb),HeaderPage.selectedSubMenuItemInFeaturedMen.toUpperCase());

    }

    public void SelectedCategoryProductNameIsDisplayed() {
        String[] selectedCategoryProName = HeaderPage.selectedCategoryProductName.split("in");
        selectedCategoryProFirstName = selectedCategoryProName[0].trim();
        selectedCategoryProSecondName = selectedCategoryProName[1].trim();
    }

    public boolean isProductListHeaderMatchWithSelectedCategoryProductName() {
        boolean flag = true;
        SelectedCategoryProductNameIsDisplayed();
        waitVisibilityOfElement(lbl_ProductListHeader);
        if (!(isTextContain(getText(lbl_ProductListHeader), selectedCategoryProFirstName.toUpperCase()) || isTextContain(getText(lbl_ProductListHeader), selectedCategoryProSecondName.toUpperCase()))) {
            if (!(isTextContain(getText(txt_BreadCrum),selectedCategoryProFirstName.toUpperCase()) || isTextContain(getText(txt_BreadCrum),selectedCategoryProSecondName.toUpperCase()))) {
                flag = false;
            }

        }
        return flag;
    }


    public boolean verifyUrl(String searchkeyword){
        String Url = driver.getCurrentUrl();
        return isTextContain(Url,searchkeyword);
    }

    public void clickProductFilter(String productfiltername){

        String xpath = "//div[@class='refinement-body']//div[contains(text(),'"+productfiltername+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        selectedFilterInProductList = productfiltername;
        clickButtonWithOutScroll(element);
    }

    public void clickInnerProductFilter(String productinnerfiltername){
        waitFor(2000);
        String xpath = "//div[@class='refinement-body']//following::div[text()='Price']//following::div//span[@aria-hidden='true' and contains(text(),'"+productinnerfiltername+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        selectedproductinnerfiltername = getText(element);
        clickButtonWithOutScroll(element);
    }

    public boolean verifyProductPrice(String filterprice){
        int filterpricevalue = Integer.parseInt(filterprice.substring(1));
        waitFor(3000);
        boolean flag = true;
        for (int i=0; i<lst_ProductPrice.size();i++){
            float productprice = Float.parseFloat(lst_ProductPrice.get(i).getText().substring(1));
            if(!(productprice <filterpricevalue)){
                logger.info("listed products are greater than the Specified Price");
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void clickProductSortBy(){

        clickButtonWithOutScroll(ddl_ProductSortByDropdown);
    }

    public boolean verifySortbyDisplayed(){

        return isElementDisplayed(ddl_ProductSortByDropdown);
    }

    public void clickProductDropdownItem(String dropdownitem){
        waitFor(3000);
        String xpath = "//button[@id='sortbyDropdown']//following::div[@aria-labelledby='sortbyDropdown']//a[contains(text(),'"+dropdownitem+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
    }

    public boolean verifyProductPriceSorting(String dropdownitem){
        boolean flag = false;
        List<Float> aftersortedtheproductlistedPrice = new ArrayList<>();
        List<Float> sortedtheproductlistedPrice = new ArrayList<>();
        clickProductSortBy();
        clickProductDropdownItem(dropdownitem);
        waitFor(3000);
        for (int i=0; i<lst_ProductPrice.size();i++){

            aftersortedtheproductlistedPrice.add(Float.parseFloat(lst_ProductPrice.get(i).getText().substring(1)));
        }

        for (int i=0; i<lst_ProductPrice.size();i++){

            sortedtheproductlistedPrice.add(Float.parseFloat(lst_ProductPrice.get(i).getText().substring(1)));
        }
        Collections.sort(sortedtheproductlistedPrice);

        if (!aftersortedtheproductlistedPrice.equals(sortedtheproductlistedPrice)){

            flag = false;

            logger.info("Listed Products are Not Sorted as per the selected dropdown");
        }

       return flag;
    }

    public boolean verifyNewArrivalsProductSorting(String dropdownitem){
        boolean flag = false;
        clickProductSortBy();
        clickProductDropdownItem(dropdownitem);
        waitFor(2000);
        for (int i=0; i<lst_ProductImg.size();i++) {
            if (isElementDisplayed(lst_ProductImg.get(i))) {
//            if(lst_Badge.get(i).isDisplayed()){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
     return flag;
    }

    public boolean isVerifyCategorytextDisplayed(String categorytitle){
        waitFor(3000);
      return (getText(txt_Categorytext).equalsIgnoreCase(categorytitle));
    }

    public void clickCategoryList(){

        for (int i=0; i<lst_Categorieslist.size();i++){

            clickButtonWithOutScroll(lst_Categorieslist.get(i));

        }
    }

    public boolean isVerifyProductDisplayed() {
        boolean flag = false;
        for (int i = 0; i < lst_ProductList.size(); i++) {
            if (isElementDisplayed(lst_ProductList.get(i))) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isVerifyColorCountDisplayedOnProduct() {
        boolean flag = false;
        for (int i = 0; i < lst_ProductColor.size(); i++) {
            if (isElementDisplayed(lst_ProductColor.get(i))) {
                flag = true;
            }
            else {
               flag = false;
               break;
            }
        }
        return flag;
    }

    public boolean isVerifyProductNameDisplayedOnProduct() {
        boolean flag = false;
        for (int i = 0; i < lst_ProductName.size(); i++) {
            if (isElementDisplayed(lst_ProductName.get(i))) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isVerifyProductPriceDisplayedOnProduct() {
        boolean flag = false;
        for (int i = 0; i < lst_ProductPrice.size(); i++) {
            if (isElementDisplayed(lst_ProductPrice.get(i))) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isVerifyProductStarRatingsDisplayedOnProduct() {
        boolean flag = false;
        for (int i = 0; i < lst_StarsOnProduct.size(); i++) {
            if (isElementDisplayed(lst_StarsOnProduct.get(i))) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isVerifyProductStarRatingsCountDisplayedOnProduct() {
        boolean flag = false;
        for (int i = 0; i < lst_StarsCountOnProduct.size(); i++) {
            if (isElementDisplayed(lst_StarsCountOnProduct.get(i))) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean clickAndVerifyProductQuickDisplayedOnProduct() {
        boolean flag = false;
        for (int j = 0; j < lst_QuickView.size(); j++) {
            mouseOver(lst_ProductList.get(j));
            if(isElementDisplayed(lst_QuickView.get(j))){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
            clickButtonWithOutScroll(lst_QuickView.get(j));
            if (isElementDisplayed(popup_QuickView)) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
            waitForAriatLoadIconDisappear();
            waitVisibilityOfElement(Btn_QuickViewCloseBtn);
            waitFor(2000);
            clickButtonWithOutScroll(Btn_QuickViewCloseBtn);
        }
        return flag;
    }

    public boolean isVerifyColourSwatchesDisplayedOnProduct() {
        boolean flag = false;
        for (int i = 0; i < lst_ProductColor.size(); i++) {
            String[] colorcount = lst_ProductColor.get(i).getText().split(" ");
            String selectedcolorcount = colorcount[0];
            int selectproductcolorcount = Integer.parseInt(selectedcolorcount);
            if (!selectedcolorcount.isEmpty() && selectproductcolorcount > 1) {
                waitFor(4000);
                mouseOver(lst_ProductColor.get(i));
                for (int j = 0; j < lst_colourswatches.size(); j++) {
                    if (isElementDisplayed(lst_colourswatches.get(j))) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    break;

                }

            }

        }
        return flag;
    }


    public boolean isVerifyMoreResultBtnDisplayed(){

        return isElementDisplayed(Btn_MoreResults);
    }


    public boolean verifyMoreResults(){

        boolean flag = false;
        String[] productcount = getText(txt_ProductCount).split(" ");
        String selectedProductcount = productcount[0];
        int displayedProductcount = Integer.parseInt(selectedProductcount);
        int listedproductcount = lst_ProductImg.size();

        while (listedproductcount<displayedProductcount){
            waitForAriatLoadIconDisappear();
            waitVisibilityOfElement(Btn_MoreResults);
            clickButtonWithOutScroll(Btn_MoreResults);
            waitFor(2000);
            listedproductcount = lst_ProductImg.size();
        }


        int displayedlistedproductcount = lst_ProductImg.size();
        if(displayedlistedproductcount==displayedProductcount) {
            flag = true;
        }
        return flag;
    }

    public boolean isVerifyFilterTextDisplayed(String text){
        return isTextContain(getText(txt_Filters),text.toUpperCase());
    }


    public void clickFilter(){

        for (int i=0; i<lst_Filter.size();i++){
            System.out.println(lst_Filter.get(i).getText());
            waitFor(2000);
            clickButtonWithOutScroll(lst_Filter.get(i));
            for (int j=0;j<lst_InnerFilters.size();j++){
                System.out.println(lst_InnerFilters.get(j).getText());
                waitFor(2000);
                clickButtonWithOutScroll(lst_InnerFilters.get(j));
            }
        }

    }

    public void clickInnerProductFilterInSelectedFilter(){
        String xpath =  "//div[@class='refinement-body']//div[contains(text(),'"+selectedFilterInProductList+"')]//following::div[contains(@class,'collapse') and contains(@aria-labelledby,'"+selectedFilterInProductList+"')]//li//button";
        List<WebElement> subFilters =driver.findElements(By.xpath(xpath));
        int randomSubFilterList = getRandomNumber(subFilters.size());
       String selectedFilterName = getText(subFilters.get(randomSubFilterList));
        click(subFilters.get(randomSubFilterList));
        waitFor(4000);
        String[] SubFilterName =selectedFilterName.split("\n");
        selectedSubFilterInProductList=SubFilterName[0];
        waitFor(4000);
    }

    public boolean isSelectedSubFilterDisplayedInProductListPage()
    {
        String xpath="//li[@class='filter-value']//button[contains(@data-datalayer,'"+selectedSubFilterInProductList+"')]";
        WebElement element =  driver.findElement(By.xpath(xpath));
        scrollToTop();
        String DisplayedFilter=getText(element);
        String[] DisplayedFilterName =DisplayedFilter.split("\n");
        selectedDisplayedSubFilterName=DisplayedFilterName[0];
        return selectedDisplayedSubFilterName.equalsIgnoreCase(selectedSubFilterInProductList);
    }



    public boolean isVerifyBannerImgDisplayed(){

       return isElementDisplayed(img_workTopBanner);
    }


    public boolean isVerifyBannerPreviousCarouselBtnDisplayed(){

        return isElementDisplayed(Btn_BannerPreviousBtn);
    }

    public boolean isVerifyBannerNextCarouselBtnDisplayed(){

        return isElementDisplayed(Btn_BannerNextBtn);
    }

    public void clickBannerImage(){

        clickButtonWithOutScroll(img_workTopBanner);
    }

    public boolean isVerifyProductListsDisplayed(){

        boolean flag = false;
        for (int i=0; i<lst_ProductImg.size();i++){

            if (isElementDisplayed(lst_ProductImg.get(i))){

                flag = true;
            } else{

                flag = false;
                break;
            }
        }
    return flag;
    }

    public void clickNextCarouselBtnOnBannerImg(){

        clickButtonWithOutScroll(Btn_BannerNextBtn);
    }

    public boolean isVerifyBreadCrumLinkDisplayed(){

       return isElementDisplayed(lnk_BreadCrumb);
    }


    public boolean isVerifyProductSearchResultsCountDisplayed(){

        return isElementDisplayed(txt_ProductCount);
    }


    public boolean isVerifyCategorieslistDisplayed(){

       return isElementDisplayed(lst_Categorieslist);
    }

    public boolean isVerifyPaginationDisplayed(){

        return isElementDisplayed(ddl_Pagination);
    }

    public boolean isVerifyFilterDisplayed(){

        return isElementDisplayed(lst_FilterBlock);
    }

    public boolean isVerifyMoreResultButtonDisplayed(){

        return isElementDisplayed(Btn_MoreResults);
    }

    public boolean isVerifyBackToTopBtnDisplayed(){
        scrollToElement(Btn_BackToTopButton);
        return isElementDisplayed(Btn_BackToTopButton);
    }

    public void clickBackToTopBtn(){

        clickButtonWithOutScroll(Btn_BackToTopButton);
    }


    public boolean isVerifyDenimProductFilterLinksDisplayed(){

        boolean flag = false;

        for (int i=0; i<lst_DenimFilterLinks.size();i++){

            if (isElementDisplayed(lst_DenimFilterLinks.get(i))){

                flag = true;
            }else{

                flag = false;
                break;
            }
        }
       return flag;
    }


    public boolean isVerifyDenimProductFilterTextsDisplayed(){

        boolean flag = false;

        for (int i=0; i<lst_DenimFiltertext.size();i++){

            if (isElementDisplayed(lst_DenimFiltertext.get(i))){

                flag = true;
            }else{

                flag = false;
                break;
            }
        }
        return flag;
    }


    public boolean isVerifyDenimProductFilterImgDisplayed(){

        boolean flag = false;

        for (int i=0; i<lst_DenimFilterImg.size();i++){

            if (isElementDisplayed(lst_DenimFilterImg.get(i))){

                flag = true;
            }else{

                flag = false;
                break;
            }
        }
        return flag;
    }


    public boolean clickAndVerifyDenimProductFilter(){
        boolean flag = false;
        for (int i=0; i<lst_DenimFilterImg.size();i++){
            selectedDenimFilterName = getText(lst_DenimFiltertext.get(i));
            waitFor(2000);
            clickButtonWithOutScroll(lst_DenimFilterImg.get(i));

            if (isVerifySelectedDenimFilterDisplayed()){

                flag = true;

            }else {

                flag = false;
                break;
            }
            if (!isVerifyProductsDisplayed()){
                flag = false;
                break;
            }
            clickClearAllFilter();
        }
        return flag;
    }

    public boolean isVerifySelectedDenimFilterDisplayed(){

        return getText(txt_appliedFilter).equalsIgnoreCase(selectedDenimFilterName);
    }

    public void clickClearAllFilter(){

        clickButtonWithOutScroll(lnk_ClearAllFilter);
    }

    public boolean isVerifyProductsDisplayed(){

        boolean flag = false;
        for (int i=0; i<lst_ProductImg.size();i++){

           if (isElementDisplayed(lst_ProductImg.get(i))){
                flag = true;

            }else{

               flag = false;
               break;
           }
        }
    return flag;
    }


    public boolean clickAndVerifyFilters(){

        boolean flag = false;
        for (int i=0; i<lst_ProductFilters.size();i++){

            clickButtonWithOutScroll(lst_ProductFilters.get(i));

        }
return flag;
    }


    public boolean isVerifyPagination(){
        boolean flag = false;
        int displayedproductcounts = 0;
//        String productcount =  txt_ProductSearchResultCount.getAttribute("data-product-search-count");
        String[] productcount = getText(txt_ProductCount).split(" ");
        String selectedProductcount = productcount[0];
        int displayedproductsearchresultcount = Integer.parseInt(selectedProductcount);
        clickButtonWithOutScroll(ddl_Pagination);
        for (int i=0; i<ddl_paginationdropdownitems.size();i++){
            waitFor(2000);
        clickButtonWithOutScroll(ddl_paginationdropdownitems.get(i));
            waitFor(2000);
        int displayedproductcount = lst_ProductImg.size();
        displayedproductcounts = displayedproductcounts+displayedproductcount;
        waitFor(3000);
        System.out.println(displayedproductcount);
        System.out.println(displayedproductcounts);
        if (displayedproductcounts==displayedproductsearchresultcount){
            flag = true;
            break;
        }
            clickButtonWithOutScroll(ddl_Pagination);
    }
    return flag;
    }

    public boolean isVerifyProductPageUrl(){

        String currentUrl = driver.getCurrentUrl();
        return FRWorkWearPage.pageUrl.equalsIgnoreCase(currentUrl);
    }
    public boolean isVerifySelectedMenuDisplayed()
    {
        return getText(lbl_ProductListHeader).equalsIgnoreCase(HeaderPage.selectedMenu);
    }

    public void selectLessthanOneReviewCountProduct()
    {
        String noReviews = "(0)";
        String xpath = "//div[@class='bv_text' and contains(text(),'"+noReviews+"')]//preceding::div[@class='pdp-link']//child::span";
        List<WebElement> lst_ProductName = driver.findElements(By.xpath(xpath));
        waitFor(2000);
        if(!lst_ProductName.isEmpty()) {
            int randomProduct = getRandomNumber(lst_ProductName);
            selectedProductName = getText(lst_ProductName.get(randomProduct));
            selectedProductPrice = getText(lst_ProductPrice.get(randomProduct));
            selectedProductAverageCount = getText(lst_StarsCountOnProduct.get(randomProduct));
            clickButton(lst_ProductImg.get(randomProduct));
        }
        else
        {
            clickButtonWithOutScroll(Btn_MoreResults);
            String xpath1 = "//div[@class='bv_text' and contains(text(),'"+noReviews+"')]//preceding::div[@class='pdp-link']//child::span";
            List<WebElement> lst_ProductNames = driver.findElements(By.xpath(xpath1));
            int randomProduct = getRandomNumber(lst_ProductNames);
            selectedProductName = getText(lst_ProductNames.get(randomProduct));
            selectedProductPrice = getText(lst_ProductPrice.get(randomProduct));
            selectedProductAverageCount = getText(lst_StarsCountOnProduct.get(randomProduct));
            clickButton(lst_ProductImg.get(randomProduct));
        }
    }

    public boolean isVerifyProductImgNewBadgeDisplayed(String badgename){
        boolean flag = false;
        for (int i=0; i<lst_productImages.size(); i++){
            if (getText(lst_productBadgeId.get(i)).equalsIgnoreCase(badgename)){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
   return flag;
    }


}


