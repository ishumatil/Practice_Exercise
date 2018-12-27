package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class  UnspecifiedNumber{     //class to check unspecified number
    public static int SumCheck(String str)     //method to find sum of unspecified number
    {
        String[] arrOfStr = str.split(" ");
        int sum = 0;
        for (String a : arrOfStr)
        {
            if(a.matches("[0-9]+")) //matches input one by one to digits
            {
                sum = sum + Integer.parseInt(a);
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SumCheck(str);
    }
}