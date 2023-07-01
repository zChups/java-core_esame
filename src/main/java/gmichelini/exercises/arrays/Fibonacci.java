package gmichelini.exercises.arrays;

public class Fibonacci {
    public static long[] fibonacci(int n){
        if (n <= 0){
            System.out.println("Negative number as parameter or null");
            return null;
        }
        int counter = 0;
        long[] dst = new long[n];

        while (counter != n){
            if (counter == 0)dst[counter] = 0;
            else if (counter == 1) dst[counter] = 1;
            else{
                dst[counter] = dst[counter-2] + dst[counter-1];
            }
            ++counter;
        }
        return dst;
    }
}
