package com.stackroute.unittest.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCountOfString {
    public Map<String,Integer> CountWordFrequency(String match){

        String strRegexOne="one";
        String strRegexTwo="two";
        String strRegexThree="three";

        Pattern pattern1=Pattern.compile(strRegexOne);
        Pattern pattern2=Pattern.compile(strRegexTwo);
        Pattern pattern3=Pattern.compile(strRegexThree);

        Matcher match1=pattern1.matcher(match);       // will match the above mentioned three
        Matcher match2=pattern2.matcher(match);          // patterns in the string
        Matcher match3=pattern3.matcher(match);

        int count1=0;
        while(match1.find()){
            count1++;
        }
        System.out.println(count1);


        int count2=0;
        while(match2.find()){
            count2++;
        }
        System.out.println(count2);


        int count3=0;
        while(match3.find()){
            count3++;
        }
        System.out.println(count3);
        Map<String,Integer> frequency=new HashMap<String, Integer>();// create a map with given values
        frequency.put("one",count1);
        frequency.put("two",count2);           // put frequency as it got after matching the string
        frequency.put("three",count3);
        System.out.println(frequency);
        return frequency;
    }

}
