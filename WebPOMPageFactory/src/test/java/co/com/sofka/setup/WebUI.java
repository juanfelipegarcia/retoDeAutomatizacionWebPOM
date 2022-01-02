package co.com.sofka.setup;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static io.cucumber.messages.internal.com.google.common.base.StandardSystemProperty.USER_DIR;


public class WebUI {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";

    private static final String WEBDRIVER_CHROME_DRIVER_PATH = "src\\test\\resources\\driver.windows\\chrome\\chromedriver.exe";

    private static final String ZONA_FIT_URL = "https://zonafit.co/";

    protected WebDriver driver;

    protected void setUpWebdriver(){
        System.setProperty(WEBDRIVER_CHROME_DRIVER, WEBDRIVER_CHROME_DRIVER_PATH);
    }

    protected void setUpWebdriverUrl(){
        driver = new ChromeDriver();
        driver.get(ZONA_FIT_URL);
        maximize();
    }

    protected void generalSetUp(){
        setUplog4j();
        setUpWebdriver();
        setUpWebdriverUrl();

    }

    protected void quietDriver(){
        driver.close();
    }

    private void maximize(){
        driver.manage().window().maximize();
    }


    private void setUplog4j(){
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }


}
