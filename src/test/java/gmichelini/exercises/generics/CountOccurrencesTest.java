package gmichelini.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOccurrencesTest {

    @Test
    void countOccurrences() {
        assertEquals(1, CountOccurrences.countOccurrences(new Integer[]{1,2,2,null,}, null));
    }
}