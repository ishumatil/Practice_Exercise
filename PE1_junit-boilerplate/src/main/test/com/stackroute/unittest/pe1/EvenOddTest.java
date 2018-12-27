package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd obj;
    @Before
    public void setUp() throws Exception {
        EvenOdd obj = new EvenOdd ();
    }

    @After
    public void tearDown() throws Exception {
        EvenOdd obj = null;
    }

    @Test
    public void EvenOdd() {
//        int expectedRes = 1;
//        int actualRes = obj.EvenOdd (21);
        assertEquals(1, obj.EvenOdd(21));
        assertEquals(0, obj.EvenOdd(24));
    }



    @Test
    public void IfNotInAEvenOdd() {
        int expectedRes = 2;
        int actualRes = obj.EvenOdd (18);
        assertEquals(2, obj.EvenOdd(18));
        assertEquals(2, obj.EvenOdd(35));
    }
}