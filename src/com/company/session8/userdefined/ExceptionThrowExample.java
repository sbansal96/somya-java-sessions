package com.company.session8.userdefined;

public class ExceptionThrowExample {

    public static void generateException() throws GenericException {
        try {
            int i = 1 / 0;
        } catch (ArithmeticException ae) {
            throw new GenericException("GE__001");
        }
    }


    public static void main(String[] args) {
        try {
            ExceptionThrowExample.generateException();
        } catch (GenericException e) {
            System.out.println(e.getMessage());
        }
    }

}
