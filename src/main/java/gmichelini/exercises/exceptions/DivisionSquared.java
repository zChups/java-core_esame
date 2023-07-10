package gmichelini.exercises.exceptions;

public class DivisionSquared {
    public static int divisionSquared(int a, int b){
        try{
            return (int) Math.sqrt(a/b);
        }catch (ArithmeticException e){
            return 0;
        }

    }
}
