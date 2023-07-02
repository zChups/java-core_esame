package gmichelini.exercises.strings;

public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIf(String string){
        if ((string.charAt(0)== 'H') && (string.charAt(1) == 'e')) return ("H" + 'e' + new StringBuilder(string).substring(2));
        else if (string.charAt(0) == 'H')return ("H" + new StringBuilder(string).substring(2));
        else if (string.charAt(1) == 'e') return ("e" + new StringBuilder(string).substring(2));
        else return new StringBuilder(string).substring(2);
    }
}
