package com.stackroute.unittest.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class StudentMarksTest {
    StudentMarks obj;

    @Before
    public void setUp() throws Exception {
        StudentMarks obj = new  StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        StudentMarks obj = null;
    }

    @Test
    public void StuGrades() {

        assertEquals("0", obj.grades(0));
        assertEquals("50", obj.grades(50));
        assertEquals("Error", obj.grades(106));
        assertEquals("Error", obj.grades(-10));
        assertEquals("Error", obj.grades(-30));
        assertEquals("100", obj.grades(100));

    }
}

