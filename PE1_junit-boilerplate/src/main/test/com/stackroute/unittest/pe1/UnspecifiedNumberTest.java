package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnspecifiedNumberTest {

    UnspecifiedNumber obj;
    @Before
    public void setUp() throws Exception {
        UnspecifiedNumber obj = new UnspecifiedNumber();
    }

    @After
    public void tearDown() throws Exception {
        UnspecifiedNumber obj =  null;
    }

    @Test
    public void SumCheck() {
        assertEquals(12,obj.SumCheck("2 4 4 2"));
        assertEquals(0,obj.SumCheck("0 0 0"));
    }
}