package gmichelini.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class JustPrintTest {

    @Test
    void listJustPrint() {
        JustPrint.justPrintList(List.of("Marco", "Filippo"));
    }

    @Test
    void justPrintMap() {
        JustPrint.justPrintMap(Map.of("Marco", "Esposito"));
    }
}