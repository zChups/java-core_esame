package gmichelini.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SpeedTestTest {
    final int times = 1000;
    @Test
    void insertBeginning() {
        long arrayList = SpeedTest.insertBeginning(new ArrayList<>(), "giulio", times);
        long linkedList = SpeedTest.insertBeginning(new LinkedList<>(), "giulio", times);
        assertTrue(linkedList < arrayList); // in un array deve scalare ogni elemento
    }

    @Test
    void insertEnd() {
        long arrayList = SpeedTest.insertEnd(new ArrayList<>(), "giulio", times);
        long linkedList = SpeedTest.insertEnd(new LinkedList<>(), "giulio", times);
        assertTrue(linkedList > arrayList);
    }
}