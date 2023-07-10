package gmichelini.exercises.functional;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().
                allMatch(AllPalindrome::isPalindrome);
    }
    public static boolean isPalindrome(String string){
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
