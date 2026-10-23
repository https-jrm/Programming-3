/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlow2;

/**
 *
 * @author Jerome
 */
public class Advanced {
    public static void main(String[] args) {

        int size = 5;

        System.out.println("Pattern Generator");
        System.out.println("----------------");

        for (int row = 1; row <= size; row++) {

            // CONTINUE: Skip row 3 entirely
            if (row == 3) {
                continue;
            }

            for (int col = 1; col <= row; col++) {

                // BREAK: Stop the INNER loop when col reaches 4
                if (col == 4) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}