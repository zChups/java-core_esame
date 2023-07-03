package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecurringCharsTest {

    @Test
    void recurringChars() {
        assertEquals(Set.of('l'), RecurringChars.recurringChars("Lello"));
        assertEquals(Set.of('l', 'e'), RecurringChars.recurringChars("Lello e"));
    }
}