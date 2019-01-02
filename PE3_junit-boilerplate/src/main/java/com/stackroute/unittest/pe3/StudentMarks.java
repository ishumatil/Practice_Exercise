package com.stackroute.unittest.pe3;

import java.util.Scanner;    // import scanner util libraries

public class StudentMarks {
    public static String grades(int StuGrades) {
        if (StuGrades < 0 || StuGrades > 100) {          //check that grades are in between 0 ans 100 inclusive
            System.out.println("Error! Grades are not valid");
            return "Error";
        } else {
            System.out.println(StuGrades);
            return Integer.toString(StuGrades);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int numOfStudents = sc.nextInt();                //no. of students
        int stuGrades[] = new int[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1));
            stuGrades[i] = sc.nextInt();
            grades(stuGrades[i]);
        }
    }
}