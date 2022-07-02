package com.company.session4;


class Parent {

    String parentFirstName;
    int parentAge;
    String surname;

    Parent() {

    }

    Parent(String parentFirstName, int parentAge, String surname) {
        this.parentFirstName = parentFirstName;
        this.parentAge = parentAge;
        this.surname = surname;
    }

    Parent(String surname) {
        this.surname = surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSurname(String surname,String a) {
        this.surname = surname;
    }

    public void setSurname(String surname,String a , String b) {
        this.surname = surname;
    }
}

class Child extends Parent {

    String fname;
    String lname;

    Child(String fname, String lname) {
       // super(); // this will call default constructor
        super(lname); // it always matches parameters
        this.fname = fname;
        this.lname = lname;
    }
}


public class ConstructorChaining {


    public static void main(String[] args) {
        Child s = new Child("John", "Doe");
        System.out.println(s.surname);
    }
}
