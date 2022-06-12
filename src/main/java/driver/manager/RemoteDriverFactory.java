package driver.manager;

import config.ConfigFactory;
import config.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(){
        BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();

        if(browserRemoteModeType == BrowserRemoteModeType.SELENIUMGRID){

        } else if (browserRemoteModeType == BrowserRemoteModeType.BROWSERSTACK) {

        } else {
            
        }
        
        return null;
    }
}
