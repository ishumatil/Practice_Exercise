package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class stringTransposeTest {

      stringTranspose obj;
    @Before
    public void setUp() throws Exception {
        stringTranspose obj =  new stringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        stringTranspose obj =  null;
    }

    @Test
    public void stringtranspose() {
       assertEquals("a kciuq nworb xof spmuj revo eht yzal god",obj.stringtranspose("a quick brown fox jumps over the lazy dog"));
        assertEquals("siht yad si emosewa",obj.stringtranspose("this day is awesome"));
        assertEquals("",obj.stringtranspose(""));
    }
}