package gmichelini.exercises.generics;

import java.util.Collections;
import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list) {
        T tmp;
        for (int i = 0; i < Math.floor((double)list.size()) / 2; i++){
            Collections.swap(list, i, list.size()-i-1);
        }
    }
}
