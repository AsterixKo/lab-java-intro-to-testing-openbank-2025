package org.jmc.mydomain;

public class Wizard extends Player {
    private int spell;

    public Wizard(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        setSpell(spell);
    }

//    public String castRandomSpell(){
//        return "Casting " + spellLibrary.getRandomSpell();
//    }

    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives());
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }
}
