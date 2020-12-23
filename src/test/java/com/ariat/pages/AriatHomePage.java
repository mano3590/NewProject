package com.ariat.pages;

import com.ariat.pagefactory.AriatHomePageFactory;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AriatHomePage extends AriatHomePageFactory {

    public static String selectedWidgetLinkName, selectedWidgetLink, selectedBannerButton, selectBannerButton, selectedWidgetLinkFirstName, selectedWorkBannerButton, selectedWorkBannerButtonSecondName, selectedWorkBanner, selectedBannerButtonName,selectedProductname;

    public AriatHomePage() {

        PageFactory.initElements(driver, this);
    }

    public void clickRandomWidgetLinksItem() {
        for (int i = 0; i < lst_HomePageWidgetLinks.size(); i++) {
            int randomWidgetLink = getRandomNumber(lst_HomePageWidgetLinks.size()) + 2;
            selectedWidgetLinkName = getText(lst_HomePageWidgetLinks.get(randomWidgetLink));
            if (!(selectedWidgetLinkName.equalsIgnoreCase("WATCH NOW") || selectedWidgetLinkName.equalsIgnoreCase("READ MORE"))) {
                clickButtonWithOutScroll(lst_HomePageWidgetLinks.get(randomWidgetLink));
                break;
            }
        }
    }


    public void clickRandomPhotoBlockItem() {
        setImplicit(2);
        driver.switchTo().frame(img_PhotoBlockFrameID);
        int random = getRandomNumber(img_PhotoBlock.size() + 1);
        WebElement photoblock = driver.findElement(By.xpath("//div[@id='frame']//ul//li['" + random + "']"));
        scrollToElement(img_FirstPhotoBlock);
        waitFor(3000);
        for (int i = 0; i < img_PhotoBlock.size(); i++) {
            if ((photoblock).isDisplayed()) {
                click(photoblock);
                switchToDefaultContent();
                break;
            }
            clickButtonWithOutScroll(btn_Next);
        }
        switchToDefaultContent();
    }


    public Boolean isHomePageBannerButtonDisplayed() {

        return isElementDisplayed(btn_HomePageBanner);
    }

    public void clickBannerButton() {

        int random = getRandomNumber(btn_HomePageBanner.size());
        selectedBannerButton = getText(btn_HomePageBanner.get(random));
        clickButtonWithOutScroll(btn_HomePageBanner.get(random));
        selectBannerButton = StringUtils.chop(selectedBannerButton);


    }

    public boolean isWidgetTitleDisplayed() {
        return isTextContain(getText(label_WidgetTiltle), selectBannerButton.toUpperCase());
    }

    public void clickRandomWidgetLinks() {

        int random = getRandomNumber(lst_HomePageWidgetLinks.size());
        selectedWidgetLink = getText(lst_HomePageWidgetLinks.get(random));
        clickButtonWithOutScroll(lst_HomePageWidgetLinks.get(random));
        String[] widgetLinks = selectedWidgetLink.split(" ", selectedWidgetLink.length());
        selectedWidgetLinkFirstName = widgetLinks[0];

    }

    public Boolean isNewArrivalTitleDisplayed() {

        waitFor(2000);
        return isElementDisplayed(lbl_NewArrivals);
    }

    public void clickRandomWorkBannerButton() {

        int random = getRandomNumber(btn_WorkBanner.size());
        selectedWorkBannerButton = getText(btn_WorkBanner.get(random));
        clickButtonWithOutScroll(btn_WorkBanner.get(random));
        String[] bannerButtons = selectedWorkBannerButton.split(" ", selectedWorkBannerButton.length());
        selectedWorkBannerButtonSecondName = bannerButtons[1];
        selectedWorkBanner = selectedWorkBannerButtonSecondName.substring(0, 3);
    }

    public void clickShopByStyleLink() {

        clickButton(lnk_ShopByStyle);
    }

    public void clickWishListLink() {

        clickButton(lnk_WishList);
    }

    public boolean isProductNameDisplayedInNewArrivals() {
        boolean flag = false;
       scrollToElement(txt_Ariat);
        for (WebElement productName : lst_ProductNameInNewArrivals) {
           if (isElementDisplayed(productName)){
               flag = true;
           }else{
               flag = false;
               break;
           }
        }
        return flag;

    }

    public boolean isProductPriceDisplayedInNewArrivals() {
        boolean flag = false;
        for (WebElement productPrice : lst_ProductPriceInNewArrivals) {
           if(isElementDisplayed(productPrice)){
               flag = true;
           }else{
               flag = false;
               break;
           }
        }
        return flag;


    }

    public boolean isProductImageDisplayedInNewArrivals() {
        boolean flag = false;
        for (WebElement productImage : lst_ImageNewArrivals) {
            if(isElementDisplayed(productImage)){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;

    }

    public boolean clickAndVerifyNewArrivalsProducts() {
        boolean flag = false;
        scrollToElement(txt_Ariat);
        for(int i=0; i<lst_ImageNewArrivals.size();i++) {
            waitForAriatLoadIconDisappear();
            waitVisibilityOfElement(lst_ProductNameInNewArrivals.get(i));
            selectedProductname = getText(lst_ProductNameInNewArrivals.get(i));
            clickButtonWithOutScroll(lst_ImageNewArrivals.get(i));
            if (isElementTextMatch(lbl_ProductName, selectedProductname)){
                flag = true;
            }else{
                flag = false;
                break;
            }

            driver.navigate().to("https://www.ariat.com/");
        }
        return flag;

    }

    public void ClickRandomProductImage() {

    }


    public boolean verifyHomePageBannerButtonDisplayed() {

        boolean flag = false;

        for (int i = 0; i < lst_HomePageBannerButton.size(); i++) {
            if (lst_HomePageBannerButton.get(i).isDisplayed()) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public boolean clickAndVerifyHomePageBannerButton() {
        boolean flag = false;
        for (int i = 0; i < lst_HomePageBannerButton.size(); i++) {
            waitForAriatLoadIconDisappear();
            waitVisibilityOfElement(lst_HomePageBannerButton.get(i));
            String selectedPageUrl = lst_HomePageBannerButton.get(i).getAttribute("href");
            clickButtonWithOutScroll(lst_HomePageBannerButton.get(i));
            String currentUrl = driver.getCurrentUrl();
            if (selectedPageUrl.equalsIgnoreCase(currentUrl)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            driver.navigate().to("https://www.ariat.com/");
        }
    return flag;
    }

    public boolean verifyPageHeader(){

        return isTextContain(selectedBannerButtonName,getText(lbl_ProductListHeader));
    }

    public boolean verifyHomePageWidgetImgsDisplayed(){
        boolean flag = false;
        for (int i=0; i<lst_Homepagewidgetimg.size();i++){
            if (isElementDisplayed(lst_Homepagewidgetimg.get(i))){
                flag=true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean verifyHomePageWidgetlinksDisplayed(){
        boolean flag = false;
        for (int i=0; i<lst_Homepagewidgetimg.size();i++){
            if (isElementDisplayed(lst_Homepagewidgetimg.get(i))){
                flag=true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean clickAndVerifyHomePageWidgetImg() {
        boolean flag = false;
        for (int i = 0; i < lst_Homepagewidgetimg.size(); i++) {
            String selectedUrl = lst_Homepagewidgets.get(i).getAttribute("href");
            clickButtonWithOutScroll(lst_Homepagewidgetimg.get(i));
            String url = driver.getCurrentUrl();
            if (selectedUrl.equalsIgnoreCase(url)){
                flag = true;
            }else {
                flag = false;
                break;
            }
            driver.navigate().to("https://www.ariat.com/");
        }
    return flag;
    }

    public boolean clickAndVerifyHomePageWidgetlinks() {
        boolean flag = false;
        for (int i = 0; i < lst_HomePageWidgetLinks.size(); i++) {
            String selectedUrl = lst_HomePageWidgetLinks.get(i).getAttribute("href");
            clickButtonWithOutScroll(lst_HomePageWidgetLinks.get(i));
            String url = driver.getCurrentUrl();
            if (selectedUrl.equalsIgnoreCase(url)){
                flag = true;
            }else {
                flag = false;
                break;
            }
            driver.navigate().to("https://www.ariat.com/");
        }
        return flag;
    }

    public boolean verifyMyAriatTextDisplayed(){

        scrollToElement(txt_NewArrivals);
        driver.switchTo().frame(img_PhotoBlockFrameID);
        return isElementDisplayed(txt_MyAriat);

    }

    public boolean verifyMyAriatHeaderDisplayed(){
        driver.switchTo().frame(img_PhotoBlockFrameID);
//        waitVisibilityOfElement(txt_MyAriat);
        return isElementDisplayed(txt_MyAriat);

    }


    public void clicAddYourPhoto(){
        clickButtonWithOutScroll(lnk_AddYourPhoto);
        switchToDefaultContent();
    }

    public boolean verifyAddYourPhoto(){

        return isElementDisplayed(lnk_AddYourPhoto);
    }

    public boolean verifyUploadFrameDisplayed(){
        waitFor(3000);
        driver.switchTo().frame(iFrameid);
        waitVisibilityOfElement(dialogue_uploaderframe);
        return isElementDisplayed(dialogue_uploaderframe);
    }

    public boolean verifySourceHeaderDisplayed(){

        return isElementDisplayed(txt_SourceHeader);
    }

    public boolean verifySourceDesktopDisplayed(){

        return isElementDisplayed(lnk_source_desktop);
    }

    public boolean verifySourceInstegramDisplayed(){

        return isElementDisplayed(lnk_source_instagram);
    }

    public boolean verifySourceFacebookDisplayed(){

        return isElementDisplayed(lnk_source_facebook);
    }

    public boolean verifySourceGooglephotosDisplayed(){

        return isElementDisplayed(lnk_source_google_photos);
    }

    public boolean verifyChooseSourceBreadCrumDisplayed(){

        return isElementDisplayed(lnk_pick_sourceBreadCrumlink);
    }

    public boolean verifySelectContentBreadCrumDisplayed(){

        return isElementDisplayed(lnk_select_contentBreadCrumlink);
    }

    public boolean verifyReviewSubmissionBreadCrumDisplayed(){

        return isElementDisplayed(lnk_review_submissionBreadCrumlink);
    }

    public boolean verifySubmitContentBreadCrumDisplayed(){

        return isElementDisplayed(lnk_submit_contentBreadCrumlink);
    }

    public void clickDesktopIcon(){

        clickButtonWithOutScroll(lnk_source_desktop);
    }

    public boolean verifySelectContentBreadCrumEnabled(){

        return isElementDisplayed(lnk_select_contentBreadCrum);

    }

    public void clickDragAndDrop(){

        clickButtonWithOutScroll(lnk_FileUploader);
    }

    public boolean verifyViewGalleryDisplayed(){

        scrollToElement(txt_NewArrivals);
        driver.switchTo().frame(img_PhotoBlockFrameID);
        return isElementDisplayed(lnk_ViewGallery);

    }

    public void clickViewGalleryDisplayed(){

       clickButtonWithOutScroll(lnk_ViewGallery);
       switchToLastWindow();
    }

    public void clickCloseBtnInUploadFrame(){

        clickButtonWithOutScroll(Btn_UploadFrameCloseBtn);

    }
    public void clickYesBtnInAlert(){

        clickButtonWithOutScroll(Btn_AlertYesBtn);
        switchToDefaultContent();
    }

    public boolean verifyPhotoBlocksDisplayed(){
        driver.switchTo().frame(img_PhotoBlockFrameID);

        boolean flag = true;

        for (int i=0; i<lst_PhotoBlocks.size();i++){
            if(!isElementDisplayed(lst_PhotoBlocks.get(i))){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void clickAndVerifyLoadMoreBtn() {

        while (Btn_LoadMoreBtn.isDisplayed()) {
            waitVisibilityOfElement(Btn_LoadMoreBtn);
            clickButtonWithOutScroll(Btn_LoadMoreBtn);
            if (Btn_EndUploader.isDisplayed()) {
                break;
            }
        }
    }

    public boolean sortByDropDownDisplayedInMyAriat(){
        waitVisibilityOfElement(ddl_SortByFilterdropdown);
        return isElementDisplayed(ddl_SortByFilterdropdown);
    }

    public void clickSortBydropdown(){

        clickButtonWithOutScroll(ddl_SortByFilterdropdown);
    }

    public boolean sortBydropdownBlockDisplayed(){

        return isElementDisplayed(ddl_SortByDropDownBlock);
    }

    public void clickSortByDropdownListItem(List<String> sortbydropdownlist){
        for (int i=0; i<lst_SortBydropdownList.size();i++) {
            String xpath = "//span[@id='sort_filter_button']//following::ul[@class='filter_dropdown']//li[@dropdown-value='" + sortbydropdownlist.get(i) + "']";
            WebElement element = driver.findElement(By.xpath(xpath));
            clickButtonWithOutScroll(ddl_SortByFilterdropdown);
            waitFor(3000);
            clickButtonWithOutScroll(element);

            }
        }

     public void clickPersonalizedContentDropdown(){

         clickButtonWithOutScroll(ddl_YourPersonalizedContent);
     }

    public void clickPersonalizedContentDropdownListItem(String dropdownlist){
            switchToDefaultContent();
            waitFor(2000);
            driver.switchTo().frame(img_PhotoBlockFrameID);
            String xpath = "//div[@id='filter_personalization']//ul[@class='filter_dropdown']//label[contains(@dropdown-value,'"+dropdownlist+"')]//following-sibling::div[@class='social_login']";
            WebElement element = driver.findElement(By.xpath(xpath));
            clickButtonWithOutScroll(element);
            switchToDefaultContent();
    }

    public void clickPersonalizedContentDropdownListphotosNearMe(String dropdownlist){
        switchToDefaultContent();
        waitFor(2000);
        driver.switchTo().frame(img_PhotoBlockFrameID);
        String xpath = "//div[@id='filter_personalization']//ul[@class='filter_dropdown']//label[contains(@dropdown-value,'"+dropdownlist+"')]";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);
    }

    public boolean verifySigninWithYourSocialPopupScreenDisplayed(){
        setImplicit(2);
        driver.switchTo().frame("pixlee_social_auth");
        waitVisibilityOfElement(popup_SocialSignInPopup);
        return isElementDisplayed(popup_SocialSignInPopup);
    }

    public void clickCloseBtnInSigninWithYourSocialPopupScreen(){
        clickButtonWithOutScroll(Btn_CloseButtonIbSocialSigninPopup);
        switchToDefaultContent();
    }

    public boolean verifyPersonalizedContentDropdownDispkayed(){
       waitFor(2000);
       return isElementDisplayed(ddl_YourPersonalizedContent);
    }


    public boolean verifyMyAriatSearchIconDisplayed(){

        return isElementDisplayed(Btn_SearchBtnInPhotoBlock);
    }

    public void clickMyAriatSearchIcon(){

        clickButtonWithOutScroll(Btn_SearchBtnInPhotoBlock);
    }

    public boolean verifyMyAriatSearchInputFieldDisplayed(){

        return isElementDisplayed(txt_PhotoBlockSearchFieldDisplayed);
    }

    public void clickMyAriatSearchCloseBtn(){

        clickButtonWithOutScroll(Btn_SearchCloseBtnInPhotoBlock);
    }

    public void enterMyAriatSearchField(String keyword){

        enterTextWithoutScroll(txt_PhotoBlockSearchInputBox,keyword);
        txt_PhotoBlockSearchInputBox.sendKeys(Keys.ENTER);

    }

    public boolean verifyenteredSearchKeywordDisplayed(String keyword){

        System.out.println(txt_PhotoBlockSearchFilterName.getText());
        return isTextContain(getText(txt_PhotoBlockSearchFilterName),keyword);
    }

    public void clickClearAll(){

        clickButtonWithOutScroll(Btn_clearAllBtn);
    }

    public boolean verifyPhotosDisplayed(){

        waitFor(3000);
        boolean flag = true;

        for (int i=0; i<lst_PhotoBlocks.size();i++){
            if(!isElementDisplayed(lst_PhotoBlocks.get(i))){
                flag = false;
                break;
            }
        }
        return flag;
    }


    public void clickRandomPhotos() {
        int random = getRandomNumber(lst_PhotoBlocks.size());
        clickButtonWithOutScroll(lst_PhotoBlocks.get(random));
        switchToDefaultContent();
    }


}




