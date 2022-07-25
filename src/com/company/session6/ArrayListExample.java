package com.company.session6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Student1 {
    public int roll_no;
    public String name;

    Student1(int roll_no, String name) {
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
public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        System.out.println(arrayList.size());

        arrayList.add(10, 9);

        System.out.println(arrayList);

        for (Integer i : arrayList) {
            System.out.println(i);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


        System.out.println(arrayList.contains(5));
        System.out.println(arrayList.contains(9));


        System.out.println("Index:" + arrayList.indexOf(10));


        List<Integer> arrayListCopy = new ArrayList<>();


        arrayListCopy.addAll(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayListCopy);

        List<Student1> arrayListStudent= new ArrayList<>();


        arrayListStudent.add(new Student1(1,"Somya"));

        System.out.println(arrayListStudent);


        // removal
        arrayList.remove(10);
        System.out.println(arrayList);

        Iterator i = arrayList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
