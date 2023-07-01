package gmichelini.exercises.arrays;

/*public class Splitter {
    public static int[] splitter(int input){
        int numDigit = countDigit(input);
        int[] dst = new int[numDigit];

        for (int i = 0; i < numDigit; i++){
            dst[dst.length-1-i] = input % 10;
            input /= 10;
        }
        return dst;
    }

    private static int countDigit(int in){
        int counter = 0;

        while (in != 0){
            in /= 10;
            ++counter;
        }
        return counter;
    }
}*/
public class Splitter {
    public static int[] splitter(int input) {
        String stringNumber = Integer.toString(input);
        int numDigit = stringNumber.length();
        int[] dst = new int[numDigit];
        for (int i = 0; i < numDigit; i++){
            dst[i] = Character.getNumericValue(stringNumber.charAt(i));
        }
        return dst;
    }
}
