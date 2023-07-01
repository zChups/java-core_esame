package gmichelini.exercises.arrays;

/*
public class TenRun {
    public static int[] tenRun(int[] v){
        int currVal = 0;
        boolean found = false;
        int i;

        //searching first good value
        for (i = 0; i < v.length; i++){
            if (v[i] % 10 == 0){    //is even
                currVal = v[i];
                found = true;
                break;
            }
        }

        //going ahead
        if (found){
            for (; i < v.length; i++){
                if (v[i] % 10 == 0){    //is even
                    currVal = v[i];
                }
                v[i] = currVal;
            }
        }
        return v;
    }
}
*/

public class TenRun{
    public static int[] tenRun(int[] v){
        int[] dst = new int [v.length];
        boolean found = false;
        int currVal = 0;

        for (int i = 0; i < v.length; i++){
            if (v[i] % 10 == 0){
                found = true;
                currVal = v[i];
            }
            dst[i] = found ? currVal : v[i];
        }
        return dst;
    }
}