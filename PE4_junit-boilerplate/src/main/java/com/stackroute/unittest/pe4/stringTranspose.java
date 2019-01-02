package com.stackroute.unittest.pe4;

import java.util.Scanner;
public class stringTranspose {
    public static String stringtranspose(String str){
        StringBuilder sb = new StringBuilder();

        sb.append(str);
        sb = sb.reverse();
        str = sb.toString();
        String arrStr[] = str.split(" ");
        int i;
        String newStr = "";
        for (i = arrStr.length-1; i >= 0; i--){
            newStr = newStr + arrStr[i] + " ";
        }
        return newStr.trim();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringtranspose(str);
        System.out.println(stringtranspose(str));
    }
}
