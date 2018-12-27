package com.stackroute.unittest.pe1;         // root package

import java.util.Scanner;              // importing util scanner libraries

public class Palindrome {         // defining class function
    public static boolean checkSumOfEven(String numAsString) {       // method to check sum of even numbers of string
        int i, sum = 0;
        for (i = 0; i < numAsString.length(); i++) {
            if (Character.getNumericValue(numAsString.charAt(i)) % 2 == 0) {
                sum = sum + Character.getNumericValue(numAsString.charAt(i));
            }
        }
        if (sum > 25) {      // checking wheather sum is greater than 25
            return true;
        } else {
            return false;
        }
    }

    public static boolean Palindrome(String numAsString) {  // method to check that the string is Plaindrome or not
        int i, flag = 0;
        for (i = 0; i < numAsString.length(); i++) {
            if (numAsString.charAt(i) != numAsString.charAt(numAsString.length() - (i + 1))) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return true;          // return flag value if string is palindrome
        } else {
            return false;         // return flag value if it is not a palindrome
        }
    }

    public static void main(String args[]) {     // main method  of function
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.matches("[0-9]+")) {
            if (Palindrome(str) && (checkSumOfEven(str))) {
                System.out.println("Success! It is a palindrome and the Sum is greater than 25");
            }
            if (!Palindrome(str)) {
                System.out.println("Failure! It is not a palindrome");
            }
            if (Palindrome(str) && !((checkSumOfEven(str)))) {
                System.out.println("Success! It is a palindrome and the Sum is less than 25");
            }

        }
    }
}