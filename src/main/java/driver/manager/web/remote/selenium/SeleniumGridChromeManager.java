package driver.manager.web.remote.selenium;

import config.ConfigFactory;
import config.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridChromeManager {
    public static WebDriver getDriver() {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(String.valueOf(BrowserType.CHROME));
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), cap);

    }
}
