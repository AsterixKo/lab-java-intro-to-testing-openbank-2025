package org.jmc.mydomain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    void convertToElf() {
        Wizard wizard = new Wizard(100, 50, 5, 10);
        Elf elfConverted = wizard.convertToElf();

        // checking properties of wizard with new elf
        assertInstanceOf(Elf.class, elfConverted);
        assertEquals(wizard.getHealth(), elfConverted.getHealth());
        assertEquals(wizard.getStrength(), elfConverted.getStrength());
        assertEquals(wizard.getLives(), elfConverted.getLives());

    }
}