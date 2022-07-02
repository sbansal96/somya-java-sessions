package com.company.session1;

public class Modifiers {

    /**
     * default
     * public
     * private
     * protected
     */


    public void publicFunction(){

    }

    private void privateFunction(){

    }

    protected void protectedFunction(){

    }

    public static void main(String[] args) {
        new Modifiers().protectedFunction();
        new Modifiers().privateFunction();
    }
}
