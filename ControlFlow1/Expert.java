/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlow1;

/**
 *
 * @author Jerome
 */
public class Expert {
    public static void main(String[] args) {

        String username = "student";
        int pin = 1234;
        double balance = 50000.00;
        double withdrawalAmount = 8000.00;

        String accountTier;
        double transactionFeeRate;
        double dailyLimit;
        
        if (username.equals("student")) {

            if (pin == 1234) {
                
                if (balance < 10000) {
                    accountTier = "Bronze";
                } else if (balance < 25000) {
                    accountTier = "Silver";
                } else if (balance < 50000) {
                    accountTier = "Gold";
                } else {
                    accountTier = "Platinum";
                }

                if (accountTier.equals("Bronze")) {
                    dailyLimit = 5000;
                } else if (accountTier.equals("Silver")) {
                    dailyLimit = 10000;
                } else if (accountTier.equals("Gold")) {
                    dailyLimit = 20000;
                } else {
                    dailyLimit = 30000;
                }

                switch (accountTier) {
                    case "Bronze":
                        transactionFeeRate = 0.02;
                        break;
                    case "Silver":
                        transactionFeeRate = 0.015;
                        break;
                    case "Gold":
                        transactionFeeRate = 0.01;
                        break;
                    default:
                        transactionFeeRate = 0.005;
                        break;
                }

                double transactionFee = withdrawalAmount * transactionFeeRate;
                double totalDeduction = withdrawalAmount + transactionFee;

                if (withdrawalAmount <= balance && withdrawalAmount <= dailyLimit) {

                    System.out.println("TRANSACTION APPROVED");
                    System.out.println("Account Tier: " + accountTier);
                    System.out.println("Withdrawal Amount: " + withdrawalAmount);
                    System.out.println("Transaction Fee: " + transactionFee);
                    System.out.println("Total Deduction: " + totalDeduction);
                    System.out.println("Remaining Balance: " + (balance - totalDeduction));

                } else {

                    System.out.println("TRANSACTION DENIED");

                    if (withdrawalAmount > balance) {
                        System.out.println("Reason: Insufficient balance.");
                    } else if (withdrawalAmount > dailyLimit) {
                        System.out.println("Reason: Withdrawal amount exceeds the daily limit for "
                                + accountTier + " tier.");
                    }
                }

            } else {
                System.out.println("TRANSACTION DENIED");
                System.out.println("Reason: Incorrect PIN.");
            }

        } else {
            System.out.println("TRANSACTION DENIED");
            System.out.println("Reason: Incorrect username.");
        }
    }
}
