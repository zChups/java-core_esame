package gmichelini.exercises.strings;

public class EqualIsNot {
    public static boolean equalIsNot(String string){
        int counterIs = 0, counterNot = 0;

        counterIs = countOccurrence(string, "is");
        counterNot = countOccurrence(string, "not");

        return counterNot == counterIs;
    }

    private static int countOccurrence(String string, String token){
        if (string.isEmpty())return 0;
        int counter = 0;
        int len = token.length();

        int offset = 0;
        while((offset = string.indexOf(token.charAt(0), offset)) != -1){
            if (string.substring(offset, offset + len).equals(token))++counter;
            ++offset;
        }
        return counter;
    }

}
