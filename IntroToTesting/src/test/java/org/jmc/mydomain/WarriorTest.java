package org.jmc.mydomain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void convertToElf() {
        Warrior warrior = new Warrior(100, 50, 5, 10);
        Elf elfConverted = warrior.convertToElf();

        // checking properties of warrior with new elf
        assertInstanceOf(Elf.class, elfConverted);
        assertEquals(warrior.getHealth(), elfConverted.getHealth());
        assertEquals(warrior.getStrength(), elfConverted.getStrength());
        assertEquals(warrior.getLives(), elfConverted.getLives());
    }

    @Test
    public void abstractMethod_decrementLive(){
        Warrior warrior = new Warrior(100, 50, 5, 10);
        warrior.decrementLive();

        assertEquals(4, warrior.getLives());

        Warrior warrior2 = new Warrior(100, 50, 1, 10);
        warrior2.decrementLive();
        assertEquals(warrior2.HEALTH_FIXED, warrior2.getHealth());
        assertEquals(0, warrior2.getLives());
    }

    @Test
    public void abstractMethod_checkHealth() {
        Warrior warrior = new Warrior(0, 50, 5, 10);
        warrior.checkHealth();

        assertEquals(warrior.HEALTH_FIXED, warrior.getHealth());
        assertEquals(4, warrior.getLives());

    }
}