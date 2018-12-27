package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ConsonantVowel {
    public static String ConsonantVowel(char ch)
    {
        int i;
        if(!Character.toString(ch).matches ("[a-zA-Z]"))  //checking if string is not match to english alphabets
        {
            System.out.println("Given input is not alphabet");
        }
        else
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') // condition to check for vowel for characters
            {
                return "vowel";
            }
            else
            {
                return "consonant";
            }
        }
        return "invalid";      //return value if it is not a english character
    }
    public static void ConsonantVowel(String word)
    {
        int i;
        for(i=0; i < word.length(); i++)  //loop in string to extract each character
        {
            System.out.println(word.charAt(i) + "-" + ConsonantVowel(word.charAt(i))); // print character and its type
        }
    }
    public static void main(String args[])  //main method of class
    {
        int i;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        ConsonantVowel(word);
    }
}
