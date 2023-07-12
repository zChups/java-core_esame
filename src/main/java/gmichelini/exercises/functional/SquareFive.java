package gmichelini.exercises.functional;

import java.util.List;

public class SquareFive {
    public static long squareFive(List<Integer> nums){
        return nums.stream()
                .map(s -> (int) Math.sqrt((double) s))
                .filter(s -> !s.toString().endsWith("5"))
                .count();
    }
}
