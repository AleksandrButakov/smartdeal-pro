package config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Key("array")
    String[] getFruitsArray();

    @Key("array")
    @Separator(";")
    @DefaultValue("orange; banana")
    List<String> getFruitsArrayWithSeparator();

    @Key("list")
    List<String> getFruitsList();

    @Key("list")
    @DefaultValue("orange; banana")
    List<String> getFruitsArrayWithDefaultValues();

}
