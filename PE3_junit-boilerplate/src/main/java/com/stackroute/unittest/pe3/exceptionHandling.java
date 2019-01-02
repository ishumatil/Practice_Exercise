package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class exceptionHandling {
    public static void exceptionHandling() {

 /*NullPointerException*/
        try {
            String str = null;
            int l = str.length();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*ArrayIndexOutOfBoundsException*/
        try {
            int array[] = new int[1];
            array[0] = 0;
            System.out.println(array[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }

      /*NegativeArraySizeException*/
        try {
            int array[] = new int[-5];
        } catch (Exception e) {
            e.printStackTrace();
        }
 }

    public static void main(String args[]) {

        exceptionHandling();
    }
}
