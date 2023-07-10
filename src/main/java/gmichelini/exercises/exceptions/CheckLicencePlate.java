package gmichelini.exercises.exceptions;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence){
        String alphas = licence.substring(0, 2) + licence.substring(5);
        for (char c : alphas.toCharArray()){
            if(!Character.isLetter(c)){
                throw (new IllegalArgumentException("Not a letter " + c));
            }
        }
        String digits = licence.substring(2,5);
        for (char c : digits.toCharArray()){
            if (!Character.isDigit(c)){
                throw (new IllegalArgumentException("Not a digit " + c));
            }
        }
    }
}
