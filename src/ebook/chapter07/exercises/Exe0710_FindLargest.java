package ebook.chapter07.exercises;

import java.util.Scanner;

import ebook.util.Arrays;

/**
 * Exercise 7.10 - Find the index of the largest element.
 * 
 * Write a methow that returns the index of the largest element in an array of
 * integers. If there is more than one element, return the largest index.
 * 
 * public static int indexOfLargestElement(int[] array)
 * 
 * Write a test program that prompts the user to enter 10 numbers, invokes
 * this method to return the index of the largest element, and displays the index
 * and the element itself.
 */
public class Exe0710_FindLargest {
    
    private static final int N = 10;

    // Method main begins program execution.
    public static void main(String[] args) {
        System.out.println("*** Exercise 7.10 - Find the index of largest element ***\n");

        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);

        int[] numbers = new int[N];
        System.out.printf("Enter %d numbers: ", N);
        for (int i = 0; i < N; i++) {
            numbers[i] = keyboard.nextInt();
        }

        int largest = Arrays.findLastMaximum(numbers);
        System.out.printf("Largest value: numbers[%d] = %d\n", largest, numbers[largest]);
    }
}
