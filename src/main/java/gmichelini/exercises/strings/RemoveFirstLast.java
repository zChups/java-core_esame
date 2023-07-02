package gmichelini.exercises.strings;

public class RemoveFirstLast {
    public static String removeFirstLast(String string){
        if (string.length() < 2) return string;
        /*if ((string.charAt(0) == string.charAt(string.length()-1))) return string.subSequence(1, string.length()-1).toString();
        return string;*/
        return ((string.charAt(0) == string.charAt(string.length()-1))) ? string.substring(1, string.length()-1) : string;
    }
}
