/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formativeassesmentpart1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class FormativeAssesmentPart1 {

    public static void main(String[] args) {
      
         Scanner input = new Scanner (System.in);
         System.out.println("Registration");
         
         System.out.print("First Name;");
         String firstname = input.nextLine();
         
         System.out.print("Last Name;");
         String lastname = input.nextLine();
         
         System.out.print("Usename;");
         String username = input.nextLine();
         
         System.out.print("Password;");
         String password = input.nextLine();
         
         System.out.print("Cellphone Number(+27xxxxxxxxx ; )");
         String phonenumber = input.nextLine();
         
         Login login = new Login(
         firstname,lastname,username,password, "0835552094");
         System.out.println(login.registerUser());
         System.out.println("\n=== Login ===");
         
         System.out.print("Username: ");
         String loginUsername = input.nextLine();
         System.out.print("Password: ");
         String loginPassword = input.nextLine();
         boolean success = login.loginUser(loginUsername, loginPassword);
         System.out.println(login.returnLoginStatus(success));
         
    }
}
