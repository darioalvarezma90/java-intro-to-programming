
package ebook.chapter07.exercises;

import java.util.Scanner;

/**
 * Exercise 7.5 - The number of even and odd numbers.
 * 
 * Write a program that reads ten integers, and then display
 * the number of even numbers and odd numbers. Assume that the
 * input ends with 0.
 */
public class Exe0705_EvenOddNumbers {
    
    private static final int N = 2;
    
    // Method main begins program execution.
    public static void main(String[] args) {
        System.out.println("*** Exercise 7.5 - The number of even and odd numbers ***\n");

        // Creates Scanner object.
        @SuppressWarnings("resource")
        var keyboard = new Scanner(System.in);

        // Creates counters array.
        var counters = new int[N];

        // Enter valid numbers and increments corresponding counter.
        System.out.print("Enter numbers: ");
        var n = keyboard.nextInt();
        while (n != 0) {
            counters[n % 2]++;
            n = keyboard.nextInt();
        }

        // Display results.
        System.out.printf("The number of odd numbers: %d\n", counters[1]);
        System.out.printf("The number of even numbers: %d\n", counters[0]);
    }
}
