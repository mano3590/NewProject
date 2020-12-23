package com.ariat.pages;

import com.ariat.pagefactory.ProductDetailsPageFactory;
import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;
import java.util.List;

public class ProductDetailPage extends ProductDetailsPageFactory {
    public static String widthCode, widthText, productSize, productColor, productQuantity, selectedProductPrice, selectedProductName, selectedFRProductPrice, selectedFRWorkwearProductPrice, selectedFilterColor, selectedWishListProductPriceInTotal, selectedProductPriceInQuickView,selectedProductPriceInSlickSlide,selectedColorInSlickSlidePopUp,productColorwishlistproduct,selectedProductQty,quickviewproductSize, selectedProductNameCode,selectedProductID,selectedProductColor,selectedproductColorName, selectedRandomProductName, selectedRandomProductPrice;
    private final String WIDTH = "Width";
    private final String SIZE = "Size";
    private final String COLOR = "Color";
    private final String QUANTITY = "Quantity";
    private final int QUANTITY_COUNT = 3;

    public ProductDetailPage() {

        PageFactory.initElements(driver, this);
    }

    public boolean isSelectedProductDisplayed() {
        return isElementTextMatch(lbl_ProductName, ProductListPage.selectedProductName);
    }

    public void clickAddToBagButton() {
        productColorwishlistproduct = getText(lbl_SelectedColor);
        scrollByPixel();
        clickButtonWithOutScroll(btn_AddToBag);
    }

    /*****
     * Need to improvise the code based on the Product design
     */
    public void selectWidth() {
        String attributeValue = "disabled";
        int randomNum = 0;
        waitFor(5000);
        if (!lst_WidthVariationCode.isEmpty()) {
            if (lst_WidthVariationCode.size() > 1) {
                randomNum = getRandomNumber(lst_WidthVariationCode);
                if ((!getAttributeValue(lst_ProductColors.get(randomNum), "class").contains(attributeValue))) {
                    clickButtonWithOutScroll(lst_WidthVariationCode.get(randomNum));
                    widthCode = getText(lst_WidthVariationCode.get(randomNum));
                    widthText = getText(lst_WidthVariationText.get(randomNum));
                }
            } else {
                if ((!getAttributeValue(lst_ProductColors.get(randomNum), "class").contains(attributeValue))) {
                widthCode = getText(lst_WidthVariationCode.get(0));
                widthText = getText(lst_WidthVariationText.get(0));
                clickButtonWithOutScroll(lst_WidthVariationCode.get(0));
            }
            }
        }
    }


    /*****
     * Need to improvise the code based on the size availability
     */
    public void selectSize() {

        String outOfStock = "Out of stock";
        String waitlist = "Waitlist";

        waitFor(3000);
        for (int k = 0; k < ddl_Size.size(); k++) {

            waitFor(5000);
            clickButtonWithOutScroll(ddl_Size.get(k));
            waitFor(4000);

            GenericWrappers.explicit = 0;
            setImplicit(0);
            if (!lst_ProductSizeNotInTheList.isEmpty()) {

                for (int i = 0; i < lst_ProductSize.size(); i++) {

                    try {

                        productSize = getText(lst_ProductSize.get(i));
                        if (!(getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(outOfStock) || getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(waitlist))) {
                            productSize = getText(lst_ProductSize.get(i));
                            clickButtonWithOutScroll(lst_ProductSize.get(i));
                            break;
                        }
                    } catch (TimeoutException e) {

                        logger.info("Element Not visibility in Dom --- Size Not Available For the product");
                    }
                }
            } else {

                for (int i = 0; i < lst_ProductSize.size(); i++) {
                    try {
                        productSize = getText(lst_ProductSize.get(i));
                        if (!(getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(outOfStock) || getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(waitlist))) {
                            productSize = getText(lst_ProductSize.get(i));
                            clickButtonWithOutScroll(lst_ProductSize.get(i));
                            break;
                        }
                    } catch (TimeoutException e) {

                        logger.info("Element Not visibility in Dom --- Size Not Available For the product");
                    }
                }
            }
        }

        GenericWrappers.explicit = setDefaultExplicit();
        setImplicit(setDefaultImplicit());
        selectedProductPrice = getText(txt_ProductPrice);

    }

    public void selectColor() {

        String attributeValue = "selected";
        waitFor(5000);
        setImplicit(5);
        if (lst_ProductColors.size() > 1) {

            for (int i = 0; i < lst_ProductColors.size(); i++) {

                if (!getAttributeValue(lst_ProductColors.get(i), "class").contains(attributeValue)) {
                    clickButtonWithOutScroll(lst_ProductColors.get(i));
                    break;
                }
            }
        }
        setDefaultImplicit();
        selectedProductPrice = getText(txt_ProductPrice);
    }

    public void getSelectedProductColor(){

        selectedproductColorName = getText(lbl_SelectedColor);
    }

    public void setQuantity() {

        int randomNum = getRandomNumber(QUANTITY_COUNT) + 1;
        txt_ProductQuantity.clear();
        enterText(txt_ProductQuantity, "2");
        productQuantity = "2";
        logger.info("+++++++++++++++++++++++++++++++++++++" + productQuantity);
        waitFor(5000);
    }

    public void selectAttributeValues(String productAttribute) {

        switch (productAttribute) {

            case WIDTH:
                selectWidth();
                break;
            case SIZE:
                selectSize();
                break;
            case COLOR:
                selectColor();
                break;
            case QUANTITY:
                setQuantity();
                break;
            default:
                logger.info("Entered field not available");
        }
    }

    public boolean isSelectedPhotoBlockProductDisplayed() {

        switchToLastWindow();
        selectedProductName = getText(lbl_ProductName);
        return isTextContain(getText(lbl_ProductName), (PhotoBlockPage.selectedProductName));
    }

    public void getSelectedFRProductPrice() {

        selectedFRProductPrice = getText(txt_ProductPrice);
        float price = Float.parseFloat(selectedFRProductPrice.substring(1));
        float FRProducttotalPrice = price * 2;
        String Decimal = new DecimalFormat("#0.00").format(FRProducttotalPrice);
        selectedFRWorkwearProductPrice = ("$" + Decimal);
    }

    public void clickQtyIncrease() {

        waitFor(3000);
        clickButtonWithOutScroll(btn_Qtyincrease);
    }

    public boolean isSelectedWidgetProductDisplayed() {

        selectedProductName = getText(lbl_ProductName);
        return isTextContain(getText(lbl_ProductName).toUpperCase(), AriatHomePage.selectedWidgetLinkFirstName);
    }

    public void clickAfterPay() {
        waitFor(2000);
        click(btn_AfterPayInfoIcon);
    }

    public void clickAfterPayCloseBtn() {

        waitFor(2000);
        click(btn_AfterPayPopupCloseBtn);
    }

    public void SelectFilterColor() {

        waitFor(3000);
        for (int i = 0; i < lst_ProductColors.size(); i++) {

            clickButtonWithOutScroll(lst_ProductColors.get(i));
            String xpath = "//span[@id='product-color-selected-attribute' and contains(text(),'" + ProductListPage.selectedFilterColorName + "')]";
            WebElement element = driver.findElement(By.xpath(xpath));
            if ((getText(lbl_SelectedColor).equalsIgnoreCase(getText(element)))) {
                selectedFilterColor = getText(lbl_SelectedColor);
                break;
            }
        }
        selectedFilterColor = getText(lbl_SelectedColor);
    }

    public boolean isSelectedColorIsDisplayed() {

        return isTextContain(selectedFilterColor, ProductListPage.selectedFilterColorName);
    }


    public void clickWishListButton() {
        productColorwishlistproduct = getText(lbl_SelectedColor);
        scrollByPixel();
        clickButtonWithOutScroll(btn_WishList);
    }

    public void selectSizeInQuickView() {

        String outOfStock = "Out of stock";
        String attributeValue = "selected";
        String waitlist = "Waitlist";

        waitFor(3000);
        for (int k = 0; k < ddl_Size.size(); k++) {

            clickButtonWithOutScroll(ddl_Size.get(k));
            waitFor(5000);

            GenericWrappers.explicit = 0;
            setImplicit(0);
            if (!lst_ProductSizeNotInTheList.isEmpty()) {

                for (int i = 0; i < lst_ProductSize.size(); i++) {

                    try {

                        productSize = getText(lst_ProductSize.get(i));
                        quickviewproductSize = getText(lst_ProductSize.get(i));
//                        if (!(getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(outOfStock)&&(getAttributeValue(lst_ProductSize.get(i), "class").contains(attributeValue)))) {
                        if (!(getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(outOfStock) || getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(waitlist))){
                            clickButtonWithOutScroll(lst_ProductSize.get(i));
                            break;
                        }
                    } catch (TimeoutException e) {

                        logger.info("Element Not visibility in Dom --- Size Not Available For the product");
                    }
                }
            } else {

                for (int i = 0; i < lst_ProductSize.size(); i++) {

                    try {

                        productSize = getText(lst_ProductSize.get(i));
                        if (!(getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(outOfStock) || getText(lst_ProductSizeOutOfStock.get(i)).equalsIgnoreCase(waitlist))) {

                            clickButtonWithOutScroll(lst_ProductSize.get(i));
                            break;
                        }
                    } catch (TimeoutException e) {

                        logger.info("Element Not visibility in Dom --- Size Not Available For the product");
                    }
                }
            }
        }
        GenericWrappers.explicit = setDefaultExplicit();
        setImplicit(setDefaultImplicit());
    }

    public void selectColorInQuickView() {

        String attributeValue = "selected";
        waitFor(3000);
        setImplicit(5);
        if (lst_ProductColors.size() > 1) {
            waitFor(3000);
            for (int i = 0; i < lst_ProductColors.size(); i++) {
                waitFor(3000);

                if (!getAttributeValue(lst_ProductColors.get(i), "class").contains(attributeValue)) {

                    clickButtonWithOutScroll(lst_ProductColors.get(i));
                    productColor = getText(lbl_SelectedColor);
                    break;
                }
            }
        }
    }

    public void getWishListProductPrice() {

        float price = Float.parseFloat(selectedProductPrice.substring(1));
        float productTotalPrice = price * 2;
        String Decimal = new DecimalFormat("#0.00").format(productTotalPrice);
        selectedWishListProductPriceInTotal = ("$" + Decimal);
    }

    public void clickEditLinkInSlickSide() {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'" + ProductListPage.selectedProductName + "')]//following::div[12]//a[@title='Edit']";
        WebElement editLinkInSlickSide = driver.findElement(By.xpath(xpath));
        click(editLinkInSlickSide);
    }

    public boolean isSlickSlidePopUpOpen() {
        waitFor(3000);
        return isElementDisplayed(popup_slickSlide);
    }

    public void SelectColorInSlickSlidePopUp() {

        String attributeValue = "selected";
        waitFor(5000);
        setImplicit(5);
        if (lst_ProductColorSlickPopUp.size() > 1) {

            for (int i = 0; i < lst_ProductColorSlickPopUp.size(); i++) {
                waitFor(2000);
                if (!getAttributeValue(lst_ProductColorSlickPopUp.get(i), "class").contains(attributeValue)) {
                    clickButtonWithOutScroll(lst_ProductColorSlickPopUp.get(i));
                    waitFor(2000);
                    if (isEnabled(btn_UpdateslickSlidePopUp)) {
                        break;
                    }
                }
            }
            setDefaultImplicit();
            waitFor(5000);
        }


    }

    public void getProductColorInSlickSlide()
    {
        selectedColorInSlickSlidePopUp = getText(lbl_SelectedColorSlickPopUp);
    }

    public void getPriceInSlickSlidePopUp()
    {
        String xpath = "//div[contains(@class,'product-quickview')]//h1[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div//span[@class='sales']";
        WebElement selectedProductPriceSlickSlide = driver.findElement(By.xpath(xpath));
        selectedProductPriceInSlickSlide = getText(selectedProductPriceSlickSlide);
        waitFor(3000);

    }


    public void clickAfterPayIconInSlickSlidePopUp()
    {
        clickButtonWithOutScroll(lnk_AfterPayInSlickSlidePopUp);
    }

    public boolean isAfterPayPopUpDisplayedInSlickSlidePopUp()
    {
        return isElementDisplayed(popup_AfterPaySlickSlidePopUp);
    }

    public void clickUpdateButtonInslickSlidePopUp()
    {
        click(btn_UpdateslickSlidePopUp);

    }

    public void clickRemoveLinkInSlickSide() {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[13][contains(@class,'remove')]//button//span[contains(text(),'Remove')]";
        WebElement removeLinkInSlickSide = driver.findElement(By.xpath(xpath));
        click(removeLinkInSlickSide);
        waitFor(3000);
    }

    public void getProductQuantity(){

        selectedProductQty = txt_ProductQuantity.getAttribute("value");
    }

    public void getQuickviewProductPrice(){

        selectedProductPriceInQuickView = getText(txt_ProductPriceInQuickview);
    }

    public boolean isSelectedProductDisplayedInBreadCrumb()
    {
        return isTextContain(getText(lnk_BreadCrumb),ProductListPage.selectedProductName.toUpperCase());
    }

    public boolean isProductImageDisplayed()
    {
        return isElementDisplayed(img_ProductImage);
    }

    public boolean isSelectedHeaderMenuDisplayedInProductedDetailPage()
    {
        return isTextContain(HeaderPage.selectedMenuItem,getText(txt_SelectedMenu));
    }

    public boolean isProductCodeDisplayedInProductDetailPage()
    {
        selectedProductNameCode = getText(txt_ProductCode);
        return isElementDisplayed(txt_ProductCode);
    }

    public void getProductId(){

        selectedProductID = getText(txt_productID);
    }

    public boolean isVerifySelectedGendertextDisplayed(){

        return isTextContain(getText(txt_ProductGendertext),ProductListPage.selectedGenderFilterName.toUpperCase());
    }

    public boolean isVerifySelectedFilterDisplayed(){
        waitFor(3000);
        return getText(txt_CertificationFilter).equalsIgnoreCase(ProductListPage.selectedInnnerFilterName);
    }

    public boolean isProductAverageRatingCountDisplayed()
    {
        return isElementDisplayed(txt_AvgRatingCount);
    }

    public boolean isProductStartsDisplayedInProductDetailPage()
    {
        highLighterMethod(driver,lbl_Stars);
        return isElementDisplayed(lbl_Stars);
    }

    public boolean isReviewCountDisplayed()
    {
        return isElementDisplayed(txt_ReviewsCount);
    }
    public boolean isWriteAReviewLinkDisplayed()
    {
        return isElementDisplayed(lnk_WriteAReview);
    }
    public boolean isViewDescriptionLinkDisplayed()
    {
        return isElementDisplayed(lnk_ViewDescription);
    }
    public boolean isSelectedProductColorNameDisplayed()
    {
        selectedProductColor= getText(lbl_SelectedColor);
        return isElementDisplayed(lbl_SelectedColor);
    }
    public boolean isProductColorsDisplayed()
    {
        return isElementDisplayed(lst_ProductColors);
    }
    public boolean isSizeDropDownDisplayed()
    {
        return isElementDisplayed(ddl_SizeBox);
    }

    public boolean isWidthBoxDisplayed()
    {
        return isElementDisplayed(lst_WidthBox);
    }

    public boolean isProductPriceDisplayed()
    {
        return isElementDisplayed(txt_ProductPrice);
    }
    public boolean isAfterPayTextDisplayed()
    {
        return isElementDisplayed(txt_AfterPay);
    }

    public boolean isAfterPayIconDisplayed()
    {
        return isElementDisplayed(btn_AfterPayInfoIcon);
    }

    public boolean isQuantityBoxDisplayed()
    {
        return isElementDisplayed(txt_QuantityInputBox);
    }
    public boolean isQuantityIncreaseButtopnDisplayed()
    {
        return isElementDisplayed(btn_Qtyincrease);
    }
    public boolean isQuantityDecreaseButtonDisplayed()
    {
        return isElementDisplayed(btn_Qtydecrease);
    }
    public boolean isSelectYourSizeButtonIsDisplayedInAddToBag()
    {
        return isElementDisplayed(btn_AddToBagDisabled);
    }
    public boolean isFreeShippingAndFreeReturnsTextDisplayed()
    {
        return isElementDisplayed(txt_FreeShippingAndFreeReturns);
    }
    public boolean isDescriptionDetailsDisplayed()
    {
        return isElementDisplayed(txt_Description);
    }
    public boolean isDescriptionHeadingDisplayed()
    {
        return isElementDisplayed(txt_DescriptionHeading);
    }
    public boolean isSpecificationsDetailDisplayed()
    {
        return isElementDisplayed(txt_SpecificationDetails);
    }
    public boolean isSpecificationTitleDisplayed()
    {
        return isElementDisplayed(txt_SpecificationTitle);
    }

    public boolean isReviewsContentDisplayed()
    {
        return isElementDisplayed(txt_ReviewsContent);
    }
    public boolean isReviewHeaderDisplayed()
    {
        return isElementDisplayed(txt_Reviews);
    }
    public boolean isCompleteTheLookTitleDisplayed()
    {
        return isElementDisplayed(txt_CompleteTheLookTitle);
    }
    public boolean isCompleteTheLookImagesDisplayed()
    {
        boolean flag=false;
        for(WebElement images: lst_CompleteTheLookImages){
            flag=isElementDisplayed(images);

        }
        return flag;
    }

    public boolean isCompleteTheLookPricesDisplayed()
    {
        boolean flag=false;
        for(WebElement prices: lst_CompleteTheLookProductPrices){
            flag=isElementDisplayed(prices);

        }
        return flag;
    }

    public boolean isCompleteTheLookProductNamesDisplayed()
    {
        boolean flag=false;
        for(WebElement productNames: lst_CompleteTheLookProductNames){
            flag=isElementDisplayed(productNames);

        }
        return flag;
    }

    public boolean isCompleteTheLookProductStarsDisplayed()
    {
        boolean flag=false;
        for(WebElement productStars: lst_CompleteTheLookProductStars){
            flag=isElementDisplayed(productStars);

        }
        return flag;
    }
    public boolean isCompleteTheLookProductReviewCountDisplayed()
    {
        boolean flag=false;
        for(WebElement productReviewCounts: lst_CompleteTheLookProductsReviewCounts){
            flag=isElementDisplayed(productReviewCounts);

        }
        return flag;
    }

    public boolean isYouMayAlsoLookLikeTitleDisplayed()
    {
        return isElementDisplayed(txt_YouMayAlsoLikeTitle);
    }

    public boolean isYouMayAlsoLookLikeProductImagesDisplayed()
    {
        boolean flag=false;
        for(WebElement productImages: lst_YouMayAlsoLikeImages){
            flag=isElementDisplayed(productImages);

        }
        return flag;
    }

    public boolean isYouMayAlsoLookLikeProductNamesDisplayed()
    {
        boolean flag=false;
        for(WebElement productNames: lst_YouMayAlsoLikeProductNames){
            flag=isElementDisplayed(productNames);

        }
        return flag;
    }

    public boolean isYouMayAlsoLookLikeProductPricesDisplayed()
    {
        boolean flag=false;
        for(WebElement productPrices: lst_YouMayAlsoLikeProductPrices){
            flag=isElementDisplayed(productPrices);

        }
        return flag;
    }
    public boolean isYouMayAlsoLookLikeProductStarsDisplayed()
    {
        boolean flag=false;
        for(WebElement productStars: lst_YouMayAlsoLikeProductStars){
            flag=isElementDisplayed(productStars);

        }
        return flag;
    }
    public boolean isYouMayAlsoLookLikeProductReviewCountDisplayed()
    {
        boolean flag=false;
        for(WebElement productReviewCounts: lst_YouMayAlsoLikeProductsReviewCounts){
            flag=isElementDisplayed(productReviewCounts);

        }
        return flag;
    }

    public boolean isRecentlyViewedTitleDisplayed()
    {
        return isElementDisplayed(txt_RecentlyViewedTitle);
    }
    public boolean isRecentlyViewedProductImagesDisplayed()
    {
        boolean flag=false;
        for(WebElement productImages: lst_RecentlyViewedImages){
            flag=isElementDisplayed(productImages);

        }
        return flag;
    }

    public boolean isRecentlyViewedProductPricesDisplayed()
    {
        boolean flag=false;
        for(WebElement productPrices: lst_RecentlyViewedProductPrices){
            flag=isElementDisplayed(productPrices);

        }
        return flag;
    }

    public boolean isRecentlyViewedProductNamesDisplayed()
    {
        boolean flag=false;
        for(WebElement productNames: lst_RecentlyViewedProductNames){
            flag=isElementDisplayed(productNames);

        }
        return flag;
    }

    public boolean isRecentlyViewedProductStarsDisplayed()
    {
        boolean flag=false;
        for(WebElement productStars: lst_YouRecentlyViewedProductStars){
            flag=isElementDisplayed(productStars);

        }
        return flag;
    }

    public boolean isRecentlyViewedProductReviewCountsDisplayed()
    {
        boolean flag=false;
        for(WebElement productReviewCounts: lst_RecentlyViewedProductsReviewCounts){
            flag=isElementDisplayed(productReviewCounts);

        }
        return flag;
    }

    public boolean isSelectedMenuItemDisplayed()
    {
        String selectedMenu = getText(txt_SelectedMenu);
        String selectedMenuItemInProductDetail= HeaderPage.selectedMenuItem +"'S";
        return isTextContain(selectedMenu,selectedMenuItemInProductDetail);
    }

    public boolean isReviewsCountMatchedInProductDetailPage()
    {
        return getText(txt_ReviewsCount).equals(ProductListPage.selectedProductAverageCount);
    }

    public boolean isColorCountMatchedWithProductDetailPage()
    {
        int sizeOfTheColor = lst_ProductColors.size();
        String sizeOfTheColorInProductDetail = Integer.toString(sizeOfTheColor);
        return isTextContain(ProductListPage.selectedProductColorCount,sizeOfTheColorInProductDetail);


    }

    public boolean isSelectedProductPriceMatchWithProductDetailPage()
    {
        return getText(txt_ProductPrice).equalsIgnoreCase(ProductListPage.selectedProductPrice);
    }

    public boolean isVerifyColorNameChanged()
    {
        waitFor(2000);
        boolean flag=false;
        if(lst_ProductColors.size()>1)
        {
            flag= !(selectedProductColor.equals(getText(lbl_SelectedColor)));
        }
        else
        {
            flag= (selectedProductColor.equals(getText(lbl_SelectedColor)));

        }
        return flag;
    }

    public boolean isAddToBagButtonEnable()
    {
        return isElementDisplayedWithoutScroll(btn_AddToBag);
    }

    public void selectAnyOneProductRandomlyInProductDetailPage()
    {
        int randomProduct = getRandomNumber(lst_productNames);
        selectedRandomProductName = getText(lst_productNames.get(randomProduct));
        String xpath = "//span[contains(text(),'"+selectedRandomProductName+"')]//following::div[1]//span[@class='sales']";
        WebElement productPrice = driver.findElement(By.xpath(xpath));
        selectedRandomProductPrice = getText(productPrice);
        logger.info("Selected Product +++ Product Name - "+selectedProductName+"\n"+"Product Price - "+selectedProductPrice);
        clickButton(lst_Images.get(randomProduct));
    }

    public boolean isRandomlySelectedProductNameDisplayed()
    {
        waitFor(3000);
        return getText(lbl_ProductName).equalsIgnoreCase(selectedRandomProductName);
    }

    public boolean isWidthSelected()
    {
        String xpath = "//div[@class='variation-code' and text()='"+widthCode+"']//preceding::div[contains(@class,'product-attribute_label')]//following::div[contains(@class,'variation-wrapper')]//a[contains(@class,'selected')]";
        WebElement selectedWidth = driver.findElement(By.xpath(xpath));
        return selectedWidth.isSelected();

    }

    public boolean isSelectedProductNameStyleCodeDisplayedInSlickSlide()
    {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[2][contains(text(),'Style')]";
        WebElement selectedStyleCodeInSlickSlide = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(selectedStyleCodeInSlickSlide),selectedProductNameCode);
    }

    public boolean isSelectedProductColorDisplayedInSlickSlide()
    {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[2]//following-sibling::p[contains(@class,'Color')]";
        WebElement selectedColorInSlickSlide = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(selectedColorInSlickSlide),selectedProductColor);
    }

    public boolean isSelectedProductWidthDisplayedInSlickSlide()
    {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[2]//following-sibling::p[contains(@class,'Width')]";
        WebElement selectedWidthInSlickSlide = driver.findElement(By.xpath(xpath));
        String selectedWidth = ProductDetailPage.widthCode + " " + "/" + " " + ProductDetailPage.widthText;
        return isTextContain(getText(selectedWidthInSlickSlide),selectedWidth);
    }

    public boolean isSelectedProductSizeDisplayedInSlickSlide()
    {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[2]//following-sibling::p[contains(@class,'Size')]";
        WebElement selectedSizeInSlickSlide = driver.findElement(By.xpath(xpath));
        // String sizeInSlickSlide[] = getText(selectedSizeInSlickSlide).split(":");
        // String sizeInslickSlideBar = sizeInSlickSlide[1];

        return isTextContain(getText(selectedSizeInSlickSlide),productSize);
    }

    public boolean isStockAvailabilityDisplayedInSlickSlide()
    {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[2]//following-sibling::div[contains(@class,'availability')]";
        WebElement stockAvailability = driver.findElement(By.xpath(xpath));
        return isElementDisplayed(stockAvailability);
    }

    public boolean isSelectedProductQuantityDisplayedInSlickSlide()
    {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[2]//following::div[4]//child::p//child::span[contains(@class,'quantity-count')]";
        WebElement selectedProductQuantityInSlickSlide = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(selectedProductQuantityInSlickSlide),selectedProductQty) ;
    }

    public boolean isSelectedProductPriceDisplayedInSlickSlide()
    {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]//following::div[2]//following::div[5]//child::span[@class='sales']";
        WebElement selectedProductPriceInProductDetail = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(selectedProductPriceInProductDetail),selectedProductPrice);
    }

    public boolean isSelectedProductNameDisplayedInSlickSlidebar()
    {
        String xpath = "//div[@class='line-item-name']//span[contains(text(),'"+ProductListPage.selectedProductName+"')]";
        WebElement selectedProductNameInSlickSlide = driver.findElement(By.xpath(xpath));
        return isTextContain(getText(selectedProductNameInSlickSlide),ProductListPage.selectedProductName);
    }

    public boolean isBeTheFirstReviewTextDisplayed()
    {
        return isElementDisplayed(txt_BeTheFirstReviewMessage);

    }






}
