package gmichelini.exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,2));
        System.out.println(RemoveDuplicates.removeDuplicates(list));
    }
    public static List<Integer> removeDuplicates(List<Integer> list){
        return new ArrayList<>(new HashSet<>(list));
    }
}
