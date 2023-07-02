package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsTest {

    @Test
    void removeFirstTwoChars() {
        assertEquals("ao", RemoveFirstTwoChars.removeFirstTwoChars("ciao"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("al"));
    }
}