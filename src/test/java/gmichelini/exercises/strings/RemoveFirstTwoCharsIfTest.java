package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsIfTest {

    @Test
    void removeFirstTwoCharsIf() {
        assertEquals("Hello", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Hello"));
        assertEquals("rs", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("ears"));
    }
}