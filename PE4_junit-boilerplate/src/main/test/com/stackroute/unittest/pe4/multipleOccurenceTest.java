package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class multipleOccurenceTest {

    multipleOccurence obj;
    @Before
    public void setUp() throws Exception {
        multipleOccurence obj = new multipleOccurence();
    }

    @After
    public void tearDown() throws Exception {
        multipleOccurence obj = null;
    }

    @Test
    public void multipleOccurence() {
        assertEquals("4-6 10-12 27-29", obj.multipleOccurence("She sells seashells by the seashore","se"));
        assertEquals("2-3 3-4 4-5 7-8 8-9", obj.multipleOccurence("whaaat aawesome morning it is", "a"));
        assertEquals("0-0", obj.multipleOccurence("", ""));
    }
}