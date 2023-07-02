package gmichelini.exercises.strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String string){
        return (string.startsWith("good") || string.startsWith("good", 1));
        //return (string.startsWith("Good") || (string.substring(1).startsWith("good")));
    }
}
