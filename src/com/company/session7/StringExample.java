package com.company.session7;

public class StringExample {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Shubham");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Somya");
        System.out.println(stringBuffer);

        stringBuilder.append(" Bansal");
        System.out.println(stringBuilder);


        stringBuffer.append(" Bansal");
        System.out.println(stringBuffer);
        String s = "Shubham";
        String s1 = " Bansal";
        String s2 = "Shubham";
        System.out.println("#############################");
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(" Bansal"));
        System.out.println(s.concat(s1));
        System.out.println(s.contains("l"));
        System.out.println(s.equals(s1));
        System.out.println(s.compareTo("shubham"));
        System.out.println(s.equalsIgnoreCase("shubham"));
        System.out.println(s.compareToIgnoreCase("shubham"));


    }

}
