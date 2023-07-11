package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class WordAfterWordTest {

    @Test
    void wordAfterWord() throws IOException {
        String word = WordAfterWord.wordAfterWord("/Users/gim/Personale/ SO + PO/PO/ESAME/java-core/src/main/resources/james-joyce-ulysses.txt", "bee");
        System.out.println("------>" + word);
    }
}