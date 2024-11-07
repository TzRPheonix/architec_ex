package org.example.creation.tp.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class Configuration {
    private static volatile Configuration instance;
    private final Map<String, String> settings = new ConcurrentHashMap<>();

    private Configuration() {
        loadSettings();
    }

    public static Configuration getInstance() {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    instance = new Configuration();
                }
            }
        }
        return instance;
    }

    private void loadSettings() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Pardon, le fichier de configuration est introuvable.");
                return;
            }

            Properties prop = new Properties();
            prop.load(input);

            for (String key : prop.stringPropertyNames()) {
                settings.put(key, prop.getProperty(key));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getSetting(String key) {
        if (!settings.containsKey(key)) {
            System.err.println("Le paramètre " + key + " est introuvable.");
            return null;
        }
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}
