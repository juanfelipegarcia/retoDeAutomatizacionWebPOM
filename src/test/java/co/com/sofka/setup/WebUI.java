package co.com.sofka.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUI {

    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_DRIVER_PATH = "src\\test\\resources\\driver.windows\\chrome\\chromedriver.exe";
    private static final String DEMO_QA_URL = "https://www.despegar.com.co";

    protected WebDriver driver;

    protected void setUpWebdriver(){
        System.setProperty(WEBDRIVER_CHROME_DRIVER, WEBDRIVER_CHROME_DRIVER_PATH);
    }

    protected void setUpWebdriverUrl(){
        driver = new ChromeDriver();
        driver.get(DEMO_QA_URL);
    }

    protected void generalSetUp(){
        setUpWebdriver();
        setUpWebdriverUrl();
        //maximize();
    }

    protected void quietDriver(){
        driver.close();
    }

    private void maximize(){
        driver.manage().window().maximize();
    }


}
