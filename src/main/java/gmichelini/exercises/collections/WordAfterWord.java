package gmichelini.exercises.collections;

import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

import static gmichelini.exercises.collections.FromFile.getLines;
import static gmichelini.exercises.collections.FromFile.lineToWords;

public class WordAfterWord {
    public static String wordAfterWord(String filename, String word) throws IOException {
        SortedSet<String> stringSortedSet = new TreeSet<>();
        for (String currLine : getLines(filename)) {
            for (String currWord : lineToWords(currLine)){
                stringSortedSet.add(currWord.toLowerCase());
            }
        }
        return new TreeSet<String>(stringSortedSet).tailSet(word, false).first();
    }


}
