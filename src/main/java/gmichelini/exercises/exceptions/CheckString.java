package gmichelini.exercises.exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        if (s.length() < 2)throw  (new ParseException(s, 0));
        boolean firstIsLetter = true;
        for (int i = 0; i < s.length(); i++){
            char currC = s.charAt(i);
            if (Character.isDigit(currC) && (firstIsLetter)){
                throw (new ParseException(s, i));
            }
            if (Character.isLetter(currC) && (!firstIsLetter)){
                throw (new ParseException(s, i));
            }
            firstIsLetter = !firstIsLetter;
        }
    }

}
