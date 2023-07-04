package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:testing.properties"
})

public interface BrowserConfig extends Config {

    @Key("browser.type")
    String getBrowserType();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("browser.size")
    String getBrowserSize();

}