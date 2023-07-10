package gmichelini.exercises.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized {
    public static <T> void justPrintParametrizedList (List<T> list, Consumer<T> consumer){
        list.forEach(consumer);
    }
    public static <K, V> void justPrintParametrizedMap(Map<K,V> map, BiConsumer<K, V> consumer){
        map.forEach(consumer);
    }
}
