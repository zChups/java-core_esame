package gmichelini.exercises.exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String word) throws ParseException {
        if (word.length() < 2)throw new ParseException(word, 0);
        boolean currIsDigit = false;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c) && currIsDigit) throw new ParseException(word, word.indexOf(c));
            else if (Character.isLetter(c) && !currIsDigit) throw new ParseException(word, word.indexOf(c));
            else {
                currIsDigit = !currIsDigit;
            }
        }
    }
}
