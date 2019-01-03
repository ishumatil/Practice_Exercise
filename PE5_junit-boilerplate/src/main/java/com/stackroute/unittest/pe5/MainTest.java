package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public List <Student> studentInfo() {
        Student obj name1 = new Student(1, "Anu", 22);        // creating 5 objects of student in class Maintest
        Student obj name2 = new Student(3, "Vaibhav", 24);
        Student obj name3 = new Student(2, "Anjali", 20);
        Student obj name4 = new Student(4, "Abhishek", 10);
        Student obj name5 = new Student(5, "Ishu", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(obj name1);
        list.add(obj name2);
        list.add(obj name3);
        list.add(obj name4);
        list.add(obj name5);
        System.out.println(list);

        Collections.sort(list, new StudentSorter());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        System.out.println(list);
        return list;
    }
}
