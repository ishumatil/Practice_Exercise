package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj;

    @Before
    public void setUp() throws Exception {
        Palindrome obj = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        Palindrome obj = null;
    }


    @Test
    public void Palindrome() {
        boolean expectedRes = true;
        boolean actualRes = obj.Palindrome("125676521");
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void NotAPalindrome() {
        boolean expectedRes = false;
        boolean actualRes = obj.Palindrome("11789928");
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkSumismore() {
        boolean expectedRes = true;
        boolean actualRes = obj.checkSumOfEven("587443654");
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkSumisless() {
        boolean expectedRes = false;
        boolean actualRes = obj.checkSumOfEven("348716");
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkPalindrome() {
        boolean expectedRes = false;
        boolean actualRes = obj.checkSumOfEven("wonder");
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkNotAPalindrome() {
        boolean expectedRes = false;
        boolean actualRes = obj.checkSumOfEven("haah");
        assertEquals(expectedRes, actualRes);
    }
  }
