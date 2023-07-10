package gmichelini.exercises.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterItems {
    public static List<String> filterItems(List<String> strings) {
        List<String> dst = new ArrayList<>();
        for (String currString : strings){
            try {
                CheckString.checkString(currString);
                dst.add(currString);
            } catch (ParseException ignored){
            }
        }
        return dst;
    }
}
