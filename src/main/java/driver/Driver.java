package driver;

import config.ConfigFactory;
import driver.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

    static WebDriver driver = null;

    public static void initDriver() { //LocalDriverFactory
        LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());

        driver.get("https://www.google.co.in/");
    }

    public static void tearDown() {
        driver.quit();
    }
}
