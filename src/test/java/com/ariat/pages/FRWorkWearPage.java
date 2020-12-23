package com.ariat.pages;

import com.ariat.pagefactory.FRWorkWearPageFactory;
import com.ariat.pagefactory.HeaderPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FRWorkWearPage extends FRWorkWearPageFactory {

    public static String selectedWidgetLinkName,pageUrl;

    public FRWorkWearPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickRandomFRWidgetLinksItem() {
        int randomFRWidgetLink = getRandomNumber(lst_FRWorkWearWidgetImg.size());
        selectedWidgetLinkName = getText(lst_FRWorkWearWidgetName.get(randomFRWidgetLink));
        logger.info("Selected Product +++ Product Name - " + selectedWidgetLinkName);
        clickButton(lst_FRWorkWearWidgetImg.get(randomFRWidgetLink));
    }

    public boolean isVerifyFRWorkWearWidgetsDisplayed() {
        boolean flag = false;
        for (int i = 0; i < lst_FRWorkWearWidgetImg.size(); i++) {
                if (isElementDisplayed(lst_FRWorkWearWidgetImg.get(i))) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
            }
        return flag;
    }

    public boolean isVerifyFRWorkWearWigetlinksDisplayed() {
        boolean flag = false;
        for (int i = 0; i < lst_FRWorkwearShopNowlinks.size(); i++) {
            if (isElementDisplayed(lst_FRWorkwearShopNowlinks.get(i))) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public boolean clickAndVerifyFRWorkWearWidgets(){

        boolean flag = false;
        for (int i=0; i<lst_FRWorkWearWidgetImg.size();i++){
            waitVisibilityOfElement(lst_FRWorkWearWidgetImg.get(i));
            String selectedUrl = lst_FRWorkWearWidgetImg.get(i).getAttribute("href");
            clickButtonWithOutScroll(lst_FRWorkWearWidgetImg.get(i));
            String currentUrl = driver.getCurrentUrl();
          if(selectedUrl.equals(currentUrl)){
              flag = true;
          }else {
              flag = false;
              break;
          }
            driver.navigate().to("https://www.ariat.com/fr");

        }
      return flag;
    }


    public boolean isVerifyFRWorkWearBannerButtonDisplayed(){

        return isElementDisplayed(Btn_FRWorkWearBannerBtn);
    }


    public boolean isVerifyPageHeader(String pageheader){

        return getText(txt_FRWorkWearHeader).equalsIgnoreCase(pageheader);
    }

    public void clickFRWorkWearbannerButton(){

        pageUrl = Btn_FRWorkWearBannerBtn.getAttribute("href");
        clickButtonWithOutScroll(Btn_FRWorkWearBannerBtn);
    }

}