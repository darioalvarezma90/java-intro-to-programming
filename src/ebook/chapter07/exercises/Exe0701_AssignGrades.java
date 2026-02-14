
package ebook.chapter07.exercises;

import java.util.Scanner;

import ebook.util.Arrays;

/**
 * Exercise 7.1 - Assign grades
 * 
 * Write a program that reads student scores, gets the best score, and
 * then assigns grades based on the following scheme:
 * 
 * Grade is A if score >= best - 5;
 * Grade is B if score >= best - 10;
 * Grade is C if score >= best - 15;
 * Grade is D if score >= best - 20;
 * Grade is F otherwise.
 * 
 * The program prompts the user to enter the total number of students, and then
 * prompts the user to enter all of the scores, and concludes by displaying the
 * grades.
 */
public class Exe0701_AssignGrades {

    public static void main(String[] args) {
        System.out.println("*** Exercise 7.1 - Assign Grades ***\n");

        // Creates Scanner object.
        @SuppressWarnings("resource")
        var keyboard = new Scanner(System.in);

        // Enters number of students.
        System.out.print("Enter the number of students: ");
        var n = keyboard.nextInt();

        // Enters student scores.
        var scores = new int[n];
        System.out.printf("Enter %d scores: ", n);
        for (var i = 0; i < n; i++) {
            scores[i] = keyboard.nextInt();
        }

        // Gets the best score and assigns corresponding grades.
        var bestScore = Arrays.maximum(scores);
        var grades = new char[n];
        for (var i = 0; i < n; i++) {
            grades[i] = assignGrade(scores[i], bestScore);
        }

        // Displays results.
        for (var i = 0; i < n; i++) {
            System.out.printf("Student %d score is %d and grade is %c\n", i, scores[i], grades[i]);
        }
    }

    private static char assignGrade(int x, int bestScore) {
        if (x >= bestScore - 05) { return 'A'; }
        if (x >= bestScore - 10) { return 'B'; }
        if (x >= bestScore - 15) { return 'C'; }
        if (x >= bestScore - 20) { return 'D'; }
        return 'F';
    }
}
