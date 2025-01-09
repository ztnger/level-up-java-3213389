package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        boolean hasUpperCaseLetter = false;
        boolean hasLowerCaseLetter = false;
        boolean hasOneDigit = false;

        if (password.length() >= 6) {
            char[] charArray = password.toCharArray();
            for (char c : charArray) {
                if (Character.isUpperCase(c)) {
                    hasUpperCaseLetter = true;
                } else if (Character.isDigit(c)) {
                    hasOneDigit = true;
                } else {
                    hasLowerCaseLetter = true;
                }

                return hasUpperCaseLetter && hasLowerCaseLetter && hasOneDigit;  
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
