package gmichelini.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        assertEquals("radar", Reverse.reverse("radar"));
        assertEquals("annuz", Reverse.reverse("zunna"));
    }
}