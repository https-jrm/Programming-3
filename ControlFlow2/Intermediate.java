/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlow2;
import java.util.Scanner;
/**
 *
 * @author Jerome
 */
public class Intermediate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.println("Enter integers (-1 to stop):");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -1) {
            total += number;

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        System.out.println("Final Total: " + total);

        input.close();
    }
}