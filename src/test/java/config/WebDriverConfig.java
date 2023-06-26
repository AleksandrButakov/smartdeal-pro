package config;

import org.aeonbits.owner.Config;

import java.net.URL;

public class WebDriverConfig {

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
        String baseUrl = System.getProperty("baseUrl");
        return baseUrl;
        // https://github.com
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        // return Browser.CHROME;
        return Browser.valueOf(browser);
    }

}
