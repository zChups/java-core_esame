package gmichelini.exercises.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClickCounterTest {
    ClickCounter counter;

    @BeforeEach
    void setUp() {
        counter = new ClickCounter();
    }

    @Test
    void getValue() {
        counter.click();
        assertEquals(1, counter.getClicked());
    }

    @Test
    void click() {
        counter.click();
        assertEquals(1, counter.getClicked());
    }

    @Test
    void undo() {
        counter.click();
        counter.undo();
        assertEquals(0, counter.getClicked());
        counter.undo();
        assertEquals(0, counter.getClicked());
    }

    @Test
    void reset() {
        counter.click();
        counter.click();
        counter.reset();
        assertEquals(0, counter.getClicked());
    }
}