package org.example.creation.tp.singleton;

public class    Demo {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();

        System.out.println("URL de la base de données : " + config.getSetting("database.url"));
        System.out.println("Environnement : " + config.getSetting("environment"));

        config.setSetting("api.key", "THOMAS LA CLE");
        System.out.println("Nouvelle clé API : " + config.getSetting("api.key"));

        Configuration anotherConfig = Configuration.getInstance();
        System.out.println("Clé API dans l'autre instance : " + anotherConfig.getSetting("api.key"));
    }
}
