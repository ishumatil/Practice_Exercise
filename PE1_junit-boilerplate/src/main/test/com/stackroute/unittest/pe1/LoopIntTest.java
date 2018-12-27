package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopIntTest {

     LoopInt obj;
    @Before
    public void setUp() throws Exception {
        LoopInt Obj = new LoopInt();
    }

    @After
    public void tearDown() throws Exception {
        LoopInt obj = null;
    }

    @Test
    public void loopInt() {
        assertEquals(1, obj.LoopInt(1));
        assertEquals(122, obj.LoopInt(2));
        assertEquals(122333, obj.LoopInt(3));
        assertEquals(1223334444, obj.LoopInt(4));

    }
}