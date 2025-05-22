package com.student.tracker; // Add this line

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of scores: ");
        int n = scanner.nextInt();

        int[] scores = new int[n]; // Array to store input scores

        // Read n scores from user
        System.out.println("Enter " + n + " test scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Store scores in ArrayList
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int score : scores) {
            scoreList.add(score);
        }

        // Display scores from ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }

        scanner.close();
    }
}
