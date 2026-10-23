/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlow1;

/**
 *
 * @author Mirabuenos
 */
public class Intermediate {
    public static void main(String[] args) {

        double purchaseAmount = 2500.00;
        double discountRate;

        if (purchaseAmount < 1000) {
            discountRate = 0.00;
        } else if (purchaseAmount < 2000) {
            discountRate = 0.05;
        } else if (purchaseAmount < 3000) {
            discountRate = 0.10;
        } else {
            discountRate = 0.15;
        }

        double discountAmount = purchaseAmount * discountRate;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + (discountRate * 100) + "%");
        System.out.println("Final Discounted Price: " + finalPrice);
    }
}