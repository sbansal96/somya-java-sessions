package com.company.session6;

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ObjectArray {

    public static void main(String[] args) {
        Student[] arr = new Student[2];

        arr[0] = new Student(1, "Shubham");
        arr[1] = new Student(2, "Somya");
        arr[0].name = "Shubham1";
        System.out.println(arr[0].name + "," +arr[1].name);

    }

}
