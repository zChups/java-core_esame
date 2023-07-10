package gmichelini.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.Map;

class JustPrintParametrizedTest {

    @Test
    void listJustPrintParametrized() {
    }

    @Test
    void mapJustPrintParametrized() {
        JustPrintParametrized.justPrintParametrizedMap(Map.of("Marco", "Esposito"), (k, v) -> System.out.println("k: " + k + ", v:" + v));
    }
}