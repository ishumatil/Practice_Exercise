package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class StringInt
{
    public static String repeatStr(String str, int num) // method to repeat the string
    {
        // condition to print last n characters of string in loop
        int i;
        String str1 = str.substring(str.length()-num);
        String resultingStr = "";
        for(i=0;i < num; i++)
        {
            resultingStr = resultingStr + str1;
        }
        str = str + resultingStr;   // collects fina string after repeat
        System.out.println(str);
        return str;
    }
    public static void main(String args[]) //main method
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        repeatStr(str,num);
    }
}