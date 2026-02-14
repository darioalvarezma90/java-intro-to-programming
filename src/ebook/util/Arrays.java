package ebook.util;

public class Arrays {
    
    public static int maximum(int[] iarray) {
        var max = iarray[0];
        for (var x : iarray) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static double sum(int[] iarray) {
        return sum(iarray, 0, iarray.length);
    }

    public static double sum(int[] iarray, int start, int end) {
        double total = 0.0;
        for (int i = start; i < end; i++) {
            total += iarray[i];
        }
        return total;
    }

    public static double sum(double[] darray) {
        return sum(darray, 0, darray.length);
    }

    public static double sum(double[] darray, int start, int end) {
        double total = 0.0;
        for (int i = start; i < end; i++) {
            total += darray[i];
        }
        return total;
    }

    public static double average(int[] iarray) {
        return average(iarray, 0, iarray.length);
    }

    public static double average(int[] iarray, int start, int end) {
        double total = sum(iarray, start, end);
        return total / (end - start);
    }    

    public static double average(double[] darray) {
        return average(darray, 0, darray.length);
    }

    public static double average(double[] darray, int start, int end) {
        double total = sum(darray, start, end);
        return total / (end - start);
    }
}
