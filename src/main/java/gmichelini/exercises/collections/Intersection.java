package gmichelini.exercises.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> integerSet = new LinkedHashSet<>();
        for (int i : first){
            if (second.contains(i))integerSet.add(i);
        }
        return integerSet;
    }
}
