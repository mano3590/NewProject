package com.ariat.pages;

import com.ariat.pagefactory.AriatWorkPageFactory;
import org.openqa.selenium.support.PageFactory;

public class AriatWorkPage extends AriatWorkPageFactory {
    public static String selectedWidgetLink, selectedWidgetLinkSecondName, selectedpageUrl;

    public AriatWorkPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickAnyWidgetLinkRandomly() {
        int random = getRandomNumber(lnk_WidgetAriatWork.size());
        selectedWidgetLink = getText(lnk_WidgetAriatWork.get(random));
        click(lnk_WidgetAriatWork.get(random));
        String[] array1 = selectedWidgetLink.split(" ", selectedWidgetLink.length());
        selectedWidgetLinkSecondName = array1[1];
        System.out.println(selectedWidgetLinkSecondName);
        if (selectedWidgetLinkSecondName.equals("LACE-UP")) {
            selectedWidgetLinkSecondName = "LACE";
        } else if (selectedWidgetLinkSecondName.equals("PULL-ON")){
            selectedWidgetLinkSecondName = "PULL";
        }
    }

    public boolean clickAndVerifyBannerAndWidgets(){
        boolean flag = false;
        for (int i=0; i<lst_BannerImages.size();i++){
            waitForAriatLoadIconDisappear();
            waitVisibilityOfElement(lst_BannerImages.get(i));
            selectedpageUrl =  lst_BannerImages.get(i).getAttribute("href");
            clickButtonWithOutScroll(lst_BannerImages.get(i));
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.equalsIgnoreCase(selectedpageUrl)){
                flag = true;
            } else{
                flag = false;
                break;
            }
           driver.navigate().to("https://www.ariat.com/work");
        }
    return flag;
    }


    public boolean clickAndVerifyBannerButtons(){
        boolean flag = false;
        for (int i=0; i<lst_WorkBannerButtons.size();i++){
            waitForAriatLoadIconDisappear();
            waitVisibilityOfElement(lst_WorkBannerButtons.get(i));
            selectedpageUrl =  lst_WorkBannerButtons.get(i).getAttribute("href");
            clickButtonWithOutScroll(lst_WorkBannerButtons.get(i));
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.equalsIgnoreCase(selectedpageUrl)){
                flag = true;
            } else{
                flag = false;
                break;
            }
            driver.navigate().to("https://www.ariat.com/work");
        }
        return flag;
    }




}
