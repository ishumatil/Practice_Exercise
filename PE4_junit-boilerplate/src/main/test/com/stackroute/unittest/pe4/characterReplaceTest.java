package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class characterReplaceTest {

      characterReplace obj;
    @Before
    public void setUp() throws Exception {
        characterReplace obj =  new characterReplace();
    }

    @After
    public void tearDown() throws Exception {
        characterReplace obj =   null;
    }

    @Test
    public void characterReplace() {

        assertEquals("fatly fry",obj.characterReplace("daily dry"));
        assertEquals("fff tttt",obj.characterReplace("dfd itit"));
        assertNotEquals("ftd",obj.characterReplace("dfd"));
        assertEquals("dalse",obj.characterReplace("false"));
        assertEquals("",obj.characterReplace(""));
    }
}