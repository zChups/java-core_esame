package gmichelini.exercises.strings;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder dst = new StringBuilder();
        for (String s : strings){
            dst.append(s);
        }
        return dst.toString();
    }
}
