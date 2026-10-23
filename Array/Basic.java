/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Mirabuenos
 */
public class Basic {public static void main(String[] args) {

        String[] favorites = {"Food", "Workout", "Games", "Cleaning House", "Work"};

        System.out.println("My Favorite Things:");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total favorites: " + favorites.length);
    }
}