package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AriatWorkPageFactory extends GenericWrappers {

    @FindBy(css = ".category_banner-btn_text")
    public List<WebElement> lnk_WidgetAriatWork;

    @FindBy (css = ".category_banner-link")
    public List<WebElement> lst_BannerImages;

    @FindBy (xpath = "//div[@class='homepage-cta_wrapper']//a[contains(@class,'js_banner-link')]")
    public List<WebElement> lst_WorkBannerButtons;


}
