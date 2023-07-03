package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        assertEquals(List.of(1,2,3), RemoveDuplicates.removeDuplicates(List.of(1,2,2,3)));
    }
}