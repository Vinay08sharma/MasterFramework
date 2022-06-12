package driver.web.remote;

import config.enums.BrowserRemoteModeType;
import config.enums.BrowserType;
import driver.web.remote.SeleniumGridFactory;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){

        if(browserRemoteModeType == BrowserRemoteModeType.SELENIUMGRID){
            return SeleniumGridFactory.getDriver(browserType);

        } else if (browserRemoteModeType == BrowserRemoteModeType.BROWSERSTACK) {
                return BrowserStackDriverFactory.getDriver(browserType);
        } else {
            return selenoidFactory.getDriver(browserType);
            
        }
    }
}
