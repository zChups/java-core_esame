package gmichelini.exercises.generics;

import java.util.Iterator;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src){
        Iterator<E> iterator = src.iterator();
        StringBuilder dst = new StringBuilder();

        while(iterator.hasNext()){
            E currVal = iterator.next();
            if (!iterator.hasNext()){
                dst.append(currVal);
            } else{
                dst.append(currVal).append(", ");
            }
        }
        return dst.toString();
    }
}
