package com.company.session1;

public class HelloWorld {

    public static void main(String args[]) {
        Car c = new Car("Renault", 2022);
        System.out.println("From object reference = ," + c.getModel());
        Modifiers m = new Modifiers();
        m.protectedFunction();

    }

}
