    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOperators;

/**
 *
 * @author Mirabuenos
 */
public class Basic {
    public static void main(String[] args) {

        int number1 = 20;
        int number2 = 6;

        System.out.println("Four-Function Calculator");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        System.out.println("Modulus: " + (number1 % number2));

        // With negative operands, division truncates toward zero and
        // the modulus (%) result follows the sign of the first operand.
    }
}
