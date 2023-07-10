package gmichelini.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoYYTest {

    @Test
    void noYY() {
        assertEquals(List.of("ay","by"), NoYY.noYY(List.of("a","b", "cy")));
    }
}