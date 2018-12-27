package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringIntTest {
    StringInt obj;

    @Before
    public void setUp() throws Exception {
        StringInt obj = new StringInt();
    }

    @After
    public void tearDown() throws Exception {
        StringInt obj = null;
    }

    @Test
    public void repeatStr() {
        assertEquals("londonndonndonndonndon", obj.repeatStr("london", 4));
        assertEquals("Stackckck", obj.repeatStr("Stack", 2));
    }

}