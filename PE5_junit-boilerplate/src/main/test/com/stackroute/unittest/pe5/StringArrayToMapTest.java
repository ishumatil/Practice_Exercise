package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringArrayToMapTest {

    StringArrayToMap obj;

    @Before
    public void setUp() throws Exception {
        obj = new StringArrayToMap();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void CheckOccurenceOfWord(){
        String  arr[] ={"a","b","c","d","a","c","c"};
        Map<String,Boolean> map=new HashMap<String,Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        System.out.println(map);
        assertEquals(map,obj.checkOccurenceOfWord(arr));
    }

    @Test
    public void checkOccurenceOfWord1(){
        String  arr[] ={"Ram","Vedansh","Dog","Ram","Monkey","Vedansh","Ram"};
        Map<String,Boolean> map=new HashMap<String,Boolean>();
        map.put("Ram",true);
        map.put("Vedansh",true);
        map.put("Dog",false);
        map.put("Monkey",false);
        System.out.println(map);
        assertEquals(map,obj.checkOccurenceOfWord(arr));
    }
}