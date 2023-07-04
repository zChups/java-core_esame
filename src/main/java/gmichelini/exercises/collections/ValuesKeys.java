package gmichelini.exercises.collections;

import java.util.*;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map){
        List<String> listValues = new ArrayList<>(map.values());
        List<String> listKeyValues = new ArrayList<>(map.keySet());
        for (String currString : listValues) {
            if (listKeyValues.contains(currString))return true;
        }
        return false;
    }
}
