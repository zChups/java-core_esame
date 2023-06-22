package gmichelini.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {

    @Test
    void copyArray() {
        assertArrayEquals(new double[]{1, 2, 3}, CopyArray.copyArray(new double[] {1, 2, 3}));
    }
}