package gmichelini.exercises.strings;

public class Palindrome {
    public static boolean isPalindrome(String string){
        return string.equalsIgnoreCase(new StringBuilder(string).reverse().toString());
    }
}
