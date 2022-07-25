package com.company.session7;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesExample {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // FIFO
        q.add(10);
        q.add(20);
        q.add(30);

        q.remove();
        System.out.println(q.peek());

//        q.clear();
        System.out.println(q.contains(40));
        System.out.println(q.contains(30));
    }

}
