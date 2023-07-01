package gmichelini.exercises.arrays;

public class DivideArrays {
    public static double[] divideArrays(double[] v1, double[] v2){
        if (v1.length != v2.length) return null;
        double[] dst = new double[v1.length];   //==v2.length
        for (int i = 0; i < dst.length; ++i){
            dst[i] = v1[i] / v2[i];
        }
        return dst;
    }
}
