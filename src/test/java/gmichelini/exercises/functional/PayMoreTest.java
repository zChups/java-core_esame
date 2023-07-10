package gmichelini.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class PayMoreTest {

    @Test
    void payMore() {
        Map<String, Double> fees = new HashMap<>(Map.of(
                "3474565432", 11.75,
                "3336534965", 9.95,
                "3315467927", 9.75,
                "3316393736", 8.75));
        PayMore.payMore(fees, "331", 1.0);
        PayMore.payMore(fees, "347", 5d);
        System.out.println(fees);

    }
}