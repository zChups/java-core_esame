package gmichelini.exercises.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] v) {
        int tmp;  //for switching
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    changed = true;
                    //switch
                    tmp = v[i + 1];
                    v[i + 1] = v[i];
                    v[i] = tmp;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v){
        int[] dst;
        dst = Arrays.copyOf(v, v.length);
        bubbleSort(dst);
        return dst;
    }
}
