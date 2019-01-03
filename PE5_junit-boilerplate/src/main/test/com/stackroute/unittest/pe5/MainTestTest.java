package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {

    MainTest obj;
    @Before
    public void setUp() throws Exception {
        obj = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
    obj = null;
    }

    @Test
    public void studentInfo() {
        Student obj Name1 = new Student(1, "Anu", 22);
        Student obj Name2 = new Student(3, "Vaibhav", 24);
        Student obj Name3 = new Student(2, "Anjali", 20);
        Student obj Name4 = new Student(4, "Abhishek", 10);
        Student obj Name5 = new Student(5, "Ishu", 22);
        List<Student> list=new ArrayList<Student>();
        list.add(obj Name1);
        list.add(obj Name2);
        list.add(obj Name3);
        list.add(obj Name4);
        list.add(obj Name5);
        List<Student> ans = obj.studentInfo();
        String expected="",actual="";
        for(int i = 0; i < list.size(); i++) {
            expected+=list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge() + " ";
        }
        for(int j = 0; j < ans.size(); j++){
            actual+ = ans.get(j).getId() + " "+ ans.get(j).getName() + " " + ans.get(j).getAge() + " ";

        }
        assertEquals(expected,actual);
    }
}