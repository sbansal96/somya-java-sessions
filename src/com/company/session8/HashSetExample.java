package com.company.session8;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,5,5,6,7,8,8,10);
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Shubham");
        hashSet.add("somya");
        hashSet.add("shubham");
        System.out.println(hashSet);

        Iterator i = hashSet.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        Set<Integer> integerSet = new TreeSet<>();


        for(Integer j : intList){
            if(!integerSet.add(j)){
                System.out.println(j.toString() + " , is Duplicate");
            }
        }

    }

}
