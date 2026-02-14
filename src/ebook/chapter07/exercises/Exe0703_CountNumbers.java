
package ebook.chapter07.exercises;

import java.util.Scanner;

/**
 * Exercise 7.3 - Count occurrence of numbers.
 * 
 * Write a program that reads the integers between 1 and 50
 * and counts the occurrences of each. Assume the input ends with 0.
 */
public class Exe0703_CountNumbers {
    
    private static final int N = 50;

    // Function main begins program execution.
    public static void main(String[] args) {
        System.out.println("*** Exercise 7.3 - Count occurrence of numbers ***\n");

        // Creates Scanner object.
        @SuppressWarnings("resource")
        var keyboard = new Scanner(System.in);

        // Creates counters array.
        var counters = new int[N + 1];

        // Enter integers and increments corresponding counter.
        var n = -1;
        System.out.print("Enter the integers between 1 and 50: ");
        while (n != 0) {
            n = keyboard.nextInt();
            if (1 <= n && n <= N) {
                counters[n]++;
            }
        }

        // Display results.
        for (var i = 1; i <= N; i++) {
            if (counters[i] > 0) {
                var message = "time";
                if (counters[i] > 1) {
                    message = "times";
                }
                System.out.printf("%d occurs %d %s\n", i, counters[i], message);
            }
        }
    }
}
