package com.ariat.pagefactory;

import com.ariat.utils.GenericWrappers;
import cucumber.api.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductRegistrationPageFactory extends GenericWrappers {

    @FindBy (xpath = "//h1[contains(@class,'prod-reg-welcome-title')]")
    public WebElement txt_ProductRegistrationWelcomeTitle;

    @FindBy (xpath = "//div[contains(@class,'prod-reg-welcome')]//button[contains(text(),'Continue')]")
    public WebElement btn_ContinueButton;

    @FindBy (xpath = "//span[@class='reg-step-count' and contains(text(),'Step 1 of 4')]")
    public WebElement txt_ProductRegistrationStepCount1;

    @FindBy (xpath = "//span[@class='reg-step-count' and contains(text(),'Step 2 of 4')]")
    public WebElement txt_ProductRegistrationStepCount2;

    @FindBy (xpath = "//span[@class='reg-step-count' and contains(text(),'Step 3 of 4')]")
    public WebElement txt_ProductRegistrationStepCount3;

    @FindBy (xpath = "//h2[@class='reg-step-title' and contains(text(),\"What's your email address?\")]")
    public WebElement txt_whatsyourEmailAddressTitle;

    @FindBy (xpath = "//label[contains(text(),'Email Address')]")
    public WebElement lbl_EmailAddressLabelName;

    @FindBy (id = "dwfrm_productregistration_email")
    public WebElement txt_EmailInputBox;

    @FindBy (xpath = "//div[@data-prod-reg-step='1']//button[contains(text(),'Continue')]")
    public WebElement btn_EmailAddressContinueButton;

    @FindBy (xpath = "//div[@data-prod-reg-step='2']//button[contains(text(),'Continue')]")
    public WebElement btn_CodeGenerationContinueButton;

    @FindBy (id = "dwfrm_productregistration_email-error")
    public WebElement txt_EmailErrorMsg;

    @FindBy (xpath = "//h2[@class='reg-step-title' and contains(text(),'What product are you registering?')]")
    public WebElement txt_WhatProductAreYourRegistringTitle;

    @FindBy (xpath = "//span[text()='Registration code']")
    public WebElement txt_RegistrationCodetext;

    @FindBy (xpath = "//p[contains(@class,'generate-code')]")
    public WebElement txt_GenerateCodeText;

    @FindBy (css = ".info-icon")
    public WebElement btn_RegistrationCodeInfoIcon;

    @FindBy (xpath = "//p[contains(@class,'generate-code')]//span[contains(@class,'js_generate-prod-reg-code')]")
    public WebElement lnk_CodeGenerateHerelink;

    @FindBy (css = ".info-content")
    public WebElement popup_codeInfoContentpopup;

    @FindBy (xpath = "//div[@class='info-content']//button[@aria-label='Close']")
    public WebElement btn_CodeGeneratorPopupCloseButton;

    @FindBy (xpath = "//div[@class='info-content']//span[text()='here']")
    public WebElement lnk_CodeGeneratorpopupHerelink;

    @FindBy (xpath = "//div[contains(@class,'prod-reg-producttype')]//p[@class='required-field']")
    public WebElement txt_RequiredText;

    @FindBy (xpath = "//div[contains(@class,'prod-reg-producttype')]//p[@class='registration-code']")
    public WebElement txt_ProductType;

    @FindBy (xpath = "//div[contains(@class,'prod-reg-producttype')]//p[text()='Please select the (3) categories which best describe your product:']")
    public WebElement txt_Select3Categorytext;

    @FindBy (xpath = "//div[contains(@class,'prod-reg-producttype')]//label[@class='js_prod-reg-category-el']")
    public WebElement txt_ProductCategory;

    @FindBy (id="ariat-select")
    public WebElement ddl_SelectProductCategory;

    @FindBy (xpath = "//div[contains(@class,'prod-reg-producttype')]//button[@disabled]")
    public WebElement btn_disabledContinueButton;

    @FindBy (xpath = "//div[contains(@class,'prod-reg-producttype')]//button[contains(text(),'Continue')]")
    public WebElement btn_ProductTypeContinueButton;











}
