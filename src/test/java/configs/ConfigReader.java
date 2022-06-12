package configs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;
    static {
        String propertyFilePath = "config.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(propertyFilePath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBrowserName(String key){
        String browser = properties.getProperty(key);
        if(browser!= null) return browser;
        else throw new RuntimeException("browser not specified in the config.properties file.");

    }
    public static String getApplicationUrl(String key){
        String url = properties.getProperty(key);
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the config.properties file.");
    }

    public static String getApiUrl(String key){
        String apiurl = properties.getProperty(key);
        if(apiurl != null) return apiurl;
        else throw new RuntimeException("Api url not specified in the config.properties file.");
    }
}