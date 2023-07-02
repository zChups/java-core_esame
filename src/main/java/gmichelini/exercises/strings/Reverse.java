package gmichelini.exercises.strings;

public class Reverse {
    public static String reverse(String string) {
/*        StringBuilder dst = new StringBuilder();

            for (int i = 0; i < string.length(); i++){
            dst.append(string.charAt(string.length()-1-i));
        }
        return dst.toString();*/
        return new StringBuilder(string).reverse().toString();
    }
}
