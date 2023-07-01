package gmichelini.exercises.arrays;

public class CanBalance {
    public static boolean canBalance(int[] v){
        int pivot = v.length - 1;   //starts from the last number
        int sumSx = 0;
        int sumDx = 0;
        int i;

        while (pivot > 0){
            sumSx = sumDx = 0;
            //totSx
            for (i = 0; i < pivot; i++){
                sumSx += v[i];
            }
            //totDx
            for (; i < v.length; i++){
                sumDx += v[i];
            }
            //check
            if (sumSx == sumDx){
                return true;
            }
            --pivot;
        }
        return false;
    }
}
