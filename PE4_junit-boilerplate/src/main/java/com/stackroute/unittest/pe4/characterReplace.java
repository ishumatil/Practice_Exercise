package com.stackroute.unittest.pe4;

import java.util.Scanner;
public class characterReplace {
    public static String characterReplace(String str){
        str = str.replace("d","f");
        str = str.replace("i","t");
        return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       // characterReplace(str);
        System.out.println(characterReplace(str));
    }
}
