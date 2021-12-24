package co.com.sofka.page.common;


import org.openqa.selenium.*;

public class CommonActionOnPages {
    private WebDriver driver;

    public CommonActionOnPages(WebDriver driver) {
        this.driver = driver;
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



    public void findElement(By locator){
        driver.findElement(locator);
    }

    public void enter(By locator){
        driver.findElement(locator).sendKeys(Keys.ENTER);
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

    public void scrollTo(By locator){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
    }


}
