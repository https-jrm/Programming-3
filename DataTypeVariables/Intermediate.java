/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypeVariables;

/**
 *
 * @author Mirabuenos
 */
public class Intermediate {
    public static void main(String[] args) {

        
        int quantity = 3;
        double unitPrice = 129.50;
        String storeName = "JEM Store";

        // totalCost should NOT be an int because unitPrice can have decimal values.
        double totalCost = quantity * unitPrice;

        System.out.println("Shopping Summary");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
    }
}

