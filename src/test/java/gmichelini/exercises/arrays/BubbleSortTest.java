package gmichelini.exercises.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


class BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] v = {1,4,10,-1,0,3};
        BubbleSort.bubbleSort(v);
        System.out.println(Arrays.toString(v));
    }
    @Test
    void bubbleSortCopy() {
        int[] v = {1,4,10,-1,0,3};
        int[] c = BubbleSort.bubbleSortCopy(v);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(c));
    }
}