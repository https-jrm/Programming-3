/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOperators;

/**
 *
 * @author Mirabuenos
 */
public class Expert {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int count = 2;

        // PREDICTED RESULT: true
        boolean result1 = a + b * 2 > 15 && count++ == 2;
        System.out.println("Expression 1 Actual Result: " + result1);

        // PREDICTED RESULT: false
        boolean result2 = a - b * 2 >= 5 || ++count < 3;
        System.out.println("Expression 2 Actual Result: " + result2);

        // PREDICTED RESULT: true
        boolean result3 = (a + b) >= 15 && count-- == 3;
        System.out.println("Expression 3 Actual Result: " + result3);

        // My prediction was wrong because count was already 4.
        // The postfix count-- compares the current value (4) first,
        // then decreases it to 3, so 4 == 3 is false.
    }
}