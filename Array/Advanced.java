/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;
/**
 *
 * @author Mirabuenos
 */
public class Advanced {
    public static void main(String[] args) {

        int[] scores = {85, 92, 78, 90, 88, 76, 95, 84};

        // Linear search
        int target = 95;
        int foundIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Score " + target
                    + " found at index: " + foundIndex);
        } else {
            System.out.println("Score " + target + " not found.");
        }

        // Make a copy of the original array
        // Sorting a copy keeps the original array's order unchanged.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        // Sort the copy
        Arrays.sort(sortedScores);

        // Print original array
        System.out.println("\nOriginal array:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        // Print sorted array
        System.out.println("\n\nSorted array:");
        for (int score : sortedScores) {
            System.out.print(score + " ");
        }
    }
}