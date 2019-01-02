package com.stackroute.unittest.pe4;

import java.util.Scanner;
public class sortedList {
    public static String[] sortList(String str){
        int i, j;
        String strArr[] = str.split(" ");
        String temp = "";
        for(i=0; i<strArr.length; i++)
        {
            for(j=1; j<strArr.length; j++)
            {
                if(strArr[j-1].compareTo(strArr[j])>0)
                {
                    temp=strArr[j-1];
                    strArr[j-1]=strArr[j];
                    strArr[j]=temp;
                }
            }
        }
        return strArr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sortList(str);
        System.out.println(sortList(str));
    }
}
