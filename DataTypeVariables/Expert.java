/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypeVariables;

/**
 *
 * @author Mirabuenos
 */
public class Expert {
    public static void main(String[] args) {

        // BYTE OVERFLOW
        byte number = 127;
        number++;

        System.out.println("BYTE OVERFLOW");
        System.out.println("After incrementing 127: " + number);
        System.out.println();


        // STRING REFERENCE COMPARISON
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";

        System.out.println("STRING COMPARISON");

        // str1 == str2 is false because they are two different String objects.
        System.out.println("str1 == str2: " + (str1.equals(str2)));

        // str1.equals(str2) is true because both Strings contain the same text.
        System.out.println("str1.equals(str2): " + str1.equals(str2));

        // str1 == str3 is false because str1 refers to a new object,
        // while str3 refers to the String literal in the String pool.
        System.out.println("str1 == str3: " + (str1.equals(str3)));

        // str1.equals(str3) is true because both Strings contain the same text.
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        // str2 == str3 is false because str2 refers to a different new object
        // while str3 refers to the String literal in the String pool.
        System.out.println("str2 == str3: " + (str2.equals(str3)));

        // str2.equals(str3) is true because both Strings contain the same text.
        System.out.println("str2.equals(str3): " + str2.equals(str3));

        System.out.println();


        // SHARED ARRAY REFERENCE
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("SHARED ARRAY REFERENCE");
        System.out.println("Before modification: " + array2[0]);

        // array1 and array2 refer to the same array,
        // so changing through array1 is visible through array2.
        array1[0] = 99;

        System.out.println("After modification through array1: " + array2[0]);
    }
}
