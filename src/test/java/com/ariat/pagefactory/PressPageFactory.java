package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PressPageFactory extends GenericWrappers {

    @FindBy (xpath = "//div[@class='ms_desktop-only' and contains(text(),'For Press')]//following::div[3]")
    public WebElement txt_ForInquireDetails;

    @FindBy (xpath = "//picture[@class='amp-dc-image cardImage']//following::div//a[@title='READ MORE']")
    public List<WebElement> lst_PressReadMoreLinks;

    @FindBy (xpath = "//picture[@class='amp-dc-image cardImage']")
    public  List<WebElement> lst_PressWidgetImages;

}
