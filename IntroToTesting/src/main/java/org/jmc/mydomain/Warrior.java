package org.jmc.mydomain;

public class Warrior extends Player {
    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        setForce(force);
    }

    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives());
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
