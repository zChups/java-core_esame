package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordAfterWordTest {

    @Test
    void wordAfterWord() throws IOException {
        String word = WordAfterWord.wordAfterWord("/Users/gim/Downloads/james-joyce-ulysses.txt", "bee");
        System.out.println("------>" + word);
    }
}