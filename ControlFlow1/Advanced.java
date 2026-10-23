/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlow1;

/**
 *
 * @author Mirabuenos
 */
public class Advanced {
    public static void main(String[] args) {

        String username = "student";
        String password = "12345";
        boolean accountLocked = false;

        if (username.equals("student")) {

            if (password.equals("12345")) {

                if (!accountLocked) {
                    System.out.println("LOGIN SUCCESSFUL");
                } else {
                    System.out.println("LOGIN FAILED: Account is locked.");
                }

            } else {
                System.out.println("LOGIN FAILED: Incorrect password.");
            }

        } else {
            System.out.println("LOGIN FAILED: Incorrect username.");
        }
    }
}
