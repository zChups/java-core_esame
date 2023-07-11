package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

class WordFrequencyTest {

    @Test
    void wordFrequency() throws IOException {
        Map<String, Integer> stringIntegerMap = WordFrequency.wordFrequency("/Users/gim/Personale/ SO + PO/PO/ESAME/java-core/src/main/resources/james-joyce-ulysses.txt");
        int counter = 1;
        for(Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()){
            if (counter==10)break;
            System.out.println(entry.getKey() + " : " + entry.getValue());
            ++counter;
        }
    }
}