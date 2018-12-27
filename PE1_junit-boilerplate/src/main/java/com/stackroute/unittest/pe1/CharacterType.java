package com.stackroute.unittest.pe1;

import java.util.Scanner;            //import util scanner libraries
public class CharacterType {                  //public class to check the type of character
    public static String CharTypeCheck(String c)
    {
        if(c.length() == 1)              ////checking that it take single character to check
        {
            if(c.matches("[a-z]"))
            {
                System.out.println("Small letter");       // check wheather its a small english alphabet
                return "Small letter";
            }
            else if(c.matches("[A-Z]"))
            {
                System.out.println("Capital letter");       // check wheather its a capital english alphabet
                return "Capital letter";
            }
            else if(c.matches("[0-9]"))
            {
                System.out.println("Digit");    // check wheather input is a digit
                return "Digit";
            }
            else
            {
                System.out.println("Special Character");  //checking for spaecial character
                return "Special Character";
            }
        }
        else
        {
            System.out.println("Error! Length greater than 1");  //error message if input is not a single character
            return "Error";
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        CharTypeCheck(c);
    }
}

