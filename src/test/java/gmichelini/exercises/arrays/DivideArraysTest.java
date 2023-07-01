package gmichelini.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DivideArraysTest {

    @Test
    void divideArrays() {
        assertArrayEquals(new double[]{1,1,2}, DivideArrays.divideArrays(new double[]{2,3,4}, new double[]{2,3,2}));
    }
}