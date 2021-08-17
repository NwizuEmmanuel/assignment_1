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
public class Program_2 {

    public void area_of_circle() {
        System.out.println("Area of a circle\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String full_name = scanner.nextLine();
        System.out.println("Full name checked.");
        System.out.println("Enter your registration number: ");
        String reg_no = scanner.nextLine();
        System.out.println("Registration number checked");

        System.out.println("To calculate the area of a circle\nEnter it's radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Full name: " + full_name + "\nReg. no.: " + reg_no + "\n");
        System.out.println("Your answer : \n" + Math.PI * (Math.pow(radius, 2)));
    }
}
