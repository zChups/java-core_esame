package gmichelini.exercises.exceptions;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

public class FilterItems {
    public static List<String> filterItems(List<String> strings) {
        List<String> dst = new LinkedList<>();
        for (String s : strings){
            try{
                CheckString.checkString(s);
                dst.add(s);
            } catch (ParseException ignored){
            }
        }
        return dst;
    }
}
