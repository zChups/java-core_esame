package gmichelini.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> numbers){
        return numbers.stream()
                .map(s -> s*2)
                .filter(s->!s.toString().endsWith("2"))
                .collect(Collectors.toList());
    }
}
