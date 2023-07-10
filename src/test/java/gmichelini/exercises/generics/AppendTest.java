package gmichelini.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppendTest {

    @Test
    void append() {
        List<String> list = new ArrayList<>(List.of("a", "marco"));
        Append.append(list,List.of("Franco"));
        assertEquals(List.of("a", "marco","Franco"), list);
    }
}