package driver.manager.web.remote.selenium;

import config.ConfigFactory;
import config.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridFirefoxManager {
    public static WebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "firefox");
        cap.setCapability("enableVNC", true);
        cap.setCapability("enableVideo", false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), cap);
    }
}
