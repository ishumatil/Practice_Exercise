package com.stackroute.unittest.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findHarry {
    public static boolean findHarry(String str){
        String regex = "\\bHarry\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            return  true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Is Harry here ? " + findHarry(str));
    }
}
