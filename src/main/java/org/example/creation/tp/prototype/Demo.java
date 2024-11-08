package org.example.creation.tp.prototype;

public class Demo {
    public static void main(String[] args) {
        HouseModel originalHouse = new HouseModel(100, "Red", "Brick");
        HouseModel clonedHouse = originalHouse.clone();
        clonedHouse.setCouleur("Blue");

        CarModel originalCar = new CarModel(200, "Noir", "Metallique");
        CarModel clonedCar = originalCar.clone();
        clonedCar.setTaille(250);

        PlaneModel originalPlane = new PlaneModel(300, "Blanc", "Bois");
        PlaneModel clonedPlane = originalPlane.clone();
        clonedPlane.setTexture("Pierre");

        System.out.println("Maison de base: " + originalHouse);
        System.out.println("Maison clonée: " + clonedHouse);

        System.out.println("Voiture de base: " + originalCar);
        System.out.println("Voiture clonée: " + clonedCar);

        System.out.println("Avion de base: " + originalPlane);
        System.out.println("Avion cloné: " + clonedPlane);
    }
}