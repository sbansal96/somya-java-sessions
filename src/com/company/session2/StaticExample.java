package com.company.session2;

public class StaticExample {
}

class Student {
    int rollno;
    String name;
    static String college = "ITS";


    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

//Test class to show the values of objects
class TestStaticVariable1 {
    public static void main(String args[]) {

        System.out.println(Student.college);

    }
}