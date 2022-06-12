package driver.manager.web.remote.browserstack;

import config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackFirefoxManager {
    public static WebDriver getDriver() {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "firefox");
        cap.setCapability("browser_version", "latest");
        cap.setCapability("os", "Windows");
        cap.setCapability("os_version", "11");
        return new RemoteWebDriver(ConfigFactory.getConfig().browserStackURL(), cap);

    }
}
