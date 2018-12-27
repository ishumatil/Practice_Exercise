package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString obj;
    @Before
    public void setUp() throws Exception {
        ReverseString obj = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        ReverseString obj = null;
    }

    @Test
    public void reverseStr() {
        assertEquals("nodnol", obj.reverseStr("london"));
        assertEquals("acca", obj.reverseStr("acca"));
        assertEquals(" ", obj.reverseStr(" "));
    }
}