package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {

    @Test
    void goodAroundTheBeginning() {
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good boy"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning(" good boy"));
        assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("  good boy"));

    }
}