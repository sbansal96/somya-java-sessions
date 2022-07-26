package com.company.session3.polymorphism.compiletime;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 2340164824848144194L;
    public String name;
    public int age;


    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("Student is walking");
    }

    public void walk(int steps){
        System.out.println("Student walked "+steps+ " steps");
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 27;
        s1.name = "Shubham";
        System.out.println(s1);
        Student s2 = new Student("Somya",24);
        s2.walk();
        s2.walk(2);
    }
}
