package driver;

import config.ConfigFactory;
import config.enums.BrowserType;
import driver.manager.ChromeManager;
import driver.manager.FirefoxManager;
import org.openqa.selenium.WebDriver;

public class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver;

        if (isBrowserChrome())
           driver = ChromeManager.getDriver();
        else
           driver = FirefoxManager.getDriver();

        return driver;

    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
