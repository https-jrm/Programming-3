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
public class Expert {
        static final int LOW_STOCK = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array: -1 means damaged shelf
        int[][] warehouse = {
            {20, 15, -1, 8},
            {3, 12, 7, 10},
            {18, -1, 4, 25}
        };

        int choice;

        // DO-WHILE: Repeat menu until user chooses 4
        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. View Total Inventory");
            System.out.println("2. Find First Critically Low Shelf");
            System.out.println("3. Restock a Shelf");
            System.out.println("4. Exit");

            choice = readInt(input, "Choose an option: ");

            switch (choice) {
                case 1:
                    showTotalInventory(warehouse);
                    break;

                case 2:
                    findLowStock(warehouse);
                    break;

                case 3:
                    restockShelf(warehouse, input);
                    break;

                case 4:
                    System.out.println("Exiting inventory system...");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
            }

        } while (choice != 4);

        input.close();
    }

    // FOR + CONTINUE: Skip damaged shelves when totaling stock
    public static void showTotalInventory(int[][] warehouse) {
        int total = 0;

        for (int row = 0; row < warehouse.length; row++) {
            for (int col = 0; col < warehouse[row].length; col++) {

                if (warehouse[row][col] == -1) {
                    continue; // CONTINUE: Skip damaged shelf
                }

                total += warehouse[row][col];
            }
        }

        System.out.println("Total inventory: " + total + " items");
    }

    // NESTED LOOPS + BREAK: Find the first low-stock shelf
    public static void findLowStock(int[][] warehouse) {
        boolean found = false;

        for (int row = 0; row < warehouse.length; row++) {
            for (int col = 0; col < warehouse[row].length; col++) {

                if (warehouse[row][col] == -1) {
                    continue; // Skip damaged shelves
                }

                if (warehouse[row][col] <= LOW_STOCK) {
                    System.out.println("First low-stock shelf found!");
                    System.out.println("Row: " + (row + 1));
                    System.out.println("Column: " + (col + 1));
                    System.out.println(
                        "Items remaining: " + warehouse[row][col]
                    );

                    found = true;
                    break; // BREAK: Exit the inner loop
                }
            }

            if (found) {
                break; // BREAK: Exit the outer loop
            }
        }

        if (!found) {
            System.out.println("No critically low shelves found.");
        }
    }

    // WHILE + RETURN: Restock with input validation
    public static void restockShelf(
            int[][] warehouse, Scanner input) {

        while (true) {
            System.out.println("\n--- RESTOCK SHELF ---");

            int row = readInt(input, "Enter row (1-"
                    + warehouse.length + "): ");

            int col = readInt(input, "Enter column (1-"
                    + warehouse[0].length + "): ");

            // Validate row and column
            if (row < 1 || row > warehouse.length
                    || col < 1
                    || col > warehouse[row - 1].length) {
                System.out.println("Invalid shelf position!");
                continue;
            }

            // Damaged shelves cannot be restocked
            if (warehouse[row - 1][col - 1] == -1) {
                System.out.println(
                    "This shelf is damaged and cannot be restocked."
                );
                continue;
            }

            int quantity = readInt(
                input, "Enter quantity to add: ");

            if (quantity <= 0) {
                System.out.println(
                    "Quantity must be greater than zero!"
                );
                continue;
            }

            warehouse[row - 1][col - 1] += quantity;

            System.out.println("Restocking successful!");
            System.out.println(
                "Updated stock: "
                + warehouse[row - 1][col - 1]
            );

            return; // RETURN: Finish restocking after valid input
        }
    }

    // WHILE: Validate that the user enters an integer
    public static int readInt(Scanner input, String message) {
        while (true) {
            System.out.print(message);

            if (input.hasNextInt()) {
                return input.nextInt();
            }

            System.out.println(
                "Invalid input! Please enter an integer."
            );
            input.next();
        }
    }
}