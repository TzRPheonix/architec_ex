package org.example.creation.tp.factory;

public class Demo {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("warrior", "Antoine");
        Character mage = CharacterFactory.createCharacter("mage", "Thomas");
        Character archer = CharacterFactory.createCharacter("archer", "Mathis");

        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(archer);
    }
}