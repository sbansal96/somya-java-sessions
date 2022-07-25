package com.company.session6;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        stack.push(1);
        stack.push(2);

        System.out.println(stack);


        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack);

        /**
         * 0
         *
         * 1
         * 0
         *
         *
         */

        System.out.println(stack.contains(2));
        System.out.println(stack.contains(1));

    }
}
