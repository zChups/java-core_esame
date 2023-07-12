package gmichelini.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> list){
        return list.stream()
                .filter(s -> s <= 12 || s >= 20)
                .collect(Collectors.toList());

    }
}
