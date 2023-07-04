package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    @Test
    void morseCode() {
        System.out.println();
        assertEquals(".... . ._.. ._.. ___",MorseCode.morseCode("Hello"));
        System.out.println();
    }
}