package com.greatlearning.main;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

import java.util.Scanner;

public class Driver {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Hi");
        //Create an employe object ... hard code
        Employee employee = new Employee("Susil","Parida");

        //.. print department options
        System.out.println("");
        //get userinput
        //print userinput
        //ICredentials
        //(Technical, Admin, Human Resource, Legal )

        displayMenu();
        int option = scanner.nextInt();
        CredentialService credentialService = new CredentialService();
        String[] departments = {"tech","admin","hr","legal"};

        //email address
        String	emailAddress = credentialService.generateEmailAddress(employee, departments[option-1]);
        String password = credentialService.generatePassword();
        employee.setEmail(emailAddress);
        employee.setPassword(password);
        credentialService.showCredentials(employee);
    }

    private static void displayMenu() {
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");
    }

}
