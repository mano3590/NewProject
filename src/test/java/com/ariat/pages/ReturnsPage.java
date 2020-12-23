package com.ariat.pages;

import com.ariat.pagefactory.ReturnsPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ReturnsPage extends ReturnsPageFactory {
    private final String FIRST_BUTTON = "first button";
    private final String SECOND_BUTTON = "second button";
    private final String THIRD_BUTTON = "third button";
    private final String FOURTH_BUTTON = "fourth button";
    private final String FIFTH_BUTTON = "fifth button";
    private final String FIRST_BUTTON_LINK = "first button link";
    private final String SECOND_BUTTON_LINK = "second button link";
    private final String FOURTH_BUTTON_LINK = "fourth button link";
    private final String FIRST_CONTENT_DESCRIPTION = "first content description";
    private final String SECOND_CONTENT_DESCRIPTION = "second content description";
    private final String THIRD_CONTENT_DESCRIPTION = "third content description";
    private final String FOURTH_CONTENT_DESCRIPTION = "fourth content description";
    private final String FIFTH_CONTENT_DESCRIPTION = "fifth content description";
    private final String FIRST_BUTTON_CONTACTNUMBER = "first button contactnumber";
    private final String FIRST_BUTTON_EMAIL = "first button email";
    private final String SECOND_BUTTON_CONTACTNUMBER = "second button contactnumber";
    private final String SECOND_BUTTON_EMAIL = "second button email";
    private final String THIRD_BUTTON_EMAIL = "third button email";
    private final String FIRST_BUTTON_HEADER = "first button header";
    private final String SECOND_BUTTON_HEADER = "second button header";
    private final String THIRD_BUTTON_HEADER = "third button header";
    private final String FOURTH_BUTTON_HEADER = "fourth button header";
    private final String FIFTH_BUTTON_HEADER = "fifth button header";

    public ReturnsPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isButtonsDisplayedinReturn() {
        return isElementDisplayed(btn_AllReturn);
    }


    public void clickContentBox(String linksAndButtons) {

        WebElement element = null;
        switch (linksAndButtons.toLowerCase()) {

            case FIRST_BUTTON:
                element = btn_FirstReturn;
                break;
            case SECOND_BUTTON:
                element = btn_SecondReturn;
                break;
            case THIRD_BUTTON:
                element = btn_ThirdReturn;
                break;
            case FOURTH_BUTTON:
                element = btn_FourReturn;
                break;
            case FIFTH_BUTTON:
                element = btn_FiveReturn;
                break;
            case FIRST_BUTTON_LINK:
                element = lnk_RequestReturnFirstButton;
                break;
            case SECOND_BUTTON_LINK:
                element = lnk_RequestReturnSecondButton;
                break;
            case FOURTH_BUTTON_LINK:
                element = lnk_RequestReturnFourthButton;
                break;

            default:
                logger.info("Enter Submenu Not Available");
        }
        highLighterMethod(driver, element);
        clickButtonWithOutScroll(element);



    }


    public boolean isAllElementDisplayed(String linksAndButtons) {

        WebElement element = null;
        switch (linksAndButtons.toLowerCase()) {

            case FIRST_BUTTON_CONTACTNUMBER:
                element = lnk_PhoneNoFirstButton;
                break;
            case FIRST_BUTTON_EMAIL:
                element = lnk_EmailFirstButton;
                break;
            case SECOND_BUTTON_CONTACTNUMBER:
                element = lnk_PhoneNoSecondButton;
                break;
            case SECOND_BUTTON_EMAIL:
                element = lnk_EmailSecondButton;
                break;
            case THIRD_BUTTON_EMAIL:
                element = lnk_EmailThirdButton;
                break;
            case FIRST_CONTENT_DESCRIPTION:
                element = lbl_FirstContent;
                break;
            case SECOND_CONTENT_DESCRIPTION:
                element = lbl_SecondContent;
                break;
            case THIRD_CONTENT_DESCRIPTION:
                element = lbl_ThirdContent;
                break;
            case FOURTH_CONTENT_DESCRIPTION:
                element = lbl_FourContent;
                break;
            case FIFTH_CONTENT_DESCRIPTION:
                element = lbl_FiveContent;
                break;
            case FIRST_BUTTON_HEADER:
                element = lbl_FirstButtonHeader;
                break;
            case SECOND_BUTTON_HEADER:
                element = lbl_SecondButtonHeader;
                break;
            case THIRD_BUTTON_HEADER:
                element = lbl_ThirdButtonHeader;
                break;
            case FOURTH_BUTTON_HEADER:
                element = lbl_FourthButtonHeader;
                break;
            case FIFTH_BUTTON_HEADER:
                element = lbl_FifthButtonHeader;
                break;
            default:
                logger.info("Enter Submenu Not Available");
        }
        scrollByPixel();
        return isElementDisplayedWithoutScroll(element);


    }
}
