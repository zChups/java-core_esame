package gmichelini.exercises.generics;

public class CountOccurrences {
    public static <T> int countOccurrences(T[] src, T item){
        int count = 0;
        if (item == null){
            for (T i : src){
                if (i == null){
                    ++count;
                }
            }
        } else{
            for (T i : src){
                if (item.equals(i)){
                    ++count;
                }
            }
        }
        return count;
    }
}
