package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FRWorkWearPageFactory extends GenericWrappers {


    @FindBy(xpath = "//a[contains(@class,'category_banner-link')]")
    public List<WebElement> lst_FRWorkWearWidgetImg;

    @FindBy (xpath = "//picture[@class='category_banner-image_wrapper']//following::div[@class='category_banner-btn']")
    public List<WebElement> lst_FRWorkwearShopNowlinks;

    @FindBy (xpath = "//h3[@class='category_banner-title']")
    public List<WebElement> lst_FRWorkWearWidgetName;

    @FindBy (xpath = "//div[@class='homepage-cta_wrapper']//a[contains(@class,'js_banner-link')]")
    public WebElement Btn_FRWorkWearBannerBtn;

    @FindBy(css = "#product-search-results div:nth-child(2)  div:nth-child(2) .search-results-title")
    public WebElement lbl_ProductListHeader;

    @FindBy (xpath = "//h1[@class='search-results-title']")
    public WebElement txt_FRWorkWearHeader;


}
