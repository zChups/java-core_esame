package gmichelini.exercises.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src){
        List<Pair<K,V>> entries = new ArrayList<>();

        for (Map.Entry<K,V> entry : src.entrySet()){
            K key = entry.getKey();
            V value  = entry.getValue();
            entries.add(new Pair<>(key, value));
        }
        return entries;
    }
}
