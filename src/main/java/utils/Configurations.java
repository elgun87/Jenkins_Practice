package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurations {

    static Properties properties = new Properties();
    static FileInputStream fileInpute = null;
    static FileOutputStream fileOut = null;

    static {
        try {
            fileInpute = new FileInputStream("C:\\Users\\elgun\\IdeaProjects\\Maven_Practice\\src\\main\\configuration.properties");
            properties.load(fileInpute);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInpute.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
