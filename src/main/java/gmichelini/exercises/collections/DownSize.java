package gmichelini.exercises.collections;

import java.util.Iterator;
import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n){
        Iterator<String> stringIterator = list.iterator();

        for(int counter = 1; stringIterator.hasNext(); counter++){
            stringIterator.next();
            if (counter%2 == 0){
                stringIterator.remove();
            }
        }
    }
}
