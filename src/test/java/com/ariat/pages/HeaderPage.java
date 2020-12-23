package com.ariat.pages;

import com.ariat.pagefactory.HeaderPageFactory;
import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HeaderPage extends HeaderPageFactory {

    private final String TWO24_SITE = "two24";
    private final String ARIAT_SITE = "ariat";
    public static String selectedSubMenuItem, selectedSubMenuItemInKids, selectedSubMenuItemInFeaturedMen, selectedCategoryProductName,selectedsubmenuItems,selectedcategoryname, selectedMenuItem, selectedMenu;
    private final String MEN = "Men";
    private final String WOMEN = "Women";
    private final String KIDS = "Kids";
    private final String CLEARANCE = "Clearance";
    private final String KID_CLOTHING = "Clothings";
    private final String CLEARANCE_KID_CLOTHING = "Clearance Clothing";
    private final String CLEARANCE_MEN_CLOTHING = "Clearance Men Clothing";
    private final String FOOTWEAR = "Footwear";
    private final String CLOTHING = "Clothing";
    private final String ACCESSORIES = "Accessories";
    private final String SHOP_BY_WORK = "ShopByWork";
    private final String NEWARRIVALS = "New Arrivals";
    private final String BEST_SELLERS = "Best Sellers";
    private final String NEW_BEST = "New Best";
    private final String ARIAT_WORK_SITE = "ariat work";
    private final String KID_FOOTWEAR = "Kid Footwear";
    private final String MEN_FEATURED = "Men Featured";
    private final String FEATURED = "Featured";
    private final String WORK = "Work";
    private final String DENIM = "Denim";
    private final String JEANS = "jeans";
    private final String FRWORKWEAR ="FR Workwear";
    private final String WOMEN_FOOTWEAR = "Women Footwear";
    private final String NEW_ARRIVALS = "New Arrivals";

    public HeaderPage() {

        PageFactory.initElements(driver, this);
    }

    public boolean isAriatInternationalLogoDisplayed() {

        return isElementDisplayed(logo_AriatInternational);
    }

    public void acceptCookie() {

        setImplicit(2);
        if (isElementDisplayed(popup_Subscriptionpopup)) {

            clickButtonWithOutScroll(btn_SubscriptionCloseButton);
        }
        clickButtonWithOutScroll(btn_AcceptButton);
        setDefaultExplicit();
    }

    public void clickSignInButton() {

        clickButtonWithOutScroll(btn_SignIn);
    }

    public void selectSite(String site) {

        switch (site.toLowerCase()) {

            case ARIAT_SITE:
                clickButtonWithOutScroll(lnk_Ariat);
                break;
            case TWO24_SITE:
                clickButtonWithOutScroll(lnk_Two24);
                break;
            case ARIAT_WORK_SITE:
                clickButtonWithOutScroll(lnk_AriatWork);
                break;
            default:
                logger.info("Enter Site not Not Implemented");
        }
    }

    public void clickViewCartIcon() {

        waitFor(2000);
        clickButtonWithOutScroll(icon_ViewCart);
    }

    public void mouseOverSubMenu(String subMenu) {

        WebElement element = null;
        switch (subMenu) {

            case MEN:
                element = lnk_MenSubmenu;
                break;
            case WOMEN:
                element = lnk_WomenSubMenu;
                break;
            case KIDS:
                element = lnk_KidsSubMenu;
                break;
            case CLEARANCE:
                element = lnk_ClearanceSubMenu;
                break;
            case NEWARRIVALS:
                element = lnk_NewArrivals;
                break;
            case BEST_SELLERS:
                element = lnk_BestSellers;
                break;
            case NEW_BEST:
                element = lnk_NewandBest;
                break;
            default:
                logger.info("Enter Submenu Not Available");
        }
        mouseOver(element);
        selectedMenuItem = getText(element);
    }

    public void clickSubMenuItemBySection(String subMenu, String section) {

        mouseOverSubMenu(subMenu);
        switch (section) {

            case FOOTWEAR:
                clickFootwearItem();
                break;
            case WOMEN_FOOTWEAR:
                clickWomenFootwearItem();
                break;
            case CLOTHING:
                clickClothingItem();
                break;
            case KID_CLOTHING:
                clickKidsClothingItem();
                break;
            case CLEARANCE_KID_CLOTHING:
                clickClearanceClothingItem();
                break;
            case CLEARANCE_MEN_CLOTHING:
                clickClearanceMenClothingItem();
                break;
            case ACCESSORIES:
                clickAccessoriesItem();
                break;
            case SHOP_BY_WORK:
                clickShopByWork();
                break;
            case KID_FOOTWEAR:
                clickKidsFootwearItems();
                break;
            case MEN_FEATURED:
                clickMenFeaturedItems();
                break;
            case WORK:
                clickWorkSubmenu();
                break;
            case DENIM:
                clickDenimSubmenu();
                break;
            case JEANS:
                clickJeansSubmenu();
                break;
            case FRWORKWEAR:
                clickFRWorkWearsubmenu();
                break;
            case NEW_ARRIVALS:
                clickNewArrivalssubmenu();
                break;

            default:
                logger.info("Entered Section Not Available");
        }
    }

    public void clickFootwearItem() {

        int random = getRandomNumber(lst_MenFootwearItems.size());
        selectedSubMenuItem = getText(lst_MenFootwearItems.get(random));
        clickButtonWithOutScroll(lst_MenFootwearItems.get(random));
    }

    public void clickWomenFootwearItem() {

        int random = getRandomNumber(lst_WomenFootwearItems.size());
        selectedSubMenuItem = getText(lst_WomenFootwearItems.get(random));
        clickButtonWithOutScroll(lst_WomenFootwearItems.get(random));
    }

    public void clickClothingItem() {
        int random = getRandomNumber(lst_WomanClothingItems.size());
        selectedSubMenuItem = getText(lst_WomanClothingItems.get(random));
        clickButtonWithOutScroll(lst_WomanClothingItems.get(random));
    }

    public void clickKidsClothingItem() {
        int random = getRandomNumber(lst_KidsClothingItems.size());
        selectedSubMenuItem = getText(lst_KidsClothingItems.get(random));
        clickButtonWithOutScroll(lst_KidsClothingItems.get(random));
    }

    public void clickClearanceClothingItem() {
        int random = getRandomNumber(lst_ClearanceKidsClothing.size());
        selectedSubMenuItem = getText(lst_ClearanceKidsClothing.get(random));
        clickButtonWithOutScroll(lst_ClearanceKidsClothing.get(random));
    }

    public void clickClearanceMenClothingItem() {
        selectedSubMenuItem = getText(lnk_ClearanceMenClothing);
        clickButtonWithOutScroll(lnk_ClearanceMenClothing);
    }

    public void clickAccessoriesItem() {
        int random = getRandomNumber(lst_WomanAccessoriesItems.size());
        selectedSubMenuItem = getText(lst_WomanAccessoriesItems.get(random));
        clickButtonWithOutScroll(lst_WomanAccessoriesItems.get(random));
    }


    public void clickSearchButton() {

        clickButtonWithOutScroll(btn_Search);
    }

    public void enterProductSearch(String Search) {

        enterTextWithoutScroll(txt_Searchfield, Search);
    }

    public void clickSubMenuFRWorkWear(String subMenu) {
        mouseOverSubMenu(subMenu);
        clickButtonWithOutScroll(lnk_FRWorkWear);

    }

    public void clickFRWorkWearsubmenu() {
        selectedSubMenuItem = getText(lnk_FRWorkWear);
        clickButtonWithOutScroll(lnk_FRWorkWear);

    }

    public void clickNewArrivalssubmenu() {
        int random = getRandomNumber(lst_NewArrivalItems.size());
        selectedSubMenuItem = getText(lst_NewArrivalItems.get(random));
        clickButtonWithOutScroll(lst_NewArrivalItems.get(random));
    }

    public void clickShopByWork() {

        clickButton(lnk_MenShopByWork);
    }

    public void clickWishlistLink() {
        mouseOver(lnk_userMyAccount);
        clickButtonWithOutScroll(lnk_Wishlist);
    }

    public void clickMyBagIcon() {

        clickButtonWithOutScroll(icon_ViewCart);
    }

    public void clickSubMenuDenimFitGuide(String subMenu) {
        WebElement element = lnk_WomenSubMenu;
        mouseOver(element);
        clickButtonWithOutScroll(lnk_DenimFitGuide);

    }

    public boolean isCountrySelectorDisplayed() {

        return isElementDisplayed(btn_CountrySelector);
    }

    public void clickCountrySelectorDropDown() {

        click(btn_CountrySelector);
    }

    public boolean isCountrySelectorPopupDisplayed() {

        return isElementDisplayed(popup_CountrySelector);
    }

    public boolean isCountryCurrencyDisplayed(String Currency) {

        return isTextContain(getText(ddl_CountryCurrency), (Currency));
    }

    public boolean isSaveAndContinueBtnDisplayed() {

        return isElementDisplayed(btn_SaveandContinue);
    }

    public void clickSaveAndContinueBtn() {

        click(btn_SaveandContinue);
    }

    public void selectCountry(String element) {

        waitFor(2000);
        clickButtonWithOutScroll(ddl_CountrySelector);
        for (int j = 0; j < lst_CountrySelector.size(); j++) {
            if (lst_CountrySelector.get(j).getText().contains(element)) {
                clickButtonWithOutScroll(lst_CountrySelector.get(j));
                break;
            }
        }
    }

    public boolean isSelectedCountryUrlDisplayed(String Url) {

        waitFor(2000);
        return isTextContain(driver.getCurrentUrl(), Url);
    }

    public void clickLearnMoreLink() {

        waitFor(2000);
        clickButtonWithOutScroll(lnk_CountrySelectorLearnMoreLink);
    }

    public void clickCountrySelectorCloseBtn() {

        waitFor(3000);
        click(btn_CountrySelectorCloseBtn);
    }

    public boolean isAboutUsDisplayed() {

        return isElementDisplayed(btn_Aboutus);
    }

    public void clickAboutUsBtn() {

        clickButtonWithOutScroll(btn_Aboutus);
    }

    public boolean isHeaderMenuDisplayed(List<String> subMenu) {

        boolean flag = true;
        for (int i = 0; i < subMenu.size(); i++) {

            if (!isVerifySubMenuDisplayedAndNavigation(subMenu.get(i))) {

                flag = false;
                logger.info("++++++++++++ Enter SubMenu Not Displayed or Implemented+++++++++ " + subMenu.get(i));
                break;
            }
        }
        return flag;
    }

    public boolean selectedMenuDisplayedInProductListPage(String subMenu) {

        return isElementTextMatch(lbl_ProductListHeader, subMenu.toUpperCase());
    }

    public boolean isVerifySubMenuDisplayedAndNavigation(String subMenu) {

        boolean flag = false;
        for (int i = 0; i < lst_SubMenu.size(); i++) {

            if (subMenu.equalsIgnoreCase(getText(lst_SubMenu.get(i)))) {

                clickButtonWithOutScroll(lst_SubMenu.get(i));
                flag = selectedMenuDisplayedInProductListPage(subMenu);
                break;
            }
        }
        return flag;
    }

    public boolean isVerifySubMenuItem(DataTable dataTable, String subMenu) {

        boolean flag = false;
        switch (subMenu) {
            case MEN:

                flag = isNavigateToSelectedSubMenuItemPage(dataTable, lst_MenSection, MEN);
                break;
            case WOMEN:

                flag = isNavigateToSelectedSubMenuItemPage(dataTable, lst_WomenSection, WOMEN);
                break;
            case KIDS:

                flag = isNavigateToSelectedSubMenuItemPage(dataTable, lst_KidsSection, KIDS);
                break;
            case CLEARANCE:

                flag = isNavigateToSelectedSubMenuItemPage(dataTable, lst_ClearanceSection, CLEARANCE);
                break;
            case NEWARRIVALS:

                flag = isNavigateToSelectedSubMenuItemPage(dataTable, lst_NewArrivalsSection, NEWARRIVALS);
                break;
            case BEST_SELLERS:

                flag = isNavigateToSelectedSubMenuItemPage(dataTable, lst_BestSellersSection, BEST_SELLERS);
                break;
            default:
                logger.info("Entered Submenu Not Available");
        }
        return flag;
    }

    public boolean isNavigateToSelectedSubMenuItemPage(DataTable dataTable, List<WebElement> elements, String subMenu) {

        List<List<String>> listData = dataTable.raw();
        boolean flag = true;
        for (int i = 0; i < listData.size(); i++) {

            mouseOverSubMenu(subMenu);
            if (!isVerifySubMenuItemIsDisplayedAndClickTheLink(listData.get(i).get(0), elements.get(i), listData.get(i).get(1))) {

                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isVerifySubMenuItemIsDisplayedAndClickTheLink(String subMenuItem, WebElement element, String breadcrumbExpected) {

        boolean flag, flagElementDisplayed;

        flagElementDisplayed = isElementDisplayed(element) && subMenuItem.equalsIgnoreCase(getText(element));
        logger.info("Actual " + getText(element) + " +++++ Submenu Element Displayed Expected ++ " + subMenuItem);
        clickButtonWithOutScroll(element);
        flag = isVerifyBreadcrumbValue(breadcrumbExpected);
        return flag && flagElementDisplayed;
    }

    public boolean isVerifyBreadcrumbValue(String expected) {

        String actual = "";
        String textBreadcrumb = getText(lbl_BreadCrumb);
        String breadcrumbActual = "";

        Matcher matcher = Pattern.compile("(?m)^.*$").matcher(textBreadcrumb);
        while (matcher.find()) {

            breadcrumbActual += matcher.group() + "/";
        }
        actual = breadcrumbActual.substring(0, breadcrumbActual.length() - 1);
        logger.info("Actual +++ " + actual + ", Expected +++ " + expected);
        return actual.equalsIgnoreCase(expected);
    }

    public boolean isHeaderSectionDisplayed() {

        return isElementDisplayed(lnk_HeaderSection);
    }

    public boolean isReturnAndFreeShippingDisplayed() {

        return isElementDisplayed(lbl_return);
    }

    public void clickDetailsLinkInFreeShipping() {

        clickButtonWithOutScroll(lnk_DetailsInFreeShipping);
    }

    public void clickDropDownInCountrySelector() {

        clickButtonWithOutScroll(ddl_countrySelection);
    }

    public boolean isCountrySelectorPopupOpened() {

        return isElementDisplayed(lbl_popUpCountrySelector);
    }

    public void clickCountrySelectorPopUpCloseButton() {

        clickButtonWithOutScroll(btn_CountrySelectorCloseBtn);
    }

    public void clickAboutUsButton() {

        clickButtonWithOutScroll(btn_AboutUs);
    }

    public void clickAuthorizedRetailerButton() {

        clickButtonWithOutScroll(lnk_AuthorizedRetailer);
    }

    public boolean isSearchBarDisplayed() {

        return isElementDisplayed(txt_SearchBar);
    }

    public void clickCloseButtonInSearch() {

        clickButtonWithOutScroll(btn_CloseSearch);
    }

    public boolean isSearchCloseBtnDisplayed() {

        return isElementDisplayed(btn_CloseSearch);
    }

    public boolean isSearchLinkDisplayed() {

        return isElementDisplayed(btn_Search);
    }

    public void clickSearchLink() {

        clickButtonWithOutScroll(btn_Search);
    }

    public void clickWorkSubmenu() {
        selectedSubMenuItem = getText(lnk_MenWork);
        clickButtonWithOutScroll(lnk_MenWork);
    }

    public void clickDenimSubmenu() {
        selectedSubMenuItem = getText(lnk_MenDenim);
        clickButtonWithOutScroll(lnk_MenDenim);
    }

    public void clickJeansSubmenu() {
        selectedSubMenuItem = getText(lnk_MenJeans);
        clickButtonWithOutScroll(lnk_MenJeans);
    }

    public void enterProductNameInSearch(String productname) {

        enterTextWithoutScroll(txt_Searchfield, productname);
    }

    public boolean verifyProductResultsTextDisplayed() {

        return isElementDisplayed(lbl_ProductListHeader);
    }

    public void clickMyAccountInUserProfile() {
        mouseOver(lnk_userProfile);
        clickButtonWithOutScroll(lnk_accountInfo);
    }

    public void clickKidsFootwearItems() {
        int random = getRandomNumber(lnk_KidsFootwear.size());
        selectedSubMenuItem = getText(lnk_KidsFootwear.get(random));
        clickButtonWithOutScroll(lnk_KidsFootwear.get(random));

    }


    public void clickMenFeaturedItems() {
        int random = getRandomNumber(lnk_MenFeatured.size());
        selectedSubMenuItemInFeaturedMen = getText(lnk_MenFeatured.get(random));
        clickButtonWithOutScroll(lnk_MenFeatured.get(random));

    }

    public boolean verifyProductResultsTextDisplayed(String productresulttext) {

        waitVisibilityOfElement(txt_ProductResulttext);

        return isTextContain(getText(txt_ProductResulttext), productresulttext.toLowerCase());
    }

    public boolean isVerifySeeAllProductsDisplayed() {

        return isElementDisplayed(lnk_SeeAllProducts);
    }

    public void clickSeeAllProductsDisplayed() {

        clickButtonWithOutScroll(lnk_SeeAllProducts);
    }

    public boolean isVerifyCategoriesTextDisplayed() {

        return isElementDisplayed(txt_ProductCategoriestext);
    }

    public boolean isVerifyCategoriesListDsiplayed() {

        boolean flag = false;
        for (int i = 0; i < lst_Categories.size(); i++) {
            flag = isElementDisplayed(lst_Categories.get(i));
        }

        return flag;
    }

    public boolean isVerifyProductListDisplayed() {

        boolean flag = false;
        for (int i = 0; i < lst_SearchSuggestedProductList.size(); i++) {
            flag = isElementDisplayed(lst_SearchSuggestedProductList.get(i));
        }

        return flag;
    }


    public boolean isErrorMsgDisplayed(String errormsg) {

        waitFor(2000);
        return getText(txt_NoProductFoundErrorMsg).equalsIgnoreCase(errormsg);
    }

    public boolean isVerifySearchProductNameDisplayed() {

        boolean flag = false;
        for (int i = 0; i < lst_SearchSuggestedProductName.size(); i++) {
            flag = isElementDisplayed(lst_SearchSuggestedProductName.get(i));
        }

        return flag;
    }

    public boolean isVerifySearchProductPriceDisplayed() {

        boolean flag = false;
        for (int i = 0; i < lst_SearchSuggestedProductPrice.size(); i++) {
            flag = isElementDisplayed(lst_SearchSuggestedProductPrice.get(i));
        }

        return flag;
    }

    public void clickSeeAllProducts() {

        clickButtonWithOutScroll(lnk_SeeAllProducts);
    }

    public boolean verifySearchedProductUrl(String keyword) {

        waitFor(3000);
        return isTextContain(driver.getCurrentUrl(), keyword);
    }

    public void clickRandomProductLinkFromCategoriesList() {
        int randomProduct = getRandomNumber(lst_ProductCategoriesList.size());
        selectedCategoryProductName = getText(lst_ProductCategoriesList.get(randomProduct));
        logger.info("Selected Product +++ Product Name - " + selectedCategoryProductName);
        clickButton(lst_ProductCategoriesList.get(randomProduct));
    }

    public void enterProductNameInSearchAndPressEnter(String searchkeyword) {

        enterTextWithoutScroll(txt_Searchfield, searchkeyword);
        txt_Searchfield.sendKeys(Keys.ENTER);

    }


    public boolean clickVerifySubMenuItemsAndProdutCategories(String subMenu, String section) {

        boolean flag = false;
        mouseOverSubMenu(subMenu);
        switch (section) {

            case FOOTWEAR:
               flag =  clickFootwearItems(subMenu,section);
                break;
            case CLOTHING:
                flag =  clickClothingItems(subMenu,section);
                break;
            case ACCESSORIES:
                flag =  clickAccessoriesItems(subMenu,section);
                break;
            case FEATURED:
                flag =  clickFeaturedItems(subMenu,section);
                break;

            default:
                logger.info("Entered Section Not Available");
        }

        return flag;
    }


    public boolean clickClothingItems(String menu, String section) {
        boolean flag = false;
        for (int i = 0; i < lst_MenClothingItems.size(); i++) {
            selectedsubmenuItems = lst_MenClothingItems.get(i).getText();
            clickButtonWithOutScroll(lst_MenClothingItems.get(i));
            if (verifypageHeader() || verifyProductNameDisplayedInBreadCrum(menu,section)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        if(verifyCategoriesDisplayed(menu, section)){
                if(flag = false){
                    break;
                }
            }
        mouseOverSubMenu(menu);
        }

        return flag;
}



    public boolean clickFootwearItems(String menu, String section) {
        boolean flag = false;
        for (int i = 0; i < lst_MenFootwearItems.size(); i++) {
            selectedsubmenuItems = lst_MenFootwearItems.get(i).getText();
            clickButtonWithOutScroll(lst_MenFootwearItems.get(i));
            if (verifypageHeader() || verifyProductNameDisplayedInBreadCrum(menu,section)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            if(verifyCategoriesDisplayed(menu, section)){
                if(flag = false){
                    break;
                }
            }
            mouseOverSubMenu(menu);
        }

        return flag;
    }


    public boolean clickAccessoriesItems(String menu, String section) {
        boolean flag = false;
        for (int i = 0; i < lst_MenAccessoriesItems.size(); i++) {
            selectedsubmenuItems = lst_MenAccessoriesItems.get(i).getText();
            clickButtonWithOutScroll(lst_MenAccessoriesItems.get(i));
            if (verifypageHeader() || verifyProductNameDisplayedInBreadCrum(menu,section)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            if(verifyCategoriesDisplayed(menu, section)){
                if(flag = false){
                    break;
                }
            }
            mouseOverSubMenu(menu);
        }

        return flag;
    }

    public boolean clickFeaturedItems(String menu, String section) {
        boolean flag = false;
        for (int i = 0; i < lst_MenFeaturedItems.size(); i++) {
            selectedsubmenuItems = lst_MenFeaturedItems.get(i).getText();
            clickButtonWithOutScroll(lst_MenFeaturedItems.get(i));
            if (verifypageHeader() || verifyProductNameDisplayedInBreadCrum(menu,section)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            if(verifyCategoriesDisplayed(menu, section)){
                if(flag = false){
                    break;
                }
            }
            mouseOverSubMenu(menu);
        }

        return flag;
    }

    public boolean verifypageHeader(){

        return isTextContain(getText(lbl_ProductListHeader),selectedsubmenuItems.toUpperCase());
    }

    public boolean verifyCategoryNameDisplayedInpageHeader(){

        return isTextContain(getText(lbl_ProductListHeader),selectedcategoryname.toUpperCase());
    }

    public boolean verifyCategoryNameDisplayedInBreadCrum(){
        String xpath = "//a[@class='breadcrumb-link' and contains(text(),'"+selectedcategoryname+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextMatch(getText(element),selectedcategoryname);
    }

    public boolean verifyProductNameDisplayedInBreadCrum(String menu, String section){
        String xpath = "//a[@class='breadcrumb-link'and contains(text(),'Ariat')]//following::a[contains(text(),'"+menu+"')]//following::a[contains(text(),'"+section+"')]//following::a[contains(text(),'"+selectedsubmenuItems+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return isTextMatch(getText(element),selectedsubmenuItems);
    }

    public boolean verifyCategoriesDisplayed(String menu, String section){
        boolean flag = isElementDisplayed(txt_Categories);
            for (int i=0; i<lst_Categorieslist.size();i++){
            waitFor(2000);
            selectedcategoryname = lst_CategoriesName.get(i).getText();
            clickButtonWithOutScroll(lst_Categorieslist.get(i));
            if ( verifyCategoryNameDisplayedInpageHeader() || verifyCategoryNameDisplayedInBreadCrum())
            {
                flag = true;
            } else {
                flag = false;
                break;
            }
            waitFor(2000);
            String xpath = "//a[@class='breadcrumb-link'and contains(text(),'Ariat')]//following::a[contains(text(),'"+menu+"')]//following::a[contains(text(),'"+section+"')]//following::a[contains(text(),'"+selectedsubmenuItems+"')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            clickButtonWithOutScroll(element);
        }
            return flag;
        }

        public void selectMenuMen(String menu) {
            switch (menu) {

                case MEN:
                   selectedMenu =  getText(lnk_MenSubmenu);
                    clickButtonWithOutScroll(lnk_MenSubmenu);
                    break;


            }
        }
    }

