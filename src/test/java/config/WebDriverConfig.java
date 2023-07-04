package config;

import org.aeonbits.owner.Config;
import java.net.URL;

@Config.Sources({
        "classpath:testing.properties"
})

public interface WebDriverConfig extends Config {

    @Key("remote.driver")
    String getRemoteDriver();

}
