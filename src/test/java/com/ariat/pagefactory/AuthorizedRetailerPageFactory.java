package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AuthorizedRetailerPageFactory extends GenericWrappers {

    @FindBy(id="store_locator-list")
    public WebElement lbl_StoreLoacatorList;

    @FindBy(xpath="//ul[@id='store_locator-list']//ancestor::a[text()='Brand Shops']")
    public WebElement lnk_BrandShops;

    @FindBy(xpath="//h2[@class='shops-title']//a")
    public List<WebElement> lst_ShopTitle;

    @FindBy(css=".store_locator-nav_item")
    public List<WebElement> lst_StoreList;

    @FindBy(css=".btn.btn-primary.shops-btn")
    public List<WebElement> lst_GoToShopButton;

    @FindBy(xpath="//ul[@id='store_locator-list']//ancestor::a[text()='Outside the US']")
    public WebElement lnk_OutsideTheUs;

    @FindBy(css=".outsidetheus.store_locator-static_content")
    public WebElement lbl_StoreLoactorContent;

    @FindBy(xpath="//p[contains(text(),'email')]//a")
    public  WebElement lnk_StoreAriatEmailLink;

    @FindBy(css=".store_locator-filter_title")
    public List<WebElement> lst_storeCountry;

    @FindBy(xpath="//p[contains(text(),'Phone')]")
    public List<WebElement> lst_PhoneNumber;

    @FindBy(xpath="//a[@class='store_locator-static_content_link']//parent::p[contains(text(),'Email')]")
    public List<WebElement> lst_EmailLink;

    @FindBy(xpath="//ul[@id='store_locator-list']//ancestor::a[text()='Stores']")
    public WebElement lnk_Stores;


    @FindBy(id="postalCode")
    public WebElement txt_postalCode;

    @FindBy(xpath="//button[text()='Search']")
    public WebElement btn_Search;

    @FindBy(xpath="//div[@aria-owns='nice_maxDistance']//span[@class='current']")
    public WebElement ddl_RadiusButton;

    @FindBy(css=".custom-control-label")
    public List<WebElement> ckb_filter;

    @FindBy(css=".js_store.store_locator-result")
    public List<WebElement> lst_StoreLocatorResult;

    @FindBy(xpath="//ul[@id='nice_maxDistance']//li")
    public List<WebElement> lst_Radius;

    @FindBy(id="all")
    public WebElement ckb_all;

    @FindBy(css=".store_locator-error.store_locator-invalid-postalcode.js_storelocator-invalid-postalcode-container")
    public WebElement txt_zipcodeErrorMessage;

    @FindBy(css=".store_locator-error.store_locator-no-results.js_storelocator-no-results-container")
    public WebElement txt_invalidZipCodeErrorMessage;

}
