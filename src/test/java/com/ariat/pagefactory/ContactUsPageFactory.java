package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPageFactory extends GenericWrappers {

    @FindBy (xpath = "//a[contains(text(),'click here')]")
    public WebElement lnk_clickherelink;
}
