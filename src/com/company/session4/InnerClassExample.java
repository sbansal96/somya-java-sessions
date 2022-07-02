package com.company.session4;

class OuterClass {

    int a = 5;

    class InnerClass {
        int b = 10;
    }
}

public class InnerClassExample {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.a + inner.b);
    }

}
