package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtBeginningTest {

    @Test
    void goodAtTheBeginning() {
        assertTrue(GoodAtBeginning.goodAtTheBeginning("good boy"));
        assertFalse(GoodAtBeginning.goodAtTheBeginning(" good boy"));
    }
}