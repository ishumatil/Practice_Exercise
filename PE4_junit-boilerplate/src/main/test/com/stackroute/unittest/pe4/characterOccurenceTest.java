package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class characterOccurenceTest {

      characterOccurence obj;
    @Before
    public void setUp() throws Exception {
        characterOccurence obj =  new characterOccurence();
    }

    @After
    public void tearDown() throws Exception {
        characterOccurence obj = null;
    }

    @Test
    public void characterOccurence() {
        assertNotEquals(2,obj.characterOccurence("India","i"));
        assertEquals(2,obj.characterOccurence("weera","e"));
        assertEquals(0,obj.characterOccurence("",""));
        assertEquals(5,obj.characterOccurence("iiiii","i"));
    }
}