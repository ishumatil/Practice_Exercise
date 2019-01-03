package com.stackroute.unittest.pe5;
import java.util.*;
import java.io.*;
import java.util.*;


public class ModifyArrayList {

    public static void main(String[] args) {

            ArrayList<String> fruitsList = new ArrayList<String>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));

            System.out.println(fruitsList);

            for (int i = 0; i < fruitsList.size(); i++) {       // It will change the item in arraylist
                if (fruitsList.get(i).equalsIgnoreCase("Apple")) {  // during the iteration
                    fruitsList.set(i, "Kiwi");
                }
            }

            System.out.println(fruitsList);

            fruitsList.clear();
            System.out.println("The ArrayList after clearing is" + fruitsList);
        }
    }
