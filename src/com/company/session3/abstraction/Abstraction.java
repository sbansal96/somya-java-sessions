package com.company.session3.abstraction;

public class Abstraction {

    public static void main(String[] args) {
//        Audi a = new Audi();
//        a.start();
//        BMW b = new BMW();
//        b.start();

        Car c1 = new Audi();
        Car c2 = new BMW();

        c1.start();
        c1.breaking();
    }

}


abstract class Car {
    int price;
    abstract void start();
    abstract void breaking();

}

class Audi extends Car {

    @Override
    void start() {
        System.out.println("Audi Started");
    }

    public void breaking(){
        System.out.println("Audi Breaking Car");
    }
}

class BMW extends Car {
    @Override
    void start() {
        System.out.println("BMW Started");
    }

    public void breaking(){
        System.out.println("BMW Breaking Car");
    }
}