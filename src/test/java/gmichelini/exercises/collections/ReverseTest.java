package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        assertEquals(List.of("Marco", "Ehi"), Reverse.reverse(List.of("Ehi", "Marco")));
    }
}