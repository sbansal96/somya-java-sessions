package com.company.session7;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();

        al.add("Shubham");
        al.add("Soumya");
        al.add("Abhishek");
        System.out.println(al);
        al.addFirst("Vikas");
        System.out.println(al);
        al.addLast("Vikram");
        System.out.println(al);

        // remove

        al.remove();
        System.out.println(al);
        al.remove("Abhishek");
        System.out.println(al);
        al.removeLast();
        System.out.println(al);

        al.add("Abhishek");
        al.add("Abhishek1");
        al.add("Abhishek");
        al.add("Abhishek1");

        System.out.println(al);

        al.removeFirstOccurrence("Abhishek1");
        al.removeLastOccurrence("Abhishek");
        System.out.println(al);

        al.add(3,"Vikram");
        System.out.println(al);

//        System.out.println(al.peek());
//        System.out.println(al.peekFirst());
//        System.out.println(al.peekLast());

//        for(String i : al){
//            System.out.println(i);
//        }

        Iterator i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
