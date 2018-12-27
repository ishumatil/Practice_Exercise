package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SortSumTest {

    SortSum obj;
    @Before
    public void setUp() throws Exception {
        SortSum obj = new SortSum();
    }

    @After
    public void tearDown() throws Exception {
        SortSum obj = null;
    }

    @Test
    public void reverseStr() {
        assertEquals("97765321", obj.reverseStr("27356719"));
        assertEquals("54321", obj.reverseStr("12345"));
        assertEquals("987632", obj.reverseStr("792386"));
    }

    @Test
    public void CalculateSum() {
        assertEquals("8", obj.CalculateSum("27356719"));
        assertEquals("6", obj.CalculateSum("12345"));
        assertEquals("16", obj.CalculateSum("792386"));
    }

    @Test
    public void checkSum() {
        assertEquals(false, obj.checkSum(8));
        assertEquals(false, obj.checkSum(6));
        assertEquals(true, obj.checkSum(16));
    }
}