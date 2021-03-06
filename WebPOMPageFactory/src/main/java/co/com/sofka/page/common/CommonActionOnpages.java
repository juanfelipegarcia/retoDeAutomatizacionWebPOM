package co.com.sofka.page.common;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static co.com.sofka.util.LimitTimeWait.FIVE_SECONDS;
import static co.com.sofka.util.LimitTimeWait.TEN_SECONDS;
import static org.openqa.selenium.Keys.TAB;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class CommonActionOnpages extends BaseSikulix{
    private final WebDriver driver;
    private WebDriverWait typeWait;

    public CommonActionOnpages (WebDriver driver) {
        this.driver = driver;
        explicitWaitInit();
    }

    protected void explicitWaitInit () {
        typeWait = new WebDriverWait(driver, TEN_SECONDS.getValue());
    }
    protected void explicitWait() {
        typeWait = new WebDriverWait(driver, TEN_SECONDS.getValue());
    }

    protected void waitGeneral (WebElement webElement) {
        typeWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected void scrollDown () {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    protected void scrollUp () {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-200)");
    }

    // BY

    protected void clearText (By locator) {
        driver.findElement(locator).clear();
    }

    protected void typeInto (By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    protected void click (By locator) {
        driver.findElement(locator).click();
    }

    protected void pathFile (By locator, String path) {
        driver.findElement(locator).sendKeys(path);
    }

    protected void pressEnter (By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public void scrollTo (By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
    }

    protected void explicitWaitTime(By locator){
        typeWait =new WebDriverWait(driver,10);
        typeWait.until(ExpectedConditions.elementToBeClickable(locator));

    }

    public void tab(By locator){
        driver.findElement(locator).sendKeys(TAB);
    }

    protected String getText (By locator) {
        return driver.findElement(locator).getText();
    }

    //WEB ELEMENT

    protected void clearText (WebElement webElement) {
        webElement.clear();
    }

    protected void typeInto (WebElement webElement, String value) {
        webElement.sendKeys(value);
    }

    protected void click (WebElement webElement) {
        webElement.click();

    }

    protected void waitClick (WebElement webElement) {
        typeWait.until(elementToBeClickable(webElement)).click();
    }

    protected void pathFile (WebElement webElement, String path) {
        webElement.sendKeys(path);
    }

    protected void pressEnter (WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    public void scrollTo (WebElement webElement) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", webElement);
    }
    protected void explicitWaitTime(WebElement webElement){
        typeWait =new WebDriverWait(driver,100);
        typeWait.until(ExpectedConditions.elementToBeClickable(webElement));

    }

    public void tab(WebElement webElement){
        webElement.sendKeys(Keys.TAB);
    }

    protected String getText (WebElement webElement) {
        return webElement.getText();
    }







}
