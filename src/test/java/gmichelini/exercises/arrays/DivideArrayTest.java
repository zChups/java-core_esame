package gmichelini.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayTest {

    @Test
    void divideArray() {
        assertArrayEquals(new double[]{1,1,1}, DivideArray.divideArray(new double[]{2,2,2}, 2));
    }
}