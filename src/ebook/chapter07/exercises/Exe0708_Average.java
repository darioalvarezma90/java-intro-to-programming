
package ebook.chapter07.exercises;

import java.util.Scanner;

import ebook.util.Arrays;

/**
 * Exercise 7-8 - Average an array.
 * 
 * Write to overloaded methods that returns the average
 * of an array with the following headers:
 * 
 * public static double avarege(double[] array)
 * public static double average(int[] array)
 * 
 * Write a test program that prompts the user to enter 10 integers, invokes
 * the first method, then displays the average value; prompts the user to enter
 * 10 double values, invokes the second method, then displays the average value.
 */
public class Exe0708_Average {
    
    private static final int N = 10;

    // Method main begins program execution.
    public static void main(String[] args) {
        System.out.println("*** Exercise 7.8 - Average an array ***\n");

        // Creates Scanner object.
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);

        // Enter integer values
        int[] integers = new int[N];
        System.out.printf("Enter %d integers: ", N);
        for (int i = 0; i < N; i++) {
            integers[i] = keyboard.nextInt();
        }

        // Compute average of integer values and displays it.
        double iavg = Arrays.average(integers);
        System.out.printf("Average of integer values: %.2f\n", iavg);

        // Enter double values.
        double[] doubles = new double[N];
        System.out.printf("Enter %d doubles: ", N);
        for (int i = 0; i < N; i++) {
            doubles[i] = keyboard.nextDouble();
        }

        // Computes average of double values and displays it.
        double davg = Arrays.average(doubles);
        System.out.printf("Average of double values: %.2f\n", davg);
    }
}
