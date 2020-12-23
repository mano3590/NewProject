package com.ariat.pages;

import com.ariat.pagefactory.AboutUsPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AboutUsPage extends AboutUsPageFactory{

    public static String aboutUsLinkName;

    public AboutUsPage() {

        PageFactory.initElements(driver, this);
    }


    public boolean isAboutUsPageLinksDisplayed(List<String> link) {

        boolean flag = true;
        for (int i = 0; i < link.size(); i++) {

            if(!isAboutUsLinksDisplayed(link.get(i))){

                flag = false;
                break;
            }
        }
        return flag;
    }


    public boolean isAboutUsLinksDisplayed(String links){

        String xpath = "//div[contains(@class,'item')]//a[@title='"+links+"']";
        WebElement element = driver.findElement(By.xpath(xpath));
       logger.info("Displayed Value +++ Actual "+getText(element)+"  ++ Expected "+links);
        return getText(element).equalsIgnoreCase(links);
    }


    public boolean isWidgetLinksDisplayed() {

        boolean flag = true;
        for (int j = 0; j < lst_AboutusWidgetsimg.size(); j++) {

            if (!isElementDisplayed(lst_AboutusWidgetsimg.get(j))){

                flag = false;
                break;
            }
        }
        return flag;
    }

    public void clickCarrerlink() {
        scrollByPixel();
        click(lnk_Careers);
    }

    public void clickGivinglink() {
        scrollByPixel();
        click(lnk_Giving);
    }

    public void clickSustainabilityLink(){

        clickButtonWithOutScroll(lnk_Sustainability);
    }

    public void clickPressLink(){

        clickButtonWithOutScroll(lnk_Press);
    }

}




