package com.company.session9;

import com.company.session3.polymorphism.compiletime.Student;

import java.io.*;
public class SerializationExample {

    public static void main(String[] args) throws IOException {
        Student p = new Student("Shubham", 167);
        FileOutputStream fout = new FileOutputStream("Planes.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);

        objectOutputStream.writeObject(p);

        objectOutputStream.flush();

        objectOutputStream.close();

    }
}
