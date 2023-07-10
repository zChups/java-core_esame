package gmichelini.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IterableToStringTest {

    @Test
    void iterableToString() {
        assertEquals("1, 2, 3", IterableToString.iterableToString(List.of(1,2,3)));
        assertEquals("1, 2, 3", IterableToString.iterableToString(Set.of(1,2,3)));
    }
}