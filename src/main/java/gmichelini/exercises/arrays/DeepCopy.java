package gmichelini.exercises.arrays;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original){
        int[][] arrDeepCopy = new int [original.length][];

        for (int i = 0; i < original.length; i++){
            arrDeepCopy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return arrDeepCopy;
    }
}
