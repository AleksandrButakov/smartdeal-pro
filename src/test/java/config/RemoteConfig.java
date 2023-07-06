package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/testing.properties"
})

public interface RemoteConfig extends Config {

    @Key("remote.url")
    String getRemoteUrl();

}
