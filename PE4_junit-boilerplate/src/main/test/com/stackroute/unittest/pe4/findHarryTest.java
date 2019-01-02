package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class findHarryTest {

     findHarry obj;

    @Before
    public void setUp() throws Exception {
        findHarry obj =  new findHarry();
    }

    @After
    public void tearDown() throws Exception {
        findHarry(); obj =  null;
    }

    @Test
    public void findHarry() {
        assertEquals(true,obj.findHarry("He is Harry"));
        assertEquals(false,obj.findHarry("He is Henry"));
        assertEquals(true,obj.findHarry("Harry was here"));
        assertEquals(false,obj.findHarry("Is Hary here"));
    }
}