package com.stackroute.unittest.pe1;


import java.util.Scanner;    // import scanner util libraries

public class EvenOdd {
    public static int EvenOdd(int num)
    {
        if(num >= 20 && num <= 30)  //condition to check the range between 20 to 30
        {
            if(num % 2 != 0)       // check if number is odd
            {
                return 1;
            }
            else
            {
                return 0;      //if number is even
            }
        }
        return 2;     // if input is out of range means not between 20 to 30
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(EvenOdd(num) == 1)  // if number is odd
        {
            System.out.println("Tom");
        }
        else if(EvenOdd(num) == 0)         // if number is even
        {
            System.out.println("Jerry");
        }
    }
}
