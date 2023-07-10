package gmichelini.exercises.generics;

public class Measure {
    public static <T> T max(T[] array, Measurer<T> measurer) {
        T max = array[0];
        for (T currVal : array) {
            if (measurer.measure(currVal) > measurer.measure(max)) {
                max = currVal;
            }
        }
        return max;
    }
    public static <T> T min(T[] array, Measurer<T> measurer){
        T min = array[0];
        for (T currVal : array){
            if (measurer.measure(currVal) < measurer.measure(min)){
                min = currVal;
            }
        }
        return min;
    }
    public interface Measurer<T> {
        double measure(T item);
    }
}
