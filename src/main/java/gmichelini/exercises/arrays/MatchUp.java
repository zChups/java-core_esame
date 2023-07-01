package gmichelini.exercises.arrays;

public class MatchUp {
    public static int matchUp(int[] v1, int[] v2){
        int diff, counter = 0;

        for (int i = 0; i < v1.length; i++){    //v1.length = v2.length
            diff = Math.abs(v1[i]-v2[i]);
            if ((diff == 1)||(diff == 2)){  //distance is 1 or 2
                ++counter;
            }
        }
        return counter;
    }
}
