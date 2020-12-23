package com.ariat.pages;

import com.ariat.pagefactory.PressPageFactory;
import org.openqa.selenium.support.PageFactory;

public class PressPage extends PressPageFactory {

    public PressPage(){

        PageFactory.initElements(driver, this);
    }

    public boolean verifyForInquireBlockDisplayed(){

        return isElementDisplayed(txt_ForInquireDetails);
    }

    public boolean isPressBlockImagesDisplayed() {

        boolean flag = true;
        for (int j = 0; j <lst_PressWidgetImages.size(); j++) {

            if (!isElementDisplayed(lst_PressWidgetImages.get(j))){

                flag = false;
                break;
            }
        }
        return flag;
    }


    public boolean isPressReadMoreDisplayed() {

        boolean flag = true;
        for (int j = 0; j <lst_PressReadMoreLinks.size(); j++) {

            if (!isElementDisplayed(lst_PressReadMoreLinks.get(j))){

                flag = false;
                break;
            }
        }
        return flag;
    }

}
