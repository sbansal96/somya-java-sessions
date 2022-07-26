package com.company.session9.desiarlize;

import com.company.session3.polymorphism.compiletime.Student;
import com.company.session9.Plane;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

//class Plane implements Serializable {
//    int pId;
//    int planeNumber;
//
//    public Plane(int pId, int planeNumber) {
//        this.pId = pId;
//        this.planeNumber = planeNumber;
//    }
//}

public class DeserializationExample {

    public static void main(String[] args) throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Planes.txt"));
        Student p = (Student) objectInputStream.readObject();
        System.out.println(p.name+ " ," + p.age);
        objectInputStream.close();

    }

}
