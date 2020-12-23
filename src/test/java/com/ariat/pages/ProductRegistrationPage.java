package com.ariat.pages;

import com.ariat.pagefactory.ProductRegistrationPageFactory;
import org.openqa.selenium.support.PageFactory;

public class ProductRegistrationPage extends ProductRegistrationPageFactory {

    public ProductRegistrationPage(){

        PageFactory.initElements(driver, this);
    }


}
