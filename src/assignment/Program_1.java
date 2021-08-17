/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Onyekachukwu
 */
public class Program_1 {

    public void print_surname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first_name = scanner.nextLine();
        System.out.println("First name checked.");
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Surname checked");
        System.out.println("Enter your last name: ");
        String last_name = scanner.nextLine();
        System.out.println("Last name checked");
        System.out.println("Enter your registration number: ");
        String reg_no = scanner.nextLine();
        System.out.println("Registration number checked");
        System.out.println("--------------------------------");
        System.out.println("* " + "Your surname: " + surname);
    }
}
