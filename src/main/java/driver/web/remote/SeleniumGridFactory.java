package driver.web.remote;

import config.enums.BrowserType;
import driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();
    }
}
