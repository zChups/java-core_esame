package gmichelini.exercises.exceptions;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence) {
        if (licence.length() != 7){
            throw new IllegalArgumentException("Licence not valid");
        }
        for (int i = 0; i < licence.length(); i++){
            try{
                if (i < 2 || i > 5){
                    boolean digit = Character.isDigit(licence.charAt(i));
                } else{
                    boolean letter = Character.isLetter(licence.charAt(i));
                }
            }catch(IllegalArgumentException e){
                throw new IllegalArgumentException("Symbol not valid " + licence.charAt(i));
            }
        }
    }
}
