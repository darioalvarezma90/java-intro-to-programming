
package ebook.chapter07.exercises;

import java.util.Scanner;

/**
 * Exercise 7.2 - Reverse the numbers entered.
 * 
 * Write a program that reads 10 integers then displays
 * them in the reverse of the order in which they were read.
 */
public class Exe0702_ReverseNumbers {
    
    private static final int N = 10;

    // Method main begins program execution.
    public static void main(String[] args) {
        System.out.println("*** Exercise 7.2 - Reverse the numbers entered ***\n");

        // Creates Scanner object.
        @SuppressWarnings("resource")
        var keyboard = new Scanner(System.in);

        // Enter integers.
        var integers = new int[N];
        System.out.printf("Enter %d integers: ", N);
        for (var i = 0; i < N; i++) {
            integers[i] = keyboard.nextInt();
        }

        // Display numbers in reverse order.
        System.out.print("Reversed numbers: ");
        for (var i = N - 1; i >= 0; i--) {
            System.out.printf("%d ", integers[i]);
        }
        System.out.println();
    }
}
