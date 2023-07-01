package gmichelini.exercises.arrays;

public class MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v){
        int len = v.length-1;
        int tmp;
        boolean found = true;

        while(found){
            if (v[len] == 0){
                --len;
                continue;
            }
            for (int i = 0; i < len; i++) {
                found = false;
                if (v[i] == 0){
                    tmp = v[i];
                    v[i] = v[i+1];
                    v[i+1] = tmp;
                    found = true;
                }
            }
        }
        return v;
    }
}
