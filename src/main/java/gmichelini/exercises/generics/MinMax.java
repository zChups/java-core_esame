package gmichelini.exercises.generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp){
        T candidate = list.get(0);
        for (T item : list){
            if (cmp.compare(item, candidate) > 0){
                candidate = item;
            }
        }
        return candidate;
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        T candidate = list.get(0);
        for (T item : list){
            if (cmp.compare(item, candidate) < 0){
                candidate = item;
            }
        }
        return candidate;
    }
}
