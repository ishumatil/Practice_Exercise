package com.stackroute.unittest.pe4;

import java.util.Scanner;
public class characterOccurence {
    public static int characterOccurence(String str1, String str2){
        int count  = 0;
        for (int  i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(0)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
       // characterOccurence(str1, str2);
        System.out.println(characterOccurence(str1, str2));
    }
}
