package com.stackroute.unittest.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class multipleOccurence {
    public static String multipleOccurence(String str, String word){
        String regex = word;
        String newArr = "";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
        {
            newArr = "" + newArr + matcher.start() + "-" + matcher.end() + " " ;
        }
        //System.out.println(newArr.trim());
        return newArr.trim();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.next();
        System.out.println(multipleOccurence(str, word));
    }
}
