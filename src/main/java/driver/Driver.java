package driver;

import config.ConfigFactory;
import config.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    static WebDriver driver = null;

    public static void initDriver() { //LocalDriverFactory
        LocalDriverFactory.getDriver()

        driver.get("https://www.google.co.in/");
    }

    public static void tearDown() {
        driver.quit();
    }
}
