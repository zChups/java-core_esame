package gmichelini.exercises.strings;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder dst = new StringBuilder();
        for (String str : strings) {
            dst.append(str);
        }
        return dst.toString();
    }
}
