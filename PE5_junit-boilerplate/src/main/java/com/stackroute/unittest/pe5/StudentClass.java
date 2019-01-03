package com.stackroute.unittest.pe5;

public class StudentClass {

    private int id;                         //variables for the class as described in the question
    private String name;
    private int age;

    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;                            //initializing the variables
        this.age = age;
    }

    public int getId() {                         //applying getter setter to get the values

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }


}
