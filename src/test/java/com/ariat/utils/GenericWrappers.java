package com.ariat.utils;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.ConfigurationFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class GenericWrappers extends Base implements Wrappers, Wrappers.SelectDropDown{

    public Logger logger = Logger.getLogger(String.valueOf(GenericWrappers.class));
    public static RemoteWebDriver driver;
    private static Configuration config = null;
    private String appUrl, stagingUserName, stagingPassword, devUserName, devPassword;
    private String browser;
    public static int implicit, explicit;
    private Select select;

    public GenericWrappers() {

        ConfigurationFactory factory = new ConfigurationFactory("src/test/configFile/config.xml");
        try {
            config = factory.getConfiguration();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
        appUrl = config.getString("url");
        stagingUserName = config.getString("stagingUserName");
        stagingPassword = config.getString("stagingPassword");
        devUserName = config.getString("devUserName");
        devPassword = config.getString("devPassword");
        browser = config.getString("browser").toLowerCase();
        implicit = Integer.parseInt(config.getString("implicit").toLowerCase());
        explicit = Integer.parseInt(config.getString("explicit").toLowerCase());
    }

    public void invokeApp(){

        launchWinBrowser();
    }

    public String setUrl(String url){
        appUrl = url;
        if(appUrl.equalsIgnoreCase(Variable.DEV_URL)){
            appUrl = config.getString("url").replace("//", "//"+devUserName+":"+devPassword+"@");
        }else if(appUrl.equalsIgnoreCase(Variable.STAG_URL)){
            appUrl = appUrl = config.getString("url").replace("//", "//"+stagingUserName+":"+stagingPassword+"@");
        }
        return appUrl;
    }

    public void launchWinBrowser(){

        if (browser.toLowerCase().equals(Variable.CHROME)) {

            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
            driver = new ChromeDriver();
        }else if (browser.toLowerCase().equals(Variable.FIREFOX)) {

            System.setProperty("webdriver.gecko.driver", "./driver/firefox.exe");
            driver = new FirefoxDriver();
        }else if (browser.toLowerCase().equals(Variable.IE)){

            System.setProperty("webdriver.ie.driver", "./driver/ie.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        setImplicit(implicit);
        getUrl(setUrl(appUrl));
        driver.navigate().refresh();

    }

    public void getUrl(String url){

        driver.navigate().to(url);
    }

    public void setImplicit(int timeOut){

        driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
    }


    public int setDefaultExplicit(){

        return Integer.parseInt(config.getString("explicit").toLowerCase());
    }

    public int setDefaultImplicit(){

        return Integer.parseInt(config.getString("implicit").toLowerCase());
    }

    public WebDriverWait webDriverWait(){

        return new WebDriverWait(driver, explicit);
    }

    public void quitBrowser() {

        driver.quit();
    }

    public void closeBrowser() {

        driver.close();
    }

    public void mouseOver(WebElement element) {

        waitVisibilityOfElement(element);
        new Actions(driver).moveToElement(element).build().perform();
    }

    public void mouseOver(List<WebElement> element, int index) {

        waitVisibilityOfElement(element.get(index));
        new Actions(driver).moveToElement(element.get(index)).build().perform();
    }

    public String getText(WebElement element){

        //waitVisibilityOfElement(element);
        highLighterMethod(driver, element);
        //scrollToElement(element);
        logger.info("Element Text - " + element.getText());
        return element.getText();
    }

    public boolean isTextMatch(String actual, String expected) {

        logger.info("Actual Value - "+ actual + "\n" +"Expected Value - " + expected);
        return actual.equalsIgnoreCase(expected);
    }

    public boolean isElementTextMatch(WebElement actualElement, String expected){

        return isTextContain(getText(actualElement), expected);
    }

    public boolean isTextContain(String actual, String expected) {

        logger.info("Actual text - " + actual + "\n" + "Expected text - " + expected);
        return actual.contains(expected);
    }

    public void waitFor(int sleepTime){

        try {

            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public void clickButton(WebElement element) {

        scrollToElement(element);
        waitVisibilityOfElement(element);
        waitElementToBeClickable(element);
        element.click();
    }

    public void clickButtonWithOutScroll(WebElement element) {

        waitVisibilityOfElement(element);
        waitElementToBeClickable(element);
        highLighterMethod(driver,element);
        element.click();
    }

    public void click(WebElement element){
        highLighterMethod(driver,element);
        element.click();
    }

    public void scrollToTop() {

        JavascriptExecutor js =  (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,0)");
        waitFor(1000);
    }

    public By locateXpath(String xpath){

        return By.xpath(xpath);
    }

    public By locateCss(String css){

        return By.cssSelector(css);
    }

    public void clickButton(WebElement scrollToElement, WebElement clickElement) {

        waitFor(1000);
        scrollToElement(scrollToElement);
        waitVisibilityOfElement(clickElement);
        waitElementToBeClickable(clickElement);
        clickElement.click();
    }

    public void clickDropDown(WebElement element, String xpath) {

        waitFor(1000);
        waitPresenceOfElementLocated(locateCss(xpath));
        element.click();
    }

    public void enterText(WebElement element, String ... textValue) {

        scrollToElement(element);
        waitVisibilityOfElement(element);
        element.clear();
        logger.info("Entered Text - " + textValue);
        element.sendKeys(textValue);
    }

    public void enterTextWithoutScroll(WebElement element, String textValue) {

        waitVisibilityOfElement(element);
        element.clear();
        logger.info("Entered Text - " + textValue);
        element.sendKeys(textValue);
    }

    public void waitVisibilityOfElement(WebElement element) {

        webDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementToBeClickable(WebElement element) {

        webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitPresenceOfElementLocated(By by) {

        webDriverWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void switchToParentWindow() {

        Set<String> winHandles = driver.getWindowHandles();
        for (String wHandle : winHandles) {
            driver.switchTo().window(wHandle);
            break;
        }
    }

    public void switchToLastWindow() {

        Set<String> winHandles = driver.getWindowHandles();
        for (String wHandle : winHandles) {

            driver.switchTo().window(wHandle);
        }
    }

    public void highLighterMethod(WebDriver driver, WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid blue;');", element);
    }

    public boolean isElementDisplayed(List<WebElement> elements) {

        return !elements.isEmpty();
    }

    public boolean isElementDisplayed(WebElement element){

        boolean flag;
        try {
            setImplicit(10);
            //scrollToElement(element);
            highLighterMethod(driver, element);
            element.isDisplayed();
            flag = true;
        }catch (Exception e){

            flag = false;
        }finally {

            setDefaultImplicit();
        }
        logger.info("Is element " + element + " displayed - "+flag);
        return flag;
    }

    public boolean isElementDisplayedWithoutScroll(WebElement element){

        boolean flag;
        try {

            waitFor(1000);
            setImplicit(10);
            highLighterMethod(driver, element);
            element.isDisplayed();
            flag = true;
        }catch (Exception e){

            setImplicit(implicit);
            flag = false;
        }
        logger.info("Is element " + element + " displayed - "+flag);
        return flag;
    }

    public boolean isElementEnabled(WebElement element){

        boolean flag;
        try {

            waitFor(1000);
            setImplicit(10);
            scrollToElement(element);
            highLighterMethod(driver, element);
            element.isEnabled();
            flag = true;
        }catch (Exception e){

            setImplicit(implicit);
            flag = false;
        }
        logger.info("Is element " + element + " enabled - "+flag);
        return flag;
    }

    public boolean isEnabled(WebElement element){

        logger.info("Is element " + element + "enabled - "+element.isEnabled());
        return element.isEnabled();
    }

    public String getAttributeValue(WebElement element, String attributeName){

        waitVisibilityOfElement(element);
        logger.info("Attribute Value - "+element.getAttribute(attributeName));
        return element.getAttribute(attributeName);
    }

    public void takeSnap(Scenario scenario) throws IOException {

        String scrname = scenario.getId().replace(";","").replace("-","");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(scrFile,
                new File(getCurrentDir() + "/target/FailureScreenShots/" + scrname + ".png"));
        System.out.println("inside screenshot");
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        Reporter.addScreenCaptureFromPath(
                "./FailureScreenShots/"+scrname+".png");
        driver.quit();
    }

    public static String getCurrentDir(){

        String currentDir = System.getProperty("user.dir");
        currentDir = currentDir.replace('\\', '/');
        return currentDir;
    }

    public void scrollToElement(WebElement element) {

        waitFor(5000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollByPixel() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

    }

    public void scrollByPixelTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-400)", "");

    }

    public Select selectDropdown(WebElement element){

        select = new Select(element);
        return select;
    }

    public void selectByIndex(WebElement element, int index) {

        selectDropdown(element).selectByIndex(index);
    }

    public void SelectByValue(WebElement element, String value) {

        selectDropdown(element).selectByValue(value);
    }

    public void SelectByVisibleText(WebElement element, String text) {

        selectDropdown(element).selectByVisibleText(text);
    }

    public void waitForLoadIconDisappear(){

        webDriverWait().until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".oak-searchResults_preloader")));
    }

    public void waitForAriatLoadIconDisappear(){

        webDriverWait().until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".spinner")));
    }

    public boolean isVerifyTitleOfPage(String title){
        webDriverWait();
        logger.info("Actual -- "+getPageTitle()+" ||   Expected -- "+title);
        return getPageTitle().equalsIgnoreCase(title);
    }

    public String getPageTitle() {

        waitFor(2000);
        return driver.getTitle();
    }

    /****
     * swipe element right or left by co-ordinated
     * @param element
     * @param offSet - (-1 swipe left or +1 swipe right)
     */
    public void swipeByX(WebElement element, int offSet){

        Point point = element.getLocation();
        Actions actions = new Actions(driver);
        System.out.println("val: "+point.getX());
        actions.dragAndDropBy(element, point.getX()-offSet, point.getY()).build().perform();
    }
    public void swipeByXCoordinates(WebElement element, int offSet){

        Point point = element.getLocation();
        Actions actions = new Actions(driver);
        System.out.println("val: "+point.getX());
        actions.dragAndDropBy(element, offSet, point.getY()).build().perform();
    }

    public WebElement getXpathElement(String xpath){

        return driver.findElement(By.xpath(xpath));
    }

    public void switchToFirstFrame() {

        List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
        driver.switchTo().frame(frames.get(0));

    }

    public void switchToFrameByIndex(int frameIndex) {
        List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
        driver.switchTo().frame(frames.get(frameIndex));
    }
    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }
}
