package com.company.session3.abstraction;

public class Interfaces {

    public static void main(String[] args) {
        Maruti m = new Maruti();
        m.start();

    }
}

interface ICar {
    int iPrice = 20000;
    void start();
    void breaking();
}

interface ICar2 extends ICar{

}

class Maruti implements ICar2{
    @Override
    public void start() {
        System.out.println("maruti Starting");
    }

    @Override
    public void breaking() {

    }
}
