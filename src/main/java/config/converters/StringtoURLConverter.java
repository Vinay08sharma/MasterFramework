package config.converters;

import config.enums.BrowserRemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class StringtoURLConverter implements Converter<URL> {

    @Override
    public URL convert(Method method, String stringUrl) {
        try {
            return new URL(stringUrl);
        } catch (MalformedURLException e) {
            System.out.println("Incorrect URL");
        }
        return null;
    }
}
