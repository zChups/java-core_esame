package gmichelini.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        List<String> stringList = new ArrayList<>(List.of("Marco","Giulio", "Filippo"));
        Reverse.reverse(stringList);
        assertEquals(List.of("Filippo","Giulio","Marco"), stringList);
    }
}