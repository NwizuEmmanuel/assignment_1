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
public class Program_3 {

    public void integer_checker() {
        System.out.println("Integer checker(Only integers)\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String full_name = scanner.nextLine();
        System.out.println("Full name checked.");
        System.out.println("Enter your registration number: ");
        String reg_no = scanner.nextLine();
        System.out.println("Registration number checked\n");

        System.out.println("Choose a number between 1 to 100 :");
        int number = scanner.nextInt();

        System.out.println("\nFull name: " + full_name + "\nReg. no.: " + reg_no + "\n");
        
        if (number <= 0) {
            System.out.println("Your number :"+number+"\n");
            System.out.println("Choosen number is out of range.");
        } else if (number > 100) {
            System.out.println("Your number :"+number+"\n");
            System.out.println("Choosen number is out of range.");
        }else if (number <= 50){
            System.out.println("Your number :"+number+"\n");
            System.out.println("Choosen number is less than 50");
        }else if (number >= 50) {
            System.out.println("Your number :"+number+"\n");
            System.out.println("Choosen number is greater than 50");
        }
    }
}
