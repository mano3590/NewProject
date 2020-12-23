package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Two24HomePageFactory extends GenericWrappers {

    @FindBy(css = ".ms_desktop-only a:nth-child(2)")
    public WebElement btn_MenCollection;

    @FindBy(css = ".ms_desktop-only a:nth-child(1)")
    public WebElement btn_WomenCollection;
}
