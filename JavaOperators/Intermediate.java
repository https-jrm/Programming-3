/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOperators;

/**
 *
 * @author Mirabuenos
 */
public class Intermediate {
        public static void main(String[] args) {
            
            int grade = 90;
            int absences = 4;
            
            boolean passed = (grade >= 75 && absences <= 3) || grade >= 90;

        System.out.println("Grade: " + grade);
        System.out.println("Absences: " + absences);

        if (passed) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}