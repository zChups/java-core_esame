package gmichelini.exercises.functional;

import java.util.Map;

public class PayMore {
    public static void payMore(Map<String, Double> fees,  String number, double delta){
        fees.replaceAll((s1,s2) -> s1.startsWith(number) ? s2 + delta : s2);
    }
}
