package gmichelini.exercises.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroEndTest {

    @Test
    void moveZerosEnd() {
        System.out.println(Arrays.toString(MoveZeroEnd.moveZerosEnd(new int[]{0,1,3,4,0,2,3,0})));
    }
}