package com.company.session3.inheritance;

class Product {

    private int pid;
    private String name;
    private int price;

    public Product() {
        System.out.println(">> Product Object Constructed");
    }

    public void setProductDetails(int pid, String name, int price) {
        setPid(pid);
        this.name = name;
        this.price = price;
        System.out.println(">> Data written in product object");
    }

    public void showProductInfo() {
        System.out.println("---- Product ID: " + pid + "-----");
        System.out.println("Name:\t" + name);
        System.out.println("Price:\t" + price);
        System.out.println("-------------------------");
    }

    private void setPid(int pid) {
        this.pid = pid;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Mobile extends Product {
    String os;
    int ram;
    int sdCardSize;


    public Mobile() {
        System.out.println(">> Mobile Object Constructed");
    }

    //Method Overloading known as compiletime polymorphisim
    public void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) {
        super.setProductDetails(pid, name, price);
        this.os = os;
        this.ram = ram;
        this.sdCardSize = sdCardSize;
        System.out.println(">> Data written in mobile object");
    }

    /**
     * Method Overriding also known as runtime polymorphisim
     *  1.) Return type should be exact
     *  2.) Arguments Should be exact
     *  3.) Modifier should be exact
     */
    public void showProductInfo() {
        System.out.println("---- Product ID: " + super.getPid() + "-----");
        System.out.println("Name:\t" + super.getName());
        System.out.println("Price:\t" + super.getPrice());
        System.out.println("OS:\t" + os);
        System.out.println("Ram:\t" + ram);
        System.out.println("Sd Card Size:\t" + sdCardSize);
        System.out.println("-------------------------");
    }


}

public class InheritanceApp {
    public static void main(String[] args) {
//        Product product1 = new Product();
//        product1.setProductDetails(101, "iphonex", 70000);
//        product1.showProductInfo();
//
//        Product product2 = new Product();
//        product2.setProductDetails(102,"Shoes",5000);
//        product2.showProductInfo();


        Mobile m = new Mobile();
        m.setProductDetails(101, "iPhoneX", 70000, "iOS", 4, 128);
        m.showProductInfo();
    }
}
