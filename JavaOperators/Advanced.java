/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOperators;

/**
 *
 * @author Mirabuenos
 */
public class Advanced {
     public static void main(String[] args) {

        double balance = 1000.00;

        balance += 200;
        System.out.println("After adding 200: " + balance);
        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);
        balance += 150;
        System.out.println("After adding 150: " + balance);

        
        int count = 5;

        System.out.println("count++: " + count++);
        System.out.println("Count after count++: " + count);

        count = 5;

        System.out.println("++count: " + ++count);
        System.out.println("Count after ++count: " + count);

        // With count++, the current value is printed first, then count increases.
        // With ++count, count increases first, then the new value is printed.
    }
}
