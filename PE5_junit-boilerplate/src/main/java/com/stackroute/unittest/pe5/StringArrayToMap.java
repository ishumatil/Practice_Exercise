package com.stackroute.unittest.pe5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringArrayToMap {
    
    public Map<String, Boolean> CheckOccurenceOfWord(String[] input){
        Map<String,Integer> map = new HashMap<String, Integer>(); // initialise map of string and integer

        for(String str:input){
            Integer num=map.get(str);
            num=(num==null)?1:++num;
            map.put(str,num);
        }
        Map<String,Boolean> result = new HashMap<String, Boolean>(); //initializing map of string and boolean to strore o/p
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue() >= 2){ // to check if the string in the map is present more than twice
                result.put(entry.getKey(),true); // if present put set it to True and add it to result map
            }
            else
                result.put(entry.getKey(),false);// if its not present more than once set it to False and add it to result map
        }
        return result;
    }


}
