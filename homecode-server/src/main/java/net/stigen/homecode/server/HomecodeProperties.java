package net.stigen.homecode.server;

import net.stigen.homecode.common.exception.HomecodeException;

import java.io.FileInputStream;
import java.util.Properties;

public class HomecodeProperties {

    enum EProperties{
        BIND_PORT("homecode.bind_port"),
        WWW_ROOT("homecode.www_root"),
        MAX_REQUESTS("homecode.max_requests"),
        CONFIG_FILE("homecode.config_file");

        private final String value;

        private EProperties(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

    private static Properties properties;

    public static String get(EProperties property) {
        if(properties == null){
            properties = loadProperties(System.getProperty(EProperties.CONFIG_FILE.getValue()));
        }

        return properties.getProperty(property.getValue());
    }

    public static int getInt(EProperties property){
        return Integer.valueOf(get(property));
    }

    private static Properties loadProperties(String filename) {
        try{
            FileInputStream propertiesFile = new FileInputStream(filename);
            Properties currentProperties = new Properties();
            currentProperties.load(propertiesFile);
            return currentProperties;
        } catch (Exception ex){
            throw new HomecodeException("Could not load properties", ex);
        }
    }
}
