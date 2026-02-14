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

    public static double average(int[] iarray, int start, int end) {
        var total = sum(iarray, start, end);
        return total / (end - start);
    }

    public static double sum(int[] iarray, int start, int end) {
        var total = 0.0;
        for (var i = start; i < end; i++) {
            total += iarray[i];
        }
        return total;
    }
}
