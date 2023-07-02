package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenate() {
        System.out.println(Concatenate.concatenate(new String[]{"Ciao,", " dear"}));
    }
}