package com.stackroute.unittest.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class consecutiveNumbersTest {

    consecutiveNumbers obj;
    @Before
    public void setUp() throws Exception {
        consecutiveNumbers obj = new consecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumbers obj = null;
    }

    @Test
    public void checkStatus() {
        assertEquals(true,obj.checkStatus(2,1));
        assertEquals(false,obj.checkStatus(4,65));
        assertEquals(true,obj.checkStatus(44,17));
        assertEquals(false,obj.checkStatus(5,49));
    }

    @Test
    public void checkconsecutiveNumbers() {

        assertEquals("non consecutive order",obj.checkconsecutiveNumbers("98,96,95,94,93"));
        assertEquals("non consecutive order",obj.checkconsecutiveNumbers("1,2,3,4,5,6,6"));
        assertEquals("in consecutive order",obj.checkconsecutiveNumbers("54,53,52,51,50,49,48"));
    }
}