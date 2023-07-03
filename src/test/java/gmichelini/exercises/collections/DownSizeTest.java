package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DownSizeTest {
    List<String> list;

    @Test
    void downsize() {
        list = new ArrayList<>(List.of("F", "C", "M", "S"));
        DownSize.downsize(list,2);
        assertEquals(List.of("F","M"), list);
    }
}