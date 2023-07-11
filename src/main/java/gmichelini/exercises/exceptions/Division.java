package gmichelini.exercises.exceptions;

public class Division {
    public static double division(double a, double b){
        if (b==0){
            throw  new IllegalArgumentException("Invalid divisor" + b);
        }
        return a/b;
    }
}
