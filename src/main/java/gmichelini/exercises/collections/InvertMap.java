package gmichelini.exercises.collections;

import java.util.*;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src){
        Map<String,Integer> dst = new HashMap<>();
        for (Map.Entry<Integer, String> entry : src.entrySet()){
            dst.put(entry.getValue(), entry.getKey());
        }
        return dst;
        /*Set<Integer> integerSet = new HashSet<>(src.keySet());
        List<Integer> integerList = new ArrayList<>(integerSet);
        Map<String, Integer> dst = new HashMap<>();
        for (int currKey : integerList){
            dst.put(src.get(currKey), currKey);
        }
        return dst;*/
    }
}
