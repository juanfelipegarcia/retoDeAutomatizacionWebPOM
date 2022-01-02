package co.com.sofka.page.common;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.*;

public class CommonActionOnPages {
    private WebDriver driver;
    private WebDriverWait wait;

    public CommonActionOnPages(WebDriver driver) {
        this.driver = driver;
    }
    protected void explicitWait() {
        wait = new WebDriverWait(driver, 5);
    }

    public void typeInto(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

    public void clearText(By locator){
        driver.findElement(locator).clear();
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void tab(By locator){
        driver.findElement(locator).sendKeys(TAB);
    }

    public void findElement(By locator){
        driver.findElement(locator);
    }

    public void enter(By locator){
        driver.findElement(locator).sendKeys(ENTER);
    }

    public void addFile(By locator, String add){
        driver.findElement(locator).sendKeys(add);
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    protected void scrollTo(By locator){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
    }
    public void implicitWaitTime(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds , TimeUnit.SECONDS);
    }

    protected void explicitWaitTime(By locator){
        wait =new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitToBeClickable(By locator){
        this.wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitGeneral (By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public boolean isElementPresent(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }


}
