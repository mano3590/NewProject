package com.ariat.pages;

import com.ariat.pagefactory.AriatGivingPageFactory;
import org.openqa.selenium.support.PageFactory;

public class AriatGivingPage extends AriatGivingPageFactory {

    public AriatGivingPage() {

        PageFactory.initElements(driver, this);
    }


}
