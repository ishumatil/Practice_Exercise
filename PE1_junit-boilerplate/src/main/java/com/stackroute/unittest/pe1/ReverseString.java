package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ReverseString
{
    public static String reverseStr(String str)
    {
        int i;
        char tempArray[] = str.toCharArray();
        String reverse = "";
        for (i = tempArray.length - 1; i >= 0; i--)
        {
            reverse = reverse + (tempArray[i]);
        }
        System.out.println(reverse);
        return reverse;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseStr(str);
    }
}