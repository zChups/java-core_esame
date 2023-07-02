package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {

    @Test
    void removeFirstLast() {
        assertEquals("google", RemoveFirstLast.removeFirstLast("google"));
        assertEquals("nemi", RemoveFirstLast.removeFirstLast("anemia"));
        assertEquals("F", RemoveFirstLast.removeFirstLast("F"));
        assertEquals("", RemoveFirstLast.removeFirstLast(""));

    }
}