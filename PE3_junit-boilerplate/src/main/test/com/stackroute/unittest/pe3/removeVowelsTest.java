package com.stackroute.unittest.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class removeVowelsTest {

      removeVowels obj;
    @Before
    public void setUp() throws Exception {
        obj =  new removeVowels();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void RemoveVowel() {
        assertEquals("nd",obj.RemoveVowel("India"));
        assertEquals("ntd Stts",obj.RemoveVowel("United States"));
        assertEquals("Grmny",obj.RemoveVowel("Germany"));
        assertEquals("ygpt",obj.RemoveVowel("Eygpt"));
        assertEquals("czchslvk",obj.RemoveVowel("czechoslovakia"));


    }
}