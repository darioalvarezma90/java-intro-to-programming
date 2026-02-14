
package ebook.chapter07.exercises;

/**
 * Exercise 7.7 - Count single digits.
 * 
 * Write a program that generates 200 random integers between
 * 0 and 9 and displays the count for each numbers.
 */
public class Exe0707_CountDigits {
    
    private static final int TRIALS = 200;
    private static final int DIGITS = 10;

    // Method main begins program execution.
    public static void main(String[] args) {
        System.out.println("*** Exercise 7.7 - Count single digits ***\n");

        // Generates 200 random integers and increments appropriate counter.
        var counters = new int[DIGITS];
        for (var i = 0; i < TRIALS; i++) {
            counters[(int)(DIGITS * Math.random())]++;
        }

        // Display results.
        for (var i = 0; i < DIGITS; i++) {
            System.out.printf("Digit %d occurs %d times\n", i, counters[i]);
        }
    }
}
