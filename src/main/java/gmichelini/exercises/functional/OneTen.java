package gmichelini.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class OneTen {
    public static List<Integer> oneTen(List<Integer> list){
        return list.stream()
                .map(s -> (s+1)*10)
                .collect(Collectors.toList());
    }

}
