package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesTest {

    @Test
    void eratosthenes() {
        assertEquals(Set.of(1,2,3,5,7,11,13,17),Eratosthenes.eratosthenes(17));
        assertEquals(Set.of(1,2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97),Eratosthenes.eratosthenes(97));
    }
}