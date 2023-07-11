package gmichelini.exercises.arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] dst = new int[v.length];
        int i, j = 0;
        for (i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                dst[j++] = v[i];
            }
        }
        return dst;
    }
}
