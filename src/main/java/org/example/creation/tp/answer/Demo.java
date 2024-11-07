package org.example.creation.tp.answer;


public class Demo {
    public static void main(String[] args) {
        ModularCars modularCars = new ModularCars.ModularCarsBuilder("SUV", "Hybride", "Bleu", 7).addExtra("GPS").addExtra("Toit Ouvrant").build();
        System.out.println(modularCars);
        ModularCars modularCars1 = new ModularCars.ModularCarsBuilder("SUV", "Hybride", "Bleu", 2).addExtra("GPS").addExtra("Toit Ouvrant").build();
        System.out.println(modularCars1);
    }
}
