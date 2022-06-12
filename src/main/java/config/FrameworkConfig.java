package config;

import config.converters.StringToBrowserType;
import config.converters.StringtoURLConverter;
import config.enums.BrowserRemoteModeType;
import config.enums.BrowserType;
import config.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserType.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringtoURLConverter.class)
    @Key("seleniumGridURL")
    URL seleniumGridURL();

    @ConverterClass(StringtoURLConverter.class)
    @Key("selenoidURL")
    URL selenoidURL();

    @ConverterClass(StringtoURLConverter.class)
    @Key("browserStackURL")
    URL browserStackURL();
}
