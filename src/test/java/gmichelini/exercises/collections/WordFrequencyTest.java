package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void wordFrequency() throws IOException {
        Map<String, Integer> stringIntegerMap = WordFrequency.wordFrequency("/Users/gim/Downloads/james-joyce-ulysses.txt");
        int counter = 1;
        for(Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()){
            if (counter==10)break;
            System.out.println(entry.getKey() + " : " + entry.getValue());
            ++counter;
        }
    }
}