package com.company.session2;

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public void display() {
        System.out.println("Private Constructor");
    }
}


class Test {
    public static void main(String[] args) {
        SingletonClass s = SingletonClass.getInstance();
        s.display();

        SingletonClass s1 = SingletonClass.getInstance();
        s1.display();
    }
}