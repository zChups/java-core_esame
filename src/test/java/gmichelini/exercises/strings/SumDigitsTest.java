package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {

    @Test
    void sumDigits() {
        assertEquals(3, SumDigits.sumDigits("12"));
        assertEquals(12, SumDigits.sumDigits("332121"));
    }
}