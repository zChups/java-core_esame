package gmichelini.exercises.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        String[] dst = new String[end-start];
        String F = "Fizz";
        String B = "Buzz";
        int counter = 0;

        for (int i = start; i < end; i++, counter++){
            if (i % 15 == 0) dst[counter] = F + B;
            else if (i % 3 == 0) dst[counter] = F;
            else if (i % 5 == 0) dst[counter] = B;
            else dst[counter] = Integer.toString(i);
        }
        return dst;
    }
}
