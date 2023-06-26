package config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverConfigOld {

//    @Config.Key("baseUrl")
//    @Config.DefaultValue("https://github.com")
//    String getBaseUrl();
//
//    @Config.Key("browser")
//    @Config.DefaultValue("CHROME")
//    Browser getBrowser();
//
//    @Config.Key("remoteUrl")
//    @Config.DefaultValue("http://localhost:4444")
//    URL getRemoteURL();


    public String getBaseUrl() {
        // reading the value from the settings
        String baseUrl = System.getProperty("baseUrl");

        // checking the default value
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }

        return baseUrl;
        // https://github.com
    }

    public Browser getBrowser() {
        // reading the value from the settings
        String browser = System.getProperty("browser");

        // checking the default value
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }

        // returning the result with type conversion
        return Browser.valueOf(browser);

        // return Browser.CHROME;
    }

    public URL getRemoteUrl() {
        // reading the value from the settings
        String remoteUrl = System.getProperty("remoteUrl");

        // checking the default value
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "http://localhost:4444";
        }

        // returning the result with type conversion
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
