package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharsTest {

    @Test
    void duplicateChars() {
        assertArrayEquals(new char[]{'e', 's'}, DuplicateChars.duplicateChars("seesso"));
    }
}