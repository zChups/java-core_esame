package gmichelini.exercises.arrays;

public class CopyArray {
    public static double[] copyArray(double[] v){
        double[] dst = new double[v.length];
        System.arraycopy(v,0,dst,0,v.length);
        return dst;
    }

/*      
    public static double[] copyArray(double[] src) {
        double[] dst = new double[src.length];
        System.arraycopy(src, 0, dst, 0, src.length);
        return dst;
    }*/
}
