package com.company.session5.collections;


import java.util.HashMap;
import java.util.Map;

class Student {
    public int age;
    public String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashMapCollection {


    public static void main(String[] args) {

        //<Key,Value>
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap

        // Values put
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        // get value
        // if key is known
//        String s = map.get(4);
        System.out.println(map);


        // interate
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getValue());
        }

        map.putIfAbsent(103, "Shubham");
        System.out.println(map);
//        map.putIfAbsent(103,"Shubham1");
//
//        HashMap<Integer,String> mapCopy=new HashMap<>();//Creating HashMap
//        mapCopy.putAll(map);
//
//        System.out.println(mapCopy);

        map.remove(103); // remove single key
        System.out.println(map);
        map.clear(); // To empty your map
        System.out.println(map);

        map.put(103, "Somya");
        System.out.println(map);
//        map.put(103,"Shubham");
        map.replace(103, "Shubham");
        System.out.println(map);

        HashMap<Integer, Student> mapStudent = new HashMap<>();//Creating HashMap

        Student s1 = new Student(20, "John");
        Student s2 = new Student(20, "Doe");

        mapStudent.put(1, s1);
        mapStudent.put(2, s2);

        System.out.println(mapStudent);


        for (Map.Entry m : mapStudent.entrySet()) {
            Student s = (Student) m.getValue();
            System.out.println(s.name);
        }

        System.out.println(mapStudent.containsKey(1));
        System.out.println(mapStudent.containsKey(3));

        System.out.println(map.containsValue("Shubham"));
        System.out.println(map.containsValue("Amit"));

        System.out.println(mapStudent.size());


        for(Integer i : mapStudent.keySet()){
            System.out.println(mapStudent.get(i));
        }

        for(Student i : mapStudent.values()){
            System.out.println(i);
        }

    }




}
