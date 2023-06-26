package config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    String getBaseUrl();

    @Key("browser")
    Browser getBrowser();

    @Key("remoteUrl")
    URL getRemoteURL();

}
