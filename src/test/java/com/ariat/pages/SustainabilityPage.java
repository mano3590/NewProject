package com.ariat.pages;

import com.ariat.pagefactory.SustainabilityPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SustainabilityPage extends SustainabilityPageFactory {

    public SustainabilityPage() {

        PageFactory.initElements(driver, this);
    }


    public boolean isVerifyTitleOfPage(String title){

        logger.info("Actual -- "+getPageTitle()+" ||   Expected -- "+title);
        return isTextContain(getPageTitle(),title);
    }

    public void clickShopButtons(String shopbuttons){

        String xpath = "//div[@class='ms_desktop-only' and contains(text(),'"+shopbuttons+"')]//following::div[4]//a";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);

    }



}
