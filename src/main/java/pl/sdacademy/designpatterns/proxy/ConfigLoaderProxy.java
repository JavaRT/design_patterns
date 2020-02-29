package pl.sdacademy.designpatterns.proxy;

public class ConfigLoaderProxy implements ConfigLoader{
    private final ConfigLoader configLoader;
    private String configuration ;

    public ConfigLoaderProxy(ConfigLoader configLoader) {
        this.configLoader = configLoader;
    }

    @Override
    public String load() {
        if (configuration == null ) {
            configuration = configLoader.load();
        }
        return configuration;
    }
}

