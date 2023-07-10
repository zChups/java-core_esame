package gmichelini.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareFiveTest {

    @Test
    void testSquareFive() {
        assertEquals(3, SquareFive.squareFive(List.of(3,1,4)));
    }
}