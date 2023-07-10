package gmichelini.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void divide() {
        assertEquals(2.0, Divide.divide(2L, 1));
    }
}