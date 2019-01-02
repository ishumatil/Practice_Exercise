package com.stackroute.unittest.pe3;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;      // import dateformat libraries
import java.util.Calendar;              // import calendar library to set dates

public class calculateDate {

    public static void main(String args[]){     //main function
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);  // set moday as the first day of week

        DateFormat df = new SimpleDateFormat(" MM/dd/yyyy");   //print date in the given format
        System.out.println(df.format(cal.getTime()));

        int i;
        for(i = 0; i < 6; i++){              // loop for calculate date of last day (sunday)
            cal.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(cal.getTime()));
    }
}


