package driver.manager.web.remote.selenoid;

import config.ConfigFactory;
import config.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenoidChromeManager {
    public static WebDriver getDriver() {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");
        cap.setCapability("enableVNC", true);
        cap.setCapability("enableVideo", false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), cap);

    }
}
