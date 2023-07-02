package gmichelini.exercises.strings;

import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String string){
        StringBuilder dst = new StringBuilder();
        for (Character c : string.toCharArray()){
            if (string.indexOf(c) != string.lastIndexOf(c)){
                if (!dst.toString().contains(c.toString())){
                    dst.append(c);
                }
            }
        }
        char[] dstSorted = dst.toString().toCharArray();
        Arrays.sort(dstSorted);
        return dstSorted;
    }
}
