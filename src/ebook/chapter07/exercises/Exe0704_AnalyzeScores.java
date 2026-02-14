
package ebook.chapter07.exercises;

import java.util.Scanner;

import ebook.util.Arrays;

/**
 * Exercise 7.4 - Analyze scores.
 * 
 * Write a program that reads unespecified number of scores and
 * determines how many scores are above or equal to the average,
 * and how many scores are below the average. Enter a negative number
 * to signify the end of the input. Assume the maximum number of scores is 100.
 */
public class Exe0704_AnalyzeScores {
    
    private static final int N = 100;

    // Method main begins program execution
    public static void main(String[] args) {
        System.out.println("*** Exercise 7.4 - Analyze scores ***\n");

        // Creates Scanner object.
        @SuppressWarnings("resource")
        var keyboard = new Scanner(System.in);

        // Creates scores array and init entered numbers counter.
        var scores = new int[N];
        var entered = 0;

        // Enter valid scores and increments numbers coounter.
        System.out.print("Enter scores (-1 to exit): ");
        var n = keyboard.nextInt();
        while (n >= 0 && entered < N) {
            scores[entered] = n;
            entered++;
            n = keyboard.nextInt();
        }

        // Compute average of entered numbers.
        var avg = Arrays.average(scores, 0, entered);

        // Counts above or equal and below to average entered values.
        var aboveOrEqual = 0;
        var below = 0;
        for (int i = 0; i < entered; i++) {
            if (scores[i] >= avg) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        // Display results.
        System.out.printf("Numbers entered: %d\n", entered);
        System.out.printf("Average: %.2f\n", avg);
        System.out.printf("Scores above or equal to average: %d\n", aboveOrEqual);
        System.out.printf("Scores below to avearge: %d\n", below);
    }
}
