package com.stackroute.unittest.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    public int compare(Student stu1,Student stu2) {
        if(stu1.getAge() > stu2.getAge())     // comparing age of each 2 students to sort

            return stu1.getAge() - stu2.getAge();

        else if(stu1.getAge()==stu2.getAge() &&! stu1.getName().equals(stu2.getName())) //checking if age same than compare names
                                                                                           // of the students
            return stu1.getName().compareToIgnoreCase(stu2.getName());
        else
            return stu1.getId()-stu2.getId();
    }
}