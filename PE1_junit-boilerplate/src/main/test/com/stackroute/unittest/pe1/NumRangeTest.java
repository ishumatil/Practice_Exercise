package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumRangeTest {

       NumRange obj;
    @Before
    public void setUp() throws Exception {
        NumRange obj = new NumRange();
    }

    @After
    public void tearDown() throws Exception {
        NumRange obj = null;
    }

    @Test
    public void NumRange() {
        assertEquals("Number guessed is less than original number", obj.NumRange(50, 85));
        assertEquals("Number guessed is more than original number", obj.NumRange(88, 85));
        assertEquals("Number guessed matches the original number", obj.NumRange(85, 85));

    }
}