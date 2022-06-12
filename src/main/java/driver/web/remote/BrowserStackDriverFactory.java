package driver.web.remote;

import config.enums.BrowserType;
import driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import driver.manager.web.remote.selenoid.SelenoidChromeManager;
import driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class BrowserStackDriverFactory {

    private BrowserStackDriverFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();
    }
}
