package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/testing.properties"
})

public interface RemoteDriverConfig extends Config {

    @Key("remote.driver")
    String getRemoteDriver();

}
