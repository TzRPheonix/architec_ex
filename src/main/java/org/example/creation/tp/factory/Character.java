package org.example.creation.tp.factory;

public abstract class Character {
    private final String name;
    private final int health;
    private final int attack;
    private final String specialSkill;

    public Character(String name, int health, int attack, String specialSkill) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.specialSkill = specialSkill;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public String useSpecialSkill() {
        return specialSkill;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", specialSkill='" + specialSkill + '\'' +
                '}';
    }
}
