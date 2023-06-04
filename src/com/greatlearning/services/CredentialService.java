package com.greatlearning.services;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService implements ICredentials {

    @Override
    public String generateEmailAddress(Employee employee, String department) {
        return employee.getFirstName()+employee.getLastName()+"@"+department+".abc.com";
    }

    @Override
    public String generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*_=+-/.?<>)";
        String values = capitalLetters+smallLetters+numbers+specialCharacters;
        Random random = new Random();
        String password = "";
		//String.valueOf(0)
		//char[] passwordchar = {'c','h'};
		//System.out.println("random character is "+values.charAt(random.nextInt(values.length())));
        String capitalChar = String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
        String numberChar = String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
        for (int i = 0; i < 6; i++) {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
			//Approach 1
            password += String.valueOf(values.charAt(random.nextInt(values.length())));

        }
        return password+capitalChar+numberChar;
    }

    @Override
    public void showCredentials(Employee employee) {
        System.out.println("Dear " + employee.getFirstName()+" your generated credentials are as follows");
        System.out.println("Email = "+ employee.getEmail());
        System.out.println("Password = "+ employee.getPassword());
    }
}
