package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class sortedListTest {

      sortedList obj;

    @Before
    public void setUp() throws Exception {
        sortedList obj =  new sortedList();
    }

    @After
    public void tearDown() throws Exception {
        sortedList obj = null;
    }

    @Test
    public void sortList() {
        String s1 = "how is is it this ";
        String arr1[] = s1.split(" ");
        assertArrayEquals(arr1 ,obj.sortList("this is how it is"));

        String s2 = "happy he is so";
        String arr2[] = s2.split(" ");
        assertArrayEquals(arr2 ,obj.sortList("he is so happy"));
    }
}