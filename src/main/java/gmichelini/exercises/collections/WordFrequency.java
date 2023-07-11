package gmichelini.exercises.collections;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static gmichelini.exercises.collections.FromFile.getLines;
import static gmichelini.exercises.collections.FromFile.lineToWords;

public class WordFrequency{
    public static Map<String, Integer> wordFrequency(String filename) throws IOException{
        Map<String, Integer> dst = new HashMap<>();
        for (String currLine : getLines(filename)) {
            for (String currWord : lineToWords(currLine)){
                if (dst.containsKey(currWord)){    //è una doppia occorrenza
                    dst.put(currWord, dst.get(currWord) + 1);
                }else{  //non contiene la parola
                    dst.put(currWord, 1);
                }
            }
        }
        return dst;
    }

}
