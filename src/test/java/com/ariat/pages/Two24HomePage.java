package com.ariat.pages;

import com.ariat.pagefactory.Two24HomePageFactory;
import org.openqa.selenium.support.PageFactory;

public class Two24HomePage extends Two24HomePageFactory {

    private final String MEN_COLLECTION = "Men's Collection";
    private final String WOMEN_COLLECTION = "Women's Collection";

    public Two24HomePage(){

        PageFactory.initElements(driver, this);
    }

    public void selectBannerButton(String button){

        switch (button){
            case MEN_COLLECTION:
                clickButtonWithOutScroll(btn_MenCollection);
                break;
            case WOMEN_COLLECTION:
                clickButtonWithOutScroll(btn_WomenCollection);
                break;
            default:
                logger.info("Entered button Not Available");
        }
    }
}
