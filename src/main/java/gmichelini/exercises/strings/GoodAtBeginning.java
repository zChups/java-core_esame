package gmichelini.exercises.strings;

public class GoodAtBeginning {
    public static boolean goodAtTheBeginning(String string){
        return "good".contentEquals(string.subSequence(0, 4));
        // return s.startsWith("good");
    }
}
