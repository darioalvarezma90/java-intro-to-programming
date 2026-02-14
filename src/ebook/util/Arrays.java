package ebook.util;

public class Arrays {

    public static int getMaximum(int[] iarray) {
        return getMaximum(iarray, 0, iarray.length);
    }

    public static int getMaximum(int[] iarray, int start, int end) {
        int max = iarray[start];
        for (int i = start; i < end; i++) {
            if (iarray[i] > max) {
                max = iarray[i];
            }
        }
        return max;
    }

    public static double getMaximum(double[] darray) {
        return getMaximum(darray, 0, darray.length);
    }

    public static double getMaximum(double[] darray, int start, int end) {
        double max = darray[start];
        for (int i = start; i < end; i++) {
            if (darray[i] > max) {
                max = darray[i];
            }
        }
        return max;
    }

    public static int findFirstMaximum(int[] iarray) {
        return findFirstMaximum(iarray, 0, iarray.length);
    }

    public static int findFirstMaximum(int[] iarray, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (iarray[i] > iarray[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int findFirstMaximum(double[] darray) {
        return findFirstMaximum(darray, 0, darray.length);
    }

    public static int findFirstMaximum(double[] darray, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (darray[i] > darray[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int findLastMaximum(int[] iarray) {
        return findLastMaximum(iarray, 0, iarray.length);
    }

    public static int findLastMaximum(int[] iarray, int start, int end) {
        int max = end - 1;
        for (int i = end - 1; i >= 0; i--) {
            if (iarray[i] > iarray[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int findLastMaximum(double[] darray) {
        return findLastMaximum(darray, 0, darray.length);
    }

    public static int findLastMaximum(double[] darray, int start, int end) {
        int max = end - 1;
        for (int i = end - 1; i >= start; i--) {
            if (darray[i] > darray[max]) {
                max = i;
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
