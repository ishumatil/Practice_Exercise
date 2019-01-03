package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ModifyArrayListTest {

    ModifyArrayList obj;

    @Before
    public void setUp() throws Exception {
        obj=new ModifyArrayList();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void UpdateArray() {
        ArrayList<String> fruitsList = new ArrayList<String>(Arrays.asList( "Apple","Grape","Melon","Berry") );
        ArrayList<String> resultList = new ArrayList<String>(Arrays.asList( "Kiwi","Grape","Melon","Berry"));
        assertEquals(fruitsList,obj.UpdateArray(resultList));
        //assertEquals(("Kiwi","Grape","Melon","Berry"), obj.addRemoveArray("Apple","Grape","Melon","Berry"))
    }
}