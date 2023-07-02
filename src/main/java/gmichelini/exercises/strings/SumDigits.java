package gmichelini.exercises.strings;

public class SumDigits {
    public static int sumDigits(String string){
        int counter = 0;

        for (Character c : string.toCharArray()){
            if (Character.isDigit(c))counter += Character.getNumericValue(c);
        }
        return counter;
    }
}
