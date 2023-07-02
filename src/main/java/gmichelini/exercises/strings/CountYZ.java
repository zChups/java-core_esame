package gmichelini.exercises.strings;

import java.util.Scanner;

public class CountYZ {
    public static int countYZ(String string){
        int counter = 0;
        String currVal;
        Scanner scn = new Scanner(string);
        while(scn.hasNext()){
            currVal = scn.next();
            if (currVal.toLowerCase().endsWith("y") || currVal.toLowerCase().endsWith("z")){
                ++counter;
            }
        }
        return counter;
    }
}
