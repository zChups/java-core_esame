package gmichelini.exercises.arrays;

import java.util.Arrays;

public class CopyArray {
    public static double[] copyArray(double[] v){
        return Arrays.copyOf(v,v.length);
    }
}
