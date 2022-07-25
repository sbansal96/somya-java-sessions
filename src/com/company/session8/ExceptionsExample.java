package com.company.session8;

public class ExceptionsExample {

    public static void main(String[] args) {

        int[] arr = new int[5];
        try {
            int i = 1 / 0;
            arr[5] = 1;
//            System.exit(0);
        } catch (ArithmeticException ae) {

            System.out.println(ae);
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Starting FOR loop");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Ending FOR loop");


    }

}
