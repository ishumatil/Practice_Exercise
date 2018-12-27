package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantVowelTest {

      ConsonantVowel obj;
    @Before
    public void setUp() throws Exception {
        ConsonantVowel obj = new ConsonantVowel();
    }

    @After
    public void tearDown() throws Exception {
        ConsonantVowel obj = null;
    }

    @Test
    public void ConsonantVowel() {
        assertEquals("vowel", obj.ConsonantVowel('a'));
        assertEquals("vowel", obj.ConsonantVowel('e'));
                assertEquals("vowel", obj.ConsonantVowel('i'));
                        assertEquals("vowel", obj.ConsonantVowel('o'));
                                assertEquals("vowel", obj.ConsonantVowel('u'));
                                        assertEquals("consonant", obj.ConsonantVowel('b'));
    }
    @Test
    public void IfNotAConsonantVowel() {
        assertEquals("Invalid", obj.ConsonantVowel('1'));
    }
}