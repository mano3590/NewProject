package com.ariat.pages;

import com.ariat.pagefactory.ContactUsPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactUsPage extends ContactUsPageFactory {

    public ContactUsPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickClickherelink(){

        clickButtonWithOutScroll(lnk_clickherelink);
    }

    public boolean isVerifyContactHeadersDisplayed(List<String> headers){

        boolean flag = false;
        for (int i=0;i<headers.size();i++){

           String xpath = "//div[@class='content-asset ariat-content-asset']//h5[text()='"+headers.get(i)+"']";
            WebElement element = driver.findElementByXPath(xpath);
            if (getText(element).equalsIgnoreCase(headers.get(i))){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }















}
