package com.stackroute.unittest.pe1; //root package path

import java.util.Scanner; //import util libraries

public class LoopInt {
    public static String LoopInt(int n)   //
    {
        int i;
        String pattern = " ";
        for(i=1; i<=n; i++)
        {
            int j = i;
            while(j != 0)
            {
                System.out.println(i + " "); // prints number with its pattern
                pattern = pattern + i; // writes no in its frequency
                j--;  //decrease the count pointer
            }
        }
        return pattern;
    }
    public static void main(String args[])
    {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LoopInt(n);
    }
}
