package org.jmc.mydomain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getAllOddIntegers() {
        assertArrayEquals(new int[]{1,3,5,7,9}, Main.getAllOddIntegers(10));
        assertArrayEquals(new int[]{1,3,5}, Main.getAllOddIntegers(5));
    }

    @Test
    void containsJavaKeywords() {
        assertTrue(Main.containsJavaKeywords("esta frase contiene un abstract class"));
        assertFalse(Main.containsJavaKeywords("esta frase no contiene nada raro"));
    }
}