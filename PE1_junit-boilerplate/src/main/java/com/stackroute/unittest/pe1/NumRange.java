package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class NumRange
{
    public static String NumRange(int num, int limit)
    {
        if(num < limit)
        {
            System.out.println("Number guessed is less than original number");
            return "Number guessed is less than original number";

        }
        else if(num > limit)
        {
            System.out.println("Number guessed is more than original number");
            return "Number guessed is more than original number";

        }
        else
        {
            System.out.println("Number guessed matches the original number");
            return "Number guessed matches the original number";

        }
    }
    public static void main(String args[]) {
        int limit = 85;
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num = sc.nextInt();
            NumRange(num,limit);
        }
        while (num != limit);
    }
}