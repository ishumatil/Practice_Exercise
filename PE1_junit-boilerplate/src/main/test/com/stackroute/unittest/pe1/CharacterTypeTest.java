package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTypeTest {

     CharacterType obj;
    @Before
    public void setUp() throws Exception {
        CharacterType obj = new  CharacterType();
    }

    @After
    public void tearDown() throws Exception {
        CharacterType obj = null;
    }

    @Test
    public void charTypeCheck() {
        assertEquals("Digit", obj.CharTypeCheck("4"));
        assertEquals("Small letter", obj.CharTypeCheck( "a"));
        assertEquals("Capital letter", obj.CharTypeCheck( "A"));
        assertEquals("Special Charater", obj.CharTypeCheck( "$"));
        assertEquals("Error! Length greater than 1", obj.CharTypeCheck( "12"));
        assertEquals("Special Charater", obj.CharTypeCheck( "!"));
    }
}