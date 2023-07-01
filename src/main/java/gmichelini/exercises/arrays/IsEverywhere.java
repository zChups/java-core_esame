package gmichelini.exercises.arrays;

public class IsEverywhere {
    public static boolean isEverywhere(int[] v, int value){
        int i;

        if (v[0] ==value)i = 2;
        else if (v[1] == value)i = 3;
        else return false;
        for (; i < v.length; i += 2){
            if (v[i] != value)return false;
        }
        return true;
    }
}

/* from prof.
public class IsEveryWhere {
    public static boolean isEveryWhere(int[] v, int value) {
        boolean isEveryWhere = true;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] != value && v[i + 1] != value) {
                isEveryWhere = false;
                break;
            }
        }
        return isEveryWhere;
    }
}*/
