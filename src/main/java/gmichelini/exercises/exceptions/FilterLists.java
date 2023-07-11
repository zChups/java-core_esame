package gmichelini.exercises.exceptions;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

public class FilterLists{
    public static List<List<String>> filterLists(List<List<String>> lists){
        List<List<String>> dst = new LinkedList<>();
        for (List<String> currList : lists){
                try{
                    for (String currString : currList) {
                        CheckString.checkString(currString);
                    }
                    dst.add(currList);
            } catch (ParseException ignored){
                }
        }
        return dst;
    }

}
