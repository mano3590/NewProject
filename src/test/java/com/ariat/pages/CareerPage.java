package com.ariat.pages;

import com.ariat.pagefactory.CareerPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CareerPage extends CareerPageFactory {

    public CareerPage() {

        PageFactory.initElements(driver, this);
    }

    public void verifyViewPositionBtn(List<String> link) {
        for (int i = 0; i < link.size(); i++) {
            careersViewPositionsBtnValidation (link.get(i));
        }
    }

    public boolean careersViewPositionsBtnValidation(String links){
        String xpath = "//div[contains(@class,'item')]//a[@title='"+links+"']";
        WebElement element = driver.findElement(By.xpath(xpath));
        System.out.println(element.getText());
        return getText(element).equalsIgnoreCase(links);
    }

    public boolean isVerifyCarrersimgsDisplayed(List<String> carrerimgs){
        boolean flag = false;
        for (int i=0; i<carrerimgs.size();i++){
            String xpath = "//div[@class='ms_desktop-only' and contains(text(),'"+carrerimgs.get(i)+"')]//following::div[5]//picture";
            WebElement element = driver.findElement(By.xpath(xpath));
            flag = isElementDisplayed(element);;
        }
        return flag;
    }

    public boolean isVerifyCarrersBtnLinksDisplayed(List<String> carrerBtnlinks){
        boolean flag = false;
        for (int i=0; i<carrerBtnlinks.size();i++){
            String xpath = "//div[@class='ms_desktop-only' and contains(text(),'"+carrerBtnlinks.get(i)+"')]//following::div[4]//a";
            WebElement element = driver.findElement(By.xpath(xpath));
            flag = isElementDisplayed(element);

        }
        return flag;
    }

    public void clickCarrersActionBtn(String actionbutton){

        String xpath = "//div[@class='ms_desktop-only' and contains(text(),'"+actionbutton+"')]//following::div[4]//a";
        WebElement element = driver.findElement(By.xpath(xpath));
        clickButtonWithOutScroll(element);

    }

    public boolean isVerifyTitleOfCarrerPage(String title){
        switchToLastWindow();
        waitVisibilityOfElement(txt_CareerOpportunities);
        logger.info("Actual -- "+getPageTitle()+" ||   Expected -- "+title);
        return getPageTitle().equalsIgnoreCase(title);
    }
}

