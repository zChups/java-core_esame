package gmichelini.exercises.collections;

import java.util.*;

public class Reverse {
    public static List<String> reverse(List<String> sentence){
        Deque<String> stack = new ArrayDeque<>();

        for (String s : sentence) {
            stack.addFirst(s);
        }
        return new ArrayList<>(stack);
    }
    /*public static List<String> reverse(List<String> sentence){
        Deque<String> stack = new ArrayDeque<>(sentence);
        List<String> dst = new ArrayList<>();
        while(!stack.isEmpty()){
            dst.add(stack.removeLast());
        }
        return dst;
    }*/
}
