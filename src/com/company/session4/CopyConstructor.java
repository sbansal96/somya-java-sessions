package com.company.session4;

class Student{

    int age;
    String name;
    int rollNo;

    public Student() {

    }

    public Student(int age, String name,int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student(Student s){
        System.out.println("Input Student in Copy Constructor :" + s);
        this.age = s.age;
        this.name = s.name;
        this.rollNo = s.rollNo;
    }

    public Student(int rollNo){
        this.rollNo = rollNo;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}


public class CopyConstructor {

    public static void main(String[] args){
        Student s1 = new Student(20,"John",101);
        System.out.println("s1 : " + s1);

        Student s2 = new Student(21,"Doe",102);
        System.out.println("s2 : " + s2);

        Student cpyS2 = new Student(s2);
        System.out.println("cpyS2 : " + cpyS2);

        try{
            s2.age += 1;

            // performing another action that gives an exception
            throw new Exception();
        }catch (Exception e){
            System.out.println("s2 in exception: " + s2);
            s2 = cpyS2;
        }
        System.out.println("s2 : " + s2);

    }

}
