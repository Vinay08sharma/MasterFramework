package driver.web.remote;

import config.enums.BrowserType;
import driver.manager.web.remote.selenoid.SelenoidChromeManager;
import driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class selenoidFactory {

    private selenoidFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidFirefoxManager.getDriver();
    }
}
