
package ebook.chapter07.exercises;

import java.util.Scanner;

import ebook.util.Arrays;

/**
 * Exercise 7.9 - Find the largest element.
 * 
 * Write a method that finds the largest element in an array
 * of double values using the following header.
 * 
 * public static double max(double[] array)
 * 
 * Write a test program that prompts the user to enter ten numbers, invokes this
 * method to return the maximum value, and displays the maximum value.
 */
public class Exe0709_LargestNumber {
    
    private static final int N = 10;

    // Main method begins program execution.
    public static void main(String[] args) {
        System.out.println("*** Exercise 7.9 - Find the largest element ***\n");

        // Creates Scanner object.
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);

        // Enter numbers.
        double[] darray = new double[N];
        System.out.printf("Enter %d numbers: ", N);
        for (int i = 0; i < N; i++) {
            darray[i] = keyboard.nextDouble();
        }

        // Find largest element in array and displays results.
        double largest = Arrays.getMaximum(darray);
        System.out.printf("The maximum number is: %.2f\n", largest);
    }
}
