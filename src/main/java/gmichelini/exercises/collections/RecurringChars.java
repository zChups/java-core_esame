package gmichelini.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string) {
        Set<Character> seen = new HashSet<>();
        Set<Character> dup = new HashSet<>();
        for (Character c : string.toCharArray()){
            if (!seen.contains(c)){
                seen.add(c);
            } else{
                dup.add(c);
            }
        }
    /*public static Set<Character> recurringChars(String string){
        Set<Character> characters = new HashSet<>();
        int counter = 1;    //tolgo una lettera per ogni controllo

        for (Character c : string.toCharArray()){
            if (string.substring(counter).contains(c.toString())){
                characters.add(c);
            }
            ++counter;
        }
        return characters;*/
        return dup;
    }
}
