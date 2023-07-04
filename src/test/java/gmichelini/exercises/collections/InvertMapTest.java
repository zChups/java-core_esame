package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {

    @Test
    void invertMap() {
        assertEquals(Map.of("Hello",1,"michael",2), InvertMap.invertMap(Map.of(1,"Hello",2,"michael")));
    }
}