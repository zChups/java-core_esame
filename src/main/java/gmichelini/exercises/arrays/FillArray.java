package gmichelini.exercises.arrays;

import java.util.Arrays;
import java.util.Random;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] dst = new double[size];
        Random rnd = new Random();
        if (addNoise){
            for (int i = 0; i < dst.length; ++i){
                //NOT DONE!!!
            }
        }
        else{
            Arrays.fill(dst, value);
        }
        return dst;
    }
}
