package org.example.creation.tp.answer;

import java.util.ArrayList;
import java.util.List;

public class ModularCars {
    private String modele;
    private String motorType;
    private String color;
    private int siegeNumber;
    private List<String> extras;

    private ModularCars(ModularCarsBuilder builder) {
        this.modele = builder.modele;
        this.motorType = builder.motorType;
        this.color = builder.color;
        this.siegeNumber = builder.siegeNumber;
        this.extras = builder.extras;
    }

    public String getModele() {
        return modele;
    }

    public String getMotorType() {
        return motorType;
    }

    public String getColor() {
        return color;
    }

    public int getSiegeNumber() {
        return siegeNumber;
    }

    public List<String> getExtras() {
        return extras;
    }

    @Override
    public String toString() {
        return "ModularCars{" +
                "modele='" + modele + '\'' +
                ", motorType='" + motorType + '\'' +
                ", color='" + color + '\'' +
                ", siegeNumber=" + siegeNumber +
                ", extras=" + extras +
                '}';
    }

    public static class ModularCarsBuilder {
        private String modele;
        private String motorType;
        private String color;
        private int siegeNumber;
        private List<String> extras;
    pas 
        public ModularCarsBuilder(String modele, String motorType, String color, int siegeNumber) {
            if (modele == null || motorType == null || siegeNumber <= 0) {
                throw new IllegalArgumentException("Le modèle, le type de moteur et le nombre de sièges sont obligatoires.");
            }
            if (modele.equals("Sport") && motorType.equals("Électrique")) {
                throw new IllegalArgumentException("Un modèle sport ne peut pas avoir de moteur électrique.");
            }
            if (modele.equals("SUV") && siegeNumber < 5) {
                throw new IllegalArgumentException("Un modèle SUV doit avoir au moins 5 sièges.");
            }
            this.modele = modele;
            this.motorType = motorType;
            this.color = color;
            this.siegeNumber = siegeNumber;
            this.extras = new ArrayList<>();
        }

        public ModularCarsBuilder addExtra(String extra) {
            this.extras.add(extra);
            return this;
        }

        public ModularCars build() {
            return new ModularCars(this);
        }
    }
}