/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypeVariables;

/**
 *
 * @author Jerome
 */
public class Advanced {
    public static void main(String[] args) {

        double centimeters = 254.75;

        // Explicit narrowing cast: converting double to int removes the decimal part.
        int wholeMeters = (int) centimeters / 100;
        double remainingCentimeters = centimeters % 100;

        System.out.println("Unit Casting Converter");
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        // Implicit widening: an int can be converted to double automatically without a cast.
        int number = 10;
        double widenedNumber = number;

        System.out.println("Implicit Widening: " + widenedNumber);

        // Explicit narrowing: converting double to int loses the decimal portion.
        double decimalNumber = 25.75;
        int narrowedNumber = (int) decimalNumber;

        System.out.println("Explicit Narrowing: " + narrowedNumber);
    }
    
}
