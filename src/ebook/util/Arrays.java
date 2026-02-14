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
}
